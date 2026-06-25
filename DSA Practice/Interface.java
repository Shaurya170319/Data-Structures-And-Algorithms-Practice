interface person {
    void disp();
}
interface student extends person
{
    void input();
}
class employee implements student
{
    public void disp()
    {
        System.out.println("basic interface");
    }
    public void input()
    {
        System.out.println("advanced interface");
    }
    public static void main(String[] args) {
        employee obj=new employee();
        obj.disp();
        obj.input();
    }
}

