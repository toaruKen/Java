class Dog{
    String voice;

    void bark(){
        System.out.println(voice);
    }

}

class DogMain{

    public static void main(String[] args){
        Dog dog=new Dog();
        dog.voice="わんわん";

        dog.bark();
    }
}