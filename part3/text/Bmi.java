import java.text.DecimalFormat;

class Bmi {

    public static void main (String[] args) {

        double height = Double.parseDouble(args[0]) / 100;
        double weight = Double.parseDouble(args[1]);

        double bmi = weight / height / height;
        
        String result = new DecimalFormat("#.##").format(bmi);
        System.out.println("bmi=" + result);
    }
}