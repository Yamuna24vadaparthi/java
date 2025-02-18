class Main
{
 public static void main(String[] args)
 {
  int a[][]=new int[][]{{1,2,3},{10,20,30},{11,22,33}};
  //int b[][]=new int[3][3];
  Main m=new Main();
  int res[][]=m.diagonals(a);
  System.out.println(res);
      }
  int[][] diagonals(int a[][])
  {
    for(int r=0;r<=a.length-1;r++)
    {
        for(int c=0;c<=a[r].length;c++)
        {
            System.out.print(a[r][c]);
        }
        System.out.println();
     }
     return a;
  }
  
  
 
}
