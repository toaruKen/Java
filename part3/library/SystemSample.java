class SystemSample{

    public static void main(String[] args){
        long time = System.currentTimeMillis();

        int num = 0;

        for(int i=0;i<10000*1000;i++){
            num+=i;
        }

        long time2=System.currentTimeMillis();

        System.out.println("count=" + num);
        System.out.println("time=" + (time2-time));
    }
}