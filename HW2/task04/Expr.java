class Expr {
    public static String expr(char a) throws Exception {
        if (a == ' ') {
            throw new Exception("Empty string has been input.");
        }

        return String.format("Your input was - %s", a);
    }
}
