package interfaceGeral;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

import funcoesXML.LerXML;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.CompoundBorder;

public class TelaQuestio3 extends JPanel {
	public JTextField textFieldInstituicao;
	public JTextField textFieldCurso;
	public JTextField textFieldTurno;
	public JTextField textFieldLocalDiferente;
	public JTextPane textPaneCurriculo;
	public LerXML arquivoXML;
	/**
	 * Create the panel.
	 */
	public TelaQuestio3(LerXML arquiXML) {

		this.arquivoXML = arquiXML;
		setBounds(100, 100, 1000, 700);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Curso");
		lblNewLabel.setBounds(454, 201, 46, 14);
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
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setLayout(null);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(449, 11, 98, 58);
		panel.add(panel_2);
		
		JLabel label_1 = new JLabel("Etapa 2");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Georgia", Font.BOLD, 14));
		label_1.setBounds(10, 11, 78, 36);
		panel_2.add(label_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 153));
		panel_3.setLayout(null);
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(830, 11, 98, 58);
		panel.add(panel_3);
		
		JLabel label_2 = new JLabel("Etapa 3");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Georgia", Font.BOLD, 14));
		label_2.setBounds(10, 11, 78, 36);
		panel_3.add(label_2);
		
		textFieldInstituicao = new JTextField();
		textFieldInstituicao.setColumns(10);
		textFieldInstituicao.setBounds(500, 148, 97, 20);
		add(textFieldInstituicao);
		
		JLabel lblDadosEscolares = new JLabel("Dados Escolares");
		lblDadosEscolares.setFont(new Font("Georgia", Font.BOLD, 20));
		lblDadosEscolares.setBounds(402, 91, 264, 15);
		add(lblDadosEscolares);
		
		JLabel lblNewLabel_1 = new JLabel("Turno do curso");
		lblNewLabel_1.setBounds(402, 248, 126, 14);
		add(lblNewLabel_1);
		
		JLabel lblLocaisParaEstgio = new JLabel("Local para Est\u00E1gio");
		lblLocaisParaEstgio.setForeground(Color.GRAY);
		lblLocaisParaEstgio.setBounds(382, 301, 126, 14);
		add(lblLocaisParaEstgio);
		
		textFieldCurso = new JTextField();
		textFieldCurso.setColumns(10);
		textFieldCurso.setBounds(500, 198, 166, 20);
		add(textFieldCurso);
		
		textFieldTurno = new JTextField();
		textFieldTurno.setColumns(10);
		textFieldTurno.setBounds(500, 248, 104, 20);
		add(textFieldTurno);
		
		JLabel lblNewLabel_2 = new JLabel("Fale um pouco sobre voc\u00EA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(328, 407, 249, 14);
		add(lblNewLabel_2);
		
		textPaneCurriculo = new JTextPane();
		textPaneCurriculo.setBorder(new CompoundBorder());
		textPaneCurriculo.setBounds(307, 432, 382, 175);
		add(textPaneCurriculo);
		
		textFieldLocalDiferente = new JTextField();
		textFieldLocalDiferente.setColumns(10);
		textFieldLocalDiferente.setBounds(500, 298, 195, 20);
		textFieldLocalDiferente.setText(" ");
		add(textFieldLocalDiferente);
		
		JLabel lblNewLabel_3 = new JLabel("Institui\u00E7\u00E3o de ensino");
		lblNewLabel_3.setBounds(374, 151, 140, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Somente a sigla Ex: UEPB");
		lblNewLabel_4.setBounds(728, 151, 166, 14);
		add(lblNewLabel_4);
		
		JLabel label_3 = new JLabel("Campos com asterisco (*) s\u00E3o obrigat\u00F3rios");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(20, 150, 286, 14);
		add(label_3);
		
		JLabel label_4 = new JLabel("*");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(363, 151, 9, 14);
		add(label_4);
		
		JLabel label_5 = new JLabel("*");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setBounds(440, 201, 9, 14);
		add(label_5);
		
		JLabel label_6 = new JLabel("*");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(389, 248, 9, 14);
		add(label_6);
		
		JLabel label_7 = new JLabel("*");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(317, 406, 9, 14);
		add(label_7);
		
		JLabel lblOutraCidadeQue = new JLabel("Outra cidade que voc\u00EA pode estagiar");
		lblOutraCidadeQue.setBounds(728, 301, 226, 14);
		add(lblOutraCidadeQue);
		
		
		
		
	}
}
