import java.lang.Math;

public class Task1{

     public static void main(String []args){
        
        int n = 5;
        Figure[] figures = new Figure[n];
        
        figures[0] = new Rectangle(1,1,10,5);
        figures[1] = new Circle(-10,5,15);
        figures[2] = new Rectangle(-3,-6,4,4);
        figures[3] = new Circle(2,8,5);
        figures[4] = new Rectangle(7,-1,9,2);
        
        for(int i=0;i<n;i++) {
            System.out.printf("%s, %s: периметр = %f, площадь = %f\n", figures[i], figures[i].getQuadrant(), figures[i].getPerimeter(), figures[i].square());
        }
        
     }
}


// абстрактный класс фигуры
abstract class Figure{
     
    float x; // x-координата центра
    float y; // y-координата центра
  
    Figure(float x, float y){
         
        this.x=x;
        this.y=y;
    }
    // абстрактный метод для периметра
    public abstract float getPerimeter();
    // абстрактный метод для площади
    public abstract float square();
    
    public Quarter getQuadrant() {
        Quarter str;
        
        if(x*y>0&&x>0)
            str = Quarter.I;
        else if (x*y>0&&x<0)
            str = Quarter.III;
        else if (x*y<0&&x>0)
            str = Quarter.IV;
        else
            str = Quarter.II;
        return str;
    }
    
    public abstract String toString();


}

enum Quarter {
  
    I,II,III,IV
}

// производный класс прямоугольника
class Rectangle extends Figure
{
    private float width;
    private float height;
    private float min=0;
    private float max=20;
    
    
    // конструктор с обращением к конструктору класса Figure
    Rectangle(float x, float y, float width, float height){
         
        super(x,y);
        
        if(width<min)
            this.width = min;
        else if(width>max)
            this.width = max;
        else    
        this.width = width;
        
        if(height<min)
            this.height = min;
        else if(height>max)
            this.height = max;
        else   
        this.height = height;
    }
     
    public float getPerimeter(){
         
        return width * 2 + height * 2;
    }
     
    public float square(){
         
        return width * height;
    }
    
    public String toString() {
        return ("Rectangle");
    }
}

class Circle  extends Figure
{
    private float  maxRadius = 10; 
    private float  minRadius = 0; 
    private float  radius; 
  
    // конструктор с обращением к конструктору класса Figure
    Circle (float x, float y, float r){
        

        super(x,y);
        
        if(r<minRadius)
            this.radius = minRadius;
        else if(r>maxRadius)
            this.radius = maxRadius;
        else    
        this.radius = r;
    }
     
    public float getPerimeter(){
         
        return 2*radius*(float)(Math.PI);
    }
     
    public float square(){
         
        return radius*radius*(float)(Math.PI);
    }
    
    public String toString() {
        return ("Circle");
    }
}
