public class ClassFunction {
    static void Method(){
        System.out.println("Static method can be called without creating objects");
    }

    public void Method2(){
        System.out.println("Public methods can be called only vai an object of that class");
    }
    public static void main(String[] args){
        Method();
        ClassFunction obj = new ClassFunction();
        obj.Method2();
    }
}
