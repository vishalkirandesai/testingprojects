
package ee.ubit.undoctrlz;

import java.awt.event.*; //used to access ActionEvent class
import javax.swing.*; //used to access AbstractAction,JFrame, JScrollPane, JTextArea, and KeyStroke class
import javax.swing.event.*; // used to access UndoableEditEvent and UndoableEditListener class
import javax.swing.text.*;// used to access the Document and JTextComponent class
import javax.swing.undo.*; // used to access CannotUndoException and UndoManager class


public class UndoCtrlZ {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Ctrl+Z Undo"); //instantiate frame
		JTextArea txtArea = new JTextArea(); //instantiate textArea
		final UndoManager undo = new UndoManager(); //instantiate an UndoManager
		Document doc = txtArea.getDocument(); //instantiate a Document class of the txtArea

		doc.addUndoableEditListener(new UndoableEditListener() {
			public void undoableEditHappened(UndoableEditEvent evt) {
				undo.addEdit(evt.getEdit());
			}
		});

		txtArea.getActionMap().put("Undo", new AbstractAction("Undo") {
			public void actionPerformed(ActionEvent evt) {
				try {
					if (undo.canUndo()) {
						undo.undo();
					}
				} catch (CannotUndoException e) {
				}
			}
		});

		txtArea.getInputMap().put(KeyStroke.getKeyStroke("control Z"), "Undo");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new JScrollPane(txtArea));
		frame.setSize(380, 320);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}