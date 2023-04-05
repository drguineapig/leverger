package fr.leverger.scene;

import fr.leverger.utils.ImageMenu;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

import java.io.FileNotFoundException;

public class Menu {
    //widget
    private Pane fond;
    private Scene scene;
    private Button boutonDebut;
    //gestion des images
    private ImageMenu imageMenu;
    //arriere plan du menu
    private BackgroundImage fondImage;
    private Background arrierePlan;



    public Menu() throws FileNotFoundException {
        //widget
        this.fond = new Pane();
        this.scene = new Scene(this.fond,800,800);
        this.boutonDebut = new Button("start");
        //gestion des images
        this.imageMenu = new ImageMenu();

        //arriere plan du menu
        this.fondImage = new BackgroundImage(imageMenu.getArrierePlanMenu(), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        this.arrierePlan = new Background(this.fondImage);


    }

    public Scene initialisation(){
        this.fond.setBackground(this.arrierePlan);
        this.fond.getChildren().addAll(this.boutonDebut);
        return scene;
    };
}
