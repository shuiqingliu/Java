import java.util.Vector;
import java.util.List;
public class VectorDemo08{
	public static void main(String[] args){
		Vector<String> arrayList = null;
		arrayList = new Vector<String>();		//指定操作的泛型为String
		System.out.println("集合操作前是否为空？" + arrayList.isEmpty());
		arrayList.addElement("Hello");		//add方法由collection接口而来
		arrayList.addElement("qingliu");
		arrayList.addElement("www.shuiqingliu.com");
		System.out.println("输出集合:");
		for(int i=0;i < arrayList.size();i++){
			System.out.print(arrayList.get(i) + "、");
		}
	}
}