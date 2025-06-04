package ThreadQues;

public class Rectangle {
    private float length, breadth;

    public synchronized void SetData(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("THE DATAS ARE SET FOR LENGTH : " + length + "FOR BREADTH: " + breadth);

    }

    public synchronized float getArea() {
        return length * breadth;
    }

    public synchronized float getPerimeter() {
        return (2 * (length + breadth));
    }
}
