package week1.day1;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class RemoveDuplicateString {

	public static void 
	main(String[] args) {
		// TODO Auto-generated method stub
		String inputtext="We learn java basics as part of java sessions in java week1";
		String[] splitinput = inputtext.split(" ");
		String result1="";
		
		int i;
	
		for(i=0;i<=splitinput.length-1;i++)
		{
		
				
				if(result1.contains(" "+splitinput[i]))
				{
					result1+="";
					
					
				}
				else
				{
					result1+=splitinput[i]+ " ";
					
				}
			
		}
				
		System.out.print(result1);	

	}
}
			
			

			
			
				
	




