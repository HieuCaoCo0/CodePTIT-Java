import java.util.*;
public class J04022 {
    static class WordSet{
        private Set<String> set;
        public WordSet(Set<String> set){
            this.set = set;
        }
        public WordSet(String line){
            String[] words = line.trim().split("\\s+");
            set = new TreeSet<>();
            for (String w : words) set.add(w.toLowerCase());
        }
        public WordSet union(WordSet ws){
            Set<String> tmp = new TreeSet<>(this.set);
            tmp.addAll(ws.set);
            return new WordSet(tmp);
        }
        public WordSet intersection(WordSet ws){
            Set<String> tmp = new TreeSet<>(this.set);
            tmp.retainAll(ws.set);
            return new WordSet(tmp);
        }
        @Override 
        public String toString(){
            StringBuilder sb = new StringBuilder("");
            for (String w : set) sb.append(w + " ");
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
