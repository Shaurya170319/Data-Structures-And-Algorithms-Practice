// method overriding 
class test4 {
    void disp(int x,int y)
    {
        int sum=x+y;
        System.out.println(sum);
    }
}
    class childTest4 extends test4{
        void disp(int x,int y)
        {
            int sub = x-y;
            System.out.println(sub);
        }
        public static void main(String[] args) {
            childTest4 obj= new childTest4();
            obj.disp(12,2);
        }
    }
