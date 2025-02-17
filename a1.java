class Main
{
	public static void main(String[] args)
	{
		String s = "a1b2c3d4e5";
		char alpha = ' ';
		String res = "";
		for(int x=0;x<s.length();x++)
		{
			int num = 0;
			char c = s.charAt(x);
			if(Character.isAlphabetic(c))
			{
				alpha = c;
			}
			else
			{
				num = Character.getNumericValue(c);
			}
			for(int y=0;y<num;y++)
			{
				res = res + alpha;
			}
		}
		System.out.println(res);
	}
}
 


