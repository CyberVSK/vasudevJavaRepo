public class oneDArrayCloning{
    public static void main(String[] args){
        int intArr[] = {1,2,3};
        int cloneArr[] = intArr.clone();

        //will print false as deep copy is created
        //for 1D array
        System.out.println(intArr==cloneArr);

        for(int i=0;i<cloneArr.length;i++){
            System.out.println(cloneArr[i]);
        }
    }
}
