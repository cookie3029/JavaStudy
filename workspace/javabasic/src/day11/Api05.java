package day11;

public class Api05 {
	public static void main(String[] args) {
		
		int i = 20;
		Integer intobj = i;
		
		int j = intobj + 10;
		
		// 문자열 -> 기본형
		int a = Integer.parseInt("123");
		boolean b = Boolean.parseBoolean("true");
		double d = Double.parseDouble("3.14");
		
		int x = 10;
		Object obj = x;
		System.out.println(obj.getClass());
		
		
		
		
		
		
		/*
			Integer i = new Integer(10);
			int ii = i.intValue();
			int iii = i; // 자동 언박싱
			
			int a = 10;
			Integer iCls = a; // 자동 박싱
			
		
			
			
			
			
			
			
			Float f = new Float(3.14F);
			Double d = new Double("3.14");
	
			Character c = new Character('c');
			
			Boolean b = new Boolean(true);
		*/
		
	}
}
