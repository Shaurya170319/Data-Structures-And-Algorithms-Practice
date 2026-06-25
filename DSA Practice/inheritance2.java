//Multi -level inheritance
class grandfather {
    int c=0;
}
class father extends grandfather
{
    int a=20;
    int b=70;
}
class grandchild extends father{
    void disp()
    {
        c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        grandchild obj=new grandchild();
        obj.disp();
    }
}
