public class stringcompression {
    public static String compressedstring(String str) {
        StringBuilder sb = new StringBuilder(" ");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1; // we make this object type because we have to convert it to the string 
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) { 
                count++;
                i++;
            }
            
            sb.append(str.charAt(i));  //add letter to stringbuilder
            if (count > 1) {
                sb.append(count.toString()); // convert count to string & add count of letters to string builder
            }
        }

        return sb.toString(); // return string by converting string builder to string
    }

    public static void main(String args[]) {
        String str = "aaaaabbccdd";
        System.out.println("Compressed String--> " + compressedstring(str));
    }

}
