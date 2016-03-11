package interfaceGeral;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipals extends JFrame {

	private JPanel contentPane;

	private TelaQuestio1 tela1 = new TelaQuestio1();
	private TelaQuestio2 tela2 = new TelaQuestio2();
	private TelaQuestio3 tela3 = new TelaQuestio3();
	boolean testeTela1 = false;
	boolean testeTela2 = false;
	boolean testeTela3 = false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipals frame = new TelaPrincipals();
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
	public TelaPrincipals() {
		super("Super Cadastro de Estágio! @ByKawêRomero");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		//add(tela1);
		//tela1.setVisible(false);
		
		JButton botaoContinuar = new JButton("Continuar");
		botaoContinuar.setBorder(null);
		botaoContinuar.setForeground(new Color(0, 0, 0));
		botaoContinuar.setBackground(new Color(240, 230, 140));
		botaoContinuar.setFont(new Font("Georgia", Font.BOLD, 12));
		botaoContinuar.setBounds(792, 624, 106, 36);
		add(botaoContinuar);
		botaoContinuar.setVisible(false);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setForeground(Color.BLACK);
		botaoVoltar.setFont(new Font("Georgia", Font.BOLD, 12));
		botaoVoltar.setBorder(null);
		botaoVoltar.setBackground(new Color(240, 230, 140));
		botaoVoltar.setBounds(635, 624, 106, 36);
		add(botaoVoltar);
		botaoVoltar.setVisible(false);
		
		
		
		
		botaoContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(testeTela1 == true && testeTela2 == false && testeTela3 == false){
					//Tela1 para Tela 2
					tela1.setVisible(false);
					setContentPane(tela2);
					tela2.setVisible(true);
					
					tela2.add(botaoContinuar);
					tela2.add(botaoVoltar);
					botaoContinuar.setVisible(true);
					botaoVoltar.setVisible(true);
					testeTela2 = true;
					testeTela1 = false;
					validate();
				}else{
					
					if(testeTela2 == true && testeTela3 == false && testeTela1 == false){
					
						//Tela2 para Tela 3
						tela2.setVisible(false);
						setContentPane(tela3);
						tela3.setVisible(true);
					
						tela3.add(botaoContinuar);
						tela3.add(botaoVoltar);
						botaoContinuar.setVisible(true);
						botaoVoltar.setVisible(true);
						testeTela3 = true;
						testeTela2 = false;
						validate();
					}
					
				}
				
				
			}
		});
		
		//********************
		
		botaoVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				if(testeTela2 == true && testeTela1 == false && testeTela3 == false){
					
					//Tela 2 para Tela 1
					tela2.setVisible(false);
					setContentPane(tela1);
					tela1.setVisible(true);
					testeTela2 = false;
					testeTela1 = true;
					
					tela1.add(botaoContinuar);
					tela1.add(botaoVoltar);
					botaoContinuar.setVisible(true);
					botaoVoltar.setVisible(false);
					validate();
				}else{
					
					if(testeTela3 == true && testeTela2 == false && testeTela1 == false){
						
						//Tela 3 para Tela 2
						tela3.setVisible(false);
						setContentPane(tela2);
						tela2.setVisible(true);
						testeTela3 = false;
						testeTela2 = true;
						
						tela2.add(botaoContinuar);
						tela2.add(botaoVoltar);
						botaoContinuar.setVisible(true);
						botaoVoltar.setVisible(true);
						validate();
					}
					
					
				}
				
				
				
				
			}
		});
		
		
		
		//****************
		
		
		JLabel lblNewLabel = new JLabel("Cadastro de est\u00E1gio");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel.setBounds(365, 31, 265, 78);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Come\u00E7ar!");
		btnNewButton.setBounds(453, 566, 115, 39);
		contentPane.add(btnNewButton);
		//setFocusable(true);
		setLocationRelativeTo(null);
		
		//*******************
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Tela principal para Tela 1
				contentPane.setVisible(false);
				setContentPane(tela1);
				tela1.setVisible(true);
				testeTela1 = true;
				
				tela1.add(botaoContinuar);
				tela2.add(botaoVoltar);
				
				botaoContinuar.setVisible(true);
				botaoVoltar.setVisible(true);
				validate();
			}
		});
	}
}
