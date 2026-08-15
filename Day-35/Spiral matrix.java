class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> r = new ArrayList<>();
        int t=0,b=a.length-1,l=0,ri=a[0].length-1;

        while(t<=b && l<=ri){
            for(int i=l;i<=ri;i++) r.add(a[t][i]); t++;
            for(int i=t;i<=b;i++) r.add(a[i][ri]); ri--;
            for(int i=ri;i>=l && t<=b;i--) r.add(a[b][i]); b--;
            for(int i=b;i>=t && l<=ri;i--) r.add(a[i][l]); l++;
        }
        return r;
    }
}