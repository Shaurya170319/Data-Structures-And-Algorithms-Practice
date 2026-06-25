//Hierarchical inheritance
class child1 extends Parent{
    child1()
    {
        a=20;
        b=40;
    }
    void disp()
    {
        System.out.println(a+b);
    }
}
class child2 extends Parent{
    child2()
    {
        a=20;
        b=40;
    }
    void disp()
    {
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        child1 obj1=new child1();
        obj1.disp();
        child2 obj2=new child2();
        obj2.disp();
    }
}
