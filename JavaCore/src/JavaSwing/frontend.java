package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JSplitPane;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class frontend extends JFrame {

	private JPanel contentPane;
	private JTextField UsernameTxt;
	private JPasswordField PasswordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frontend frame = new frontend();
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
	public frontend() {
		setTitle("ApplicationForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 339);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(UIManager.getColor("EditorPane.inactiveBackground"));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel.setBounds(92, 70, 63, 33);
		contentPane.add(lblNewLabel);
		
		UsernameTxt = new JTextField();
		UsernameTxt.setBounds(138, 76, 201, 20);
		contentPane.add(UsernameTxt);
		UsernameTxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(UIManager.getColor("EditorPane.inactiveBackground"));
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(74, 128, 54, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String un = UsernameTxt.getText();
				String psw = PasswordTxt.getText();
				
//				check  in db
				
				
				try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Emancipate");
						//login sql
						String sql = "select * from user where username = '"+un+"' and password = '"+psw+"' ";
						Statement stm = con.createStatement();
						ResultSet rs = stm.executeQuery(sql);
						
						if(rs.next()) {	
						JOptionPane.showMessageDialog(null, "login success");
						new Homepage().setVisible(true);
						dispose();
						
						}
						else {
						JOptionPane.showMessageDialog(null, "login failed");
					}
				}
					
				catch(Exception e1) {
					e1.printStackTrace();
				
				}
			
				
//				if (un.equals("ram") && psw.equals("123")) {
//					JOptionPane.showMessageDialog(null, "Login Success");
//					
//					new Homepage().setVisible(true);
//					dispose();
//				}
//				else {
//					JOptionPane.showMessageDialog(null,"Login Failed");
//					}
//				}
			}
		}
		);
		btnNewButton.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton.setBounds(193, 186, 89, 23);
		contentPane.add(btnNewButton);
		
		PasswordTxt = new JPasswordField();
		PasswordTxt.setBounds(138, 125, 201, 23);
		contentPane.add(PasswordTxt);
		
}
		}