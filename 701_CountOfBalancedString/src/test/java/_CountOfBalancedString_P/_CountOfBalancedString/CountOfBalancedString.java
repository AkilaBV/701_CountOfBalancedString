package _CountOfBalancedString_P._CountOfBalancedString;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountOfBalancedString {

public int countbalancedstrings(String s) {
	int rcount=0,lcount=0;
	int	count=0;
	
	if(s.length()==0) {
		
	}else {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='R') {
				rcount++;
			}else if(s.charAt(i)=='L') {
				lcount++;
			}
			if(rcount==lcount) {
				count++;
				rcount=0;
				lcount=0;
			}
		}
	}System.out.println("Number of balanced substrings are : " +count);
		return count;
	}
	
	@Test
	public void testcase1() {
	//	System.out.println(countbalancedstrings("RLLRRL"));
		Assert.assertTrue(countbalancedstrings("RLLRRL")==3);
	}
	
	@Test
	public void testcase2() {
	//	System.out.println(countbalancedstrings("RRLL"));
		Assert.assertTrue(countbalancedstrings("RRLL")==1);
	}
	@Test
	public void testcase3() {
		//System.out.println(countbalancedstrings(""));
		Assert.assertTrue(countbalancedstrings("")==0);
	}

	
}
