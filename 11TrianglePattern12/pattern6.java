import java.io.*;
class pattern6{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=1;
		int row;
		System.out.println("Enter The Rows=");
		row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num+=i+1;
			}
			System.out.println();
			num=i+2;
		}
	}
}

















