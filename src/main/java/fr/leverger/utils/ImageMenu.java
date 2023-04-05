package fr.leverger.utils;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImageMenu {
    private Image arrierePlanMenu;
    private Image boutonDebut;
    private Image boutonQuitter;

    public ImageMenu()throws FileNotFoundException {
        this.arrierePlanMenu = new Image(new FileInputStream("src/image/menuLeverger.png"));
    }

    public Image getArrierePlanMenu() {
        return arrierePlanMenu;
    }
}
