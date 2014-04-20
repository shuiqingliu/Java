import java.util.Vector;
import java.util.List;
import java.util.Collection;
public class VectorDemo07{
	public static void main(String[] args){
		List<String> arrayList = null;
		arrayList = new Vector<String>();		//指定操作的泛型为String
		System.out.println("集合操作前是否为空？" + arrayList.isEmpty());
		arrayList.add("Hello");		//add方法由collection接口而来
		arrayList.add(0,"World");		//默认情况下向最后加入
		arrayList.add("qingliu");
		arrayList.add("www.shuiqingliu.com");
		System.out.println("输出集合:");
		for(int i=0;i < arrayList.size();i++){
			System.out.print(arrayList.get(i) + "、");
		}
	}
}