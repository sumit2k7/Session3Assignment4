import java.util.Scanner;
public class Session3Assignment4 {

	public static void main(String[] args) {

			int iFirst=0,iSecond=0;
			char opertion;
			Scanner sc=new Scanner(System.in); 
			System.out.println("Please Enter First Number");
			iFirst=sc.nextInt();
			System.out.println("Please Enter Second Number");
			iSecond=sc.nextInt();
			System.out.println("Please Enter Operation (+,-,*,/");
			opertion=sc.next().charAt(0);
			sc.close();
			MathFunctions mf=new MathFunctions();
			switch(opertion)
			{
			case '+': 
				System.out.println("Addition of "+iFirst+" and "+ iSecond+" is:-> "+ mf.Addition(iFirst, iSecond));
				break;
			case '-': 
				System.out.println("Subtraction of "+iFirst+" and "+ iSecond+" is:-> "+ mf.Subtraction(iFirst, iSecond));
				break;
			case '*': 
				System.out.println("Multiplication of "+iFirst+" and "+ iSecond+" is:-> "+ mf.Multiplication(iFirst, iSecond));
				break;
			case '/': 
				System.out.println("Division of "+iFirst+" and "+ iSecond+" is:-> "+ mf.Division(iFirst, iSecond));
				break;
				default:
					System.out.println("Please Enter a Valid Operation");
			}
	}

}

class MathFunctions
{
	public int Addition(int iFirst,int iSecond)
	{
		return iFirst+iSecond;
	}
	public int Subtraction(int iFirst,int iSecond)
	{
		return iFirst-iSecond;
	}
	public int Multiplication(int iFirst,int iSecond)
	{
		return iFirst*iSecond;
	}
	public int Division(int iFirst,int iSecond)
	{
		return iFirst/iSecond;
	}
}
