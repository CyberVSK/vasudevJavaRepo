import java.util.Scanner;
// public class Lab3{
//     public static void main(String[] args){
//         // 1) using char datatype
//         char[] helloArray={'h','e','l','l','o'};
//         String helloString=new String(helloArray);
//         System.out.println(helloString);
//     }
// }

public class Lab3{
    public void menu(){
        System.out.println("1)add\n2)subtract\n3)multiply\n4)divide");
    }
    public static void main(String[] args){
        //calculator
        System.out.println("|||||||||Calculator|||||||||")
        float num1,num2,total=0;
        
        int choice;
        while(true){
            Scanner obj=new Scanner(System.in);
            num1=obj.nextFloat();
            

            switch (choice){
                case 1:
                total=num1+num2;
                break;

                case 2:
                total=num1-num2;
                break;

                case 3:
                if(num2==0){System.out.println("Division by zero exception");}
                else{total=num1/num2;}
                break;

                case 4:
                total=num1*num2;
                break;
            }
            System.out.println("The output is: "+total);
        }
    }
}