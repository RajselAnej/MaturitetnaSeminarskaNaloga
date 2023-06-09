package application;

	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.canvas.Canvas;
	import javafx.scene.layout.Pane;
	import javafx.scene.paint.Color;
	import javafx.stage.Stage;

	public class GUISolitaire extends Application {

		@Override
		public void start(Stage primaryStage) {
			Canvas canvas = new Canvas(900, 600);
			
			Pane root = new Pane(canvas);
			
			Scene scene = new Scene(root, Color.DARKGREEN);
			
			Game game = new Game(canvas.getGraphicsContext2D());
			
			canvas.setOnMouseClicked(game::handleMouseClicked);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Pasjansa");
			primaryStage.show();
		}

		public static void main(String[] args) {
			launch(args);
		}
}