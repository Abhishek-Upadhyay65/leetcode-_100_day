class Solution {
    public int mySqrt(int x) {
        int si = 0;
        int li = x;
        int ans = 0;

        while (si <= li) {
            int mid = si + (li - si) / 2;

            if (mid <= x / Math.max(mid, 1)) {
                ans = mid;
                si = mid + 1;
            } else {
                li = mid - 1;
            }
        }

        return ans;
    }
}