import java.util.*;
public class mid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("b is mid");
            }else
            if(a>c){
                System.out.println("c is mid");
            }else{
                System.out.println("a is mid");
            }
        }else{
            if(a>c){
                System.out.println("a is mid");
            }else if(b>c){
                System.out.println("c is mid");
            }else{
                System.out.println("b is mid");
            }
        }
    }
}