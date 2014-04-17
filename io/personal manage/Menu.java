import java.io.*;
public class Menu{
	public Menu(){
		show();
	}
	public void show(){
		System.out.println("======个人管理系统======");
		System.out.println("[1].增加数据");
		System.out.println("[2].删除数据");
		System.out.println("[3].更新数据");
		System.out.println("[4].查看数据");
		System.out.println("[0].退出系统");
		InputData input = new InputData();
		/*调用InputData的getInt方法*/
		int i = input.getInt("请输入选项:","输入选项不正确,请重新输入");		
		switch(i){
			case 1:{
				Operate.add();
				break;
			}
			case 2:{
				Operate.delete();
				break;
			}
			case 3:{
				Operate.update();
				break;
			}
			case 4:{
				Operate.find();
			}
			case 0:{
				System.exit(1);
				break;
			}
			default:{
				System.out.println("请选择正确的操作!");
			}
		}
	}

}