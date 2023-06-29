package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tableform extends JFrame {

	private JPanel contentPane;
	private JTextField fnameTxt;
	private JTextField lnameTxt;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tableform frame = new Tableform();
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
	public Tableform() {
		setTitle("TableForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First name");
		lblNewLabel.setBounds(10, 27, 68, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last name");
		lblNewLabel_1.setBounds(148, 27, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		fnameTxt = new JTextField();
		fnameTxt.setBounds(62, 24, 76, 20);
		contentPane.add(fnameTxt);
		fnameTxt.setColumns(10);
		
		lnameTxt = new JTextField();
		lnameTxt.setBounds(203, 24, 76, 20);
		contentPane.add(lnameTxt);
		lnameTxt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("College");
		lblNewLabel_2.setBounds(289, 27, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox collegeCmb = new JComboBox();
		collegeCmb.setModel(new DefaultComboBoxModel(new String[] {"Kec", "Nec", "Trinity", "St. Xavier"}));
		collegeCmb.setBounds(334, 23, 90, 22);
		contentPane.add(collegeCmb);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(10, 71, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton maleBtn = new JRadioButton("Male");
		buttonGroup.add(maleBtn);
		maleBtn.setBounds(60, 67, 68, 22);
		contentPane.add(maleBtn);
		
		JRadioButton rdbtnFemale = new JRadioButton(" Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(130, 67, 76, 20);
		contentPane.add(rdbtnFemale);
		
		JRadioButton agreeChk = new JRadioButton("Agree");
		agreeChk.setBounds(203, 67, 109, 23);
		contentPane.add(agreeChk);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String fn = fnameTxt.getText();
				String ln = lnameTxt.getText();
				String colz = collegeCmb.getSelectedItem().toString();
				
				String gender;
				if(maleBtn.isSelected()) {
					gender = "Male";
				}else {
					gender = "Female";
				}
				
				String agr = (agreeChk.isSelected())? "Yes" : "No";
				
				// set to database
				
				
				
				//set data to Jtable
				DefaultTableModel tmodel =  (DefaultTableModel)table.getModel();
				tmodel.addRow(new Object[] {fn,ln,colz,gender,agr});
				
				
			}
		});
		btnNewButton.setBounds(334, 78, 89, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 234, 399, -113);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(29, 119, 380, 131);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First name", "Last name", "College", "Gender", "Agree"
			}
		));
		scrollPane_1.setViewportView(table);
	}
}
