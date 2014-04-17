import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputData{
	private BufferedReader buf = null;
	public InputData(){		//只要输入数据就执行此内容
		this.buf = new BufferedReader(new InputStreamReader(System.in));		//读取键盘操作
	}
	public String getString(String info){		//得到字符串信息
		String temp = null;
		System.out.print(info);		//打印信息
		try{
			temp = this.buf.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		return temp;
	}
	public int getInt(String info,String error){
		int temp = 0;
		String str = null;
		boolean flag = true;
		while(flag){
			str = this.getString(info);		//调用getString方法取得信息
			if(str.matches("^\\d+$")){		//判断是否由数字组成
				temp = Integer.parseInt(str);		//转型
				flag = false;		//结束循环
			}else{
				System.out.println(error);		//打印错误信息
			}
		}
		return temp;
	}

}