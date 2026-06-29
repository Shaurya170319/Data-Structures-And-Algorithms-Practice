//method overloading based on sequence of parameters
class test3 {
    void disp(int x,char y)
    {
        System.out.println(x);
        System.out.println(y);
    }
    void disp(char y,int x)
    {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        test3 obj=new test3();
        obj.disp(12,'m');
        obj.disp(21,'z');
    }
}
