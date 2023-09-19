public class Rectangle {    //mall av ett object
    int x;                  //instansvariabler
    int y;
    int width;
    int height;

    public Rectangle() {    //konstruktör
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.x = 0;
        this.y = 0;
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        double area = this.width * this.height;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = (width*2) + (height*2);
        return perimeter;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
