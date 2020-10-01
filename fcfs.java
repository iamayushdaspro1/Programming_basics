

import java.io.*;
import java.util.*;
public class fcfs {
	public static void main(String args[]) {
               Scanner sc =new Scanner(System.in);
		int[] pro = {1, 2, 3}, tat = new int[13], wt = new int[10];
		int avgwt;
		int total;
		int n = (int)pro.length;
		int avgtat;
		int[] bust = {22, 3, 5};
		System.out.println("-------------------");
		System.out.println("pid\t bt");
		System.out.println("--------------------");
		for(int i = 0; i < n; i++) {
			System.out.println((i + 1) + "\t " + bust[i] + "\t");
		}
		tat[0] = 0;
		total = 0;
		for(int i = 1; i < n + 1; i++) {
			tat[i] = bust[i - 1] + tat[i - 1];
			total = tat[i] + total;
		}
		System.out.println("total turn around time:" + total);
		avgtat = total / 3;
		System.out.println("average turnaround time=" + avgtat);
		total = 0;
		for(int i = 1; i < n + 1; i++) {
			wt[i] = tat[i] - bust[i - 1];
			total = total + wt[i];
		}
		System.out.println("total waiting time:" + total);
		avgwt = total / 3;
		System.out.println("avereage waiting time:" + avgwt);
		System.out.println("finall ganttchart is:");
		System.out.println("-------------------------------------------");
		System.out.println("pid\t burst\t waiting\tturn around\t");
		System.out.println("   \t time \time     \ttime     ");
		System.out.println("-----------------------------------------------");
		for(int i = 1; i < n + 1; i++) {
			System.out.println(i + "\t " + bust[i - 1] + "\t " + wt[i] + "\t\t " + tat[i] + "\t");
		}
		
	}
}