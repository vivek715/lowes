public class sample {
    public static void main(String[] args) {
       int i =10;
       method(i);


    }
    static void method(Object o){
        System.out.println("boj");
    }
    static void method(Number n){
        System.out.println("num");
    }
}
