package com.shuiqingliu.demo;
class Demo{
	public String getInfo(){
		return "hello world!!!";
	}
}
public class PackageDemo01{
	public static void main(String[] args){
		System.out.println(new Demo().getInfo());
	}
}