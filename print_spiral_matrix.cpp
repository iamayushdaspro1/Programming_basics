//Given a number n print all the numbers from 1 to n2 into a 2D array in spiral form
class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> arr(n, vector<int>(n));

        int up=0, down=n-1, left=0, right=n-1;
        vector<int> flat;
        int num=1;
        while(num<=n*n){
            for(int j=left;j<=right && num<=n*n;j++)
                arr[up][j]=num++;
            up++;
            
            for(int i=up;i<=down && num<=n*n;i++)
                arr[i][right]=num++;
            right--;
            
            for(int j=right;j>=left && num<=n*n;j--)
                arr[down][j]=num++;
            down--;
            
            for(int i=down;i>=up && num<=n*n;i--)
                arr[i][left]=num++;
            left++;
        }
        
        return arr;
    }
};