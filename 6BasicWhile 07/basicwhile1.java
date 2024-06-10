
 class basicwhile1+ {
    public static void main(String[] args) {
        int asciiValue = 90; 
        while (asciiValue >= 65) { 
            char character = (char) asciiValue; 
            System.out.print(character + " "); 
            asciiValue--; 
        }
    }
}

