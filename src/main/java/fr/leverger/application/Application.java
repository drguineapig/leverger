package fr.leverger.application;

import fr.leverger.scene.Menu;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
         Menu menu = new Menu();
         primaryStage.setScene(menu.initialisation());
         primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
