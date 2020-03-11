
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView.TableRow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.util.HashMap;
import javax.swing.JScrollPane;

/**
 * Ejemplo de uso de TableRowSorter y RowFilter.
 * 
 * @author Chuidiang
 * 
 */
public class PruebaJTable {

	private TableRowSorter<TableModel> modeloOrdenado;

	/**
	 * main del ejemplo.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new PruebaJTable();
	}

	/**
	 * Instancia un JFrame con un JTable dentro y diez filas de datos. Lleva un
	 * trozo de código comentado para poder reemplazar.
	 */
	public PruebaJTable() {
		JFrame v = new JFrame("Prueba JTable");

		// Modelo de datos, segunda columna Integer y primera String. Los
		// índices empiezan en cero.
		DefaultTableModel modelo = new DefaultTableModel() {
			@Override
			public Class getColumnClass(int columna) {
				if (columna == 1)
					return Integer.class;
				return String.class;
			}
		};

		// Añadimos unos datos.
		modelo.addColumn("columna 1");
		modelo.addColumn("columna 2");
		for (int i = 0; i < 10; i++) {
			modelo.addRow(new Object[] { "" + i, 100 - i });
		}

		// Metemos el modelo ordenable en la tabla.
		modeloOrdenado = new TableRowSorter<TableModel>(modelo);
		//modelo.setRowSorter(modeloOrdenado);
		modeloOrdenado.setRowFilter(RowFilter.regexFilter("2", 1));

		// Lo pintamos todo en la ventana y la mostramos.
		JTable tabla = new JTable(modelo);
		JScrollPane scroll = new JScrollPane(tabla);
		v.getContentPane().add(scroll);
		v.pack();
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
}