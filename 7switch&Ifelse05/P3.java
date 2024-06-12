
 class P3 {

    public static void main(String[] args) {
        
        char size = 'M' ;
        
        switch(size) {
            case 'S':
                System.out.println("SMALL ");
                break;
            case 'M':
                System.out.println("MEDIUM");
                break;
            case 'L':
                System.out.println("LARGE");
                break;
            case 'X':
                System.out.println("EXTRA LARGE");
                break;
            default:
                System.out.println("Invalid input.");
        } 
    }
}
 