import java.io.*;
class p4 {
    public static void main(String[] args) throws IOException{
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number Of Row=");
		int row=Integer.parseInt(br.readLine());
        int ch=65;
        for (int i = 1; i <= row; i++) {
            
            for (int  j = 1; j <= i; j++) {
                
                System.out.print((char)ch + " ");
                ch++;
            }
           
            
            System.out.println();
          
       
           
        }
    }
}



