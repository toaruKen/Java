class PersonA {

    private String name;
    private int age;

    void showInfo(){
        System.out.println(name + " " + age + "才");
    }

    void setInfo(String n,int a){
        if(a<0){
            System.out.println("ageがマイナスです");
            return ;
        }
        name = n;
        age = a;   
    }
}

class PersonAMain{
    public static void main(String[] args){
    PersonA p = new PersonA();
    p.setInfo("アリス",-5);
    }
}

