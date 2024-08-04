import java.util.Scanner;
public class Ex1{
    public static void main(String[] args){
        // To initialize an array of element, assign values to them and print the elements
        int[] array=new int[5];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50; 
        for(int i=0;i<5;i++){
            System.out.println("Element at index "+i+": "+array[i]);
        }
    }
}