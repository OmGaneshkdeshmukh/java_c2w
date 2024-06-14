import java.io.*;
class p8 {
    public static void main(String[] args) throws IOException{
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Number Of Row=");
		int row=Integer.parseInt(br.readLine());
        int num=row;
        for (int i = 1; i <= row; i++) {
         
            for (int j = row; j >= i; j--) {
                System.out.print(num +"\t");
               
            }
            num--;
            System.out.println(); 
           
        }
    }
}
