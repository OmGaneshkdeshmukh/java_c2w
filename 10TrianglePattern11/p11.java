import java.io.*;
class p11 {
    public static void main (String []args )throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter The No Of Rows : ");
        int row = Integer.parseInt(br.readLine());
        
        for (int i=1;i<=row;i++) {
            int ch=64+row;
            for(int j=row;j>=i;j--) {
                System.out.print((char) ch +"\t");
                ch--;
            }
            System.out.println();
        }    
    

    }
}