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
		// Aby program v�bec fungoval, mus�me m�t tuhle funkci v tomto k�du.
		JFrame frame = new JFrame("TextInput");
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		// Hlavn� funkce tohoto k�du od toho je samo��ejm� odvozeno n�zev programu.
		JPanel panel = new JPanel(new FlowLayout(SwingConstants.LEADING, 10, 10));
		frame.add(panel);
		JTextField field = new JTextField(10);
		panel.add(field);
		
		
		// Tla��tko pro funkci (ActionListener)
		JButton button = new JButton("Enter");
		button.setPreferredSize(new Dimension(100, 15));
		panel.add(button);
		
	
		// Funkce, kter� z tla��tka vezme text kter� jste napsali v JTextField.
		JLabel label = new JLabel();
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Enter")) {
					String txt = field.getText().trim();
					label.setText(txt);
			    if(txt.isEmpty()) {
			    	  label.setText("Mus�te napsat v�tu nebo slovo do textov�ho pole!");
					}
				} 	
			}
		});
		// Aby fungovala cel� funkce, mus�me zadat .add 
		panel.add(label, new FlowLayout(SwingConstants.LEFT, 10, 10));
		
		// .setVisible tu mus� b�t, jinak by se okno programu neuk�zalo.
		frame.setVisible(true);
	}
}
