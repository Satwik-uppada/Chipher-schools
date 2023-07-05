package Access_modifiers1;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.x); //default is accessible in same package
       // System.out.println(obj.y); //private is not accessible in same package
        System.out.println(obj.w);
        System.out.println(obj.z);
    }
}
