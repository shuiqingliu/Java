import java.io.InputStream;
public class SystemDemo04{
	public static void main(String[] args) throws Exception{
		StringBuffer stf = new StringBuffer();
		InputStream input = System.in;
		System.out.print("请输入信息：");
		int temp = 0;
		while((temp = input.read())!=-1){
			char c = (char)temp;
			if(c == '\n'){
				break;
			}
			stf.append(c);
		}
		System.out.println("输入的信息为:" + stf);
	}
}