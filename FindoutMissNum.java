package Practice1;

import java.util.Date;

interface Int{
	 void find(int a);
}

abstract class Find{
abstract int find(int d);
}

public  class FindoutMissNum {
	public static void main(String[] args) {
		int a[] = {1,3,6,10,12};
		int b[] = new int[a[a.length-1]-a.length+1];
		for(int n=0;n<a[0];n++){
			b[n]=n;
			
		}
		int c=a[0];
			for(int i=0; i<a.length-1;i++) {
				for (int j = i+1; j < b.length; j++) {
					int d = a[j]-a[i];
					for (int k = 1; k < d; k++) {
						//System.out.println("K " + a[i]+k);
						b[c]= a[i]+k;
						c++;
					}
					break;
				}
			}
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
	/*		FindoutMissNum n = new FindoutMissNum();
			int a = n.find(1);
			System.out.println(a);
		}

	@Override
	public int find(int a) {
		// TODO Auto-generated method stub
		return a;
	}*/

	
	
	}

		
	
}
