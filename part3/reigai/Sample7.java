class Sample7 {

    public static void main(String[] args) {
        int result = divOneTwo(args);
        System.out.println("result=" + result);
    }

    static int divOneTwo(String[] args){
        if(args.length < 2){
            IllegalArgumentException e = new IllegalArgumentException("引数は2つ指定してください");
            throw e;
        }
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);
        return one / two;
    }
}