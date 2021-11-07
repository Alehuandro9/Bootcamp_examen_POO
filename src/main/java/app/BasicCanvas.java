package app;

import controller.FigureSelectorManager;
import model.figure.Figure;
import java.util.Objects;
import java.util.UUID;
import controller.IFigureSelectorSubscriber;
import java.util.Random;

public class BasicCanvas implements IFigureSelectorSubscriber, ICanvas {

    private final UUID uuid;
    private Figure figure;

    public BasicCanvas() {
        this.uuid = UUID.randomUUID();
        FigureSelectorManager.getInstance().subscribe(this);
    }

    @Override
    public void selectFigure(Figure figure) {
        FigureSelectorManager.getInstance().changeFigureSelection(figure);
    }

    @Override
    public void drawFigure() {
        int height = (int) (Math.random() * 8001);
        int width = (int) (Math.random() * 8001);
        System.out.println("Canvas: " + uuid.toString() + " draws figure: " + figure.toString() + " with height " + height + " and width " + width);
    }

    @Override
    public void update(Figure figure) {
        this.figure = figure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BasicCanvas)) {
            return false;
        }
        BasicCanvas basicCanvas = (BasicCanvas) o;
        return Objects.equals(uuid, basicCanvas.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
