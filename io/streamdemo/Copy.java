import java.io.*;
public class Copy{
	public static void main(String[] args){
		if(args.length !=2){
			System.out.println("输入参数不正确");
			System.out.println("例:java  Copy   源文件   目标文件");
			System.exit(1);
		}
		File f1 = new File(args[0]);         //源文件的File对象
		File f2 = new File(args[1]);         //目标文件的File对象  
		if(!f1.exists()){                    //判断 文件是否存在
			System.out.println("文件不存在");   
			System.exit(1);
		}
		InputStream input = null;            //准备好输入流对象，读取目标文件 
		OutputStream out = null;             //准备好输出流对象，写入目标文件
		try{
			input = new FileInputStream(f1);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		try{
			out = new FileOutputStream(f2);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		if(input != null && out != null){
			int temp = 0;
			try{
				while((temp= input.read())!=-1){
					out.write(temp);
				}
				System.out.println("拷贝完成！");
			}catch(IOException e){
				e.printStackTrace();
				System.out.println("拷贝失败！");
			}
			try{
				input.close();
				out.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}