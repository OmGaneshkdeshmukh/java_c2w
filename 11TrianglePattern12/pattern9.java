import java.io.*;
class pattern9{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Row=");
        int row=Integer.parseInt(br.readLine());
        int start=4;
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                if(j<1){
                    System.out.print((char)(96+(2*j+1))+" ");
                }
            }
            start+=(2*i+2);
            System.out.println();
        }
    }
}