package week1.day1;

import com.aventstack.extentreports.model.Test;

public class OddIndexToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changename";//changename
		String newresult="";

		char[] charArray1 = test.toCharArray();
		//char index1=
		int ss=test.indexOf('c');
		//test.indexOf(index1)

		//	System.out.println(index1);
		for(int i=0;i<=charArray1.length-1;i++)//0-9
		{
			//	System.out.println(test.indexOf(charArray1[i]));//indexof(c) will give 0
			if(i%2==1)//even
			{
				charArray1[i]=Character.toUpperCase(charArray1[i]);

				//System.out.print(charArray1[i]);

			}


			System.out.print(charArray1[i]);
		}
	}
}
