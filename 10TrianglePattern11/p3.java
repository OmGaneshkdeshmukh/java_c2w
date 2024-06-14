import java.io.*;
class p3 {
    public static void main(String[] args) throws IOException{
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number Of Row=");
		int row=Integer.parseInt(br.readLine());
           
        for (int i = 1; i <= row; i++) {
            int num=row;
            for (int  j = 1; j <= i; j++) {
                System.out.print(num-- + " ");
            }
            
            
            System.out.println();
          
       
           
        }
    }
}



