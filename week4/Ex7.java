public class Ex7{
    public static int sum(int arr[]){
        int sum=0;
        for(int m:arr){
            sum+=m;
        }
        return sum;
    }
    public static void main(String[] args)    {
        int arr[]={3,1,2,5,4};
        System.out.println("Sum of array values: "+sum(arr));
    }
}
