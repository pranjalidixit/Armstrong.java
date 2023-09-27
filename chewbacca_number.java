package JAVA;
import java.util.Scanner;
public class chewbacca_number {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        long sum=0l;
        long mul=1l;
        while(num>0){
            long rem=num%10;
            long te=9-rem;
            if(rem>te&&te!=0){
                rem=te;
            }
            if(rem==9&&num/10!=0){
                rem=0;
            }
            sum=sum+rem*mul;
            num=num/10;
            mul=mul*10;
        }
        System.out.print(sum);
    }
}
