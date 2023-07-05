package Access_modifiers2;
import Access_modifiers1.A;
public class C extends A{
    public static void main(String[] args) {
        A obj = new A();
        C childObj = new C();
        //System.out.println(obj.x); //default is not accessible outside the package
        System.out.println(obj.w);
        //System.out.println(obj.z); // not accessible for outside the package
        System.out.println(childObj.z); //protected will be visible in different package in subclass,using obj of child class
    }
}
