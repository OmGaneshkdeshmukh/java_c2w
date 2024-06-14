import java.io.*;
class p12{
    public static void main (String []args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the No Of Rows : ");
        int row =Integer.parseInt(br.readLine());
        
        for (int i=1;i<=row;i++) {
            int ch=65;
            //int num=i;
            for(int j=row;j>=i;j--) {
                if (j%2==1) {
                    System.out.print((char)ch +"\t");
                }
                else {
                    System.out.print(ch +"\t");
                }
                ch++;
                
            }
            System.out.println();
        }

    }
}