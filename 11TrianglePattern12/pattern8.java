import java.io.*;
class pattern8{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Row=");
        int row=Integer.parseInt(br.readLine());
        int start=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                if(j<1){
                    System.out.print((char)(96+(2*j+3))+" ");
                }
            }
            start+=(2*i+3);
            System.out.println();
        }
    }
}