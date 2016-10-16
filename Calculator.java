import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Calculator extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		GridPane grid = new GridPane();
		for (int col=0; col<8; col++) {
			ColumnConstraints column = new ColumnConstraints(30);
			grid.getColumnConstraints().add(column);
		}
		for (int ro=0; ro<10; ro++) {
			RowConstraints row = new RowConstraints(30);
			grid.getRowConstraints().add(row);
		}	
		grid.setVgap(5);
		grid.setHgap(5);
		
		Button add = new Button("+");
		Button equals = new Button("=");
		Button minus = new Button("-");
		Button devide = new Button("/");
		Button multiply = new Button("x");
		Button decimal = new Button(".");
		Button delete = new Button("Delete");
		Button clear = new Button("Clear");
		Button cleara = new Button("ClearAll");
		Button opara = new Button("(");
		Button cpara = new Button (")");
		Button zero = new Button("0");
		Button one = new Button("1");
		Button two = new Button("2");
		Button three = new Button("3");
		Button four = new Button("4");
		Button five = new Button("5");
		Button six = new Button("6");
		Button seven = new Button("7");
		Button eight = new Button("8");
		Button nine = new Button("9");
		
		Label output = new Label("");
		Label outputup = new Label(null);
		Label outputup1 = new Label("");
		Label outputup2 = new Label("");
		Label outputup3 = new Label("");
		
		//grid.add(child, columnIndex, rowIndex);
		grid.add(zero, 0, 9);
		zero.setPrefWidth(65);
		zero.setPrefHeight(30);
		GridPane.setColumnSpan(zero, 2);
		grid.add(one, 0, 8);
		one.setPrefWidth(30);
		one.setPrefHeight(30);
		grid.add(four, 0, 7);
		four.setPrefWidth(30);
		four.setPrefHeight(30);
		grid.add(seven, 0, 6);
		seven.setPrefWidth(30);
		seven.setPrefHeight(30);
		grid.add(two, 1, 8);
		two.setPrefWidth(30);
		two.setPrefHeight(30);
		grid.add(five, 1, 7);
		five.setPrefWidth(30);
		five.setPrefHeight(30);
		grid.add(eight, 1, 6);
		eight.setPrefWidth(30);
		eight.setPrefHeight(30);
		grid.add(decimal, 2, 9);
		decimal.setPrefWidth(30);
		decimal.setPrefHeight(30);
		grid.add(three, 2, 8);
		three.setPrefWidth(30);
		three.setPrefHeight(30);
		grid.add(six, 2, 7);
		six.setPrefWidth(30);
		six.setPrefHeight(30);
		grid.add(nine, 2, 6);
		nine.setPrefWidth(30);
		nine.setPrefHeight(30);
		grid.add(minus, 3, 9);
		minus.setPrefWidth(30);
		minus.setPrefHeight(30);
		grid.add(add, 3, 8);
		add.setPrefWidth(30);
		add.setPrefHeight(30);
		grid.add(devide, 3, 7);
		devide.setPrefWidth(30);
		devide.setPrefHeight(30);
		grid.add(multiply, 3, 6);
		multiply.setPrefWidth(30);
		multiply.setPrefHeight(30);
		grid.add(cleara, 4, 6);
		cleara.setPrefWidth(135);
		cleara.setPrefHeight(30);
		GridPane.setColumnSpan(cleara, 4);
		grid.add(clear, 4, 7);
		clear.setPrefWidth(65);
		clear.setPrefHeight(30);
		GridPane.setColumnSpan(clear, 2);
		grid.add(delete, 6, 7);
		delete.setPrefWidth(65);
		delete.setPrefHeight(30);
		GridPane.setColumnSpan(delete, 2);
		grid.add(opara, 4, 8);
		opara.setPrefWidth(30);
		opara.setPrefHeight(30);
		grid.add(cpara, 5, 8);
		cpara.setPrefWidth(30);
		cpara.setPrefHeight(30);
		grid.add(equals, 4, 9);
		equals.setPrefWidth(135);
		equals.setPrefHeight(30);
		GridPane.setColumnSpan(equals, 4);
		grid.add(output, 0, 4);
		GridPane.setColumnSpan(output, 8);
		grid.add(outputup, 0, 0);
		GridPane.setColumnSpan(outputup, 8);
		grid.add(outputup1, 0, 1);
		GridPane.setColumnSpan(outputup1, 8);
		grid.add(outputup2, 0, 2);
		GridPane.setColumnSpan(outputup2, 8);
		grid.add(outputup3, 0, 3);
		GridPane.setColumnSpan(outputup3, 8);
		
		zero.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append(0);
				output.setText(addtoout.toString());
			}
		});
		one.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append(1);
				output.setText(addtoout.toString());
			}
		});
		two.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append(2);
				output.setText(addtoout.toString());
			}
		});
		three.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append(3);
				output.setText(addtoout.toString());
			}
		});
		four.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append(4);
				output.setText(addtoout.toString());
			}
		});
		five.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append(5);
				output.setText(addtoout.toString());
			}
		});
		six.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append(6);
				output.setText(addtoout.toString());
			}
		});
		seven.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append(7);
				output.setText(addtoout.toString());
			}
		});
		eight.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append(8);
				output.setText(addtoout.toString());
			}
		});
		nine.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append(9);
				output.setText(addtoout.toString());
			}
		});
		devide.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append("/");
				output.setText(addtoout.toString());
			}
		});
		multiply.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append("*");
				output.setText(addtoout.toString());
			}
		});
		add.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addout;
				addout = new StringBuffer(output.getText());
				addout.append("+");
				output.setText(addout.toString());
			}
		});
		minus.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append("-");
				output.setText(addtoout.toString());
			}
		});
		opara.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append("(");
				output.setText(addtoout.toString());
			}
		});
		cpara.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent add){
				
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				addtoout.append(")");
				output.setText(addtoout.toString());
			}
		});		
		clear.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent cleara){
				output.setText("");
			}
		});	
		cleara.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent cleara){
				output.setText("");
				outputup.setText("");
			}
		});	
		delete.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent cleara){
				StringBuffer addtoout;
				addtoout = new StringBuffer(output.getText());
				int a = addtoout.length();
				addtoout.replace(a-1, a, "");
				System.out.println(a);
				
				output.setText(addtoout.toString());
			}
		});	
		equals.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent equate) {
				ScriptEngineManager mgr = new ScriptEngineManager();
				ScriptEngine engine = mgr.getEngineByName("JavaScript");
				String out = outputup.getText();
				String out1 = outputup1.getText();
				String out2 = outputup2.getText();
				outputup3.setText(out2);
				outputup2.setText(out1);
				outputup1.setText(out);
				try {
					outputup.setText("" + output.getText() + " = "
							+ engine.eval(output.getText()));
					output.setText("");
				} catch (ScriptException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Scene scene = new Scene(grid, 280, 345);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
