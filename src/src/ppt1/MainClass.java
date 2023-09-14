package src.ppt1;

public class MainClass {
	public static void main(String[] args) {
		// 동일 패키지
		PublicClassExam instanceA1 = new PublicClassExam();
		PublicClassExam instanceA2 = new PublicClassExam(10);
		PublicClassExam instanceA3 = new PublicClassExam(10.5);
		//PublicClassExam instanceA4 = new PublicClassExam("private");
		
		instanceA1.publicA = 10;
		instanceA1.protectedA = 10;
		instanceA1.defaultA = 10;
		//instanceA1.privateA = 10;
		
		instanceA1.publicFn();
		instanceA1.protectedFn();
		instanceA1.defaultFn();
		//instanceA1.privateFn();
	}
}

class Calc{
	
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	int add(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	
	double add(double a, double b) {
		double sum = a+b;
		return sum;
	}
	
	double add(double a, double b, double c) {
		double sum = a + b + c;
		return sum;
	}
	
	
}


