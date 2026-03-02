package lesson_6;



class Student{
    int id;
    String name;
    float marks;
    Student(){}
        Student(int id){
            this.id=id;
            
            
        }
        Student(int id,String name){
            this.id=id;
            this.name=name;
        }

        Student(int id,String name,float marks){
            this.id=id;
            this.name=name;
            this.marks=marks;
        }
        void displaydetail(){
            System.out.println(this.id+"|"+this.name+"|"+this.marks);

        }
    
}

public class main_homework {
    public static void main(String[] args) {
        Student st0=new Student();
        Student st1=new Student(123);
        Student st2=new Student(121,"Atharv");
        Student st3=new Student( 125,"samviya",95);

        st0.displaydetail();
        st1.displaydetail();
        st2.displaydetail();
        st3.displaydetail();

    }
    
}
