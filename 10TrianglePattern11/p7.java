import java.io.*;
class p7 {
    public static void main(String[] args) throws IOException{
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number Of Row=");
		int row=Integer.parseInt(br.readLine());
      
        for (int i = 1; i <= row; i++) {
          //int num=1;
            for (int j = row; j >= i; j--) {
                System.out.print("*" +"\t");
                
            }
            
            System.out.println(); 
            
        }
    }
}
