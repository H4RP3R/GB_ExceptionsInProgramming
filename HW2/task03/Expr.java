class Expr {

    public static double expr(int a, int b) {
        if (b == 0) {
            System.out.println(a);
            return 0;
        }
        printSum(a, b);
        return (double) a / b;
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);

    }
}
