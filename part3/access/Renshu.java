class Lady {
    private int age;

    void setAge(int age) {
        this.age=age;
    }

    int getAge(){
        return age;
    }
}

class Renshu{
    public static void main(String[] args) {
        Lady lady = new Lady();
        lady.setAge(30);
        System.out.println("age=" + lady.getAge());

    }
}