class Person4{
    String name;
    int age;

    Person4(String iname,int iage){
        name = iname;
        age = iage;
    }

    void showInfo(){
        System.out.println(name + " " + age + "才");
    }

    void showInfo(String msg){
        System.out.println(msg + " " + name + " " + age + "才");
    }
}

class Person4Main{
    public static void main(String[] args){
        Person4 p = new Person4("アリス",10);

        System.out.println("引数なしのメソッドを呼びます");
        p.showInfo();
        
        System.out.println("引数付きのメソッドを呼びます");
        p.showInfo("不思議の国の");
    }
}