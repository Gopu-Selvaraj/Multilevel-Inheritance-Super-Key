class AllNumbers
	{
		int no1 = 10;
		int no2 = 20;
	}
class Addition extends AllNumbers
	{
		int no3 = 30;
		int ares;

		public int AdditionOperation()
		{
			//ares = 10 + 20 + 30;
			ares = super.no1 + super.no2 + no3;
			return ares; // ares = 60;
		}
	}
class Subtraction extends Addition
	{
		int no4 = 40;
		int sres;

		public int SubtractionOperation()
		{
		//sres = (20 + 60) - 40;
		sres = (super.no2 + super.ares) - no4;
		return sres; // sres = 40;
		}
	}
class MultilevelInheritanceSuperkey
	{
		public static void main(String[] args)
		{
			Subtraction so = new Subtraction();
			System.out.println("Addition result : " + so.AdditionOperation());
			System.out.println("Subtraction result : " + so.SubtractionOperation());
		}
	}
