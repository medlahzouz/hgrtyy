package com.ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField txt_prix;
	private JTextField txt_quantite;
	private JTextField txt_tva;
	private JTextField txt_ht;
	private JTextField txt_ttc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Facture");
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(64, 128, 128));
		lblNewLabel.setBounds(104, 30, 448, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		txt_prix = new JTextField();
		txt_prix.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});
		txt_prix.setBounds(249, 133, 185, 30);
		contentPane.add(txt_prix);
		txt_prix.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Prix Unitaire:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(74, 138, 135, 20);
		contentPane.add(lblNewLabel_1);
		
		JButton btncalculer = new JButton("Calculer:");
		btncalculer.setForeground(new Color(255, 255, 255));
		btncalculer.setBackground(new Color(0, 0, 255));
		btncalculer.setFont(new Font("Tahoma", Font.BOLD, 15));
		btncalculer.setBounds(522, 158, 149, 41);
		contentPane.add(btncalculer);
		
		txt_quantite = new JTextField();
		txt_quantite.setColumns(10);
		txt_quantite.setBounds(249, 186, 185, 30);
		contentPane.add(txt_quantite);
		
		txt_tva = new JTextField();
		txt_tva.setColumns(10);
		txt_tva.setBounds(249, 242, 185, 30);
		contentPane.add(txt_tva);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quantitie Comander:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(74, 191, 165, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Taux Tva:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(104, 245, 135, 20);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Prix TTC:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setBounds(29, 396, 135, 20);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Prix HT:");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setBounds(29, 340, 135, 20);
		contentPane.add(lblNewLabel_1_2_2);
		
		txt_ht = new JTextField();
		txt_ht.setEnabled(false);
		txt_ht.setColumns(10);
		txt_ht.setBounds(162, 330, 185, 30);
		contentPane.add(txt_ht);
		
		txt_ttc = new JTextField();
		txt_ttc.setEnabled(false);
		txt_ttc.setColumns(10);
		txt_ttc.setBounds(162, 391, 185, 30);
		contentPane.add(txt_ttc);
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,"vouler vous quiter l'app!!","Fermaer app",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
				if(result==JOptionPane.YES_OPTION)
			  dispose();
			}
		});
		btnFermer.setForeground(new Color(255, 255, 255));
		btnFermer.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFermer.setBackground(new Color(255, 0, 0));
		btnFermer.setBounds(476, 396, 149, 36);
		contentPane.add(btnFermer);
		
		JButton btnInitialiser = new JButton("Initialiser");
		btnInitialiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_prix.setText(null);
				txt_quantite.setText(null);
				txt_tva.setText(null);
				txt_ttc.setText(null);
				txt_prix.getFocusAccelerator();
				
				
				
				
			}
		});
		btnInitialiser.setForeground(new Color(255, 255, 255));
		btnInitialiser.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnInitialiser.setBackground(new Color(0, 0, 255));
		btnInitialiser.setBounds(476, 330, 149, 41);
		contentPane.add(btnInitialiser);
	}
}
