import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
public class ArrayListDemo02{
	public static void main(String[] args){
		List<String> arrayList = null;
		arrayList = new ArrayList<String>();		//指定操作的泛型为String
		arrayList.add("Hello");		//add方法由collection接口而来
		arrayList.add(0,"World");		//默认情况下向最后加入
		arrayList.add("qingliu");
		arrayList.add("www.shuiqingliu.com");
		System.out.println(arrayList);
		arrayList.remove(0);		//删除一个元素，指定删除的位置
		arrayList.remove("Hello");		//由Collection接口继承而来
		System.out.println(arrayList);
	}
}