public class PekingDuck extends Duck{
    pekingDuck(String name){
        super(name);
    }
    void beCrispy(){
        System.out.println("Grob grob! (sound effect)");
    }

    @Override
    void clean(Animal animal) {
        System.out.println("พี่แจ๊คครับ.........");
    }
    public void beCrispy(){
        System.out.println("Grob grob! (sound effect)");
    }
}
