package model.color;
public enum ColorEnum {
    RED(Color.create(255, 0, 0)),
    GREEN(Color.create(0, 255, 0)),
    BLUE(Color.create(0, 0, 255)),
    WHITE(Color.create(255, 255, 255)),
    BLACK(Color.create(0, 0, 0)),
    ;
    private final Color color;

    ColorEnum(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
