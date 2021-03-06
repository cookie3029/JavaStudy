package day07;

// 캡슐화를 활용
class Person2 {
	private int age = 1;
	
	public void setAge(int age) {
		if(age > 0 && age < 150) {			
			this.age = age;
		} else {
			System.out.println("나이가 이상해요....");
		}
	}
	
	public int getAge() {
		return age;
	}
}

class Person3 {
	
	private String name = "";
	private int age = 1;
	private char bloodType = ' ';
	private double height = 0.0;
	private String addr = "";
	private String tel = "";
	private String idNum = "";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getBloodType() {
		return bloodType;
	}
	
	public void setBloodType(char bloodType) {
		this.bloodType = bloodType;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getIdNum() {
		return idNum;
	}
	
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	
}

public class Test84 {
	public static void main(String[] args) {
	
		/*
			Person2 p = new Person2();
			
			// p.age = 250;
			p.setAge(20);
			
			System.out.println(p.getAge());
		*/
		
		// 연습
		// 이름, 나이, 혈액형, 키, 주소, 전화번호, 주민번호에 해당하는 변수들과
		// get/set 메서드 만들기 (캡슐화) 
		
		Person3 p2 = new Person3();
		
		p2.setName("피카츄");
		p2.setAge(13);
		p2.setBloodType('B');
		p2.setHeight(178.5);
		p2.setAddr("태초마을");
		p2.setTel("010-1234-4321");
		p2.setIdNum("911010-1234567");
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge() + "살");
		System.out.println(p2.getBloodType() + "형");
		System.out.println(p2.getHeight() + "cm");
		System.out.println(p2.getAddr());
		System.out.println(p2.getTel());
		System.out.println(p2.getIdNum());
		
	}
}
