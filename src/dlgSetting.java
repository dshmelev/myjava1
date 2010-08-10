import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class dlgSetting {
	private JDialog dlg;
	
	public dlgSetting()
	{		
		JTextField firstName = new JTextField();
		JCheckBox checkBox1 = new JCheckBox("HostName");
		JCheckBox checkBox2 = new JCheckBox("Location");
		JCheckBox checkBox3 = new JCheckBox("OS");
		
		checkBox1.setMnemonic(KeyEvent.VK_H);
		checkBox2.setMnemonic(KeyEvent.VK_L);
		checkBox3.setMnemonic(KeyEvent.VK_O);
		

		

		Object[] msg = {"First Name:", firstName, checkBox1, checkBox2, checkBox3};
		JOptionPane op = new JOptionPane(
			msg,
			JOptionPane.INFORMATION_MESSAGE,
			JOptionPane.OK_CANCEL_OPTION,
			null,
			null);
		op.setBackground(Color.DARK_GRAY);
		dlg = op.createDialog("Enter Settings...");
	}
	
	void dlgShow() {
		dlg.setVisible(true);
	}
	
}
