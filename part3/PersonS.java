class PersonS {

    static int counter;

    String name;
    int age;

    PersonS(){
        counter++;
    }

    void showInfo(){
        System.out.println(name + " " + age + "才");
    }

    static void showCount(){
        System.out.println("作成したPersonの数は" + counter);
    }

}

class StaticSample {
    public static void main(String[] args){
        PersonS.counter = 100;
        
        new PersonS();
        new PersonS();

        PersonS.showCount();
    }
}