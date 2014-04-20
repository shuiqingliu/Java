import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
public class ArrayListDemo04{
	public static void main(String[] args){
		List<String> arrayList = null;
		arrayList = new ArrayList<String>();		//指定操作的泛型为String
		arrayList.add("Hello");		//add方法由collection接口而来
		arrayList.add(0,"World");		//默认情况下向最后加入
		arrayList.add("qingliu");
		arrayList.add("www.shuiqingliu.com");
		String str[] = arrayList.toArray(new String[]{});		//转换为数组
		System.out.print("指定数组类型:");
		for(int i=0;i < str.length;i++){
			System.out.print(str[i] + "、");
		}
	}
}