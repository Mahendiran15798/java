import java.util.Scanner;
public class Nested_for {
	public static void main(String args[]) {
		int row;
		int col;
		System.out.println("Enter Number");
		Scanner be=new Scanner(System.in);
		row=be.nextInt();
		col=be.nextInt();
		for (row=1;row<=5;row++) 
		{
			for(col=1;col<=4;col++) 
			{
				System.out.print("* ");
			}
			System.out.println("*");
		}
	}

}
