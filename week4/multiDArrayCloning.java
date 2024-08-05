public class multiDArrayCloning {
    public static void main(String[] args){
        int intArr[][] = {{1,2,3},{4,5}};
        int cloneArr[][] = intArr.clone();

        //will print false
        System.out.println(intArr==cloneArr);
        System.out.println(intArr[0]==cloneArr[0]);
        System.out.println(intArr[1]==cloneArr[1]);
    }
}
