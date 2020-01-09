package horga_flavian_proiect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Color;

public class AdaugareMasinaGrafic {
    JList<String> list;
    DefaultListModel<String> listModel;
    
	private JFrame frmAdaugareMasina;
	private JTextField textFabricant;
	private JTextField textFieldFabricant;
	private JTextField txtModel;
	private JTextField textFieldModel;
	private JTextField txtAn;
	private JTextField textFieldAn;
	private JTextField txtKilometraj;
	private JTextField textFieldKilometraj;
	private JTextField txtPret;
	private JTextField textFieldPret;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdaugareMasinaGrafic window = new AdaugareMasinaGrafic();
					window.frmAdaugareMasina.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdaugareMasinaGrafic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdaugareMasina = new JFrame();
		frmAdaugareMasina.setTitle("Adaugare Masina\r\n");
		frmAdaugareMasina.setBounds(100, 100, 667, 396);
		frmAdaugareMasina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdaugareMasina.getContentPane().setLayout(null);
		
		textFabricant = new JTextField();
		textFabricant.setForeground(Color.WHITE);
		textFabricant.setBackground(Color.BLACK);
		textFabricant.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textFabricant.setText("Fabricant");
		textFabricant.setBounds(10, 23, 60, 20);
		frmAdaugareMasina.getContentPane().add(textFabricant);
		textFabricant.setColumns(10);
		
		textFieldFabricant = new JTextField();
		textFieldFabricant.setBounds(113, 24, 86, 20);
		frmAdaugareMasina.getContentPane().add(textFieldFabricant);
		textFieldFabricant.setColumns(10);
		
		txtModel = new JTextField();
		txtModel.setForeground(Color.WHITE);
		txtModel.setBackground(Color.BLACK);
		txtModel.setText("Model");
		txtModel.setBounds(10, 66, 86, 20);
		frmAdaugareMasina.getContentPane().add(txtModel);
		txtModel.setColumns(10);
		
		textFieldModel = new JTextField();
		textFieldModel.setBounds(113, 66, 86, 20);
		frmAdaugareMasina.getContentPane().add(textFieldModel);
		textFieldModel.setColumns(10);
		
		txtAn = new JTextField();
		txtAn.setForeground(Color.WHITE);
		txtAn.setBackground(Color.BLACK);
		txtAn.setText("An");
		txtAn.setBounds(10, 120, 86, 20);
		frmAdaugareMasina.getContentPane().add(txtAn);
		txtAn.setColumns(10);
		
		textFieldAn = new JTextField();
		textFieldAn.setBounds(113, 120, 86, 20);
		frmAdaugareMasina.getContentPane().add(textFieldAn);
		textFieldAn.setColumns(10);
		
		txtKilometraj = new JTextField();
		txtKilometraj.setForeground(Color.WHITE);
		txtKilometraj.setBackground(Color.BLACK);
		txtKilometraj.setText("Kilometraj");
		txtKilometraj.setBounds(10, 175, 86, 20);
		frmAdaugareMasina.getContentPane().add(txtKilometraj);
		txtKilometraj.setColumns(10);
		
		textFieldKilometraj = new JTextField();
		textFieldKilometraj.setBounds(113, 175, 86, 20);
		frmAdaugareMasina.getContentPane().add(textFieldKilometraj);
		textFieldKilometraj.setColumns(10);
		
		txtPret = new JTextField();
		txtPret.setForeground(Color.WHITE);
		txtPret.setBackground(Color.BLACK);
		txtPret.setText("Pret");
		txtPret.setBounds(10, 223, 86, 20);
		frmAdaugareMasina.getContentPane().add(txtPret);
		txtPret.setColumns(10);
		
		textFieldPret = new JTextField();
		textFieldPret.setBounds(113, 223, 86, 20);
		frmAdaugareMasina.getContentPane().add(textFieldPret);
		textFieldPret.setColumns(10);
		
		listModel = new DefaultListModel<String>();
		list = new JList<String>(listModel);
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JButton btnAdauga = new JButton("Adauga");
		btnAdauga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fabricant = textFieldFabricant.getText();
				String model = textFieldModel.getText();
				String an = textFieldAn.getText();
				String kilometraj = textFieldKilometraj.getText();
				String pret = textFieldPret.getText();
				
				
				if(!fabricant.isEmpty() || !model.isEmpty() || !an.isEmpty() || !kilometraj.isEmpty() || !pret.isEmpty()) {
					listModel.addElement(fabricant);
					listModel.addElement(model);
					listModel.addElement(an);
					listModel.addElement(kilometraj);
					listModel.addElement(pret);
					listModel.addElement(" ");
					
				}
				
				
				try {
					FileWriter write = new FileWriter ("listaMasini.txt", true); // true - sa nu faca overwrite la fisier
					PrintWriter printWrite = new PrintWriter(write);
					printWrite.printf("%s %s %s %s %s ", fabricant, model, an, kilometraj, pret);
					printWrite.println();
					printWrite.close();

					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 	
				
				
				
			}
		});
		btnAdauga.setBounds(59, 279, 89, 23);
		frmAdaugareMasina.getContentPane().add(btnAdauga);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(430, 23, 186, 217);
		frmAdaugareMasina.getContentPane().add(scrollPane);
		
		
		scrollPane.setViewportView(list);
		scrollPane.setViewportView(list);
	}
}
