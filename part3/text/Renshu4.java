class Renshu4 {
    public static void main (String[] args) {

        //s1の文字列のなかの"ab"という文字をxxに置き換える
        String s1 = "abcabc";
        String s2 = s1.replaceAll("ab","xx");

        System.out.println(s2);
    }
}