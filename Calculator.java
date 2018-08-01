import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		float a,b,res;
		char choice,ch;
		Scanner scan=new Scanner(System.in);
		do{
		  System.out.println("1. Add Two Numbers\n");
		  System.out.println("2. Exit\n\n");
		  System.out.print("Enter your choices: ");
		  choice=scan.next().charAt(0);
		  switch(choice){
			case '1' :System.out.print("Enter two numbers: ");
				a=scan.nextFloat();
				b=scan.nextFloat();
				res=a+b;
				System.out.println("Result ="+res);
				break;
			case '2' :System.exit(0);
				break;
			default : System.out.print("Invalid Choice ");
		}
	}while(choice!=2);
}
}
