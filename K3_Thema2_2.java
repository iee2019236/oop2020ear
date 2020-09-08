class K3_Thema2_2 {
    public static void main(String[] args) {
        System.out.println(array11(new int[] { 1, 2, 11 }, 0));
        System.out.println(array11(new int[] { 11, 5, 4, 11 }, 0));
        System.out.println(array11(new int[] { 11, 5, 4, 11 }, 2));
        System.out.println(array11(new int[] { 1, 2, 3, 4 }, 0));
    }

    public static int array11(int[] pinakas, int thesi) {
        if (thesi < pinakas.length)
            if (pinakas[thesi] == 11)
                return 1 + array11(pinakas, thesi + 1);
            else
                return 0 + array11(pinakas, thesi + 1);
        else
            return 0;
    }
}
