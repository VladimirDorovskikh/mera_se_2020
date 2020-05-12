public class SequenceMain {
    public static void main(String[] args) {
        SequentialRandom sr = new SequentialRandom();
        System.out.println(sr.getId());
        System.out.println(new SequentialRandom().getId());
        System.out.println(sr.getId());
        System.out.println(new SequentialRandom().getId());
        System.out.println(new SequentialRandom().getId());
        SequentialRandom.resetRandom();
        System.out.println(new SequentialRandom().getId());
        System.out.println(new SequentialRandom().getId());
        System.out.println(new SequentialRandom().getId());
        System.out.println(new SequentialRandom().getId());
    }
}
