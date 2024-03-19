import java.util.Scanner;

public class Eight {
    public static int sum(int a, int b){
        int sum=a+b;
return sum;
   }
    public static void main (String  args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = sum(a, b);
        System.out.println(sum);
    }
}


//import java.util.*;
// public class fuunn {
//     public static int printmyname(String name){
//         System.out.println(name);
//         return 1;
//     }
// public static void main (String args[]){
//     Scanner sc=new Scanner (System.in);
//     String name=sc.next();
//     printmyname(name);
// }
    
// }
