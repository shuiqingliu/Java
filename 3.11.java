interface Info{

}
class Contact{
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
}
class Introduction implements Info{
	private String name;
	private String sex;
	private int age;
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
}