package qaBoxApp;

import javafx.application.Application;
import javafx.stage.Stage;

import qaBoxApp.frontend.MainFrontend;
import qaBoxApp.backend.MainBackend;

public class QaBoxApp extends Application {

	@Override
    public void start(Stage stage) throws Exception{
		
		MainFrontend start = new MainFrontend(stage);
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
