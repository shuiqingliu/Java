class  Person
{
	//����һ��ʵ��Field
	public String name;
	//����һ����Field
	public static int eyeNum;
	
}
public class PersonTest
{
	public static void main (String[] args)
	{
		//Person ���Ѿ���ʼ���ˣ���eyeNum �����������ˣ����0
		System.out.println("Person ��eyeNum��Fieldֵ��" + Person.eyeNum);
		//����Person����
		Person p = new Person();
		//ͨ��Person���������p������Person�����name ʵ�� Field
		//��ͨ��ʵ������eyeNum ��Field
		System.out.println("p ������name Field ֵ�ǣ�" + p.name + "p �����eyeNum Field ֵ�ǣ�" + p.eyeNum);
		//ֱ��Ϊnameʵ�� Field  ��ֵ
		p.name = "�����";
		//ͨ��p����eyeNum ��Field  ����Ȼ�Ƿ��� Person ��eyeNum ��Field
		p.eyeNum = 2;
		//�ٴ�ͨ��Person ����������nameʵ��Field ��eyeNum ��Field
		System.out.println("p ������name field ֵ�ǣ�" + p.name + "p �����eyeNum Field ֵ�ǣ�" + p.eyeNum);
		//ǰ��ͨ��p�޸���Person �� eyeNum ���˴���Person.eyeNum �����2
		System.out.println("Person ��eyeNum ��Field ֵ�ǣ�" + Person.eyeNum);
		Person p2 = new Person();
		//p2 ���� eyeNum ��� Field ��Ȼ����Person ��� �������Ȼ��� 2
		System.out.println("p2�����eyeNum �� Field ֵ ��" + p2.eyeNum);
		
	}
}