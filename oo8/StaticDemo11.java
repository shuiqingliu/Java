public class StaticDemo11{
	public static void main(String[] args){
		if(args.length != 3){
			System.out.println("输入参数不足三个");
			System.exit(1);
		}
		for(int i = 0;i<args.length;i++){
			System.out.println("第" + (i+1) + "个参数:" + args[i]);
		}
	}
}