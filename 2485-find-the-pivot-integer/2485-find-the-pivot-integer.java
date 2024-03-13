// class Solution {
//     public int pivotInteger(int n) {
//         int s1 = 0, s2 = 0;
//         for (int i = 1; i <= n; i++) {
//             s1 = i*(i-1)/2;
//             s2 = (n * (n + 1) / 2) - s1;
//             if (s1 == s2)
//                 return i;
//         }
//         return -1;
//     }
// }
class Solution {
    public int pivotInteger(int n) {
        int s1 = 0;
        int s2 = 0;
        
        for (int i = 1; i <= n; i++) {
            s1 = i * (i + 1) / 2;
            s2 = n * (n + 1) / 2 - i * (i - 1) / 2;
            
            if (s1 == s2)
                return i;
        }
        
        return -1;
    }
}
