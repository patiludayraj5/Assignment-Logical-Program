import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No.: ");
        int n=sc.nextInt();
        int num=n;
        int reverse=0;
        while (n!=0){
            int remainder=n%10;
            reverse= reverse*10+remainder;
            n=n/10;
        }
        System.out.println("The reverse of no "+num+" is "+reverse);
    }
}
