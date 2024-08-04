public class String_Buffer{
    public static void main(String[] args){
        // 1) append() method in StringBuffer
        // StringBuffer sb=new StringBuffer("Hello");
        // sb.append("Java"); //now original string is changed
        // System.out.println(sb);//prints Hello Java


        // 2) insert() method in StringBuffer
        // StringBuffer sb=new StringBuffer("Hello");
        // sb.insert(1,"Java");// now original string is changed
        // System.out.println(sb);//prints HJavaello


        // 3) replace() method in StringBuffer
        // StringBuffer sb=new StringBuffer("Hello");
        // sb.replace(1,3,"Java");//index 1 ot 3 of Hello will be replaced(excluding 3)
        // System.out.println(sb);// prints HJavalo


        // 4) delete() method in StringBuffer
        // StringBuffer sb=new StringBuffer("Hello");
        // sb.delete(1,3);//deletes all values from index 1 to 3(excluding 3)
        // System.out.println(sb);//prints Hlo


        // 5) reverse() method in StringBuffer
        // StringBuffer sb=new StringBuffer("Hello");
        // sb.reverse();
        // System.out.println(sb);//prints olleH


        // 6) capacity() method in StringBuffer
        // StringBuffer sb=new StringBuffer();
        // System.out.println(sb.capacity());// default 16
        // sb.append("Hello");
        // System.out.println(sb.capacity());//now 16
        // sb.append("Java is my favourite language");
        // System.out.println(sb.capacity());//now (16*2)+2=34 i.e (capacity*2)+2


        // 7) ensureCapacity() method in StringBuffer
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());// default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("Java is my favourite language");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (old capacity*2)+2
        sb.ensureCapacity(10);//now no change
        System.out.println(sb.capacity());//now 34
        sb.ensureCapacity(50);//now (34*2)+2=70
        System.out.println(sb.capacity());
    }
}
