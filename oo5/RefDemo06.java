class Person{
	private String name;
	private int age;
	private Book book;
	private Person child;
	public Person(String name,int age){
		this.setName(name);
		this.setAge(age);
	} 
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setBook(Book b){
		book = b;
	}
	public Book getBook(){
		return book;
	}
	public void setChild(Person c){
		child = c;
	}
	public Person getChild(){
		return child;
	}
}
class Book{
	private String title;
	private float price;
	private Person person;
	public Book(String title,float price){
		this.setTitle(title);
		this.setPrice(price);
	}
	public void setTitle(String t){
		title = t;
	}
	public void setPrice(float p){
		price = p;
	}
	public String getTitle(){
		return title;
	}
	public float getPrice(){
		return price;
	}
	public void setPerson(Person p){
		person = p;
	}
	public Person getPerson(){
		return person;
	}
}
public class RefDemo06{
	public static void main(String[] args){
		Person per = new Person("张三",39);
		Person cld = new Person("张亮",10);
		Book bk = new Book("疯狂java讲义",109.00f);
		Book b = new Book("一千零一夜",98f);
		per.setBook(bk);
		bk.setPerson(per);
		cld.setBook(b);
		b.setPerson(cld);
		per.setChild(cld);
		System.out.println("从人找到书----->姓名:" + per.getName() + ":年龄 : " + per.getAge()
			+ ":书名:" + per.getBook().getTitle() + ":价格:" + per.getBook().getPrice());
		System.out.println("从书找到人------>姓名:" + bk.getPerson().getName() + ":年龄:" + bk.getPerson().getAge()
			+ ":书名:" + bk.getTitle() + ":价格:" +  bk.getPrice());
		System.out.println(per.getName() + "的孩子的姓名:" + per.getChild().getName() + ":年龄:" + per.getChild().getAge()
			+ ":书名:" +  per.getChild().getBook().getTitle() + ":价格:" + per.getChild().getBook().getPrice());
	}
}