package interfaceGeral;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaQuestio2 extends JPanel {
	private JTextField textFieldCEP;
	private JTextField textFieldRua;
	private JTextField textFieldBairro;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public TelaQuestio2() {

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
		panel_2.setBackground(new Color(153, 255, 102));
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
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(462, 201, 46, 14);
		add(lblRua);
		
		JLabel lblEndereo = new JLabel("Dados de endere\u00E7o");
		lblEndereo.setFont(new Font("Georgia", Font.BOLD, 20));
		lblEndereo.setBounds(402, 87, 264, 24);
		add(lblEndereo);
		
		JLabel label_3 = new JLabel("Campos com asterisco (*) s\u00E3o obrigat\u00F3rios");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(20, 150, 286, 14);
		add(label_3);
		
		textFieldCEP = new JTextField();
		textFieldCEP.setColumns(10);
		textFieldCEP.setBounds(500, 148, 86, 20);
		add(textFieldCEP);
		
		textFieldRua = new JTextField();
		textFieldRua.setColumns(10);
		textFieldRua.setBounds(500, 198, 264, 20);
		add(textFieldRua);
		
		JLabel lblNewLabel_1 = new JLabel("Bairro");
		lblNewLabel_1.setBounds(445, 251, 54, 14);
		add(lblNewLabel_1);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setBounds(500, 248, 86, 20);
		add(textFieldBairro);
		textFieldBairro.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cidade");
		lblNewLabel_2.setBounds(445, 302, 46, 14);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(500, 298, 109, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Estado");
		lblNewLabel_3.setBounds(445, 351, 46, 14);
		add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(500, 348, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Acre (AC)", "Alagoas (AL)", "Amap\u00E1 (AP)", "Amazonas (AM)", "Bahia (BA)", "Cear\u00E1 (CE)", "Distrito Federal (DF)", "Esp\u00EDrito Santo (ES)", "Goi\u00E1s (GO)", "Maranh\u00E3o (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Par\u00E1 (PA) ", "Para\u00EDba (PB)", "Paran\u00E1 (PR)", "Pernambuco (PE)", "Piau\u00ED (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rond\u00F4nia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "S\u00E3o Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(648, 348, 179, 20);
		add(comboBox);
		
	}
}
