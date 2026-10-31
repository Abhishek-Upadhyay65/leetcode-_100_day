class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,mul=1,total=0;
        while(n!=0){
            int r=n%10;
            sum=sum+r;
            mul*=r;
            n/=10;
        }
        return mul-sum;
    }
}