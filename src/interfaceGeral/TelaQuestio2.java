package interfaceGeral;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

import funcoesXML.LerXML;

import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TelaQuestio2 extends JPanel {
	public JTextField textFieldCEP;
	public JTextField textFieldRua;
	public JTextField textFieldBairro;
	public JTextField textFieldCidade;
	public JTextField textFieldComplemento;
	public JComboBox boxEstados;
	public LerXML arquivoXML;
	int vigiaCEP = 0;
	int contagemCEP=8;
	/**
	 * Create the panel.
	 */
	public TelaQuestio2(LerXML arquiXML) {
		
		this.arquivoXML = arquiXML;
		setBounds(100, 100, 1000, 700);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEP");
		lblNewLabel.setBounds(462, 151, 46, 14);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(153, 153, 255));
		panel.setBounds(0, 0, 1000, 80);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(49, 11, 98, 58);
		panel.add(panel_1);
		
		JLabel label = new JLabel("Etapa 1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Georgia", Font.BOLD, 14));
		label.setBounds(10, 11, 78, 36);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 153));
		panel_2.setLayout(null);
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(449, 11, 98, 58);
		panel.add(panel_2);
		
		JLabel label_1 = new JLabel("Etapa 2");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Georgia", Font.BOLD, 14));
		label_1.setBounds(10, 11, 78, 36);
		panel_2.add(label_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel_3.setBounds(830, 11, 98, 58);
		panel.add(panel_3);
		
		JLabel label_2 = new JLabel("Etapa 3");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Georgia", Font.BOLD, 14));
		label_2.setBounds(10, 11, 78, 36);
		panel_3.add(label_2);
		
		JLabel lblRua = new JLabel("Logradouro");
		lblRua.setBounds(421, 201, 46, 14);
		add(lblRua);
		
		JLabel lblEndereo = new JLabel("Dados de endere\u00E7o");
		lblEndereo.setFont(new Font("Georgia", Font.BOLD, 20));
		lblEndereo.setBounds(402, 87, 264, 24);
		add(lblEndereo);
		
		JLabel label_3 = new JLabel("Campos com asterisco (*) s\u00E3o obrigat\u00F3rios");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(20, 150, 286, 14);
		add(label_3);
		
		JLabel labelContagemCEP = new JLabel("8");
		labelContagemCEP.setForeground(new Color(255, 0, 0));
		labelContagemCEP.setBounds(599, 151, 46, 14);
		add(labelContagemCEP);
		
		
		textFieldCEP = new JTextField();
		textFieldCEP.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(textFieldCEP.getText().length()<8){	
					
					if(vigiaCEP == textFieldCEP.getText().length()){
						vigiaCEP++;	
						
						if(vigiaCEP>0){
							contagemCEP--;
						}
						System.out.println("Condi1");
					}else{
						
						if(vigiaCEP>0 && contagemCEP>0 || vigiaCEP==8 && contagemCEP==0){
							System.out.println("Condi2");
							vigiaCEP--;
							contagemCEP++;
						}
					}
						
					System.out.println(contagemCEP);
					System.out.println(textFieldCEP.getText().length());
					System.out.println(vigiaCEP);
					System.out.println("******");
					labelContagemCEP.setText(Integer.toString(contagemCEP));
				}
				 if(textFieldCEP.getText().length()>=8) {
					// System.out.println("HUE");
					 
			            getToolkit().beep();
			            e.consume();
				 }
			}
		});
		textFieldCEP.setColumns(10);
		textFieldCEP.setBounds(500, 148, 86, 20);
		add(textFieldCEP);
		
		textFieldRua = new JTextField();
		textFieldRua.setColumns(10);
		textFieldRua.setBounds(500, 198, 280, 20);
		add(textFieldRua);
		
		JLabel lblNewLabel_1 = new JLabel("Bairro");
		lblNewLabel_1.setBounds(454, 301, 54, 14);
		add(lblNewLabel_1);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setBounds(500, 298, 188, 20);
		add(textFieldBairro);
		textFieldBairro.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cidade");
		lblNewLabel_2.setBounds(450, 351, 46, 14);
		add(lblNewLabel_2);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setBounds(500, 348, 188, 20);
		add(textFieldCidade);
		textFieldCidade.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Estado");
		lblNewLabel_3.setBounds(450, 401, 46, 14);
		add(lblNewLabel_3);
		
		boxEstados = new JComboBox();
		boxEstados.setModel(new DefaultComboBoxModel(new String[] {"Acre (AC)", "Alagoas (AL)", "Amap\u00E1 (AP)", "Amazonas (AM)", "Bahia (BA)", "Cear\u00E1 (CE)", "Distrito Federal (DF)", "Esp\u00EDrito Santo (ES)", "Goi\u00E1s (GO)", "Maranh\u00E3o (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Par\u00E1 (PA) ", "Para\u00EDba (PB)", "Paran\u00E1 (PR)", "Pernambuco (PE)", "Piau\u00ED (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rond\u00F4nia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "S\u00E3o Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)"}));
		boxEstados.setToolTipText("");
		boxEstados.setBounds(500, 398, 179, 20);
		add(boxEstados);
		
		
		JLabel label_4 = new JLabel("*");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(450, 151, 9, 14);
		add(label_4);
		
		JLabel label_5 = new JLabel("*");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setBounds(402, 199, 9, 14);
		add(label_5);
		
		JLabel label_6 = new JLabel("*");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(443, 299, 9, 14);
		add(label_6);
		
		JLabel label_7 = new JLabel("*");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(440, 349, 9, 14);
		add(label_7);
		
		JLabel label_8 = new JLabel("*");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_8.setBounds(435, 399, 9, 14);
		add(label_8);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(410, 250, 89, 14);
		add(lblComplemento);
		
		textFieldComplemento = new JTextField();
		textFieldComplemento.setBounds(500, 248, 280, 20);
		add(textFieldComplemento);
		textFieldComplemento.setColumns(10);
		textFieldComplemento.setText(" ");
		
		JLabel lblSomenteNmerosEx = new JLabel("Somente n\u00FAmeros Ex:58400000");
		lblSomenteNmerosEx.setBounds(802, 151, 188, 14);
		add(lblSomenteNmerosEx);
		
		
	}
}
