import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num[]=new int[9];
		int max=0;
		int idx=0;
		for(int i=0;i<9;i++){
			num[i]=sc.nextInt();
			if(max<num[i])
			{
				max=num[i];
				idx=i;
			}			
		}
		System.out.println(max+" "+(idx+1));
	}
}