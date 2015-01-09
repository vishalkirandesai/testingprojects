package ee.ubit.undoctrlz;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import javax.swing.text.BadLocationException;

import com.shazam.gwen.collaborators.Arranger;
import com.shazam.gwen.collaborators.Asserter;

public class Screen implements Asserter, Arranger{
	
	public void hasText(String text){
		UndoCtrlZ undoCtrlZ = new UndoCtrlZ();
		undoCtrlZ.txtArea.setText(text);
	}
	
	public void deletesLastLetter(String text,UndoCtrlZ undoCtrlZ) throws BadLocationException{
		assertThat(text, equalTo(undoCtrlZ.txtArea.getDocument().getText(0, undoCtrlZ.txtArea.getDocument().getLength())));
	}

}
