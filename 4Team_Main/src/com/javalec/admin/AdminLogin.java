package com.javalec.admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.function.TimeStampFlow;

import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JPanel mainPanel;
	private JPanel topPanel;
	private JPanel infoPanel;
	private JPanel nowPanel;
	private JButton btnUserInfo;
	private JButton btnSalesInfo;
	private JButton btnAnno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{220, 0, 0};
		gbl_contentPane.rowHeights = new int[]{50, 500, 170, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 10.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 14.0, 5.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		GridBagConstraints gbc_topPanel = new GridBagConstraints();
		gbc_topPanel.insets = new Insets(0, 0, 0, 0);
		gbc_topPanel.fill = GridBagConstraints.BOTH;
		gbc_topPanel.gridx = 0;
		gbc_topPanel.gridy = 0;
		gbc_topPanel.gridwidth = 2;
		contentPane.add(getTopPanel(), gbc_topPanel);
		GridBagConstraints gbc_infoPanel = new GridBagConstraints();
		gbc_infoPanel.insets = new Insets(0, 0, 0, 0);
		gbc_infoPanel.fill = GridBagConstraints.BOTH;
		gbc_infoPanel.gridx = 0;
		gbc_infoPanel.gridy = 1;
		contentPane.add(getInfoPanel(), gbc_infoPanel);
		GridBagConstraints gbc_mainPanel = new GridBagConstraints();
		gbc_mainPanel.insets = new Insets(0, 0, 0, 0);
		gbc_mainPanel.fill = GridBagConstraints.BOTH;
		gbc_mainPanel.gridx = 1;
		gbc_mainPanel.gridy = 1;
		gbc_mainPanel.gridheight = 2;
		contentPane.add(getMainPanel(), gbc_mainPanel);
		GridBagConstraints gbc_nowPanel = new GridBagConstraints();
		gbc_nowPanel.insets = new Insets(0, 0, 0, 0);
		gbc_nowPanel.fill = GridBagConstraints.BOTH;
		gbc_nowPanel.gridx = 0;
		gbc_nowPanel.gridy = 2;
		contentPane.add(getNowPanel(), gbc_nowPanel);
	}
	private JPanel getMainPanel() {
		if (mainPanel == null) {
			mainPanel = new JPanel();
			mainPanel.setBackground(new Color(247, 248, 228));
		}
		return mainPanel;
	}
	private JPanel getTopPanel() {
		if (topPanel == null) {
			topPanel = new JPanel();
			topPanel.setBackground(new Color(247, 226, 202));
			GridBagLayout gbl_topPanel = new GridBagLayout();
			gbl_topPanel.columnWidths = new int[]{220, 220, 220, 220, 220, 220};
			gbl_topPanel.rowHeights = new int[]{35};
			gbl_topPanel.columnWeights = new double[]{5.5, Double.MIN_VALUE};
			gbl_topPanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			topPanel.setLayout(gbl_topPanel);
			GridBagConstraints gbc_btnUserInfo = new GridBagConstraints();
			gbc_btnUserInfo.insets = new Insets(0, 0, 0, 5);
			gbc_btnUserInfo.gridheight = 2;
			gbc_btnUserInfo.gridx = 2;
			gbc_btnUserInfo.gridy = 0;
			topPanel.add(getBtnUserInfo(), gbc_btnUserInfo);
			GridBagConstraints gbc_btnSalesInfo = new GridBagConstraints();
			gbc_btnSalesInfo.insets = new Insets(0, 0, 0, 5);
			gbc_btnSalesInfo.gridheight = 2;
			gbc_btnSalesInfo.gridx = 3;
			gbc_btnSalesInfo.gridy = 0;
			topPanel.add(getBtnSalesInfo(), gbc_btnSalesInfo);
			GridBagConstraints gbc_btnAnno = new GridBagConstraints();
			gbc_btnAnno.gridheight = 2;
			gbc_btnAnno.gridx = 4;
			gbc_btnAnno.gridy = 0;
			topPanel.add(getBtnAnno(), gbc_btnAnno);
		}
		return topPanel;
	}
	private JPanel getInfoPanel() {
		if (infoPanel == null) {
			infoPanel = new JPanel();
			infoPanel.setBackground(new Color(226, 223, 222));
		}
		return infoPanel;
	}
	private JPanel getNowPanel() {
		if (nowPanel == null) {
			nowPanel = new JPanel();
			nowPanel.setBackground(new Color(223, 234, 195));
		}
		return nowPanel;
	}
	private JButton getBtnUserInfo() {
		if (btnUserInfo == null) {
			btnUserInfo = new JButton("사용자 정보 확인");
			btnUserInfo.setFont(new Font("굴림", Font.PLAIN, 25));
			btnUserInfo.setBounds(220, 7, 220, 35);
		}
		return btnUserInfo;
	}
	private JButton getBtnSalesInfo() {
		if (btnSalesInfo == null) {
			btnSalesInfo = new JButton("매출 정보");
			btnSalesInfo.setFont(new Font("굴림", Font.PLAIN, 25));
		}
		return btnSalesInfo;
	}
	private JButton getBtnAnno() {
		if (btnAnno == null) {
			btnAnno = new JButton("공지사항");
			btnAnno.setFont(new Font("굴림", Font.PLAIN, 25));
		}
		return btnAnno;
	}
}
