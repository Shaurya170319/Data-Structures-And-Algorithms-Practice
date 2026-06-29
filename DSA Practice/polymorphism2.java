//Method Overloading based on type of parametrs
class test2{
    void disp(int x, int y)
    {
        if(x>y)
            System.out.println(x);
        else
            System.out.println(y);
    }
    void disp(float x,float y)
    {
        if(x>y)
            System.out.println(x);
        else
            System.out.println(y);
    }
    void disp(double x,double y)
    {
         if(x>y)
            System.out.println(x);
        else
            System.out.println(y);
    }
    public static void main(String[] args) {
        test2 obj=new test2();
        obj.disp(12,8);
        obj.disp(16f,33f);
        obj.disp(18.88,33.33);
    }
}
