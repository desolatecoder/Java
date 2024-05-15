class A{
    public void show(){

        System.out.println("this is in A class");
    }
}

public class Anonymous {
    public static void main(String[] args) {

        A obj = new A()
        {
            public void show(){
                System.out.println("this is in anonymous class");
            }
        };
        obj.show();

        



    }
    
}


