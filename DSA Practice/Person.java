 class Person {
    Person(int a,int b)
    {
        int sum=a+b;
        System.out.println("sum" + sum);
    }
    public static void main(String[]args)
    {
        Person obj=new Person(12,2);
        System.out.println(obj);//using the obj to avoid warning -:The value of the local variable obj is not used
    }
    
}
