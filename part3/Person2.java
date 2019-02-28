class Person2{

    String name;
    int age;

    Person2(){
        System.out.println("コンストラクタが呼ばれました");
        name="名無しさん";
        age=10;
    }

    void showInfo(){
        System.out.println(name + " " + age + "才");
    }
}

class Person2Main {
    
    public static void main(String[] args){
        System.out.println("newの前");

        Person2 p=new Person2();

        System.out.println("newの後");

        p.showInfo();
        
    }
}