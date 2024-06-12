class while10{
    public static void main(String args []){
        long num=9370258878L;
        long sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum Of Digit="+sum);
    }
}