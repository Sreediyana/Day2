package week1.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="madam1";
		String rev="";

		for(int i=name1.length()-1;i>=0;i--)
		{
			rev+=name1.charAt(i);
		}
		//System.out.println(rev);//prints reverse of input string given
		if(rev.equals(name1))
		{
			System.out.println("Given string is a paindrome");

		}
		else
		{
			System.out.println("Given string is not a paindrome");
		}
	}
}


//	boolean isvalid=true;
//	char[] charArray = nm.toCharArray();

//	for(int i=charArray.length-1;i>=0;i--)
//	{
//		{for(int j=0;j<=charArray.length-1;j++)
//		{

//		if(charArray[i]!=charArray[j])
//		{
//			isvalid=false;
////					System.out.println("Given string is not a palindrome");
//				break;
//		}
//}
//		}
//	if(isvalid==true)
//{
//System.out.println("Given string is palindrome"); 


//		}


//}


//}

//}
