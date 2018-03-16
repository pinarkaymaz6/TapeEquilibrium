public class Client {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int diff=1000000000;
        for(int i=1;i<A.length;i++){
            int sum1=0,sum2=0;
            int index1=i-1,index2=i;

            while(index1>=0) {
                sum1 += A[index1];
                index1--;
            }
            while(index2<A.length){
                sum2 += A[index2];
                index2++;
            }
            if(Math.abs(sum1 - sum2)<diff) {
                diff = Math.abs(sum1 - sum2);
            }
        }
        return diff;
    }
}
