
public class StringEx {

	public static void main(String[] args) {
		
		/*String s1 = "ABC";
		String s2=new String(s1);
		//s1 =s1 + "D";
		
		String st1 = new String("ABC");
		String st2 = new String("ABC");	
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 + " " + s2 + " " + s1==s2);*/
		
		StringBuffer sb1 = new StringBuffer("XYZ");
		StringBuffer sb2 = sb1;
		sb1.append("A");
		
		StringBuilder sbr1 = new StringBuilder("XYZ");
		StringBuilder sbr2 = sbr1;
		sbr1.append("d");
		//System.out.println(sb1);
		//System.out.println(sb2);
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println();
		System.out.println(sbr1==sbr2);
		System.out.println(sbr1.equals(sbr2));
		
		

	}

}
