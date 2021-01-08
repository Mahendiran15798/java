import java.util.Scanner;

public class two_number {
    public static void main(String args[]){
        int frist_value ;
        int second_value;
        Scanner Input =new Scanner(System.in);
        System.out.print("frist_value : ");

        frist_value=Input.nextInt();
        System.out.print("second_value : ");
        second_value=Input.nextInt();

        int total=frist_value+second_value;
        System.out.println("total number is :" +total);
    }
}
