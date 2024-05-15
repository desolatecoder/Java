public class strings {
    public static void main(String a[]){
        String s1 = "java";
        char ch[]={'s','t','r','i','n','g'};
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]);
        }
        System.out.println(ch.length);
        String s2 = new String(ch);
        String s3 = new String("welcome");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
