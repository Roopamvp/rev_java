package com.revature.com;
import java.util.Scanner;
public class NumberofVowels {
	public static void main(String[] args) {
		Scanner linex =new Scanner(System.in);
		System.out.println("PLEASE ENTER LOWER CASE");
		String str=linex.nextLine();
		System.out.print(num_Vowels(str));
		
	}
public static int num_Vowels(String str)
{
	int cnt=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
		{
			cnt++;
		}
	}
	return cnt;
}

}
