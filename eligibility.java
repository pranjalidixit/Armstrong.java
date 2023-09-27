import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        int age;
        System.out.println("enter the age:");
        Scanner r= new Scanner(System.in);
        age=r.nextInt();
        if(age>=18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
