public class stringbuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // fn for adding new characters or string to same string
        }
        System.out.println(sb);
    }

}
