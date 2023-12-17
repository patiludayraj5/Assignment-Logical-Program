import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int res=1;
        int n=sc.nextInt();
        if (n<0){
            System.out.println("Invalid No");
            return;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                res+=i;
            }
        }
        if (res==n && n!=1){
            System.out.println("The No "+n+" is a perfect number");
        }else {
            System.out.println("The No "+n+" is Not a perfect number");
        }
    }
}
/*
Perfect Number
a. Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number. For example, 28 is the perfect
number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7
 */