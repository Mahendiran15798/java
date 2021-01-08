import java.util.Scanner;

public class add_5_num {
    public static void main(String args []){
        Scanner Input =new Scanner(System.in);
        System.out.println("Enter the frist number :");
        int num1 =Input.nextInt();
        System.out.println("Enter the second number :");
        int num2 =Input.nextInt();
        System.out.println("Enter the third number :");
        int num3 =Input.nextInt();
        System.out.println("Enter the four number :");
        int num4 =Input.nextInt();
        System.out.println("Enter the five number :");
        int num5 =Input.nextInt();
        System.out.println("Getting divison value :"+(num1+num2+num3+num4+num5)/5);

    }
}
