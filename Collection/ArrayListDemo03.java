import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
public class ArrayListDemo03{
	public static void main(String[] args){
		List<String> arrayList = null;
		arrayList = new ArrayList<String>();		//指定操作的泛型为String
		arrayList.add("Hello");		//add方法由collection接口而来
		arrayList.add("Hello");
		arrayList.add(0,"World");		//默认情况下向最后加入
		arrayList.add("qingliu");
		arrayList.add("www.shuiqingliu.com");
		System.out.println("由前向后输出");
		for(int i=0;i < arrayList.size();i++){
			System.out.println(arrayList.get(i) + "、");
		}
		System.out.println("由后向前输出");
		for(int i = arrayList.size() -1;i >= 0;i--){
			System.out.println(arrayList.get(i) + "、");
		}
	}
}