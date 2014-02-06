class Check{
	public boolean validate(String name,String password){
		if(name.equals("qingliu")&&password.equals("123456")){
			return true;
		}else{
			return false;
		}
	}
}
class Operate{
	private String info[];
	public Operate(String info[]){
		this.info = info;
	}
	public void isExit(){
		if(this.info.length !=2){
			System.out.println("输入参数不合理");
			System.out.println("格式: java LoginDemo01 用户名 密码");
			System.exit(1);
		}
	}
	public String login(){
		Check che = new Check();
		this.isExit();
		String str = null;
		String name = this.info[0];
		String password = this.info[1];
		if(che.validate(name,password)){
			str = "欢迎" + name + "登陆";
		}else{
			str = "输入的用户名或密码不正确";
		}
		return str;
	}
}
public class LoginDemo02{
	public static void main(String[] args){
		Operate op = new Operate(args);
		System.out.println(op.login());
	}
}