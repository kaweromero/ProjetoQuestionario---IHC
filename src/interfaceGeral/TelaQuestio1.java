package interfaceGeral;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import funcoesXML.LerXML;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TelaQuestio1 extends JPanel {
	public JTextField textFieldNomeCompleto;
	public JTextField textFieldCPF;
	public JTextField textFieldDataNascimento;
	public JTextField textFieldIdade;
	public JTextField textFieldTelefone;
	public JTextField textFieldTelefoneResidencial;
	public JTextField textFieldEmail;
	public JTextField textFieldConfirmarEmail;
	public JRadioButton radioBotaoSim = new JRadioButton("Sim");
	public JRadioButton radioBotaoNao = new JRadioButton("N\u00E3o");
	
	public LerXML arquivoXML;
	public ButtonGroup grupo1 = new ButtonGroup();
	int contagemNome=35;
	int vigiaNome=0;
	int contagemCPF=11;
	int vigiaCPF=0;
	int contagemDataNasci=8;
	int vigiaDataNasci=0;
	/**
	 * Create the panel.
	 */
	public TelaQuestio1(LerXML arquiXML) {

		this.arquivoXML = arquiXML;
		setBounds(100, 100, 1000, 700);
		setLayout(null);
		
		JLabel labelNome = new JLabel("Nome Completo");
		labelNome.setBounds(402, 151, 98, 14);
		add(labelNome);
		
		JLabel labelCPF = new JLabel("CPF");
		labelCPF.setBounds(470, 201, 51, 14);
		add(labelCPF);
		
		JLabel labelData = new JLabel("Data Nascimento");
		labelData.setBounds(395, 251, 98, 14);
		add(labelData);
		
		JLabel labelContagemNome = new JLabel("35");
		labelContagemNome.setForeground(new Color(255, 102, 0));
		labelContagemNome.setBounds(796, 151, 46, 14);
		add(labelContagemNome);
		
		JLabel labelContagemCPF = new JLabel("11");
		labelContagemCPF.setForeground(new Color(255, 102, 0));
		labelContagemCPF.setBounds(616, 201, 46, 14);
		add(labelContagemCPF);
		
		JLabel labelContagemDataNasci = new JLabel("8");
		labelContagemDataNasci.setForeground(new Color(255, 102, 0));
		labelContagemDataNasci.setBounds(616, 251, 46, 14);
		add(labelContagemDataNasci);
		
		
		textFieldNomeCompleto = new JTextField();
		textFieldNomeCompleto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(textFieldNomeCompleto.getText().length()<35){	
					
					if(vigiaNome == textFieldNomeCompleto.getText().length()){
						vigiaNome++;
						
						if(vigiaNome>0){
							
							contagemNome--;
						}
						
					}else{
						if(vigiaNome>0 && contagemNome>0 || vigiaNome==35 && contagemNome==0){
							
						vigiaNome--;
						contagemNome++;
						}
					}		
					System.out.println(contagemNome);
					System.out.println(textFieldNomeCompleto.getText().length());
					System.out.println(vigiaNome);
					System.out.println("******");
					labelContagemNome.setText(Integer.toString(contagemNome));
				}
				 if(textFieldNomeCompleto.getText().length()>=35) {
					// System.out.println("HUE");
					 
			            getToolkit().beep();
			            e.consume();
				 }
			}
		});
		textFieldNomeCompleto.setBounds(500, 148, 286, 20);
		add(textFieldNomeCompleto);
		textFieldNomeCompleto.setColumns(10);
		
		textFieldCPF = new JTextField();
		textFieldCPF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(textFieldCPF.getText().length()<11){	
					
					if(vigiaCPF == textFieldCPF.getText().length()){
						vigiaCPF++;					
						if(vigiaCPF>0){
							contagemCPF--;
						}
						
					}else{
						if(vigiaCPF>0 && contagemCPF>0 || vigiaCPF==11 && contagemCPF==0){
							vigiaCPF--;
							contagemCPF++;
						}
					}
						
					//System.out.println(contagemNome);
					//System.out.println(textFieldNomeCompleto.getText().length());
					//System.out.println(vigiaNome);
					//System.out.println("******");
					labelContagemCPF.setText(Integer.toString(contagemCPF));
				}
				 if(textFieldCPF.getText().length()>=11) {
					// System.out.println("HUE");
					 
			            getToolkit().beep();
			            e.consume();
				 }
			}
		});
		textFieldCPF.setBounds(500, 198, 106, 20);
		add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		textFieldDataNascimento = new JTextField();
		textFieldDataNascimento.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(textFieldDataNascimento.getText().length()<8){	
					
					if(vigiaDataNasci == textFieldDataNascimento.getText().length()){
						vigiaDataNasci++;	
						
						if(vigiaDataNasci>0){
							contagemDataNasci--;
						}
					}else{
						
						if(vigiaDataNasci>0 && contagemDataNasci>0 || vigiaDataNasci==8 && contagemDataNasci==0){		
							vigiaDataNasci--;
							contagemDataNasci++;
						}
					}
						
					System.out.println(contagemDataNasci);
					System.out.println(textFieldIdade.getText().length());
					System.out.println(vigiaDataNasci);
					System.out.println("******");
					labelContagemDataNasci.setText(Integer.toString(contagemDataNasci));
				}
				 if(textFieldDataNascimento.getText().length()>=8) {
					// System.out.println("HUE");
					 
			            getToolkit().beep();
			            e.consume();
				 }
					
			}
		});
		
		textFieldDataNascimento.setBounds(500, 248, 86, 20);
		add(textFieldDataNascimento);
		textFieldDataNascimento.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 255));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 1000, 80);
		panel.setLayout(null);
		add(panel);
		
		JPanel panelEtapa1 = new JPanel();
		panelEtapa1.setBackground(new Color(255, 255, 153));
		panelEtapa1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelEtapa1.setBounds(49, 11, 98, 58);
		panelEtapa1.setLayout(null);
		panel.add(panelEtapa1);
		
		JLabel lblNewLabel_3 = new JLabel("Etapa 1");
		lblNewLabel_3.setFont(new Font("Georgia", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 11, 78, 36);
		panelEtapa1.add(lblNewLabel_3);
		
		JPanel panelEtapa2 = new JPanel();
		panelEtapa2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(204, 204, 204)));
		panelEtapa2.setBounds(449, 11, 98, 58);
		panelEtapa2.setLayout(null);
		panel.add(panelEtapa2);
		
		JLabel lblEtapa = new JLabel("Etapa 2");
		lblEtapa.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtapa.setFont(new Font("Georgia", Font.BOLD, 14));
		lblEtapa.setBounds(10, 11, 78, 36);
		panelEtapa2.add(lblEtapa);
		
		JPanel panelEtapa3 = new JPanel();
		panelEtapa3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panelEtapa3.setBounds(830, 11, 98, 58);
		panelEtapa3.setLayout(null);
		panel.add(panelEtapa3);
		
		JLabel lblEtapa_1 = new JLabel("Etapa 3");
		lblEtapa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtapa_1.setFont(new Font("Georgia", Font.BOLD, 14));
		lblEtapa_1.setBounds(10, 11, 78, 36);
		panelEtapa3.add(lblEtapa_1);
		
		
		
		JLabel labelIdade = new JLabel("Idade");
		labelIdade.setBounds(459, 301, 62, 14);
		add(labelIdade);
		
		textFieldIdade = new JTextField();
		textFieldIdade.setBounds(500, 298, 51, 20);
		add(textFieldIdade);
		textFieldIdade.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Possui alguma difici\u00EAncia?");
		lblNewLabel.setBounds(341, 551, 159, 14);
		add(lblNewLabel);
		////////**********////////
		
		radioBotaoSim.setBounds(500, 547, 51, 23);
		add(radioBotaoSim);
		
		
		radioBotaoNao.setBounds(553, 547, 62, 23);
		add(radioBotaoNao);
		
		grupo1.add(radioBotaoNao);
		grupo1.add(radioBotaoSim);
		
		
		////////**********////////
		JLabel lblTelefone = new JLabel("Telefone (Celular)");
		lblTelefone.setBounds(390, 351, 113, 14);
		add(lblTelefone);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setBounds(454, 451, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Confirmar E-mail");
		lblNewLabel_2.setBounds(395, 501, 133, 14);
		add(lblNewLabel_2);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setBounds(500, 348, 106, 20);
		add(textFieldTelefone);
		textFieldTelefone.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setText("");
		textFieldEmail.setBounds(500, 448, 271, 20);
		add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldConfirmarEmail = new JTextField();
		textFieldConfirmarEmail.setBounds(500, 498, 271, 20);
		add(textFieldConfirmarEmail);
		textFieldConfirmarEmail.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Somente n\u00FAmeros   Ex: 09011122299");
		lblNewLabel_4.setBounds(661, 201, 216, 14);
		add(lblNewLabel_4);
		
		JLabel label = new JLabel("*");
		label.setForeground(new Color(255, 0, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(392, 149, 9, 14);
		add(label);
		
		JLabel lblNewLabel_5 = new JLabel("Campos com asterisco (*) s\u00E3o obrigat\u00F3rios");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(20, 150, 286, 14);
		add(lblNewLabel_5);
		
		JLabel label_1 = new JLabel("*");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(459, 199, 9, 14);
		add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(383, 249, 9, 14);
		add(label_2);
		
		JLabel label_3 = new JLabel("*");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setBounds(449, 299, 9, 14);
		add(label_3);
		
		textFieldTelefoneResidencial = new JTextField();
		textFieldTelefoneResidencial.setBounds(500, 398, 106, 20);
		add(textFieldTelefoneResidencial);
		textFieldTelefoneResidencial.setText(" ");
		textFieldTelefoneResidencial.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Telefone (Residencial)");
		lblNewLabel_6.setBounds(366, 401, 140, 14);
		add(lblNewLabel_6);
		
		JLabel label_4 = new JLabel("*");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(379, 349, 9, 14);
		add(label_4);
		
		JLabel label_5 = new JLabel("*");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setBounds(445, 449, 9, 14);
		add(label_5);
		
		JLabel label_6 = new JLabel("*");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(383, 499, 9, 14);
		add(label_6);
		
		JLabel label_7 = new JLabel("*");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(328, 549, 9, 14);
		add(label_7);
		
		JLabel lblSomenteNmerosEx = new JLabel("Somente n\u00FAmeros   Ex: 01021900");
		lblSomenteNmerosEx.setBounds(661, 251, 216, 14);
		add(lblSomenteNmerosEx);
		
		JLabel lblNewLabel_7 = new JLabel("Dados Pessoais");
		lblNewLabel_7.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_7.setBounds(402, 91, 264, 14);
		add(lblNewLabel_7);
		
		JLabel lblDddNmero = new JLabel("DDD + N\u00FAmero  Ex: 01140028922");
		lblDddNmero.setBounds(635, 351, 242, 14);
		add(lblDddNmero);
		
		JLabel label_8 = new JLabel("DDD + N\u00FAmero  Ex: 01140028922");
		label_8.setBounds(635, 401, 242, 14);
		add(label_8);
		
		JLabel lblExamploexemplocom = new JLabel("exemplo@exemplo.com");
		lblExamploexemplocom.setBounds(783, 451, 217, 14);
		add(lblExamploexemplocom);
		
		JLabel label_9 = new JLabel("exemplo@exemplo.com");
		label_9.setBounds(781, 501, 217, 14);
		add(label_9);
		
		JLabel lblMaxLetras = new JLabel("Max. 35 letras");
		lblMaxLetras.setBounds(852, 151, 98, 14);
		add(lblMaxLetras);
		
	
		
		
		
	
		
		
		
	}
	
	public String testeDeficiente(){
		
		if(radioBotaoSim.isSelected()){
			
			return "Sim";	
			
		}else{
			if(radioBotaoNao.isSelected()){
				
				return "Não";
				
			}
		}
		
		return "";
	}
}
