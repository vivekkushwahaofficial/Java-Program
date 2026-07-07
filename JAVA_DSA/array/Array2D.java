public class Array2D{
  public static void print2DArray(int[][] marks){
    
    for(int i = 0; i < marks.length; i++){
      for(int j = 0; j < marks.length; j++){
        System.out.print(marks[i][j] +" ");
      }
      System.out.println();
    }

  }
  public static void main(String[] args) {
      int marks[][] = {
      {12, 23, 34},
      {23, 33, 44},
      {55, 44, 11}
    };
    print2DArray(marks);
  }
}