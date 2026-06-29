// Dynamic Polymorphism
class A {
    void disp()
    {
        System.out.println("A class");
    }
}
class B extends A
{
    void disp()
    {
        System.out.println("B class");
    }
}
class C extends A
{
    void disp()
    {
        System.out.println("C class");
    }
    public static void main(String[] args) {
        A m=new A();
        B n=new B();
        C o=new C();
        A obj;
        obj=m;
        obj.disp();
        obj=n;
        obj.disp();
        obj=o;
        obj.disp();
    }
}
