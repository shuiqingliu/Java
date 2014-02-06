public class LoginDemo01{
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("输入参数不合理");
			System.out.println("格式: java LoginDemo01 用户名 密码");
			System.exit(1);
		}
		String name = args[0];
		String password = args[1];
		if(name.equals("qingliu")&&password.equals("123456")){
			System.out.println("欢迎" + name + "登陆");
		}else{
			System.out.println("输入的用户名或密码不正确");
		}
	}
}