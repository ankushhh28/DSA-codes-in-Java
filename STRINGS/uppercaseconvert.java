public class uppercaseconvert {
    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0)); // convert first index letterto uppercase
        sb.append(ch); // add uppercase letter to stringbuilder

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') { // in caseof space
                sb.append(str.charAt(i)); // add space to stringbuilder
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); // convert letter to uppercase after space
            } else {
                sb.append(str.charAt(i)); // adds letters to stringbuilder
            }
        }

        return sb.toString(); // return string by coverting stringbuilder to it
    }

    public static void main(String args[]) {
        String str = "hello buddy i am a coder";
        System.out.println(toUppercase(str));
    }

}
