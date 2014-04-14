import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;
public class PushbackInputStreamDemo{
	public static void main(String[] arsg) throws Exception{    //所有异常抛出
		String str = "www.shuiqingliu.com";                     //定义字符串
		PushbackInputStream pis = null;                         //定义回退流对象
		ByteArrayInputStream bai = null;                        //定义内存输入流
		bai = new ByteArrayInputStream(str.getBytes());         //实例化内存输入流
		pis = new PushbackInputStream(bai);                     //从内存中读取数据
		System.out.print("读取后的数据为:");
		int temp = 0;
		while((temp = pis.read())!=-1){                         //读取内容
			if(temp == '.'){                                    //判断是否读到了'.'
				pis.unread(temp);                               //放回缓冲区
				temp = pis.read();                              //再读一遍
				System.out.println("(退回" + (char)temp + ")" );
			}else{
				System.out.print((char)temp);
			}
		}
	}
}