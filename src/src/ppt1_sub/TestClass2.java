package src.ppt1_sub;

import src.ppt1.SystemOutPrintln;

public class TestClass2 extends SystemOutPrintln {
	
	public static void main(String[] args) {
		TestClass2 myclass = new TestClass2();
		myclass.test();   // 1
		
		TestClass2 myclass2 =  new TestClass2();
		myclass2.test();  // 1
	}
	
	
	public void test() { 
		//test2(); // protected
	}
	
}

