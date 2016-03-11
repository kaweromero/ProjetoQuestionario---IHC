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

public class TelaQuestio2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaQuestio2() {

		setBounds(100, 100, 1000, 700);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEP");
		lblNewLabel.setBounds(278, 167, 46, 14);
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
		lblRua.setBounds(278, 210, 46, 14);
		add(lblRua);
		
	}

}
