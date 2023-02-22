package algorithm.root_determination_21;

public class RootDetermination {

    public static long solution(long n) {

        long num = 1;
        while(true) {
            long a = num*num;
            if (a > n) {
                return -1;
            }
            if(a == n) {
                return (num+1)*(num+1);
            }
            num++;
        }
    }
}
