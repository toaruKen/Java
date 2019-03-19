class Sample8 {
    public static void main(String[] args){
        sleep1s();
    }

    static void sleep1s(){
        try {
            thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}