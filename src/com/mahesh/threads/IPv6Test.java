package com.mahesh.threads;

import java.util.Scanner;

public class IPv6Test {
	public static void main(String[] args) {
		
		System.out.println("Enter the ip address");
		Scanner scanner = new Scanner(System.in);
		String ipAddress = scanner.next();
		scanner.close();
		String[] ipAddressSplit = ipAddress.split("::");
		StringBuffer buffer = new StringBuffer();
		
		if(ipAddressSplit.length==0){
			buffer.append("0:0:0:0:0:0:0:0");
		}else if(ipAddressSplit.length==1){
			buffer.append(ipAddressSplit[0]);
			buffer.append(appendZeros(8-(ipAddressSplit[0].split(":").length)));
		}else if(ipAddressSplit[0].isEmpty()){
			buffer.append("0");
			buffer.append(appendZeros(8-(ipAddressSplit[1].split(":").length+1)));
			buffer.append(":");
			buffer.append(ipAddressSplit[1]);
		}else{
			String left = ipAddressSplit[0];
			String right = ipAddressSplit[1];
			buffer.append(left);
			buffer.append(appendZeros(8-(left.split(":").length+right.split(":").length)));
			buffer.append(":");
			buffer.append(right);
			
		}
		System.out.println("ipaddrss is "+buffer.toString() );
		
		
	}

	private static String appendZeros(int numOfZeros) {
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<numOfZeros;i++){
			buffer.append(":0");
		}
		return buffer.toString();
	}

}
