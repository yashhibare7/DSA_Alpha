/*
 Weakest Soldier

 we are given an mxn binary matrix of 1's (soldiers) and 0's (civilians). The soldiers are positioned in front of the
 civilians. That is, all the 1's will appear to the left of all the 0's in each row.

 A row i is weaker than a row j if one of the following is true:
   - The number of soldiers in row i is less than the number of soldiers in row j.
   - Both rows have the same number of soldiers and i<j.
 Find the k weakest rows.

      m=4,n=4,k=2      ans = row0 & row2
      1 0 0 0
      1 1 1 1
      1 0 0 0
      1 0 0 0
 */

public class L_WeakestSoldier {
  static class Row implements Comparable<Row> {
    int soldiers;
    int idx;

    public Row(int soldiers,int idx){
      this.soldiers = soldiers;
      this.idx = idx;
    }

    @Override
    public int compareTo(Row r2){
      if(this.soldiers == r2.soldiers){
        return this.idx - r2.idx;
      } else {
        
      }
    }
  }
    public static void main(String args[]) {
      int army[][] = {{1, 0, 0, 0},
                      {1, 1, 1, 1},
                      {1, 0, 0, 0},
                      {1, 0, 0, 0}};

      int k = 2;
    }
}