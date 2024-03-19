//import java.util.*;

//public class Six {
    // public static void main(String[] args) {
    //      int i,sum=0;
    //      Scanner sc = new Scanner (System.in);
    //      int n=sc.nextInt();
    //      for (i=1;i<=n;i++) {
    //         sum=sum+i;
    //      }
    //      System.out.println(sum);
//     }
// }

// Sum of  all even number
import java.util.*;
public class Six{
public static void main (String args[]){

 Scanner sc= new Scanner (System.in);
 int i,sum=0;
 int n =sc.nextInt();
 for(i=1;i<=n;i++){
    if(i%2 ==0) {
        //if(i%2!==0) for odd all 
        sum=sum + i;
    }
 }
 System.out.println(sum);

}
}
