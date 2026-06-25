 class Person2 {
    int a;
    int b;
   Person2()
    {
        a=20;
        b=40;
    }
    void disp()
    {
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[]aStrings)
    {
        Person2 obj=new Person2();
        obj.disp();
    }
}
