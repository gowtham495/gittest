package pack;

public class add {
	
	int a,b;

	public add(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int addition(int a,int b)
	{
		return a+b;
	}
	
	//edited in git
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add obj=new add(9,2);
		System.out.println(obj.addition(2,2));
		System.out.println(obj.addition(3,2));
		

	}

}
