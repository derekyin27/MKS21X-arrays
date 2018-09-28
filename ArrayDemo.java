public static void printArray(int[]ary){
  String printers = "[";
  for (int i = 0; i < ary.length; i++) {
    printers = printers + ary[i] + ",";
  }
  printers = printers + ary[ary.length] + "]";
  return printers;
}

//public static void printArray(int[][]ary){
  //int[][] printer1 = new int[ary.length];
  //for (int i = 0; i < ary
    
