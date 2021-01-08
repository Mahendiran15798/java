import java.util.Scanner;

public class hexdecimal {
    public static void main(String args[]){
        int n,m,o,p;
        Scanner In =new Scanner(System.in);
        System.out.println("Enter the hexdecimal number : ");
        n=In.nextInt();
        System.out.println("Enter the binary number : ");
        m=In.nextInt();
        System.out.println("Enter the octal number : ");
        o=In.nextInt();
        System.out.println("Enter the UnsignedString number : ");
        p=In.nextInt();
        String a=Integer.toHexString(n);
        System.out.println("Is a hexdecimal number : "+a);
        String b=Integer.toBinaryString(m);
        System.out.println("Is a Binary number : "+b);
        String c=Integer.toOctalString(o);
        System.out.println("Is a octal number : "+c);
        String d=Integer.toUnsignedString(p);
        System.out.println("Is a UnsignedString number : "+d);
    }
}
