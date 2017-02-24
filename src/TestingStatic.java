
public class TestingStatic {
	int val;
	int keyy;
	
	TestingStatic(int val,int keyy){
		this.val = val;
		this.keyy = keyy;
	}
	void fun(){
		System.out.println(this.val);
		System.out.println(this.keyy);
		
	}
	
	public  static  void main(String[] args){
		TestingStatic a = new TestingStatic(50,12) ;
		TestingStatic b = new TestingStatic(150,112) ;
		a.fun();
		b.fun();
		
		
	 }
	}
