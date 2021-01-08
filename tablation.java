import java.util.Scanner;

public class tablation {
    public static void main(String args[]) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num1 = Input.nextInt();

        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1) + "x" + num1 + "=" + ((i + 1) * num1));
        }
    }
}
