class ArraySample {
    public static void main (String[] args){

        int[] a;
        a=new int [3];

        a[0]=10;
        a[1]=11;
        a[2]=12;

        for(int i=0;i<a.length;i++){
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}