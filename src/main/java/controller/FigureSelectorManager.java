package controller;

import app.BasicCanvas;
import model.figure.Figure;
import java.util.HashSet;
import java.util.Set;

public class FigureSelectorManager {
    private static final FigureSelectorManager instance = new FigureSelectorManager();
    private final Set<BasicCanvas> subscribers;

    private FigureSelectorManager() {
        this.subscribers = new HashSet<>();
    }

    public static FigureSelectorManager getInstance() {
        return instance;
    }

    public void subscribe(BasicCanvas basicCanvas) {
        subscribers.add(basicCanvas);
    }

    public void unsubscribe(BasicCanvas basicCanvas) {
        subscribers.remove(basicCanvas);
    }

    private void notifyAll(Figure figure) {
        subscribers.forEach(c -> c.update(figure));
    }

    public void changeFigureSelection(Figure figure) {
        notifyAll(figure);
    }
}
