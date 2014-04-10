import java.io.*;
public class PrintDemo02{
	public static void main(String[] args) throws Exception{
		PrintStream ps = null;
		ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "qingliu.txt" )));
		String name = "qingliu";
		int age = 20;
		float score = 98.05f;
		char sex = 'M';
		ps.printf("姓名： %s ;年龄:%d ;成绩:%f ; 性别:%c ",name,age,score,sex);
		ps.close();
	}
}