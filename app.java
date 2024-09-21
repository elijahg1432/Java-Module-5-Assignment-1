//a lot of imports for later so that we can edit our images to appear differently.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

//the main class of where our images are stored,
public class app extends Application {
    @Override
    public void start(Stage primaryStage) {
        
        //load the imagews, make sure to use their own directories and give them unique variable names so we can call upon the specific image
        Image image1 = new Image("file:///C:/Users/Elijah/Pictures/Saved%20Pictures/dankey.jpg");
        Image image2 = new Image("file:///C:/Users/Elijah/Pictures/Saved%20Pictures/sadEmoji.png");
        Image image3 = new Image("file:///C:/Users/Elijah/Pictures/Saved%20Pictures/cloud.jpg");
        Image image4 = new Image("file:///C:/Users/Elijah/Pictures/Saved%20Pictures/yoshmug.jpg");
        
        //we create views so that we can actually look at the image.
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);
        
        //we set the width and height of each image, so that the image's individual sizes arent drastic between each other.
        imageView1.setFitWidth(400);
        imageView1.setFitHeight(400);

        //we also use preserveratio so that the image is not stretched out in one way or the other.
        imageView1.setPreserveRatio(true);
        
        //we do this with our second image...
        imageView2.setFitWidth(400);
        imageView2.setFitHeight(400);
        imageView2.setPreserveRatio(true);
        
        //3rd...
        imageView3.setFitWidth(400);
        imageView3.setFitHeight(400);
        imageView3.setPreserveRatio(true);
        
        //... and 4th!
        imageView4.setFitWidth(400);
        imageView4.setFitHeight(400);
        imageView4.setPreserveRatio(true);
        
        //we then create our grid for the images to appear on. 0,0 is top left, 1, 0 is top right, 0, 1 is bottom left, and 1, 1 is bottom right. we add them, as if it were a list
        GridPane gridPane = new GridPane();
        gridPane.add(imageView1, 0, 0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 0, 1);
        gridPane.add(imageView4, 1, 1);
        
        //we set the scene to be 1000 x 1000px
        Scene scene = new Scene(gridPane, 1000, 1000);

        //we name our window grid time, i thought it was a nice name.
        primaryStage.setTitle("Grid time!");

        //we set the scene after we compiled the grid from above
        primaryStage.setScene(scene);

        //then we show our scene to the user
        primaryStage.show();
    }

    //then we run our main, which runs all the code from above basically. all done!
    public static void main(String[] args) {
        launch(args);
    }
}
