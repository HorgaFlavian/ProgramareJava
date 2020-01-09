package horga_flavian_proiect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextArea;

public class AdaugareClienti {
	 JList<String> list;
	 DefaultListModel<String> listModel;
	 JTextArea textArea_2 = new JTextArea();

	private JFrame frmAplicatieAdaugareClienticalcul;
	private JTextField txtNume;
	private JTextField textFieldNume;
	private JTextField textFieldPrenume;
	private JTextField txtPrenume;
	private JTextField txtNumarTelefon;
	private JTextField textFieldNrTlf;
	private JTextField txtEmail;
	private JTextField textFieldEmail;
	private JScrollPane scrollPane;
	private JTextField textFieldRata;
	private JTextField textFieldPretMasina;
	private JTextArea txtrRezultat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdaugareClienti window = new AdaugareClienti();
					window.frmAplicatieAdaugareClienticalcul.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdaugareClienti() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAplicatieAdaugareClienticalcul = new JFrame();
		frmAplicatieAdaugareClienticalcul.setTitle("Aplicatie adaugare clienti/calcul\r\n");
		frmAplicatieAdaugareClienticalcul.getContentPane().setBackground(Color.WHITE);
		frmAplicatieAdaugareClienticalcul.setBounds(100, 100, 655, 521);
		frmAplicatieAdaugareClienticalcul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAplicatieAdaugareClienticalcul.getContentPane().setLayout(null);
		
		txtNume = new JTextField();
		txtNume.setBackground(new Color(0, 0, 0));
		txtNume.setForeground(Color.WHITE);
		txtNume.setText("Nume");
		txtNume.setBounds(15, 39, 37, 20);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(txtNume);
		txtNume.setColumns(10);
		
		textFieldNume = new JTextField();
		textFieldNume.setBounds(111, 39, 86, 20);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(textFieldNume);
		textFieldNume.setColumns(10);
		
		textFieldPrenume = new JTextField();
		textFieldPrenume.setBounds(111, 96, 86, 20);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(textFieldPrenume);
		textFieldPrenume.setColumns(10);
		
		txtPrenume = new JTextField();
		txtPrenume.setForeground(Color.WHITE);
		txtPrenume.setBackground(Color.BLACK);
		txtPrenume.setText("Prenume");
		txtPrenume.setBounds(15, 96, 50, 20);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(txtPrenume);
		txtPrenume.setColumns(10);
		
		txtNumarTelefon = new JTextField();
		txtNumarTelefon.setForeground(Color.WHITE);
		txtNumarTelefon.setBackground(Color.BLACK);
		txtNumarTelefon.setText("Numar Telefon");
		txtNumarTelefon.setBounds(15, 144, 86, 20);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(txtNumarTelefon);
		txtNumarTelefon.setColumns(10);
		
		textFieldNrTlf = new JTextField();
		textFieldNrTlf.setBounds(111, 144, 118, 20);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(textFieldNrTlf);
		textFieldNrTlf.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(Color.BLACK);
		txtEmail.setForeground(Color.WHITE);
		txtEmail.setText("Email");
		txtEmail.setBounds(15, 196, 86, 20);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(111, 196, 131, 20);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		listModel = new DefaultListModel<String>();
		list = new JList<String>(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JButton btndd = new JButton("Adauga");
		btndd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nume = textFieldNume.getText();
				String prenume = textFieldPrenume.getText();
				String nrTelefon = textFieldNrTlf.getText();
				String email = textFieldEmail.getText();
				
				if(!nume.isEmpty() || !prenume.isEmpty() || !nrTelefon.isEmpty() || !email.isEmpty()) {
					listModel.addElement(nume);
					listModel.addElement(prenume);
					listModel.addElement(nrTelefon);
					listModel.addElement(email);
					listModel.addElement(" ");
				}
				
				
					else {
						System.out.println("Va rugam completati toate campurile");
					}
					
				 
				try {
					FileWriter write = new FileWriter ("listaCumparatori.txt", true); // true - sa nu faca overwrite la fisier
					PrintWriter printWrite = new PrintWriter(write);
					printWrite.printf("%s %s %s %s ", nume, prenume, nrTelefon, email);
					printWrite.println();
					printWrite.close();

					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 	
			}
		});
		btndd.setBounds(232, 64, 89, 23);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(btndd);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(343, 40, 252, 207);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(scrollPane);
		
		
		scrollPane.setViewportView(list);
		
		
		textFieldRata = new JTextField();
		textFieldRata.setBackground(Color.LIGHT_GRAY);
		textFieldRata.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textFieldRata.setText("Calculare rata pe o perioada de 24 de luni");
		textFieldRata.setBounds(61, 271, 456, 51);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(textFieldRata);
		textFieldRata.setColumns(10);
		
		textFieldPretMasina = new JTextField();
		textFieldPretMasina.setBounds(143, 348, 99, 20);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(textFieldPretMasina);
		textFieldPretMasina.setColumns(10);
		
		JTextArea txtrPretMasina = new JTextArea();
		txtrPretMasina.setText("Pret masina");
		txtrPretMasina.setBounds(15, 346, 99, 22);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(txtrPretMasina);
		
		JTextArea txtrAdaugaPosibilClient = new JTextArea();
		txtrAdaugaPosibilClient.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtrAdaugaPosibilClient.setText("Adauga posibil client");
		txtrAdaugaPosibilClient.setBounds(218, 7, 242, 22);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(txtrAdaugaPosibilClient);
		
		JTextArea txtrRate = new JTextArea();
		txtrRate.setText("Rate");
		txtrRate.setBounds(25, 379, 51, 22);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(txtrRate);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("24");
		textArea_1.setBounds(163, 379, 54, 22);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(textArea_1);
		
		JButton btnCalculeaza = new JButton("Calculeaza");
		btnCalculeaza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pret = Integer.parseInt(textFieldPretMasina.getText());
				double perioada = 24;
				double rata = pret / perioada;
				
				
				textArea_2.setText(String.valueOf(rata) + " lunar");
				
				
			}
		});
		btnCalculeaza.setBounds(61, 448, 89, 23);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(btnCalculeaza);
		textArea_2.setForeground(Color.DARK_GRAY);
		textArea_2.setBackground(Color.RED);
		
		
		textArea_2.setBounds(400, 395, 117, 22);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(textArea_2);
		
		txtrRezultat = new JTextArea();
		txtrRezultat.setText("REZULTAT");
		txtrRezultat.setBounds(420, 368, 86, 22);
		frmAplicatieAdaugareClienticalcul.getContentPane().add(txtrRezultat);
		
	
		
		
	}
}
