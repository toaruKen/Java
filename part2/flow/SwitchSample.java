class SwitchSample {
    public static void main (String[] args){
        int num=3;

        switch(num){
            case 1:
            System.out.println("1です");
            break;
            
            case 3:
            System.out.println("3です");
            break;

            default:
            System.out.println("それ以外です");
            break;
        }

        System.out.println("その後");
    }
}