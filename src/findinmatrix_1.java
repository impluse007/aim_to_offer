public class findinmatrix_1 {
    public static boolean Find(int target,int [][] array){
        if(array==null||array.length==0||array[0].length==0) return false;
        int m=array.length;
        int n=array[0].length;
        int i=m-1,j=0;
        while(i>=0&&j<n){
            if(array[i][j]==target) return true;
            else if(array[i][j]>target) i--;
            else j++;
        }
    return false;
    }
    public static void main(String[] args){
        int[][] a={{1,2,4},{2,4,7},{4,6,19}};
        boolean flag=Find(19,a);
        System.out.println(flag);

    }
}
