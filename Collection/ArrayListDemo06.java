import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
public class ArrayListDemo06{
	public static void main(String[] args){
		List<String> arrayList = null;
		arrayList = new ArrayList<String>();		//指定操作的泛型为String
		System.out.println("集合操作前是否为空？" + arrayList.isEmpty());
		arrayList.add("Hello");		//add方法由collection接口而来
		arrayList.add(0,"World");		//默认情况下向最后加入
		arrayList.add("qingliu");
		arrayList.add("www.shuiqingliu.com");
		/*判断对象是否存在*/
		System.out.println(arrayList.contains("Hello")?"\"Hello\"字符串存在!":"\"Hello\"字符串不存在" );
		/*字符串截取*/
		List<String> allSub = arrayList.subList(2,3);
		System.out.print("集合截取:");
		for(int i=0;i < allSub.size();i++){
			System.out.print(allSub.get(i) + "\n");
		}
		System.out.println("qingliu的位置是" + arrayList.indexOf("qingliu"));
		System.out.println("集合操作后是否为空？" + arrayList.isEmpty());

	}
}