public class Duck extends Animal implements Flyable{
    String name ;
    public Duck(String name){
        this.name = name;

    }
    @Override
    void sound() {
        System.out.println("Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb");
    }

    @Override
    public void glide() {
        System.out.println("hiyahh!");

    }
    void clean(Animal animal){
        System.out.println(this.toString()+" is cleaning"+animal);
    }
    public String toString(){
        return "เป็ด: "+this.name;
    }


}
