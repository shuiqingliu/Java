enum Season
{
	spring,summer,autumn,winter;
	public static Season getSeason(String season)
	{
		return valueOf(season);

	}
}
public class Test01
{
	public void caseSeason(String season)
	
	{
		// 声明变量season
		// String season = "夏天";
		// 执行 swith 分支语句
		switch (Season.getSeason(season))
		{
			case spring :
				System.out.println("春暖花开！");
				break ;
			case summer:
				System.out.println("夏日炎炎！");
				break ;
			case autumn :
				System.out.println("秋高气爽！");
				break ;
			case winter :
				System.out.println("白雪皑皑") ;
				break ;
			default:
				System.out.println("季节输入错误");
		}
	}
	public static void main(String[] args) {
		Test01 test01 = new Test01();
		test01.caseSeason("summer");
	}
}