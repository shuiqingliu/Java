interface NetWork{
	public void browse();
}
class Real implements NetWork{
	public void browse(){
		System.out.println("上网浏览信息");
	}
}
class Proxy implements NetWork{
	private NetWork network;
	public Proxy(NetWork network){
		this.network = network;
	}
	public void check(){
		System.out.println("检查用户合法性");
	}
	public void browse(){
		this.check();
		this.network.browse();
	}
}
public class InterfaceDemo04{
	public static void main(String[] args) {
		NetWork net = new Proxy(new Real());
		net.browse();
	}
}