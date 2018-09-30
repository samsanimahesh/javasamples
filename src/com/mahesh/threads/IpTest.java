package com.mahesh.threads;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {
	public static void main(String[] args) throws UnknownHostException {
		String ipAddr = "2001:1b70:82a1:0139:0000:0607:5297:004d";
		InetAddress inetAddress = InetAddress.getByName(ipAddr);
		byte[] byteArray = inetAddress.getAddress();
		for(int i=0;i<byteArray.length;i++){
			System.out.println(byteArray[i]&0x000000FF);
		}
	}

}
