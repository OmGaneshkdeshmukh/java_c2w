import java.io.*;
class p2 {
    public static void main(String[] args) throws IOException{
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number Of Row=");
		int row=Integer.parseInt(br.readLine());
        //int num =1;
        for (int i = 1; i <= row; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j +"\t");
                
            }
            
            System.out.println(); 
            
        }
    }
}
