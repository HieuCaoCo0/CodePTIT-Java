import java.util.*;

public class J04021 {
    static class IntSet{
        private Set<Integer> st;
        public IntSet(Set<Integer> st){
            this.st = st;
        }
        public IntSet(int a[]){
            st = new TreeSet<>();
            for(int i : a){
                st.add(i);
            }
        }
        public IntSet union(IntSet s2){
            Set<Integer>set1 = this.st, set2 = s2.st;
            set1.addAll(set2);
            return new IntSet(set1);
        }
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder("");
            for (int i : st){
                sb.append(i + " ");
            }
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
