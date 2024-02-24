class Expr {

    public static double expr(int[] intArray, int d) {

        if (d == 0) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Double.NaN;
        } else if (intArray.length < 9) {
            System.out.println(
                    "It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Double.NaN;
        } else {
            double result = (double) intArray[8] / d;
            String msg = String.format("intArray[8] / d = %s / %s = %s", intArray[8], d, result);
            System.out.println(msg);
            return result;
        }
    }
}
