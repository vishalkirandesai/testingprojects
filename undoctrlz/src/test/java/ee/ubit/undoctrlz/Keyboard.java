package ee.ubit.undoctrlz;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import com.shazam.gwen.collaborators.Actor;

public class Keyboard implements Actor{

	public void pressCtrlZ(UndoCtrlZ ctrlZ){
		KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
	}
}