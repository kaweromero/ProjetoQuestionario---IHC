package interfaceGeral;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import funcoesXML.Estagiario;
import funcoesXML.LerXML;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class TelaPrincipals extends JFrame {

	private JPanel contentPane;

	public LerXML objeXML = new LerXML();
	XStream xstream = new XStream(new DomDriver());
	LerXML lergravar = new LerXML();
	Estagiario estagiario = new Estagiario();
	boolean testeTela1 = false;
	boolean testeTela2 = false;
	boolean testeTela3 = false;
	private TelaQuestio1 tela1 = new TelaQuestio1(objeXML);
	private TelaQuestio2 tela2 = new TelaQuestio2(objeXML);
	private TelaQuestio3 tela3 = new TelaQuestio3(objeXML);
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
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		JButton botaoContinuar = new JButton("Continuar");
		botaoContinuar.setBorder(null);
		botaoContinuar.setForeground(new Color(0, 0, 0));
		botaoContinuar.setBackground(new Color(240, 230, 140));
		botaoContinuar.setFont(new Font("Georgia", Font.BOLD, 12));
		botaoContinuar.setBounds(792, 624, 106, 36);
		getContentPane().add(botaoContinuar);
		botaoContinuar.setVisible(false);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setForeground(Color.BLACK);
		botaoVoltar.setFont(new Font("Georgia", Font.BOLD, 12));
		botaoVoltar.setBorder(null);
		botaoVoltar.setBackground(new Color(240, 230, 140));
		botaoVoltar.setBounds(635, 624, 106, 36);
		getContentPane().add(botaoVoltar);
		botaoVoltar.setVisible(false);
			
		
		botaoContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(testeTela1 == true && testeTela2 == false && testeTela3 == false){
					
					//Tela1 para Tela 2						
					if(tela1.textFieldNomeCompleto.getText().length()!=0){
						
						if(tela1.textFieldCPF.getText().length()==11){
							
							if(tela1.textFieldDataNascimento.getText().length()==8){
								
								if(tela1.textFieldIdade.getText().length()!=0){
									
									if(tela1.textFieldTelefone.getText().length()!=0){
										
										if(tela1.testeDeficiente().equals("Sim") || tela1.testeDeficiente().equals("Não")){
											
											if(tela1.textFieldEmail.getText().length()!=0){
												
												
												if(tela1.textFieldEmail.getText().equals(tela1.textFieldConfirmarEmail.getText())){
													
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
													JOptionPane.showMessageDialog(null, "Email de confirmação não bate com o email colocado!");
												}
														
											}else{
												JOptionPane.showMessageDialog(null, "Preencha o campo 'Email'");
											}
										}else{
											JOptionPane.showMessageDialog(null, "Marque a opção de 'Deficiência");
										}
										
									}else{
										JOptionPane.showMessageDialog(null, "Preencha o campo 'Telefone'");
									}
									
								}else{
									JOptionPane.showMessageDialog(null, "Preencha o campo 'Idade'");
								}
								
								
							}else{
								JOptionPane.showMessageDialog(null, "Preencha o campo 'Data Nascimento' corretamente!");
							}
							
						}else{
							JOptionPane.showMessageDialog(null, "Preencha o campo 'CPF' corretamente!");
						}
						
					}else{
						JOptionPane.showMessageDialog(null, "Preencha o campo 'Nome'!");
					}
					
			
				}else{
					
					if(testeTela2 == true && testeTela3 == false && testeTela1 == false){
					
						
						//Tela2 para Tela 3//					
						if(tela2.textFieldCEP.getText().length()==8){					
							
							if(tela2.textFieldRua.getText().length()!=0){
								
								if(tela2.textFieldBairro.getText().length()!=0){
									
									if(tela2.textFieldCidade.getText().length()!=0){
										
										
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
										
										
									}else{
										JOptionPane.showMessageDialog(null, "Preencha o campo 'Cidade'!");
									}	
																		
								}else{
									JOptionPane.showMessageDialog(null, "Preencha o campo 'Bairro'!");
								}						
								
							}else{
								JOptionPane.showMessageDialog(null, "Preencha o campo 'Logradouro'!");
							}
														
						}else{
							JOptionPane.showMessageDialog(null, "Preencha o campo 'Nome'!");
						}
								
						
					}else{
						
						if(testeTela3 == true && testeTela2 == false && testeTela1 == false){
							
						
							if(tela3.textFieldInstituicao.getText().length()!=0){
								
								if(tela3.textFieldCurso.getText().length()!=0){
									
									if(tela3.textFieldTurno.getText().length()!=0){
										
										if(tela3.textPaneCurriculo.getText().length()!=0){
											
											try{
												//Cadastrar estagiario
												cadastrar(estagiario);
												lergravar.gravarArquivo(estagiario, xstream);
												JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
												System.exit(0);
												
											}catch(Exception e){
												
												JOptionPane.showMessageDialog(null, "Erro ao cadastrar, contate o administrador!");
											}
											
										}else{
											
											JOptionPane.showMessageDialog(null, "Preencha o campo 'Nome'!");
										}
									}else{
										
										JOptionPane.showMessageDialog(null, "Preencha o campo 'Nome'!");
									}
								}else{
									
									JOptionPane.showMessageDialog(null, "Preencha o campo 'Curso'!");
								}
							}else{
								
								JOptionPane.showMessageDialog(null, "Preencha o campo 'Instituição de ensino'!");
							}					
							
						}
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
		btnNewButton.setBackground(new Color(255, 255, 153));
		btnNewButton.setFont(new Font("Georgia", Font.BOLD, 12));
		btnNewButton.setBounds(453, 566, 115, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro de alunos para concorrer a uma vaga de est\u00E1gio.");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(258, 469, 531, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Projeto da disciplina Projeto Interface Homem-Computador");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(63, 199, 567, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Analise da usabilidade do cadastro usando a avalia\u00E7\u00E3o de conformidade seguindo a ISO 9241-17 ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(63, 256, 766, 69);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.decode("#F4F4F4"));
		panel.setBounds(40, 174, 868, 337);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPorKawRomero = new JLabel("Por Kaw\u00EA Romero");
		lblPorKawRomero.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPorKawRomero.setBounds(650, 240, 165, 36);
		panel.add(lblPorKawRomero);
		
		//JLabel spritesair = new JLabel(new ImageIcon("imagem/spritesair.png"));
		JLabel lblNewLabel_4 = new JLabel(new ImageIcon("imagem/uepb.png"));
		lblNewLabel_4.setBounds(41, 11, 150, 150);
		
		contentPane.add(lblNewLabel_4);
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
	
	public void cadastrar(Estagiario estagiario){
		
		estagiario.setNomeCompleto(tela1.textFieldNomeCompleto.getText());
		estagiario.setCPF(tela1.textFieldCPF.getText());
		estagiario.setDataNascimento(tela1.textFieldDataNascimento.getText());	
		estagiario.setIdade(tela1.textFieldIdade.getText());
		estagiario.setTelefone(tela1.textFieldTelefone.getText());
		estagiario.setTelefoneResidencial(tela1.textFieldTelefoneResidencial.getText());
		estagiario.setEmail(tela1.textFieldEmail.getText());
		estagiario.setConfirmarEmail(tela1.textFieldConfirmarEmail.getText());
		
		
		estagiario.setDeficiente(tela1.testeDeficiente());
		
		estagiario.setCEP(tela2.textFieldCEP.getText());
		estagiario.setRua(tela2.textFieldRua.getText());
		estagiario.setBairro(tela2.textFieldBairro.getText());
		estagiario.setCidade(tela2.textFieldCidade.getText());
		estagiario.setComplemento(tela2.textFieldComplemento.getText());
		estagiario.setEstado(tela2.boxEstados.getSelectedItem()+"");
		
		estagiario.setInstituicao(tela3.textFieldInstituicao.getText());
		estagiario.setCurso(tela3.textFieldCurso.getText());
		estagiario.setTurno(tela3.textFieldTurno.getText());
		estagiario.setLocalDiferente(tela3.textFieldLocalDiferente.getText());
		estagiario.setCurriculo(tela3.textPaneCurriculo.getText());
		
		
	}
	
	public boolean testeCamposImportantes(){
		
		
		
		if(tela1.textFieldEmail.getText() != tela1.textFieldConfirmarEmail.getText()){
			
			JOptionPane.showMessageDialog(null, "O email confirmando não bate com o email digitado");
			
			return false;
		}
		
		
		return false;
		
	}
}
