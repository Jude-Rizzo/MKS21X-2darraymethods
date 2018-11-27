public class ArrayMethods{

  public static int rowSum(int[][] ary, int x){
    int sum = 0;
    
    if(x > ary.length){
      return 0;
    }
    for (int i = 0; i < ary[x].length; i++){
      sum += ary[x][i];
    }
    return sum;

  }

  public static int columnSum(int[][] ary, int x){
    int sum = 0;
    for(int i = 0; i < ary.length; i++){
      if (x < ary[i].length)
        sum += ary[i][x];
      } return sum;
  }


  public static int[] allRowSums(int[][] ary){
    int[] ans = new int[ary.length];
    for(int i = 0; i < ary.length; i++){
      ans[i] = rowSum(ary, i);
    } return ans;
  }


  public static int[] allColSums(int[][] ary){
    int[] ans = new int[ary.length];
    int max = 0;
    for (int i = 0; i < ary.length; i++){
        if (ary[i].length > max){
          max = ary[i].length;
        }
      }
      //System.out.println("Length: " +longest);
      int[] colSums = new int[max];
      for (int i = 0; i < max; i++){
        colSums[i] = columnSum(ary, i);
      }
      return colSums;
    }





    public static boolean isRowMagic(int[][] ary){
      int[] rowSum = allRowSums(ary);
      for(int i = 0; i < rowSum.length - 1; i++){
        if(rowSum[i] != rowSum[i + 1])
          return false;
      } return true;
    }


    public static boolean isColumnMagic(int[][] ary){
      int[] columnSum = allColSums(ary);
      for(int i = 0; i < columnSum.length - 1; i++){
        if(columnSum[i] != columnSum[i + 1])
          return false;
      } return true;
    }






}
