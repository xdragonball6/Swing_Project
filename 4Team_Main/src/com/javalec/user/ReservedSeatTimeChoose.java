package com.javalec.user;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ReservedSeatTimeChoose extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnLogout;
	private JButton btnLogout_1;
	private JButton btnLogout_1_1;
	private JButton btnLogout_1_1_1;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JButton btnProductPurchase;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservedSeatTimeChoose frame = new ReservedSeatTimeChoose();
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
	public ReservedSeatTimeChoose() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				btnProductPurchase.setVisible(false);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 100, 600, 1280);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnProductPurchase());
		contentPane.add(getPanel_1());
		contentPane.add(getPanel());
		contentPane.add(getBtnLogout_1_1_1());
		contentPane.add(getBtnLogout_1_1());
		contentPane.add(getBtnLogout());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnLogout_1());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("상품 가격표");
			btnNewButton.setBackground(new Color(94, 178, 234));
			btnNewButton.setBounds(353, 207, 100, 80);
		}
		return btnNewButton;
	}
	private JButton getBtnLogout() {
		if (btnLogout == null) {
			btnLogout = new JButton("LogOut");
			btnLogout.setBackground(new Color(234, 94, 94));
			btnLogout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnLogout.setBounds(472, 207, 100, 80);
		}
		return btnLogout;
	}
	private JButton getBtnLogout_1() {
		if (btnLogout_1 == null) {
			btnLogout_1 = new JButton("뒤로가기");
			btnLogout_1.setBackground(new Color(94, 178, 234));
			btnLogout_1.setBounds(472, 339, 100, 80);
		}
		return btnLogout_1;
	}
	private JButton getBtnLogout_1_1() {
		if (btnLogout_1_1 == null) {
			btnLogout_1_1 = new JButton("당일권");
			btnLogout_1_1.setBackground(Color.WHITE);
			btnLogout_1_1.setBounds(41, 426, 150, 50);
		}
		return btnLogout_1_1;
	}
	private JButton getBtnLogout_1_1_1() {
		if (btnLogout_1_1_1 == null) {
			btnLogout_1_1_1 = new JButton("기간권");
			btnLogout_1_1_1.setBackground(Color.WHITE);
			btnLogout_1_1_1.setBounds(219, 426, 150, 50);
		}
		return btnLogout_1_1_1;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBounds(33, 507, 521, 179);
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(255, 128, 0));
			panel_1.setBounds(33, 685, 521, 44);
		}
		return panel_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("메인");
			lblNewLabel.setBackground(Color.WHITE);
			lblNewLabel.setBounds(0, 333, 584, 591);
		}
		return lblNewLabel;
	}
	private JButton getBtnProductPurchase() {
		if (btnProductPurchase == null) {
			btnProductPurchase = new JButton("상품구매");
			btnProductPurchase.setForeground(new Color(255, 255, 255));
			btnProductPurchase.setBackground(new Color(253, 108, 26));
			btnProductPurchase.setBounds(219, 852, 150, 50);
		}
		return btnProductPurchase;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("하단");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(0, 948, 584, 122);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("상단");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(0, 0, 584, 301);
		}
		return lblNewLabel_2;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(0, 948, 584, 122);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(0, 333, 584, 591);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(0, 0, 584, 301);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
}
