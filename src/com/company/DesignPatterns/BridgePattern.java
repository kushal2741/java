package com.company.DesignPatterns;

public class BridgePattern {
    public static void main(String[] args) {

        Squareshape squareshape = new Squareshape("Square",new Red());
        System.out.println(squareshape);
        RectangleShape rectangleShape = new RectangleShape("Rectangle",new Blue());
        System.out.println(rectangleShape);
    }
}
// Implementor
interface Color{

    String getColor();
}
//Concrete Implementor
class Blue implements Color{

    @Override
    public String getColor() {
        return "Blue";
    }
}
//Concrete Implementor
class Red implements Color{
    @Override
    public String getColor() {
        return "Red";
    }
}
//Concrete Implementor
class Pink implements Color{

    @Override
    public String getColor() {
        return "Pink";
    }
}
// Abstraction
abstract class Shapetype{

    String sides;
    Color color;

    public Shapetype(String sides,Color color){
    this.sides = sides;
    this.color = color;

    }

}
// Refined Abstraction
class Squareshape extends Shapetype{
    String type;
    public Squareshape(String type,Color color){
    super("4 sides",color);
    this.type = type;
    }

    @Override
    public String toString() {
        return "Type of shape: " + type + " and color: " + color.getColor() + " and total no of sides are: "+sides;
    }
}
// Refined Abstraction

class RectangleShape extends Shapetype{
    String type;
    public RectangleShape(String type,Color color){
        super("4 sides",color);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type of shape: " + type + " color: " + color.getColor() + " and total no of sides are : "+sides;
    }
}






