import java.util.Scanner;

public class Euclid{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a,b;

        a = scn.nextInt();
        b = scn.nextInt();

        while(a != b){
            if(a>b){
                a -= b;
            }
            else{
                b -= a;

            }
        }

        System.out.println(a);
    }
}