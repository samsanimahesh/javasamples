package com.mahesh.threads;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;

public class FileExtractor {
	public static void main(String[] args) throws IOException {
		File archive = new File("/Users/mahesh/Desktop/mahes/mahesh.tar.gz");
		if (archive.exists()) {
			System.out.println("File exists");
		}
		InputStream in = new FileInputStream(archive);
		GzipCompressorInputStream archiver = new GzipCompressorInputStream(in);
		TarArchiveInputStream tarIn = new TarArchiveInputStream(archiver);
		TarArchiveEntry entry;

		while ((entry = (TarArchiveEntry) tarIn.getNextEntry()) != null) {
			/** If the entry is a directory, create the directory. **/
			if (entry.isDirectory()) {
				File f = new File("/Users/mahesh/Desktop/mahes/" + entry.getName());
				System.out.println("creating directory in " + f.getAbsolutePath());
				boolean created = f.mkdir();
				if (!created) {
					System.out.printf("Unable to create directory '%s', during extraction of archive contents.\n",
							f.getAbsolutePath());
				}
			} else {
				int count;
				byte data[] = new byte[1024];
				File outputFile = new File("/Users/mahesh/Desktop/mahes/" + entry.getName());
				boolean fileCreated = outputFile.createNewFile();
				if (fileCreated) {
					FileOutputStream fos = new FileOutputStream(outputFile);
					try (BufferedOutputStream dest = new BufferedOutputStream(fos, 1024)) {
						while ((count = tarIn.read(data, 0, 1024)) != -1) {
							dest.write(data, 0, count);
						}
						dest.close();
					}
				} else {
					System.out.println("Error creating file...");
				}
			}
		}

		tarIn.close();
		System.out.println("Untar completed successfully!");
	}

}
