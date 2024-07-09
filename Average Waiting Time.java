class Solution {
  public double averageWaitingTime(int[][] customers) {
      int i, n = customers.length;
      int total_time = 0;
      long waiting_time=0;
      for(i=0 ;i<n ;i++){
          int arrival_time= customers[i][0];
          int prep_time=customers[i][1];
          total_time=Math.max(arrival_time,total_time)+prep_time;
          waiting_time+=(total_time-arrival_time);
      }
      return(double)waiting_time/n;
  }
}