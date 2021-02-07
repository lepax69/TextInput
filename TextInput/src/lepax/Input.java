package lepax;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Input {
	public static void main(String[] args) {
		// Aby program vùbec fungoval, musíme mít tuhle funkci v tomto kódu.
		JFrame frame = new JFrame("TextInput");
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		// Hlavní funkce tohoto kódu od toho je samožøejmì odvozeno název programu.
		JPanel panel = new JPanel(new FlowLayout(SwingConstants.LEADING, 10, 10));
		frame.add(panel);
		JTextField field = new JTextField(10);
		panel.add(field);
		
		
		// Tlaèítko pro funkci (ActionListener)
		JButton button = new JButton("Enter");
		button.setPreferredSize(new Dimension(100, 15));
		panel.add(button);
		
	
		// Funkce, která z tlaèítka vezme text který jste napsali v JTextField.
		JLabel label = new JLabel();
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Enter")) {
					String txt = field.getText().trim();
					label.setText(txt);
			    if(txt.isEmpty()) {
			    	  label.setText("Musíte napsat vìtu nebo slovo do textového pole!");
					}
				} 	
			}
		});
		// Aby fungovala celá funkce, musíme zadat .add 
		panel.add(label, new FlowLayout(SwingConstants.LEFT, 10, 10));
		
		// .setVisible tu musí být, jinak by se okno programu neukázalo.
		frame.setVisible(true); 
	}
}
