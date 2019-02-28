class Person3 {

    String name;
    int age;

    Person3(String iname,int iage){
        System.out.println("コンストラクタが呼ばれました");
        name = iname;
        age = iage;
    }

    void showInfo(){
        System.out.println(name + " " + age + "才");
    }
}

class Person3Main{
    public static void main(String[] args){

        Person3 p = new Person3("アリス",10);

        p.showInfo();
    }
}