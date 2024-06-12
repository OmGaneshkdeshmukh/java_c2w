class while4{
    public static void main(String agrs[]){
        int x=1;
        int y=6;
        while(x<=y){
            if(x%2!=0){
                System.out.print((char)('A'+x-1)+" ");
            }else{
                System.out.print(x+ " ");
            }
            x++;
        }
    }
}