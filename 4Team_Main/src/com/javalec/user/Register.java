package com.javalec.user;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnBack;
	private JButton btnRegister;
	private JButton btnLogout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	String message = "";
	private JLabel lblNewLabel;
	private JTextField tfTelno;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPasswordField tfPassword;
	private JPasswordField tfPasswordCheck;
	
	/**
	 * Create the frame.
	 */
	public Register() {
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 100, 600, 1280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getChckbxNewCheckBox());
		contentPane.add(getBtnBack());
		contentPane.add(getBtnRegister());
		contentPane.add(getBtnLogout());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfTelno());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTfPassword());
		contentPane.add(getTfPasswordCheck());
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("개인정보취급방침동의");
			chckbxNewCheckBox.setBounds(157, 357, 167, 23);
		}
		return chckbxNewCheckBox;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("뒤로가기");
			btnBack.setBounds(476, 49, 97, 23);
		}
		return btnBack;
	}
	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("등록");
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int j = insertFieldCheck();
					insertAction();
				}
			});
			btnRegister.setBounds(384, 756, 97, 43);
		}
		return btnRegister;
	}
	
	
	
	
	
	private JButton getBtnLogout() {
		if (btnLogout == null) {
			btnLogout = new JButton("로그아웃");
			btnLogout.setBounds(476, 14, 97, 23);
		}
		return btnLogout;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("휴대폰 번호 : ");
			lblNewLabel.setBounds(83, 169, 107, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setBounds(194, 164, 148, 26);
			tfTelno.setColumns(10);
		}
		return tfTelno;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("비밀번호 :");
			lblNewLabel_1.setBounds(83, 228, 79, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("비밀번호 확인 : ");
			lblNewLabel_2.setBounds(83, 288, 115, 16);
		}
		return lblNewLabel_2;
	}
	private JPasswordField getTfPassword() {
		if (tfPassword == null) {
			tfPassword = new JPasswordField();
			tfPassword.setBounds(194, 223, 148, 26);
		}
		return tfPassword;
	}
	private JPasswordField getTfPasswordCheck() {
		if (tfPasswordCheck == null) {
			tfPasswordCheck = new JPasswordField();
			tfPasswordCheck.setBounds(194, 283, 148, 26);
		}
		return tfPasswordCheck;
	}
	
	
	private int insertFieldCheck() {
		int i = 0;
		if(tfTelno.getText().trim().length() == 0) {
			i++;
			message = "전화번호를 ";
			tfTelno.requestFocus();
		}
		
		if(tfPassword.getText().trim().length() == 0) {
			i++;
			message = "비밀번호를 ";
			tfPassword.requestFocus();
		}
		if(tfPasswordCheck.getText().trim().length() == 0) {
			i++;
			message = "비밀번호 확인 ";
			tfPasswordCheck.requestFocus();
		}
	
				
		return i;
	}
	
	
	private void insertAction() { //회원가입 등록누르는 기
	    String telno = tfTelno.getText();
	    String password = tfPassword.getText();   
	    String passwordCheck = tfPasswordCheck.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//END


