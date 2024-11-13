import java.util.*;
public class Main{
  public static boolean search2DArray(int num[][],int key){    
    for(int i=0; i<num.length;i++){
      for(int j=0; j<num[0].length;j++){
        if(num[i][j]==key){
          System.out.print("Found at: ("+i+" "+j+")");
          return true;
        }
      }
    }
    System.out.print("Not found");
    return false;
  }
  public static void spiralmatrix(int num[][]){
    int startrow=0;
    int startcols=0;
    int endrow=num.length-1;
    int endcol=num[0].length-1;
      while(startrow<=endrow && startcols<=endcol){
        //top
        for(int j=startcols;j<=endcol;j++){
          System.out.print(num[startrow][j]+" ");
        }
        //right
        for(int i=startrow+1;i<=endrow;i++){
          System.out.print(num[i][endcol]+" ");
        }
        //bottom
        for(int k=endcol-1;k>=startcols;k--){
          if(startrow==endrow){
            break;
          }
          System.out.print(num[endrow][k]+" ");
        }
        //left
        for(int n= endrow-1;n>=startrow+1;n--){
          if(startcols==endcol){
            break;
          }
          System.out.print(num[n][startcols]+" ");
        }
        startrow++;
        endrow--;
        startcols++;
        endcol--;
        }
    System.out.println();
      }
  

  public static void main(String[] args){
    int num[][]={{1,3,5,},
                 {6,69,7,},
                 {8,6,69}};
    spiralmatrix(num);
    
  }
}
