// //SWITCH STATEMENT
import java.util.*;

public class Fourth {
    public static void main(String[] args) {
        int marks;
        Scanner sc =new Scanner(System.in);
        marks=sc.nextInt();
        switch (marks / 10) {
            case 10:
            case 9:
            //90-100
                System.out.println("GRADE A ");
                break;
        case 8:
        case 7:
        //70-89
        System.out.println("GRADE B");
        break;
    
        case 6:
        //60-69
        System.out.println("Grade c");
         break;
    
        case 5:
        case 4:
        //40-59
        System.out.println(" Grade d");
        break;
    
            default:
            System.out.println("THIRD OR fail");
                break;
        }
       // System.out.println(marks);
    }
        
    }