package Fadi;

import javax.swing.JFrame;

public class Calculator {

	public static void main(String args[]) {
		ViewOfCalculator view = new ViewOfCalculator();
		Model model = new Model();
		Controller controller = new Controller();

		controller.addModel(model);
		controller.addView(view);
		view.addController(controller);
		view.setVisible(true);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(700, 300);
	}

}
