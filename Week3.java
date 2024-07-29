import java.util.Scanner;

// 1) Amstrong number problem

public class Week3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=scan.nextInt();
        System.out.print("Enter second number: ");
        int num2=scan.nextInt();
        scan.close();

        //ckeck for amstrong number
        int total=0;
        for(int i=num1+1;i<num2;i++){
            int temp=i,temp1=0,len=0,sum=0,digit;
            //finding number of digits
            while(true){
                if(temp>0){
                    temp/=10;
                    len++;
                }
                else{
                        break;
                }
            }

            for(int j=1;j<=len;j++){
                temp=(int)((i/Math.pow(10,len-j)));
                digit=(temp*10-temp1)/10;
                temp1=temp*(int)(Math.pow(10,len-j));
                sum+=Math.pow(digit,len);
            }
            if(sum==i){
                total++;
            }
        }
        System.out.printf("Total number of amstrong numbers are: %d",total);
    }
}


//2) Program to print square star pattern
// public class Week3{
//     public static void main(String[] args){
//         int num;
//         Scanner scan=new Scanner(System.in);
//         System.out.print("Enter length of side of the square: ");
//         num=scan.nextInt();
//         int height;
//         if(num%2!=0){
//                 height=(num+1)/2;
//         }
//         else{
//                 height=num/2;
//         }
//         for(int i=0;i<height;i++){
//             if(i==0 || i==height-1){
//                 for(int j=0;j<num;j++){
//                     System.out.print("*");
//                 }
//                 System.out.print("\n");
//             }
//             else{
//                 for(int j=0;j<num;j++){
//                     if(j>0 && j<num-1){
//                         System.out.print(" ");
//                     }
//                     else{
//                         System.out.print("*");
//                     }
//                 }
//                 System.out.print("\n");
//             }
//         }
//     }
// }



// 3) Program to find LCM of two numbers

// public class Week3{
//     public static void main(String[] args){
//         int num1,num2;
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         num1=scan.nextInt();
//         System.out.print("Enter second number: ");
//         num2=scan.nextInt();

//         int i=1;
//         while(true){
//             if((num1*i)%num2==0){
//                 System.out.println("The LCM of "+num1+" and "+num2+" is: "+num1*i);
//                 break;
//             }
//             i++;
//         }
//     }
// }