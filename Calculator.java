import java.util.Scanner;

public class Calculator{
    public static void menu(){
        System.out.println("1)add 2)subtract 3)divide 4)multiply 5)exit");
    }
    public static void main(String[] args){
        //calculator
        System.out.println("|||||||||Calculator|||||||||\n");
        float num,total=0;
        int choice=0;

        System.out.print("Enter number: ");
        Scanner obj=new Scanner(System.in);
        num=obj.nextFloat();
        total=num;
        while(true){
            menu();
            System.out.println("Enter choice: ");
            choice=obj.nextInt();
            if(choice==5){
                System.out.println("Exiting...");
                break;
            }
            else if(choice>5){
                System.out.println("Invalid choice!!!Enter again");
                continue;
            }
            System.out.print("Enter number: ");
            num=obj.nextFloat();         
            
            switch (choice){
                case 1:
                total+=num;
                break;

                case 2:
                total-=num;
                break;

                case 3:
                if(num==0){
                    System.out.println("Division by zero is not possible !!!");
                }
                else{total/=num;}
                break;

                case 4:
                total*=num;
                break;
            }
            System.out.println("The resultant is: "+total);            
        }
    }
}