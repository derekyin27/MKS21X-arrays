Public class ArrayDemo{
public static void PrintArray(int[]ary){
  for (int i = 0; i < ary.length; i++) {
    System.out.print(ary[i] + " ");
}
  System.out.print(" ");
}
  
  public static String PrintArray(int[][]ary){
    int c = 0;
    for (int i = 0; i < ary.length; i++){
      for (int p = 0; p < ary[i].length; p++) {
        System.out.print(ary[i][p] + " ");
    }
      System.out.print(" ");
    }
  }
  
  
  public static int CountZeros2D(int[][] nums){
    int c = 0;
    for (int i = 0; i < nums.length; i++){
      for (int p = 0; p < nums[i].length; p++) {
        if (nums[i][p] == 0) {
          c++;
        }
      }
    }
    return c;
  }
  
  public static void fill2D(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      for (int p = 0; p < vals[i].length; p++) {
        if (i == p) {
          vals[i][p] = 3;
        }
        else {
          vals[i][p] = 1;
        }
      }
    }
    return vals;
  }
  
  public static int[][] fill2DCopy(int[][] vals){
    int[][] COPY = new int[vals.length][vals[0].length];
    for (int i = 0; i < vals.length; i++){
      for (int p = 0; p < vals[i].length; p++){
        if (vals[i][p] < 0) {
          COPY[i][p] = 3;
        }
        else {
          COPY[i][p] = 1;
        }
      }
    }
    return COPY;
  }
}
  
          
    
  
      
        
  
  
     
    
