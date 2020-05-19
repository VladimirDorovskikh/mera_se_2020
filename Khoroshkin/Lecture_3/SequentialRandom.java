package Lecture_3;
import java.util.Random;

public class SequentialRandom {
	private int Readvariable;
	private static boolean isNew = false;
	private static int Prev;
    

    public static int getPrev() {
		return Prev;
	}



	public static void setPrev(int prev) {
		Prev = prev;
	}



	public static boolean isNew() {
		return isNew;
	}



	public static void setNew(boolean isNew) {
		SequentialRandom.isNew = isNew;
	}



	public SequentialRandom() {
		if(isNew == false) {
			Random rand = new Random();
			this.Readvariable = rand.nextInt();
			setPrev(this.Readvariable);
			setNew(true);
		}
		else {
			this.Readvariable = getPrev()+1;
			setPrev(this.Readvariable);
		} 

	}

	public int getReadvariable() {
		return Readvariable;
	}


	static void resetRandom() {
		SequentialRandom.isNew = false;
	}
	
	
	public static void main(String[] args) {
		SequentialRandom sr1 = new SequentialRandom();
		System.out.println(sr1.getReadvariable());
		SequentialRandom sr2 = new SequentialRandom();
		System.out.println(sr2.getReadvariable());
		SequentialRandom sr3 = new SequentialRandom();
		System.out.println(sr3.getReadvariable());
		resetRandom();
		SequentialRandom sr4 = new SequentialRandom();
		System.out.println(sr4.getReadvariable());
		SequentialRandom sr5 = new SequentialRandom();
		System.out.println(sr5.getReadvariable());

		
	}
}