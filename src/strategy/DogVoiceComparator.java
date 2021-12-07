package strategy;

public class DogVoiceComparator implements MyComparator<Dog>{
    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.voice<o2.voice) return -1;
        else if(o1.voice>o2.voice) return 1;
        else return 0;
    }
}
