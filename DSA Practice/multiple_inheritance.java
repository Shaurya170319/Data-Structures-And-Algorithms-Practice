//multiple inheritance
interface a {
    void disp();    
}
interface b
{
    void input();
}
class c implements a,b
{
    public void disp()
    {
        System.out.println("Basic example");
    }
    public void input()
    {
        System.out.println("multiple inheritance example");
    }
    public static void main(String[] args) {
        c obj=new c();
        obj.disp();
        obj.input();
    }
}
