import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
public class FileOperate{		//此类专门用于读取写入对象
	private File file = null;		//定义文件对象
	public FileOperate(String pathName){		//通过构造方法传入文件路径
		this.file = new File(pathName);
	}
	public boolean save(Object obj) throws Exception{		//保存对象
		ObjectOutputStream oos = null;
		boolean flag = false;		//定义标志类
		try{
			oos = new ObjectOutputStream(new FileOutputStream(this.file));
			oos.writeObject(obj);
			flag = true;
		}catch(Exception e){
			throw e;
		}finally{
			if(oos != null){
				oos.close();
			}
		}
		return flag;
	}
	public Object load() throws Exception{		//读取对象
		Object obj = null;
		ObjectInputStream ois = null;		//对象输入流	
		try{
			ois = new ObjectInputStream(new FileInputStream(this.file));		//实例化对象输入流
			obj = ois.readObject();		//读取对象
		}catch(Exception e){
			throw e;
		}finally{
			ois.close();
		}
		return obj;
	}
}