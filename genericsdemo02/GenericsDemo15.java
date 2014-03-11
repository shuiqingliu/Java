interface Info{

}
class Contact implements Info{
	private String address;
	private String telphone;
	private String zipcode;
	public Contact(String address,String telphone,String zipcode){
		this.setAddress(address);
		this.setTelphone(telphone);
		this.setZipcode(zipcode);
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setTelphone(String telphone){
		this.telphone =telphone;
	}
	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}
	public String getAddress(){
		return this.address;
	}
	public String getTelphone(){
		return this.telphone;
	}
	public String getZipcode(){
		return this.zipcode;
	}
	public String toString(){
		return "联系方式:" + "\n" +
			"\t | 住址:" + this.address + "\n" +
			"\t | 电话:" + this.telphone + "\n" +
			"\t | 邮编:" + this.zipcode;
	}
}
class Introduction implements Info{
	private String name;
	private String sex;
	private int age;
	public Introduction(String name,String sex,int age){
		this.setName(name);
		this.setSex(sex);
		this.setAge(age);
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public String getSex(){
		return this.sex;
	}
	public int getAge(){
		return this.age;
	}
	public String toString(){
		return "基本信息 ：" +"\n"
			+"\t|-姓名:" + this.name + "\n"
			+"\t|-性别:" + this.sex + "\n"
			+"\t|-年龄:" + this.age;
	}
}
class Person<T extends Info>{
	private T info;
	public Person(T	 info){
		this.setInfo(info);
	}
	public void setInfo(T info){
		this.info = info;
	}
	public T getInfo(){
		return this.info;
	}
	public String toString(){
		return this.info.toString();
	}
}
public class GenericsDemo15{
	public static void main(String[] args){
		Person<Contact> p = null;
		p = new Person<Contact>(new Contact ("beijing","124356","23456"));
		System.out.println(p);
	}
}