class SgSample {

    private String message;

    //セッタ
    public void setMessage(String message) {
        this.message = message;
    }

    //ゲッタ
    public String getMessage() {
        return message;
    }
} 

class SampleMain {

    public static void main (String[] args) {
        SgSample s = new SgSample();
        s.setMessage("Hello");
        System.out.println(s.getMessage());
    }
}