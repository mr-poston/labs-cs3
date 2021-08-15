public class HashCode {
	public static void main ( String[] args ) {
		
		Character c = 'a';
		System.out.println(c.hashCode());
		
		c = '0';
		System.out.println(c.hashCode());
		
		c = 'A';
		System.out.println(c.hashCode());     
		
		Integer num = 45;
		System.out.println(num.hashCode());
		
		num = 101;
		System.out.println(num.hashCode());  
		
		String s = "a";		
		System.out.println(s.hashCode());  
		
		s = "ab";		
		System.out.println(s.hashCode());      //how exactly did this number come up? 	     	   
	}
}