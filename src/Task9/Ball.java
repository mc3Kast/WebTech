package Task9;

public class Ball {
    public double weight;
    public BallColors color;

    public Ball(double weight, BallColors color){
        this.color = color;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public BallColors getColor() {
        return color;
    }
}
