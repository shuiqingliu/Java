
public class Message{
	public static void main(String[] args){
		Colleges c = new Colleges();
		Student s = new Student();
		Teacher t = new Teacher();
		c.setName("***科技学院");
		c.setNum(16000);
		c.setArea(800);

		s.setName1("秦*盛");
		s.setGrade("测绘B111");
		s.setMajor("建筑工程学院");

		t.setName("王老师");
		t.setCurriculum("Java 编程");

		System.out.println(c.getName() + " 有 " + c.getNum() + "名学生" + "占地面积" + c.getArea() + "亩");

		System.out.println(t.getName() + "在" + c.getName() + "教授" + t.getCurriculum()  );

		System.out.println(s.getName1() + "就读于" + s.getMajor() + s.getGrade() + "在上" + t.getName() + "的" + t.getCurriculum());
	}



}