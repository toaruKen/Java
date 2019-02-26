class MeritSample {
    public static void main (String[] args) {

        int score1=60;
        judgeScore(score1);

        int score2=40;
        judgeScore(score2);


    }

    static void judgeScore (int score){
        if (score > 50){
            System.out.println("合格です");
        }else{
            System.out.println("不合格です");
        }
    }
}