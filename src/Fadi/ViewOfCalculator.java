package Fadi;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class ViewOfCalculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNumber1, txtNumber2, txtResult;
	private JButton btnAdd, btnSubtract, btnMultiply, btnMod, btnDivide, btnSquareRoot;
	private JLabel L1, lblNumber1, lblNumber2, lblResult;
	private JPanel panel;


	public ViewOfCalculator() {
		getContentPane().setLayout(new BorderLayout());
		txtNumber1 = new JTextField();
		txtNumber2 = new JTextField();
		txtResult = new JTextField();
		txtResult.setForeground(new Color(0, 0, 0));
		txtResult.setEditable(false);
		btnAdd = new JButton("+");
		btnSubtract = new JButton("-");
		btnMultiply = new JButton("*");
		btnDivide = new JButton("/");
		btnMod = new JButton("%");
		btnSquareRoot = new JButton("sqrt");
		L1 = new JLabel("Calculator", JLabel.CENTER);
	
		lblResult = new JLabel("Result:");
		panel = new JPanel();
		for (int i = 0; i < 20; i++)
			panel.add(new JLabel(""));
		lblNumber1 = new JLabel("Number1:");
		lblNumber2 = new JLabel("Number2:");

		getContentPane().add(L1, BorderLayout.NORTH);
		getContentPane().add(panel, BorderLayout.WEST);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addGap(19)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(btnAdd)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(lblResult, GroupLayout.PREFERRED_SIZE, 52,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblNumber2)))
										.addComponent(lblNumber1))
								.addGap(18)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(txtNumber1, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
										.addGroup(gl_panel
												.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnSubtract).addGap(18).addComponent(btnMultiply)
												.addGap(18).addComponent(btnDivide))
										.addComponent(txtNumber2)
										.addGroup(gl_panel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(txtResult,
														GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
						.addGroup(gl_panel.createSequentialGroup().addGap(54).addComponent(btnMod).addGap(71)
								.addComponent(btnSquareRoot)))
						.addGap(194)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(33)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNumber1).addComponent(
						txtNumber1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(21)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNumber2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumber2))
				.addGap(32)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(btnAdd)
						.addComponent(btnMultiply).addComponent(btnDivide).addComponent(btnSubtract))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel
						.createParallelGroup(Alignment.BASELINE).addComponent(btnSquareRoot).addComponent(btnMod))
				.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblResult).addComponent(
						txtResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		panel.setLayout(gl_panel);

	}

	public void addController(Controller controller) {
		btnAdd.addActionListener(controller);
		btnSubtract.addActionListener(controller);
		btnMultiply.addActionListener(controller);
		btnDivide.addActionListener(controller);
		btnMod.addActionListener(controller);
		btnSquareRoot.addActionListener(controller);
	}

	public double number1Value() {
		double number = 0;
		try {
			number = Double.parseDouble(txtNumber1.getText());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "The First Number is wrong", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return number;
	}

	public double number2Value() {
		double number = 0;
		try {
			number = Double.parseDouble(txtNumber2.getText());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "The Second Number is wrong", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return number;
	}

	public void setResult(String result) {
		txtResult.setText(result);
	}

	public JButton getBtnAdd() {
		return this.btnAdd;
	}

	public JButton getBtnSubtract() {
		return this.btnSubtract;
	}

	public JButton getBtnMultiply() {
		return this.btnMultiply;
	}

	public JButton getBtnDivide() {
		return this.btnDivide;
	}

	public JButton getBtnMod() {
		return this.btnMod;
	}

	public JButton getBtnSquareRoot() {
		return this.btnSquareRoot;
	}
}
