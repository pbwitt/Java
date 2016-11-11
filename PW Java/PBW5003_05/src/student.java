import java.awt.*;
import javax.swing.*;

public class student 
{
		String firstName;
		String lastName;
		int age;

		public student(String a, String b, int x)
		{	
			super();
			firstName = a;
			lastName = b;
			age = x;
			
		}
		
		String getInfo()
		{
			return "NAME = "+firstName+ "  "+lastName+"  "+"Age = "+age;
		}
	
	
	
		String whatsUp()
		{
			double r = Math.random();
			int myNumber = (int) (r * 3f); //comment: a random number between 0 and 2
			String answer = "I don't know";
			if(myNumber == 0) answer = "searching the web";
			if(myNumber == 1) answer = "doing Java";
			if(myNumber == 2) answer = "Listening to endless lecture";
			return answer;
		}

	
	

}
