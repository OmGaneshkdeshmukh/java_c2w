import java.io.*;
class pattern7{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Number Of Rows=");
        int row=Integer.parseInt(br.readLine());
        for(int i=0;i<row;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.print((char)(96+i)+" ");
        }
        System.out.println(" ");
    }
}