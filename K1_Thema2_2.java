class K1_Thema2_2 {
    public static void main(String[] args) {
        System.out.println(se(2, 3));
        System.out.println(se(2, 2));
        System.out.println(se(2, 1));
        System.out.println(se(2, 0));
    }

    public static double se(double x, double y) {
        if (y == 0)
            return 1;
        else
            return Math.pow(x, se(x, y - 1));
    }
}
