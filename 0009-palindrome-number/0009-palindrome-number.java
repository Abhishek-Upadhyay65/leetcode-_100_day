class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev=0,org_num=x;
        while(x>0){
            int r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
        if(rev==org_num){
            return true;
        }else{
            return false;
        }
    }
}