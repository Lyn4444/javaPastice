public class course10_25 {
    public static void main(String[] args) {
        String s1 = "a?b?gf#e";
        String[] index1 = split(s1, "[?#]");
        for (String e : index1)
                System.out.print(e + "\t");

        System.out.println();

        String s2 = "ab#12#456";
        String[] index2 = split(s2, "#");
        for (String e : index2)
            System.out.print(e + "\t");
    }

    public static String[] split(String s, String regex) {
        StringBuffer str_1 = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            str_1.append(s.charAt(i));
        }
        String s_1 = str_1.toString();

        String[] s_temp = s.split(regex);
        StringBuilder str_2 = new StringBuilder();
        for (String e : s_temp) {
            str_2.append(e);
        }
        String s_2 = str_2.toString();

        char[] ch_1 = s_1.toCharArray();
        char[] ch_2 = s_2.toCharArray();

        int i = 0 , j = 0 , flag = 0;
        StringBuffer index = new StringBuffer();
        for (i = 0 ; i < s_2.length() ; i ++ ) {
            if (ch_2[i] == ch_1[j]) {
                index.append(ch_1[j]);
                flag = 0;
            }else {
                flag ++;
                if (flag == 1 ) {
                    index.append(',');
                    index.append(ch_1[j]);
                    index.append(',');
                }
                if (flag == 2) {
                    index.append(ch_1[j]);
                    index.append(',');
                }
                i--;
            }
            j ++;
        }
        if (j + 1 < s_1.length()) {
            for (int k = j + 1 ; k < s_1.length() ; k ++ ){
                index.append(ch_1[k]);
            }
        }
        String s_answer = index.toString();

        return s_answer.split(",");
    }
}



