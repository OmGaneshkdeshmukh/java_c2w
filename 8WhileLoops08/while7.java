class while7{
    public static void main(String [] args){
        int num=93079224;
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println("count of digit="+count);
    }
}