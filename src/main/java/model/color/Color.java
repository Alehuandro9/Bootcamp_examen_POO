package model.color;
        
public class Color {
    public int redValue;
    public int greenValue;
    public int blueValue;

    public Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    public static Color create(int r, int g, int b) {
        return new Color(r, g, b);
    }

    @Override
    public String toString() {
        return "Color{" +
                "r=" + redValue +
                ", g=" + greenValue +
                ", b=" + blueValue +
                '}';
    }
}
