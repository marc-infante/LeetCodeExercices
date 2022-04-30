
/*
difficulty: easy

You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version, all the versions
after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad
one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad.
Implement a function to find the first bad version. You should minimize the number of
calls to the API.
*/
public class FirstBadVersion {

    int bad;

    public FirstBadVersion(int bad) {
        this.bad = bad;
    }

    public int firstBadVersion(int n) {
        int ini,fin,med;
        ini=1;
        fin=n;
        while(ini!=fin){
            med = getMedianNumber(ini,fin);
            if(isBadVersion(med)){
                fin=med;
            }else{
                ini=med+1;
            }
        }
        return ini;
    }

    private boolean isBadVersion(int med) {
        return med>=bad;
    }

    private int getMedianNumber(int ini, int fin) {
        return ((fin-ini)/2)+ini;
    }
}
