 class P10 {
    public static void main(String[] args) {
        int rows = 4;
        int x = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(  x++ + " "); 
            }
            System.out.println(); 
        }
    }
}
