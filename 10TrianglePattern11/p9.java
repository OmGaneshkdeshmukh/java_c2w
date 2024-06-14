import java.io.*;
class p9 {
    public static void main (String[]args)throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
         System.out.print("Enter The No. of Rows : ");
         int row =Integer.parseInt(br.readLine());
         
        for (int i=1;i<=row;i++) {
            int num=1;
            for (int j=row;j>=i;j--){
                System.out.print(num +"\t");
                num++;
            }
            System.out.println();
        }
    }
}