package com.shuiqingliu.demo.b;
import com.shuiqingliu.demo.a.HelloDemo01;
class SubDemo extends HelloDemo01{
	public void print(){
		System.out.println("受保护的权限:" + super.name);
	}
}
public class ProtectedDemo02{
	public static void main(String[] args){
		SubDemo sub = new SubDemo();
		sub.print();
	}
}