public class Circle {
  private double radius;
  private String color;

  public Circle() {
    radius = 1.0;
    color = "red";
  }

  public Circle(String color, double radius) {
    this.color = color;
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getCircumference() {
    return 2 * radius * Math.PI;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  @Override
  public String toString() {
    return "A Circle with radius= "
      + getRadius()
      +  " with color of "
      + getColor();
  }
}

