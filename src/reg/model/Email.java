package reg.model;

public class Email
{
	public boolean checkEmail(String email)
	{
		if(email.contains("@")&& email.contains(".com"))
		{
			if(email.length() > 2)
			{
				
				System.out.println("good");
			}
			else
			{
				System.out.println("wrong");
			}
			
		}
		else
		{
			System.out.println("wrong");
		}
		
		
		return false;
		
	}


}
