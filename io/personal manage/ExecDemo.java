public class ExecDemo{
	public static void main(String[] args) throws Exception{
		int j = 0;
		int i = 0;
		InputData input = new InputData();		//实例化InputDate对象
		i = input.getInt("请输入第一个数:","输入的不是数字请重新输入");		//调用getInt方法
		j = input.getInt("请输入第二个数:","输入的不是数字请重新输入");
		System.out.println( i  + "+"  + j + "= " + (i + j));
	}
}