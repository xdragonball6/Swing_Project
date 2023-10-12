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

public class CabinetChoose extends JFrame {

	private JPanel contentPane;
	private JPanel infoPanel;
	private JPanel infoPanel_1;
	private JPanel infoPanel_2;

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
	public CabinetChoose() {
		setTitle("로그인화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 100, 616, 1490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getInfoPanel());
		contentPane.add(getInfoPanel_1());
		contentPane.add(getInfoPanel_2());
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
	private JPanel getInfoPanel_2() {
		if (infoPanel_2 == null) {
			infoPanel_2 = new JPanel();
			infoPanel_2.setBackground(new Color(226, 223, 222));
			infoPanel_2.setBounds(0, 373, 600, 350);
		}
		return infoPanel_2;
	}
}
