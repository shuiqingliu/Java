import java.nio.charset.Charset;  
import java.util.Iterator;  
import java.util.Set;  
import java.util.SortedMap; 

public class CharsetTest
{
	public static void main (String[] args)
	{
		//获取Java 支持的全部字符集
		SortedMap<String,Charset>  map = Charset.availableCharsets();
		for (String alias : map.keySet())
		{
			//输出字符集的别名和对应的Charset 对象
			System.out.println(alias + "------> " + map.get(alias));

		}
	}
}