class Hello{
    private int age;
    public int getAge(){

       return age;
    }
    public void setAge(int age){
        this.age =age;
    }
    
}
class Setmethod {
    public static void main(String [] args){
       
        Hello obj = new Hello();
        obj.setAge(12);
        System.out.println(obj.getAge());
    }
    
} 