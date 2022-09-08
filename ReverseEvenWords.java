package week1.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="I am a happy person";
		String[] arraytest=test.split(" ");//splitting into words array
		String newone="";// string variable to store final result 
		//System.out.println(arraytest[0]);
		for(int i=0;i<=arraytest.length-1;i++) {
			//System.out.println(arraytest[0]);
			if(i%2==0)//if even display as it is
			{

				arraytest[i]=arraytest[i]+" ";//even index will print as it is with a space
				newone+=arraytest[i].toString();
				//	System.out.println(newone);
				//	System.out.println(arraytest[i]);
			}

			else//change to char array n reverse
			{
				//if odd index then change that word to char array
				char[] charArray1 = arraytest[i].toCharArray();

				for(int j=charArray1.length-1;j>=0;j--)//in reverse order
				{
					newone+=charArray1[j];//attaches to already entered even string
				
				}
				newone+=" ";//if even index goes to 1st loop if odd comes to j loop takes that word reverses and stores with a space at the end

				

			}


		}
		System.out.println(newone);



	}

}
