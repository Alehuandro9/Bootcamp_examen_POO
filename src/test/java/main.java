import app.BasicCanvas;
import model.color.Color;
import model.color.ColorEnum;
import model.figure.Figure;
import model.figure.FigureShapeEnum;

public class main {
    public static void main(String[] args) {

        BasicCanvas basicCanvasA = new BasicCanvas();
        basicCanvasA.selectFigure(Figure.create(FigureShapeEnum.HEARTH, ColorEnum.RED.getColor(), ColorEnum.RED.getColor()));
        basicCanvasA.drawFigure();

        BasicCanvas basicCanvasB = new BasicCanvas();
        BasicCanvas basicCanvasC = new BasicCanvas();
        Color personalizedColor = new Color(244, 53, 14);
        Figure figure = Figure.create(FigureShapeEnum.HEARTH, personalizedColor, ColorEnum.RED.getColor());
        basicCanvasC.selectFigure(figure);
        basicCanvasB.drawFigure();
    }
}
