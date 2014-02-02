public class StaticDemo10{
	public static void main(String[] args){
		for(int i = 0;i<args.length;i++){
			System.out.println("第" + (i+1) + "个参数:" + args[i]);
		}
	}
}