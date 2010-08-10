public class MainWindow
{
	public MainWindow()
	{		
	}
 
 
	public static void main(String[] args)
	{
		dlgSetting frame = new dlgSetting();
		frame.dlgShow();
		trayIcon tray = new trayIcon();
		tray.createAndShowGUI();
	}
}