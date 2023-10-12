package com.javalec.user;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class IfUsingUser extends JFrame {

	private JPanel contentPane;
	private JButton btn1;
	private JButton btnNewButton;
	private JPanel infoPanel;
	private JPanel infoPanel_1;
	private JButton btn1_1;
	private JButton btn1_2;
	private JButton btnLogout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IfUsingUser frame = new IfUsingUser();
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
	public IfUsingUser() {
		setTitle("ifusinguser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 100, 600, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtn1());
		contentPane.add(getInfoPanel());
		contentPane.add(getInfoPanel_1());
		contentPane.add(getBtn1_1());
		contentPane.add(getBtn1_2());
	}

	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("문열기");
			btn1.setBounds(219, 377, 144, 64);
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return btn1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("뒤로가기");
			btnNewButton.setBounds(453, 60, 85, 70);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return btnNewButton;
	}
	private JPanel getInfoPanel() {
		if (infoPanel == null) {
			infoPanel = new JPanel();
			infoPanel.setBackground(new Color(226, 223, 222));
			infoPanel.setBounds(0, 0, 600, 150);
			infoPanel.setLayout(null);
			infoPanel.add(getBtnLogout());
			infoPanel.add(getBtnNewButton());
		}
		return infoPanel;
	}
	private JPanel getInfoPanel_1() {
		if (infoPanel_1 == null) {
			infoPanel_1 = new JPanel();
			infoPanel_1.setBackground(new Color(226, 223, 222));
			infoPanel_1.setBounds(0, 811, 600, 150);
		}
		return infoPanel_1;
	}
	private JButton getBtn1_1() {
		if (btn1_1 == null) {
			btn1_1 = new JButton("좌석변경");
			btn1_1.setBounds(219, 473, 144, 64);
		}
		return btn1_1;
	}
	private JButton getBtn1_2() {
		if (btn1_2 == null) {
			btn1_2 = new JButton("퇴실");
			btn1_2.setBounds(219, 563, 144, 64);
		}
		return btn1_2;
	}
	private JButton getBtnLogout() {
		if (btnLogout == null) {
			btnLogout = new JButton("LogOut");
			btnLogout.setBounds(470, 241, 100, 80);
		}
		return btnLogout;
	}
}
