public class main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.sound();

        Duck donald = new Duck("โดนัลด์");
        donald.sound();

        Pig burin = new Pig();
        burin.sound();

        Owl hedwig = new Owl();
        hedwig.sound();

        donald.clean(cow);

        Duck daisy = new Duck("เดซี่");
        daisy.clean(donald);

        Duck fourseason = new pekingDuck("4ss");
        fourseason.clean(daisy);
        fourseason.fly();
        fourseason.glide();
        fourseason.beCrispy();

        donald.clean(new Cow());
    }
}
