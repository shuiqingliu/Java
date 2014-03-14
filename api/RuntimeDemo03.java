public class RuntimeDemo03{
	public static void main(String[] args){
		Runtime rt = Runtime.getRuntime();
		Process p = null;
		try{
			p = rt.exec("notepad.exe");
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
		p.destroy();
	}
}