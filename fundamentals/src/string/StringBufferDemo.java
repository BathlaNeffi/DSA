package string;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer str=new StringBuffer("abc");
//		str.setCharAt(0, 'S');
//		System.out.println(str);
		StringBuffer str1=new StringBuffer("");
		for(int i=0;i<5;i++)
		{
		    str1.append((char)(65+i));
		}
		System.out.println(str1);

	}

}
