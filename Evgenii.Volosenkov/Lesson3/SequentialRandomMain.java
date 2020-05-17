public class SequentialRandomMain {
    public static void main(String[] args)
    {
        SequentialRandom p1 = new SequentialRandom();
        SequentialRandom p2 = new SequentialRandom();
        SequentialRandom p3 = new SequentialRandom();
        SequentialRandom.resetRandom();
        SequentialRandom p4 = new SequentialRandom();
        SequentialRandom p5 = new SequentialRandom();
        SequentialRandom[] arraySequentialRandom = {p1, p2, p3, p4, p5};
        for(SequentialRandom rand: arraySequentialRandom)
        {
            System.out.println(rand.getRandomValue());
        }
    }
}
