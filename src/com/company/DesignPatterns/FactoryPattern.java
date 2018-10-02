package com.company.DesignPatterns;

public class FactoryPattern {
    public static void main(String[] args) {

        Polygon polygonWithCircle  = Shapefactory.getPolygonObject("shape of circle");
        polygonWithCircle.getShape().draw();

        Polygon polygonWithRectangle = Shapefactory.getPolygonObject("shape of rectangle");
        polygonWithRectangle.getShape().draw();

        Polygon polygonWithSquare = Shapefactory.getPolygonObject("shape of square");
        polygonWithSquare.getShape().draw();
    }
}

interface Shape{

    void draw();
}
//subclass Circle
class Circle implements Shape {

    @Override
    public void draw() {
    System.out.println("This will draw circle");
    }
}
//subclass Square
class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("This will draw square");
    }
}
// subclass Rectangle
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("This will draw rectangle");
    }
}
//sub class polygon
class Polygon{
    Shape shape;
    public Shape getShape(){

    return shape;

    }
    public void setShape(Shape shape){
    this.shape = shape;
    }

}
//Factory Class
class Shapefactory{

 static Polygon getPolygonObject(String name){

   Polygon polygon = new Polygon();
   switch(name){
       case "shape of circle":
           polygon.setShape(new Circle());
           break;
       case "shape of rectangle":
           polygon.setShape(new Rectangle());
           break;
       case "shape of square":
           polygon.setShape(new Square());
           break;

   }
   return polygon;
 }


}


