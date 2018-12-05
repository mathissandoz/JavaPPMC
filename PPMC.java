import java.util.Scanner;

public class PPMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean pp2 = false;
		int mppp2;
		int mpp3;
		boolean pp3;
		int mpp2;
		
		Scanner sc = new Scanner(System.in);
				int i = sc.nextInt();
		
		mpp2 = i % 2;
		if (mpp2 == 0)
			pp2 = true;
			
		else
		{
			
			
		
		if (pp2 == true)
			mppp2 = i / 2;
			else
			{
				mpp3 = i % 3;
				if (mpp3 == 0)
					pp3 = true;
				
			}
		}
	}

}
