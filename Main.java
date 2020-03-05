package Pawielski.Macy.Chapter6.Java.Project.FinalAttempt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(54, 43, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(54, 99, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNumerator = new JLabel("Numerator");
		lblNumerator.setBounds(54, 25, 66, 14);
		frame.getContentPane().add(lblNumerator);
		
		JLabel lblDenominator = new JLabel("Denominator");
		lblDenominator.setBounds(54, 74, 66, 14);
		frame.getContentPane().add(lblDenominator);
		
		JLabel lblResult = new JLabel("Result :)");
		lblResult.setBounds(306, 74, 46, 14);
		frame.getContentPane().add(lblResult);
		
		JButton btnCalculate = new JButton("Calculate");
		
		btnCalculate.setBounds(296, 98, 89, 23);
		frame.getContentPane().add(btnCalculate);
	
	
	btnCalculate.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			double numerator = Double.parseDouble(textField.getText());
			double demoninator = Double.parseDouble(textField_1.getText());
		
		SimpleMath simplemath1 = new SimpleMath();
		double result = simplemath1.Divide(numerator,demoninator);
		String x = String.valueOf(result);
			try {
				lblResult.setText(x);
			} 
		
			catch(ArithmeticException e) {
				
				lblResult.setText("Cannot Divide by 0");
			}
		}
	});
}
}

