public class RegexDemo01{
	public static void main(String[] args){
		String str = "0123456789";       //此字符串由数字组成
		boolean flag = true;            //定义一个标记变量
		char c[] = str.toCharArray();   //字符串转换为字符数组
		for(int i = 0;i< c.length;i++){  //循环依此判断
			if(c[i] < '0' | c[i] >'9'){   //如果满足条件，则表示不是数字
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("是由数字组成");
		}else{
			System.out.println("不是由数字组成");
		}
	}
}