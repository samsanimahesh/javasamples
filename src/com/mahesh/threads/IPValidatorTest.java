package com.mahesh.threads;

import java.util.Scanner;

public class IPValidatorTest {
	public static void main(String[] args) {

		System.out.println("Enter the ipaddress");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		if (str.contains("::") || str.contains(":")) {
			System.out.println(constructIpAddress(str, true));
		} else {
			System.out.println(constructIpAddress(str, false));

		}
	}

	private static String constructIpAddress(String ipAddr, boolean isIpv6) {
		StringBuffer buffer = new StringBuffer();
		String[] strArray = ipAddr.split("\\.");
		int i = 0;
		for (String str : strArray) {

			String subStr = str.substring(str.lastIndexOf('0') + 1, str.length());
			if (subStr == null || subStr.isEmpty()) {
				buffer.append('0');
			} else {
				buffer.append(subStr);
			}
			if (isIpv6) {
				if (i != 7) {
					buffer.append(":");
				}

			} else {
				if (i != 3) {
					buffer.append(".");
				}
			}
			i++;

		}
		return buffer.toString();
	}

}
