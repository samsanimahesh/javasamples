package com.mahesh.threads;

import java.io.InputStream;
import java.io.OutputStream;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelShell;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class JschTest {

	/**
	 * JSch Example Tutorial Java SSH Connection Program
	 */
	public static void main(String[] args) {
		String host = "ssh.journaldev.com";
		String user = "sshuser";
		String password = "sshpwd";
		String command1 = "ls -ltr";
		try {

			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			JSch jsch = new JSch();
			Session session = jsch.getSession("cli", "10.44.107.243", 22);
//			session.setPassword(password);
			session.setConfig(config);
			session.connect();
			System.out.println("Connected");

			Channel channel = session.openChannel("shell");
			InputStream in = channel.getInputStream();
			
			((ChannelShell) channel).sendSignal("admin");
			((ChannelShell) channel).sendSignal("Admin6352");
//			channel.setInputStream(null);
//			((ChannelShell) channel).setErrStream(System.err);

			
			channel.connect();
			byte[] tmp = new byte[1024];
			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 1024);
					if (i < 0)
						break;
					System.out.print(new String(tmp, 0, i));
				}
				if (channel.isClosed()) {
					System.out.println("exit-status: " + channel.getExitStatus());
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (Exception ee) {
				}
			}
			channel.disconnect();
			session.disconnect();
			System.out.println("DONE");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
