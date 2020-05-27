package Lecture_5;

import java.util.Random;


public abstract class Figure {

	public abstract double square();
	
	public Figure() {
		this.x=0;
		this.y=0;
	}
	Figure [] point;
	protected int x = new Random().nextInt();
	protected int y = new Random().nextInt();
	
	enum Quadrant{I, II, III, IV, coordinate_intersection}

	public Quadrant getQuadrant() {
		
				
		if (this.x>0 & this.y>0) {
			return Quadrant.I;
		}
		else if (this.x<0 & this.y>0) {
			return Quadrant.II;
		}else if (this.x<0 & this.y<0) {
			return Quadrant.III;
		}else if(this.x>0 && this.y<0){
			return Quadrant.IV;
		}else {
			return Quadrant.coordinate_intersection;
		}

	}
	
	

	public static void main(String[] args) {
		
		Random rnd=new Random();
		Quadrant [] quadrant = Quadrant.values();
		Figure[] figures = {new Circle(), new Rectangle(), new Circle(), new Rectangle(), new Circle()};

		for (int i=0;i<figures.length;i++) {
		System.out.println("Figure:"+" "+(figures[rnd.nextInt(5)]+" "+quadrant[rnd.nextInt(4)]));
		}
			}
	}
        





