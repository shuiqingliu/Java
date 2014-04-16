import java.io.Externalizable;
import java.io.*;
public class Person implements Externalizable{		//实现Externalizable接口
	private String name;	//声明name属性
	private int age;	//声明age属性
	public Person(){}
	public Person(String name,int age){		//通过构造设置内容
		this.name = name;
		this.age = age;
	}
	public String toString(){		//覆写toString方法
		return "姓名" + this.name + "年龄:" + this.age;
	}
	public void writeExternal(ObjectOutput out)
                   		throws IOException{			//覆写Externalizable接口的方法		
        /*进行写操作*/           			
        out.writeObject(this.name);
        out.writeInt(this.age);           			
    }

    public void readExternal(ObjectInput in)
                  		throws IOException,
                        	 ClassNotFoundException{
        /*进行读取姓名和年龄*/                	 	
        this.name = (String)in.readObject();
        this.age = in.readInt();
                        	 	
    }
}
