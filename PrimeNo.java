import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();
        boolean flag=false;
        if (n==2){
            System.out.println("The No "+n+" is a Prime No");
            return;
        } else if (n==0 || n==1) {
            System.out.println("The no "+n+" is Not a prime No");
        }
        for (int i=2;i<n;i++){
            if (n % i == 0){
                System.out.println("The no "+n+" is Not a prime No");
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println("The no "+n+" is a prime No");
        }
    }
}
