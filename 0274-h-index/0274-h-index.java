class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;
        
        for (int i = 0; i < n; i++) {
            int papersWithAtLeast = n - i;  // number of papers from i to n-1
            if (citations[i] >= papersWithAtLeast) {
                h = papersWithAtLeast;
                break;
            }
        }
        return h;
    }
}