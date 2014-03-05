class Info{
	private String name = "qingliu";
	private String content = "student";
	public void setName(String name){
		this.name = name;
	}
	public void setContent(String content){
		this.content = content;
	}
	public String getName(){
		return this.name;
	}
	public String getContent(){
		return this.content;
	}
}
class Producer implements Runnable{
	private Info info = null;
	public Producer(Info info){
		this.info = info;
	}
	public void run(){
		boolean flag = false;
		for(int i = 0;i < 50;i++){
			if(flag){
				this.info.setName("qingliu");
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				this.info.setContent("student");
				flag = false;
			}else{
				this.info.setName("java");
				try {
					Thread.sleep(90);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				this.info.setContent("study");
				flag = true;
			}
		}
	}
	
}
class Consumer implements Runnable{
	private Info info = null;
	public Consumer(Info info){
		this.info = info;
	}
	public void run(){
		for(int i = 0;i < 50;i++){
			try {
				Thread.sleep(90);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(this.info.getName() + "=============>" +this.info.getContent());
		}
	}
}
public class ThreadCaseDemo01 {
	public static void main(String[] args){
		Info info = new Info();
		Producer pro = new Producer(info);
		Consumer con = new Consumer(info);
		new Thread(pro).start();
		new Thread(con).start();
	}
}
