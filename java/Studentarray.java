class Student{
    int rollno;
    String name;
    int marks;
}
public class Studentarray {
 public static void main(String args[]){

    Student s1=new Student();
        s1.name= "sai";
        s1.rollno=2;
        s1.marks=19;
    Student s2=new Student();
        s2.name= "rakesh";
        s2.rollno=3;
        s2.marks=24;
    Student s3=new Student();
        s3.name= "daksh";
        s3.rollno=4;
        s3.marks=50;
    Student students[] = new Student[3];
        students[0] =s1;
        students[1] =s2;
        students[2] =s3;

    for(int i=0;i<students.length;i++){
        System.out.println(students[i].name +" :" + students[i].marks);
    }


 }   
}