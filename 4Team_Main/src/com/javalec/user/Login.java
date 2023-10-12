package com.javalec.user;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblId;
	private JTextField tfId;
	private JLabel lblPassword;
	private JButton btnCheck;
	private JPasswordField tfPassword;
	private JPanel infoPanel;
	private JPanel infoPanel_1;
	private JButton btnRegist_1;
	private JPanel infoPanel_2;
	private JButton btnCheck_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("로그인화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 100, 616, 1490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblId());
		contentPane.add(getTfId());
		contentPane.add(getLblPassword());
		contentPane.add(getBtnCheck());
		contentPane.add(getTfPassword());
		contentPane.add(getInfoPanel());
		contentPane.add(getInfoPanel_1());
		contentPane.add(getBtnRegist_1());
		contentPane.add(getInfoPanel_2());
		contentPane.add(getBtnCheck_1());
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID :");
			lblId.setHorizontalAlignment(SwingConstants.RIGHT);
			lblId.setBounds(128, 739, 57, 15);
		}
		return lblId;
	}
	private JTextField getTfId() {
		if (tfId == null) {
			tfId = new JTextField();
			tfId.setBounds(197, 736, 199, 21);
			tfId.setColumns(10);
		}
		return tfId;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("password :");
			lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
			lblPassword.setBounds(105, 767, 80, 15);
		}
		return lblPassword;
	}
	private JButton getBtnCheck() {
		if (btnCheck == null) {
			btnCheck = new JButton("비밀번호 찾기");
			btnCheck.setBounds(287, 883, 123, 23);
		}
		return btnCheck;
	}
	private JPasswordField getTfPassword() {
		if (tfPassword == null) {
			tfPassword = new JPasswordField();
			tfPassword.setBounds(197, 761, 199, 26);
		}
		return tfPassword;
	}
	private JPanel getInfoPanel() {
		if (infoPanel == null) {
			infoPanel = new JPanel();
			infoPanel.setBackground(new Color(226, 223, 222));
			infoPanel.setBounds(0, 0, 600, 350);
		}
		return infoPanel;
	}
	private JPanel getInfoPanel_1() {
		if (infoPanel_1 == null) {
			infoPanel_1 = new JPanel();
			infoPanel_1.setBackground(new Color(226, 223, 222));
			infoPanel_1.setBounds(0, 911, 600, 150);
		}
		return infoPanel_1;
	}
	private JButton getBtnRegist_1() {
		if (btnRegist_1 == null) {
			btnRegist_1 = new JButton("Login");
			btnRegist_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnRegist_1.setBounds(404, 763, 97, 23);
		}
		return btnRegist_1;
	}
	private JPanel getInfoPanel_2() {
		if (infoPanel_2 == null) {
			infoPanel_2 = new JPanel();
			infoPanel_2.setBackground(new Color(226, 223, 222));
			infoPanel_2.setBounds(0, 373, 600, 350);
		}
		return infoPanel_2;
	}
	private JButton getBtnCheck_1() {
		if (btnCheck_1 == null) {
			btnCheck_1 = new JButton("회원가입");
			btnCheck_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnCheck_1.setBounds(152, 883, 123, 23);
		}
		return btnCheck_1;
	}
}
