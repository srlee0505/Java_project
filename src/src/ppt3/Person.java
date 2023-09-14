package src.ppt3;

/**
 * 기본적인 상속을 실습하기 위한
 * 기초 클래스(부모 클래스, 슈퍼 클래스)
 */
public class Person {
	
	// 필드(=멤버 변수) : 보통 private으로 선언하여 보호.
	// 외부에서 접근 불가능. 내부의 메서드를 통하여 접근.
	protected String name;
	private int age;
	private String rrn; 
	
	// default constructor() 
	// 부모클래스에 기본생성자가 없을 경우에는, 자식 클래스에서 부모의 생성자를 무조건 명시하여 호출해야 한다.
	// 부모클래스에 기본생성자가 있는 경우에는, 자식 클래스에서 부모의 생성자 호출을 생략해도, 자동으로 기본 생성자를 호출해준다.
	public Person() {
		System.out.println("Person의 기본 생성자");
	}
	
	// constructor(name, age, rrn)
	public Person(String name, int age, String rrn) {
		System.out.println("Person의 두번째 생성자(매개변수 有)");
		this.name = name;
		this.age = age;
		this.rrn = rrn;
	}

	public void greeting() {
		System.out.println("안녕하세요. 저는 " + name + "입니다." );
	}

}
