class BaiCai{
	int age;
	String name;
	String type;


	void song(){
	System.out.println("我好猥琐");
	}
}




public class CaiCai{
	public static void main(String[] args){
	BaiCai baicai = new BaiCai();
	baicai.age = 18;
	baicai.name = "白菜";
	System.out.println( baicai.age + " 岁的 " + baicai.name + " 大喊 ");
	baicai.song();
	}
}