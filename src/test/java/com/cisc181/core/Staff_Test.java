// am unable to determine why an error is occurring and test is not running.

package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() throws PersonException {
		ArrayList<Staff> test_arraylist = new ArrayList<Staff>();
		
		test_arraylist.add(new Staff("First", "Middle", "Last",
				new Date(),"Address", "111-111-1111",
				"email@website.com", "OH",1,10000.0, new Date(), eTitle.MR));
		
		test_arraylist.add(new Staff("First", "Middle", "Last",
				new Date(),"Address", "111-111-1111",
				"email@website.com", "OH",1,15000.0, new Date(), eTitle.MR));
	
		test_arraylist.add(new Staff("First", "Middle", "Last",
				new Date(),"Address", "111-111-1111",
				"email@website.com", "OH",1,20000.0, new Date(), eTitle.MR));
	
		test_arraylist.add(new Staff("First", "Middle", "Last",
				new Date(),"Address", "111-111-1111",
				"email@website.com", "OH",1,25000.0, new Date(), eTitle.MR));
	
		test_arraylist.add(new Staff("First", "Middle", "Last",
				new Date(),"Address", "111-111-1111",
				"email@website.com", "OH",1,30000.0, new Date(), eTitle.MR));
		
		double sum = 0d;
		
		for(Staff idx : test_arraylist) {
			sum += idx.getSalary();
		}
	
		double average = sum/5d;
		
		System.out.println(average);
		assertEquals(20,000,(int)average);
	
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}
