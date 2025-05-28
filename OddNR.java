public class OddNR{

    public static void main(String[] args) {
        String input = "ZOHO CORPORATION PVT LTD";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            int pos = words.length - i; 

            if (pos % 2 != 0) { 
                char[] chars = words[i].toCharArray();
                for (int j = chars.length - 1; j >= 0; j--) {
                    result.append(chars[j]);
                }
            } else { 
                result.append(words[i]);
            }

            if (i != 0) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}
