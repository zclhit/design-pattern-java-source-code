package sample01;


public class TVFactory
{
	public static TV produceTV(String brand) throws Exception
	{
		if(brand.equalsIgnoreCase("Haier"))
		{
			System.out.println("Haier");
			return new HaierTV();
		}
		else if(brand.equalsIgnoreCase("Hisense"))
		{
			System.out.println("Hisense");
			return new HisenseTV();
		}
		else
		{
			throw new Exception("Other");
		}
	}
}