class LabelSample {
    public static void main (String[] args) {
        outher_loop:
        for(int i=0;i<3;i++){
            System.out.println("i=" + i);
            for(int j=0;j<3;j++){
                if(i==1 && j==1){
                    break outher_loop;
                }
                System.out.println(" j=" + j);
            }
        }
    }
}