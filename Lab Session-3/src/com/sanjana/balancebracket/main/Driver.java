package com.sanjana.balancebracket.main;
import com.sanjana.balancebracket.service.BalancingBrackets;

public class Driver {
	public static void main(String [] args) {
		BalancingBrackets balancingBrackets = new BalancingBrackets();
		String bracketExpression="([[]{}])";
		
		Boolean result;
		result = balancingBrackets.checkingBracketsBalanced(bracketExpression);
		if(result)
			System.out.println("The ended String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not conatain Balanced Brackets");
	}

}
