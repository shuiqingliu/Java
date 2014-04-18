public class Operate{
	private Student  stu[] = {new Student(1,"张三",0),new Student(2,"李四",0),
								new Student(3,"王五",0),new Student(4,"赵六",0)};
	private boolean flag = true;
	public Operate(){
		this.printInfo();
		while(flag){
			this.vote();
		}
		this.getResult();
	}
	private void getResult(){
		java.util.Arrays.sort(this.stu);
		System.out.println("投票最终结果" + this.stu[0].getName() + "同学," + "以"
			 + this.stu[0].getVote() +"票获得班长");
	}
	public void vote(){
		InputDate input = new InputDate();
		int num = input.getInt("请输入候选人代号:","输入不正确，请输入正确代号");
		switch(num){
			case 0:{
				this.flag = false;
				break;
			}
			case 1:{
				this.stu[0].setVote(this.stu[0].getVote() + 1);
				break;
			}
			case 2:{
				this.stu[1].setVote(this.stu[1].getVote() + 1);
				break;
			}
			case 3:{
				this.stu[2].setVote(this.stu[2].getVote() + 1);
				break;
			}
			case 4:{
				this.stu[3].setVote(this.stu[3].getVote() + 1);
				break;
			}
			default:{
				System.out.println("此选票无效，请选择正确的候选人");
			}

		}
	}

	public void printInfo(){
		for(int i = 0;i< stu.length;i++){
			System.out.println(this.stu[i].getStuNo() 
				+ ":" + this.stu[i].getName() + ":" + this.stu[i].getVote());
		}
	}
}