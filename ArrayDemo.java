Public class ArrayDemo{
public static String printersArray(int[]ary){
  String printers = "[";
  for (int i = 0; i < ary.length; i++) {
    printers = printers + ary[i] + ",";
  }
  printers = printers + ary[ary.length-1] + "]";
  return printers;
}
  
  public static void PrintArray(int[]ary){
    System.out.println(printersArray(ary));
}
  
  public static String printersBIGArray(int[][]ary){
    String printers = "[";
    for (int i = 0; i <ary[][].length; i++){
      printers = printers + printersArray(ary[i]);
    }
    return printers + "]";
  }
  
  public static void PrintBigArray(int[][]ary){
    System.out.println(printersBIGArray(ary));
  }
  
  
      



//public static void printArray(int[][]ary){
  //int[][] printer1 = new int[ary.length];
  //for (int i = 0; i < ary
    
