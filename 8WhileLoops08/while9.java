class while9{
    public static void main(String args[]){
        int num=214367689;
        int odd=0;
        int even=0;

        while(num > 0){
            int digit=num%10;
            if(digit%2==0){
                even++;
            }else{
                odd++;
            }
            num /=10;
        }
        System.out.println("odd="+odd);
        System.out.println("even="+even);
    }
}