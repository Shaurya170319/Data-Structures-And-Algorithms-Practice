//1
//11
//111
//1111
//11111
//1111
//111
//11    
//1
class program3 {
    
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
    
}
