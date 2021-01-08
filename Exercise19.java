import java.util.Scanner;
public class Exercise19 {
    public static void main(String args[])
    {
        int dec_num, i=1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        dec_num = scan.nextInt();

        while(dec_num != 0)
        {
            bin_num[i++] = dec_num%2;
            dec_num = dec_num/2;
        }

        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}