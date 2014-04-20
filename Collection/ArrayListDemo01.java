import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo01{
	public static void main(String[] args){
		List<String> arrayList = null;
		arrayList = new ArrayList<String>();		//指定操作的泛型为String
		arrayList.add("Hello");		//add方法由collection接口而来
		arrayList.add(0,"World");		//默认情况下向最后加入
		System.out.println(arrayList);
	}
}