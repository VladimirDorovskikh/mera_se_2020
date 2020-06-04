import java.util.Random;

public class GenericsMain {
    static Random rand = new Random();
    public static void main(String[] args)
    {
        MyArrayList<Bycicle> bycicles = new MyArrayList<>();
        String[] models = {"Альтаир", "Хонда", "Победа", "Трек", "Мерида"};
        for(int byInd =0; byInd<11;byInd++)
        {
            Bycicle bycicle = new Bycicle(models[rand.nextInt(5)], rand.nextInt(45)+5);
            try
            {
                bycicles.add(bycicle);
            }
            catch (MyArrayListStoreException e)
            {
                System.out.println("не могу добавить велосипед " + bycicle.model + " с максимальной скоростью "+ bycicle.maxSpeed);
            }
        }
        int lessSpeed = rand.nextInt(50);
        System.out.println("Минимальная скорость "+ lessSpeed + " км/ч");
        int index= 0;
        while(bycicles.size()>0 && index<bycicles.size())
        {
            Bycicle cycle = bycicles.get(index);
            if (cycle.maxSpeed<lessSpeed)
            {
                bycicles.remove(cycle);
            }
            else
            {
                index++;
            }
        }
        Object[] cycles = bycicles.toArray();
        for( Object objCycle:cycles)
        {
            Bycicle cycle = (Bycicle) objCycle;
            System.out.println(cycle.model + " " + cycle.maxSpeed +" км/ч");
        }


        System.out.print("");
        System.out.println("Числа");
        MyArrayList<Integer> numberList = new MyArrayList<>();
        for(int numInd=0; numInd<10;numInd++)
        {
            numberList.add(rand.nextInt());
        }
        int numIndex = 0;
        while(numberList.size()>0 && numIndex<numberList.size())
        {
            int currVal = numberList.get(numIndex);
            if (currVal%2==0)
            {
                numberList.remove(currVal);
                continue;
            }
            numIndex++;
        }
        Object [] numObjects = numberList.toArray();
        for( Object obj: numObjects)
        {
            System.out.print( (int)obj + "  ");
        }
    }
}
