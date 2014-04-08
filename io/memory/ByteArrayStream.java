import java.io.*;
public class ByteArrayStream{
	public static void main(String[] args){
		String str = "HELLOWORLD";
		ByteArrayInputStream bain = new ByteArrayInputStream(str.getBytes());   //内存输入流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();                //内存输出流
		int temp = 0;
		while((temp=bain.read()) != -1){
			char c = (char)temp;        //读取的数字转换为字符
			bos.write(Character.toLowerCase(c));   //将字符转换为小写
		}
		String st = bos.toString();
		try{
			bain.close();
			bos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(st);
	}
}