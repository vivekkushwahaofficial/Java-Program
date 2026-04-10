import java.util.*;
class Solution {
  public static void main(String args[]){
    System.out.print("Enter Input : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    Code(num);
  }
  static void Code(int num) {
    for(int i=1; i<=num; i++){
      for(int j=1; j<=i; j++){
       System.out.print( (i==4) ? ("*") : (j+" "));
      }
      System.out.println();
    }
  }
}