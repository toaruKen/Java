class Sample {
    public static void main (String[] args) {
        System.out.println("呼ぶ前");

        doSomething();

        System.out.println("読んだ後");
    }

    static void doSomething() {
        System.out.println("メソッドが呼ばれたよ");
    }
}
