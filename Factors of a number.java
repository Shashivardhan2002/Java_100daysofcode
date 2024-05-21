import java.util.Scanner;
public class dayone {
    static void factors(int x){
        int count=0;
        for(int i=1;i<=x;i++){
             if(x%i==0){
                System.out.println(i);
                count++;
             }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
         int n = sc.nextInt();
        factors(n);
    }
