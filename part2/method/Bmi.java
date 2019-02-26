class Bmi {
    public static void main (String[] args){

        double height = Double.parseDouble(args[0]);
        double wehight = Double.parseDouble(args[1]);

        double bmi = clacBmi(height,wehight);
        System.out.println("bmi=" + bmi);

        judgeBmi(bmi);

    }

    static double clacBmi(double height,double wehight){
        height = height / 100;
        double bmi=wehight / height /height;
        return bmi;
    }

    static void judgeBmi(double bmi) {
        if(bmi < 18.5){
            System.out.println("やせ");
        }else if(bmi < 25){
            System.out.println("標準");
        }else if(bmi < 30){
            System.out.println("肥満");
        }else{
            System.out.println("高度肥満");
        }
    }
}