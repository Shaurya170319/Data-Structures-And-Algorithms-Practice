//Method Overloading based on number of Parameter (Type 1)
class test {
    void disp(int x,int y)
    {
        System.out.println(x+y);
    }
    void disp(int x, int y,int z)
    {
        System.out.println(x+y+z);
    }
    public static void main(String[] args) {
        test obj=new test();
        obj.disp(12,2);
        obj.disp(1,2,3);
    }
}
