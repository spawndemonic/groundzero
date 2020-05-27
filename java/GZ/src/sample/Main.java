package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Button b1 = new Button("refresh");
        Button b2 = new Button("add new url");
        TextField url = new TextField();
        TextArea feed = new TextArea();
       //  //Grid settings
       // GridPane grid = new GridPane();
       // grid.setGridLinesVisible(true);
       // grid.setHgap(10);
       // grid.setVgap(10);
        //                     item,column,row
        //GridPane.setConstraints(b1,1,2);
        //GridPane.setConstraints(b2,3,2);
        //                     layout,column,row,take up this many columns,take up this many rows
        //GridPane.setConstraints(url,4,2,3,1);

        //Border pane settings
        //BorderPane bp = new BorderPane();
        //bp.setTop(new TextArea());
        //GridPane.setConstraints(feed,1,1,5,1);


        //grid.getChildren().addAll(b1,b2,feed,url);
        primaryStage.setTitle("Rss Feed");
        //                              layout,width,height
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
