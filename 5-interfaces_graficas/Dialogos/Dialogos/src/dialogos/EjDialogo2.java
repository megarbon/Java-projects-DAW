package dialogos;

import javax.swing.JOptionPane;

public class EjDialogo2 {

	public static void main(String[] args) {
		String nombre =
				 JOptionPane.showInputDialog("Introduce tu nombre");
				JOptionPane.showMessageDialog(null, "Hola " + nombre);
	}

}
