package com.mahesh.threads;

import java.util.ArrayList;
import java.util.List;

public class DuplicateTest {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);
        numbers.add(5);
        DuplicateTest dn = new DuplicateTest();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
	}

	private int findDuplicateNumber(List<Integer> numbers) {
		int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;
	}

	private int getSum(List<Integer> numbers) {
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
	}

}
