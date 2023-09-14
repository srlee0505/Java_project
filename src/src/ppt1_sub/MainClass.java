package src.ppt1_sub;
import src.ppt1.PublicClassExam;

public class MainClass extends PublicClassExam {
	public MainClass() {
		//super();
		super(10);
		//super(10.5);
		//super("private");
	}
	
	public void test() {
		publicA = 10;
		protectedA = 10;
		//defaultA = 10;
		//privateA = 10;
		
		publicFn();
		protectedFn();
		//defaultFn();
		//privateFn();
	}
	
	public static void main(String[] args) {
		PublicClassExam instanceA1 = new PublicClassExam();
		//PublicClassExam instanceA2 = new PublicClassExam(10);	// 이건 안 됨!
		//PublicClassExam instanceA3 = new PublicClassExam(10.5);
		//PublicClassExam instanceA4 = new PublicClassExam("private");
		
		instanceA1.publicA = 10;
		//instanceA1.protectedA = 10; // 안 됨
		//instanceA1.defaultA = 10;
		//instanceA1.privateA = 10;
		
		instanceA1.publicFn();
		//instanceA1.protectedFn();	// 안 됨
		//instanceA1.defaultFn();
		//instanceA1.privateFn();
		
		MainClass instanceA2 = new MainClass();
		instanceA2.publicFn();
		instanceA2.protectedFn();	
	}
}

