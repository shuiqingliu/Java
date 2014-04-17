public class Operate{
	public static void add(){		//增加
		System.out.println("增加操作");
		InputData input = new InputData();		//实例化输入数据对象
		FileOperate fo = new FileOperate("d:\\test.txt");		//实例话FileOperate类
		String name = input.getString("请输入姓名:");		//取得name;
		int age = input.getInt("请输入年龄:","年龄必须为数字请重新输入");
		Person per = new Person(name,age);		//实例化person对象
		try{
			fo.save(per);		//保存对象
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	public static void delete(){		//删除
		System.out.println("删除操作");
		FileOperate fo = new FileOperate("d:\\test.txt");
		try{
			fo.save(null);		//保存对象
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("删除成功");
	}
	public static void update(){		//更新
		System.out.println("更新文件");
		FileOperate fo = new FileOperate("d:\\test.txt");		//实例话FileOperate类
		Person per = null;
		try{
			per = (Person)fo.load();

		}catch(Exception e){
			e.printStackTrace();
		}
		InputData input = new InputData();		//实例化输入数据对象
		String name = input.getString("请输入姓名(原姓名:"+ per.getName() + "):");		//取得name;
		int age = input.getInt("请输入年龄(原年龄:"+per.getAge()+ "):","年龄必须为数字请重新输入");
		per = new Person(name,age);		//实例化person对象
		try{
			fo.save(per);		//保存对象
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	public static void find(){		//查看
		System.out.println("查看信息");
		FileOperate fo = new FileOperate("d:\\test.txt");		//实例话FileOperate类
		Person per = null;
		try{
			per = (Person)fo.load();

		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(per);
	}
}