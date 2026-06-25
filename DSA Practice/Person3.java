 class Person3 {
    int a;
    int b;
    Person3()
    {
        a=20;
        b=30;
    }    
    Person3(int a, int b)
    {
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[]args)
    {
        Person3 obj=new Person3();
        Person3 obj1=new Person3(obj.a,obj.b);

        System.out.println(obj1);
    }
}
