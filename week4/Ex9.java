public class Ex9 {
    public static void main(String[] args)    {
        int intArr[] = new int[2];
        byte byteArr[] = new byte[2];
        short shortArr[] = new short[2];
        String stringArr[] = new String[2];
        System.out.println(intArr.getClass());
        System.out.println(intArr.getClass().getSuperclass());
        System.out.println(byteArr.getClass());
        System.out.println(shortArr.getClass());
        System.out.println(stringArr.getClass());
    }
}
