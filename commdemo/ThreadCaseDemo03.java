class InfoTest{
	private String name = "qingliu";
	private String content = "student";
	private boolean flag = false;
	public synchronized void set(String name,String content){
		if(!flag){
			try{
				super.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.setName(name);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		this.setContent(content);
		flag = false;
		super.notify();
	}
	public synchronized void get(){
		if(flag){
			try{
				super.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(this.getName() + "=============>" +this.getContent());
		flag = true;
		super.notify();
	}
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
class Producer01 implements Runnable{
	private InfoTest info = null;
	public Producer01(InfoTest info){
		this.info = info;
	}
	public void run(){
		boolean flag = false;
		for(int i = 0;i < 50;i++){
			if(flag){
				this.info.set("qingliu","student");
				flag = false;
			}else{
				this.info.set("java","study");
				flag = true;
			}
		}
	}
	
}
class Consumer01 implements Runnable{
	private InfoTest info = null;
	public Consumer01(InfoTest info){
		this.info = info;
	}
	public void run(){
		for(int i = 0;i < 50;i++){
			this.info.get();
		}
	}
}
public class ThreadCaseDemo03{
	public static void main(String[] args){
		InfoTest info = new InfoTest();
		Producer01 pro = new Producer01(info);
		Consumer01 con = new Consumer01(info);
		new Thread(pro).start();
		new Thread(con).start();
	}
}
