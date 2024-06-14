 class P7 {
    public static void main(String[] args) {
        int rows = 3;
        for (int i = 0; i < rows; i++) {
            char ch = 'A'; 
            for (int j = 1; j <= rows; j++) {
                System.out.print(j + "" + ch + " "); 
                ch++; 
            }
            System.out.println(); 
        }
    }
}
