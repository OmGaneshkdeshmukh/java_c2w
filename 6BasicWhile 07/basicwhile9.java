 class basicwhile9 {
    public static void main(String[] args) {
        int start = 150;
        int end = 101;
        int sum = 0;
        if (start % 2 == 0) {
            start--;
        }
        while (start >= end) {
            sum += start;
            start -= 2; 
        }
        System.out.println( sum);
    }
}
