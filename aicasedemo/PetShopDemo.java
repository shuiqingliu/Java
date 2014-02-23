interface Pet{
	public String getName();
	public String getColor();
	public int getAge();
}
class Cat implements Pet{
	private String name;
	private String color;
	private int age;
	public Cat(String name,String color,int age){
		this.setName(name);
		this.setAge(age);
		this.setColor(color);
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getColor(){
		return this.color;
	}
}
class Dog implements Pet{
	private String name;
	private String color;
	private int age;
	public Dog(String name,String color,int age){
		this.setName(name);
		this.setAge(age);
		this.setColor(color);
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getColor(){
		return this.color;
	}
}
class PetShop{
	private Pet[] pets;
	private int foot;
	public PetShop(int len){
		if(len>0){
			this.pets = new Pet[len];
		}else{
			this.pets = new Pet[1];
		}
	}
	public boolean add(Pet pet){
		if(this.foot<this.pets.length){
			this.pets[this.foot] = pet;
			this.foot++;
			return true;
		}else{
			return false;
		}
	}
	public Pet[] search(String keyWord){
		Pet pet[] = null;
		int count = 0;
		for(int i=0;i<this.pets.length;i++){
			if(this.pets[i] != null){
				if(this.pets[i].getName().indexOf(keyWord) !=-1 || this.pets[i].getColor().indexOf(keyWord) !=-1){
					count++;
				}
			}
		}
		pet = new Pet[count];
		int f = 0;
		for(int i=0;i<this.pets.length;i++){
			if(this.pets[i] != null){
				if(this.pets[i].getName().indexOf(keyWord) !=-1 || this.pets[i].getColor().indexOf(keyWord) !=-1){
					pet[f] = this.pets[i];
					f++;
				}
			}
		}
		return pet;
	}
}
public class PetShopDemo{
	public static void main(String[] args) {
		PetShop ps = new PetShop(5);
		ps.add(new Cat("白猫","白色",2));
		ps.add(new Cat("黑猫","黑色",2));
		ps.add(new Cat("花猫","花色",2));
		ps.add(new Dog("吉娃娃","白色",2));
		ps.add(new Dog("金毛","黄色",2));
		ps.add(new Dog("拉布拉多","花",2));
		print(ps.search("黑"));
	}
	public static void print(Pet p[]){
		for(int i=0;i<p.length;i++){
			if(p[i] != null){
				System.out.println(p[i].getName() + "," + p[i].getColor() + "," + p[i].getAge());
			}
		}
	}
}