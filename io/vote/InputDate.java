import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class InputDate{
	private BufferedReader buf = null;
	public InputDate{
		this.buf = new BufferedReader(new InputStreamReader(System.in));
	}
	public String getString(String info){
		String temp = null;
		System.out.print(info);
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
			str = this.getString();
			if(str.matches("\\d+")){
				temp = Integer.parseInt(str);
				flag = false;
			}else{
				System.out.println(error);
			}
		}
		return temp;
	}
}