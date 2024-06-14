import java.io.*;
class p10{
    public static void main (String []args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the No Of Rows : ");
        int row =Integer.parseInt(br.readLine());
        
        for (int i=1;i<=row;i++) {
            int num=i;
            for(int j=row;j>=i;j--) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }

    }
}