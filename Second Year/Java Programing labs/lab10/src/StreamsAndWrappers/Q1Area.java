package StreamsAndWrappers;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Q1Area extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JTextField circleRadius;
	private JTextField outputFld;
	JButton btnNewButton;
	double area, radius;
	private JLabel lblCicle;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q1Area frame = new Q1Area();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Q1Area() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 5, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 285, SpringLayout.WEST, contentPane);
		contentPane.add(panel);
		
		JLabel lblPleaseEnterRadius = new JLabel("Please enter radius of circle");
		sl_contentPane.putConstraint(SpringLayout.EAST, lblPleaseEnterRadius, -72, SpringLayout.EAST, contentPane);
		contentPane.add(lblPleaseEnterRadius);
		
		circleRadius = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblPleaseEnterRadius, -16, SpringLayout.NORTH, circleRadius);
		sl_contentPane.putConstraint(SpringLayout.NORTH, circleRadius, 61, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, circleRadius, -182, SpringLayout.EAST, contentPane);
		contentPane.add(circleRadius);
		circleRadius.setColumns(10);
		
		btnNewButton = new JButton("Calculate");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, circleRadius);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 98, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, circleRadius, 0, SpringLayout.EAST, btnNewButton);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		outputFld = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, outputFld, 138, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, outputFld, -244, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, outputFld, -32, SpringLayout.EAST, contentPane);
		contentPane.add(outputFld);
		outputFld.setColumns(10);
		
		lblCicle = new JLabel("Circle Area");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblCicle, 6, SpringLayout.SOUTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblCicle, -10, SpringLayout.EAST, btnNewButton);
		contentPane.add(lblCicle);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// if button is pressed do the job
		if (e.getSource()==btnNewButton){
			// getting data from input field
			radius= Double.parseDouble(circleRadius.getText());
			// formula for calculating circle area
			area=radius * radius * Math.PI;
			// converting double to string
			 String answer = Double.toString(area);
			outputFld.setText(answer);
		}
		
	}
}
