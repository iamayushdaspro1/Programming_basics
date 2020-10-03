import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int arr[][]=new int [n][n];
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){
              arr[i][j]=sc.nextInt();
         
      }
      }
      for(int i=0;i<arr.length;i++){
          for(int j=i;j<arr[0].length;j++){
              int temp=arr[i][j];
              arr[i][j]=arr[j][i];
              arr[j][i]=temp;
          }
      }
      for(int r=0;r<arr.length;r++){
          int lo=0;
          int hi=arr[0].length-1;
          while(lo<hi){
              int temp=arr[r][lo];
              arr[r][lo]=arr[r][hi];
              arr[r][hi]=temp;
              lo++;
              hi--;
          }
      }
      display(arr);
      
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}