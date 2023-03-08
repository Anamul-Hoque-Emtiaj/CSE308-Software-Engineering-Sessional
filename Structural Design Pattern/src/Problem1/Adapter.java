package Problem1;

public class Adapter implements Passengers{
    Imposter imposter;

    public Adapter() {
        imposter = new Imposter();
    }

    @Override
    public void study() {
        imposter.poison();
    }

    @Override
    public void maintain() {
        imposter.damage();
    }
}
