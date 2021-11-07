package model.figure;

import model.color.Color;

public class Figure {
    private FigureShapeEnum shape;
    private Color borderColor;
    private Color backgroundColor;

    private Figure(FigureShapeEnum shape, Color borderColor, Color backgroundColor) {
        this.shape = shape;
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    public FigureShapeEnum getShape() {
        return shape;
    }

    public void setShape(FigureShapeEnum shape) {
        this.shape = shape;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "shape=" + shape +
                ", borderColor=" + borderColor +
                ", backgroundColor=" + backgroundColor +
                '}';
    }

    public static Figure create(FigureShapeEnum shape, Color borderColor, Color backgroundColor) {
        return new Figure(shape, borderColor, backgroundColor);
    }
}
