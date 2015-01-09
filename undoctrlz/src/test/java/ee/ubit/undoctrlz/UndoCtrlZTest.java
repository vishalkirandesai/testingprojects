package ee.ubit.undoctrlz;

import javax.swing.text.BadLocationException;

import org.junit.Test;

public class UndoCtrlZTest {

	Screen screen;
	Keyboard keyboard;
	UndoCtrlZ undoCtrlZ;
	
	public void initialise(){
		undoCtrlZ = new UndoCtrlZ();
		screen = new Screen();
		keyboard = new Keyboard();
	}
	
	@Test
	public void testUndo() throws BadLocationException{
		String text  = "textIsThis,";
		com.shazam.gwen.Gwen.given(screen).hasText(text);
		
		com.shazam.gwen.Gwen.when(keyboard).pressCtrlZ(undoCtrlZ);
		
		com.shazam.gwen.Gwen.then(screen).deletesLastLetter("textIsThis",undoCtrlZ);
		
	}
}
