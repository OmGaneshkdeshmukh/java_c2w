class while5{
    public static void main(String agrs[]){
        int row=4;
        int num=1;
        int count=0;
        while(count < row){
            int col=0;
            while(col< row){
                System.out.print(num+" ");
                num+=2;
                col++;
            }
            System.out.println();
            count++;
        }
    }
}