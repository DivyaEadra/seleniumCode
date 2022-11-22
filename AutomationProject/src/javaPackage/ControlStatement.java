package javaPackage;

public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(10<15)
		{
			System.out.println("true");
			if (5>1)
			{
				System.out.println("true");
			}
		}
			
		else
		{
			System.out.println("false");
		}
		
		
		// switch - case
		char ch = 'v';
		switch(ch)
		{
		case 'a'  :
		System.out.println("its a");
		//break;
		case 'b'  :
			System.out.println("its b");
			break;
			default :
				System.out.println("no match");
				break;
		
		}
	}

}
