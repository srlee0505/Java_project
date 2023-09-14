package src.ppt3;

/**
 * JAVA-PPT3 실습 용 메인 클래스
 * 이 클래스에만 main 메서드 가지도록 구현해 볼 예정.
 */
public class MainClass {

	public static void main(String[] args) {		

		//Person lee = new Person("lee", 20 , "810000-2000000");
		Student lee = new Student();
		System.out.println("-------------------");
		
		Student cho = new Student("cho", 21, "910000-1000000", "한직교", 1, 3);
		
		/*
		 * lee.greeting(); System.out.println("-------------------");
		 * 
		 * cho.greeting(); System.out.println("-------------------\n\n");
		 * 
		 * cho.changeName("Cho Young Ja"); lee.greeting();
		 * System.out.println("-------------------");
		 * 
		 * cho.greeting(); System.out.println("-------------------");
		 */
	}

}


