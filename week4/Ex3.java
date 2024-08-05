class Student{
    public String name;
    Student(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}

public class Ex3{
    public static void main(String[] args){
        //declares an array and initializing the elements of the array
        Student[] myStudents = new Student[]{
            new Student("Dharma"),new Student("sanvi"),new Student("rupa"),new Student("ajay")
        };
        for(Student m:myStudents){
            System.out.println(m);
        }
    }
}