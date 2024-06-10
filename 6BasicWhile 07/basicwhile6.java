 class basicwhile6 {
    public static void main(String[] args) {
        char currentChar = 'A';
        while (currentChar <= 'Z') {
            if (currentChar != 'A' && currentChar != 'E' && currentChar != 'I' && currentChar != 'O' && currentChar != 'U') {
                System.out.print(currentChar + " ");
            }
            currentChar++;
        }
    }
}
