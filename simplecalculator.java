import java.util.*;
class calculator{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       char ch = sc.next().charAt(0);
       switch(ch){
           case '+':
               System.out.println(num1+num2);
               break;
           case '-':
               System.out.println(num1-num2);
               break;
           case '*':
               System.out.println(num1*num2);
               break;
           case '/':
               System.out.println(num1/num2);
               break;
           case '%':
               System.out.println(num1%num2);
               break;
           default:
                System.out.println("invalid choice");
               
        
               
               
       }
       
    }
}