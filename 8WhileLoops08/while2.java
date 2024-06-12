class while2{
    public static void main(String agrs[]){
        int x=150;
        int y=100;
       
        
        while(x<=y){
            int c=x*x;     
            if(c%2==1){
                System.out.println(x+" ");
            }
            x++;
        }
    }
}