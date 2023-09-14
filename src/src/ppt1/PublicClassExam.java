package src.ppt1;

public class PublicClassExam {
	
	// 필드(멤버 변수)
	public int 		publicA;
	protected int	protectedA;
	int				defaultA;
	private int		privateA;
	
	// 생성자
	public PublicClassExam()			{System.out.println("public 생성자");}
	protected PublicClassExam(int a)	{System.out.println("protected 생성자");}
	PublicClassExam(double a)			{System.out.println("default 생성자");}
	private PublicClassExam(String a)	{System.out.println("private 생성자");}
	
	// 메서드(멤버 함수)
	public void publicFn() 		{System.out.println("public 메서드");}
	protected void protectedFn(){System.out.println("protected 메서드");}
	void defaultFn()			{System.out.println("default 메서드");}
	private void privateFn()	{System.out.println("private 메서드");}

}

class DefaultClassExam{

	
}

