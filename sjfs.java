import java.io.*;
import java.util.*;
public class sjfs {
public static void main(String args[]) {
 int pro[]={1,2,3};
 int tat[] = new int[10];
  int total;
  int wt[] = new int[10];
 int bust[]={10,5,2};
 int i,j,temp;
 int avgtat,avgwt;
int n = (int)pro.length;
 System.out.println(n);
 System.out.print("-------------------\n");
 System.out.println("pid\tbt\n");
 System.out.println("--------------------\n");
  for(i=0;i<n;i++)
 {
      System.out.println("\t"+(i+1)+"\t"+bust[i]);
 }
 for(i=0;i<n;i++)
 {
  for(j=0;j<n;j++)
  {
  if(bust[i]<bust[j])
  {
   temp=bust[i];
   bust[i]=bust[j];
   bust[j]=temp;
  }
 }
}
 tat[0]=0;
 total=0;
for(i=1;i<n+1;i++)
{
 tat[i]=bust[i-1]+tat[i-1];
 total=total+tat[i];
}
System.out.println("total turnaround time:"+total);
avgtat=(total)/3;
System.out.println("average turnaround time:"+avgtat);
total=0;
for(i=3;i>0;i--)
{
 wt[i]=(tat[i]-bust[i-1]);
 total=total+wt[i];
}
 System.out.println("total waitng time:"+total);
 avgwt=(total)/3;
 System.out.println("average waiting time:"+avgwt);
 System.out.println("finall ganttchart is:");
 System.out.print("-------------------------------------------\n");
 System.out.println("pid\t burst\t waiting\tturn around\t\n");
 System.out.println("   \t time \time     \ttime     \n");
 System.out.println("-----------------------------------------------\n");
 for(i=1;i<n+1;i++)
 {
    System.out.println(i+"\t"+bust[i-1]+"\t"+wt[i]+"\t"+tat[i]);
  }
 }
}