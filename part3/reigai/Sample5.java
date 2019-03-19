class Sample5 {
    public static void main(String[] args) {
        try {
            int result = divOneTwo(args);
            System.out.println("result=" + result );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsExceptionをキャッチしました");
        } finally{
            System.out.println("finally内の処理を実行");
        }
        System.out.println("その後の処理");
    }

    static int divOneTwo(String[] args){
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);
        return one / two;
    }
}