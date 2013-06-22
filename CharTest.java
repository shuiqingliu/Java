public  class CharTest
{
	public static void main (String[] args)
	{
		//直接指定单个字符作为字符类型变量
		char aChar = 'a';
		//使用转义字符作为字符型变量
		char enterChar = '\r';
		//使用Unicode编码指来指定字符类型变量
		char ch = '\u9999';
		//输出一个‘香’字符
		System.out.println(ch);
		//定义一个‘疯’字符类型变量
		char zhong = '疯';
		//直接将一个char类型类型变量当成int类型变量使用
		int zhongValue  = zhong;

		System.out.println(zhongValue);
		//直接把0~65535范围内的一个int整数赋给一个char类型变量
		char c = 97;
		System.out.println(c);

			
		
	}
}