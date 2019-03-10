class Renshu3 {
    public static void main (String[] args) {

        //s1の文字列に"bcd"という文字が含まれるかチェックする
        String s1 = "abcdef";
        boolean result = s1.indexOf("bcd") != -1;

        System.out.println(result);
    }
}