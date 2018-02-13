package Fadi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener {
	Model model;
	ViewOfCalculator view;

	public Controller() {
		model = new Model();
		view = new ViewOfCalculator();
	}

	public void addModel(Model m) {
		this.model = m;
	}

	public void addView(ViewOfCalculator v) {
		this.view = v;
	}

	public void actionPerformed(ActionEvent e) {
		double number1 = view.number1Value();

		if (e.getSource() == view.getBtnAdd()) {
			double number2 = view.number2Value();
			view.setResult(model.add(number1, number2));
		} else if (e.getSource() == view.getBtnSubtract()) {
			double number2 = view.number2Value();
			view.setResult(model.subtract(number1, number2));
		} else if (e.getSource() == view.getBtnMultiply()) {
			double number2 = view.number2Value();
			view.setResult(model.multiply(number1, number2));
		} else if (e.getSource() == view.getBtnDivide()) {
			double number2 = view.number2Value();
			view.setResult(model.divide(number1, number2));
		} else if (e.getSource() == view.getBtnMod()) {
			double number2 = view.number2Value();
			view.setResult(model.mod( number1, number2));
		} else if (e.getSource() == view.getBtnSquareRoot()) {
			view.setResult(model.squareRoot(number1));
		}
	}
}
