package com.javalec.user;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SeatChoose extends JFrame {



		private JPanel contentPane;
		private JPanel infoPanel_1;
		private JPanel infoPanel_2;
		private JPanel infoPanel_1_1;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Choose frame = new Choose();
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
		public SeatChoose() {
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowOpened(WindowEvent e) {
				
				}
			});
			setTitle("sdfa");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(750, 100, 600,1280 );
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			contentPane.add(getInfoPanel_1());
			contentPane.add(getInfoPanel_2());
			contentPane.add(getInfoPanel_1_1());
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
				infoPanel_2.setBounds(0, 194, 600, 489);
			}
			return infoPanel_2;
		}
	private JPanel getInfoPanel_1_1() {
		if (infoPanel_1_1 == null) {
			infoPanel_1_1 = new JPanel();
			infoPanel_1_1.setBackground(new Color(226, 223, 222));
			infoPanel_1_1.setBounds(0, 0, 600, 150);
		}
		return infoPanel_1_1;
	}
	} // End