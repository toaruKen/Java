class Sample3 {

    public static void main(String[] args) {
        try{
            int result = divOneTwo(args);
            System.out.println("result=" + result);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsExceptionをキャッチしました");
        }catch(NumberFormatException e){
            System.out.println("NumberFormatExceptionをキャッチしました");
        }catch(ArithmeticException e){
            System.out.println("ArithmeticExceptionをキャッチしました");
        }
    }

    static int divOneTwo(String[] args){
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);
        return one / two;
    }
}