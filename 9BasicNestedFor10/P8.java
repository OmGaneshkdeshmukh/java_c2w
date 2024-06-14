 class P8 {
    public static void main(String[] args) {
        int rows = 3;
        for (int i = 0; i < rows; i++) {
            char ch = 'c'; 
            for (int j = 0; j < rows; j++) {
                System.out.print(ch + " "); 
                ch--; 
            }
            System.out.println(); 
        }
    }
}
