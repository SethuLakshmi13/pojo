
public class StringDemo {

	public static void main(String[] args) {
	String s="Good Morning";
	String b="GOOD MORNING";
	int i;
	int a=90;
	String str="abc";
	char[]s1=s.toCharArray();
	for(i=0;i<s1.length;i++) {
		System.out.println(s1[i]);
	
	}
	String s2=(String) s.subSequence(0,4);	
	System.out.println(s2);
	String s3=String.valueOf(a);
	System.out.println(s3);
	String s4=s.concat(str);
	System.out.println(s4);
	System.out.println(s.contains("Good")); 
	char c = s.charAt(5);	
	System.out.println(c);
	System.out.println(s.compareToIgnoreCase(str));
	System.out.println(s.replace("o","y"));
	System.out.println(s.trim());
	
		StringBuffer sb=new StringBuffer("Hello");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		sb. deleteCharAt(6);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.codePointAt(3));
		System.out.println(sb.reverse());
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		
		
		StringBuilder sbb=new StringBuilder("Hello String Builder");
		sbb.append("Java");//now original string is changed  
		System.out.println(sbb);//prints Hello Java  
		sbb. deleteCharAt(6);
		System.out.println(sbb);
		System.out.println(sbb.capacity());
		System.out.println(sbb.codePointAt(3));
		System.out.println(sbb.reverse());
		sbb.trimToSize();
		System.out.println(sbb.capacity());
	}

}
