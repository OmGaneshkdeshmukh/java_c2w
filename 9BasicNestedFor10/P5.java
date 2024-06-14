 class P5 {
    public static void main(String[] args) {
        int rows = 3;
        int Ch = 65; 

        
        for (int i = 0; i < rows; i++) {
            int Chh = Ch + (i * 2); 
            for (int j = 0; j < rows; j++) {
                System.out.print((char) Ch + " ");
                Ch += 2; 
            }
            System.out.println(); 
        }
    }
}
