
 interface Computer{
    void run();
}
 class Laptop implements Computer {
    public void run(){
        System.out.println("In laptop");
    }

    
}
class Mobile implements Computer{
    public void run(){
        System.out.println("In mobile");
    }
}
public class Example {
    public static void main(String[] args) {

        Computer m = new Mobile();
       m.run();
        
    }
    
}
