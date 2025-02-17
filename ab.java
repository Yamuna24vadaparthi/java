class Main
{
 public static void main(String[] args)
 {
   int rows=3,cols=4;
    for(int r=1;r<=rows;r++)
    {
      int temp='A'+(r-1);
       for(int c=1;c<=cols;c++)
         {
          System.out.print((char)temp+" ");
	  temp++;
          }
          System.out.println( );
     }
  }
}