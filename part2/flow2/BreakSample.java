class BreakSample {
    public static void main (String[] args){
        int i=0;
        while(true){
            if(i>2){
                break;
            }

            System.out.println("i=" + i);
            i++;
            
        }
    }
}