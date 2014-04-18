public class Operate{
	private Student  stu[] = (new Student(1,"张三",0),new Student(2,"李四"),
								new Student(3,"王五"),new Student(4,"赵六"));
	public void printInfo(){
		for(int i = 0;i< stu.length;i++){
			System.out.println(this.stu[i].getStuNo() 
				+ ":" + this.stu[i].getName + ":" + this.stu[i].getVote());
			


		}
	}
}