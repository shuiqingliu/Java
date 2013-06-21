public class IntegerValTest
{
	//下面代码是正确的，系统会自动把56当成byte 类型处理
	byte a = 56;
	/*
	下面代码是错误的，,系统会吧9999999999999当成long类型处理
	所以超出int的表数范围，从而引起错误
	*/
	//long bigValue = 9999999999999;
	//下面代码是正确的，在巨大的整数变量后使用L后缀，强制使用long类型
	long bigValue = 9223372036854775807L;
	//以0开头的整数常量是八进制
	int octaVlaue = 013;
	//以0x开头的整数常量是十六进制的整数
	int hexValue1 = 0x13;
	int hexVlaue2 = 0xaF;
	/**
	*由于目前ubuntu 用的是java 6所以不支持二进制整数的，这段代码暂且注释掉
	*/
	//定义两个八位的二进制数
	/*int binVal1 = 0b11010100;
	int binVal2 = 0b01101001;
	//定义一个32位的二进制整数，最高位是符号位
	int binVal3 = 0B10000000000000000000000000000011;
	System.out.println(binVal1); //输出212
	System.out.println(binVal2); //输出105
	System.out.println(binVal3); //输出-2147483645*/
	
}