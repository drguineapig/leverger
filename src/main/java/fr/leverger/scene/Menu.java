package fr.leverger.scene;

import fr.leverger.utils.ImageMenu;
import javafx.scene.Scene;
import javafx.scene.layout.*;

import java.io.FileNotFoundException;

public class Menu {
    private Pane fond;
    private Scene scene;
    private ImageMenu imageMenu;
    private BackgroundImage fondImage;
    private Background arrierePlan;

    public Menu() throws FileNotFoundException {
        this.fond = new Pane();
        this.scene = new Scene(this.fond,800,800);
        this.imageMenu = new ImageMenu();
        this.fondImage = new BackgroundImage(imageMenu.getArrierePlanMenu(), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        this.arrierePlan = new Background(this.fondImage);
    }

    public Scene initialisation(){
        this.fond.setBackground(this.arrierePlan);
        return scene;
    };
}
