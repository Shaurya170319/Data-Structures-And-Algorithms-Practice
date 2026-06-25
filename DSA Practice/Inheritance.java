//Sinle level inheritance
class Parent
{
    int a=10;
    int b=2;
}
class child extends Parent
{
    int c;
    void disp()
    {
        c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        child obj=new child();
        obj.disp();
    }
}
