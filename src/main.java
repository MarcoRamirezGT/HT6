import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.RowFilter;
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

public class main {

	private JFrame frame;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField txtAgregarCarta;
	private JTable table;
	private JTextField txtConsulta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 671, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		tabbedPane.setBounds(0, 0, 655, 370);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Coleccion", null, panel, null);
		panel.setLayout(null);
		
		txtAgregarCarta = new JTextField();
		txtAgregarCarta.setBounds(25, 37, 158, 20);
		panel.add(txtAgregarCarta);
		txtAgregarCarta.setColumns(10);
		
		JLabel lblColeccionAgregar = new JLabel("Agregar carta");
		lblColeccionAgregar.setBounds(10, 11, 158, 14);
		panel.add(lblColeccionAgregar);
		
		JButton btnAgregarCarta = new JButton("Agregar");
		
		btnAgregarCarta.setBounds(220, 36, 89, 23);
		panel.add(btnAgregarCarta);
		
		
		
		
		
		//tableVer.setBounds()
		String[] tblHead={"Nombre","Tipo"};
		DefaultTableModel dtm=new DefaultTableModel();
		dtm.addColumn("Nombre");
		dtm.addColumn("Tipo");
		JLabel lblColeccionCartas = new JLabel("Coleccion");
		lblColeccionCartas.setBounds(10, 119, 140, 14);
		panel.add(lblColeccionCartas);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Consulta", null, panel_1, null);
		panel_1.setLayout(null);
		
		txtConsulta = new JTextField();
		txtConsulta.setBounds(28, 48, 193, 20);
		panel_1.add(txtConsulta);
		txtConsulta.setColumns(10);
		
		JLabel lblConsulta = new JLabel("Ver tipo de carta");
		lblConsulta.setBounds(28, 11, 170, 14);
		panel_1.add(lblConsulta);
		
		JButton btnNewButton = new JButton("Ver");
	
		btnNewButton.setBounds(260, 47, 89, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblConsultaR = new JLabel("");
		lblConsultaR.setBounds(129, 138, 309, 14);
		panel_1.add(lblConsultaR);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Almacen", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(638, 60, -638, 274);
		panel_2.add(scrollPane);
		String[] Head= {"Nombre","Tipo"};
		DefaultTableModel total=new DefaultTableModel(Head,0);
		TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(dtm);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 144, 630, 187);
		panel.add(scrollPane_2);
		JTable table_1=new JTable(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Nombre", "Tipo"
			}
		));
		scrollPane_2.setViewportView(table_1);
		table_1.setAutoCreateRowSorter(true);
		table_1.setRowSorter(elQueOrdena);
		
		table_1.setAutoCreateRowSorter(true);
		
		JButton btnAlmacen = new JButton("Almacen");
	
		btnAlmacen.setBounds(177, 11, 89, 23);
		panel_2.add(btnAlmacen);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 39, 630, 292);
		panel_2.add(scrollPane_1);
		JTable tableVer = new JTable(total);
		scrollPane_1.setViewportView(tableVer);
		TableRowSorter<TableModel> totalOrder = new TableRowSorter<TableModel>(total);
		tableVer.setRowSorter(totalOrder);
		
		
		btnAgregarCarta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HashMap<String, String> cartas = new HashMap<String, String>();
				 Scanner entrada = null;
			        String linea;
			        int numeroDeLinea = 1;
			        boolean contiene = false;
			        Scanner sc = new Scanner(System.in);

			        //Para seleccionar el archivo
			        JFileChooser j = new JFileChooser();
			        j.showOpenDialog(j);
			        
			        
			        
			        //Introducimos el texto a buscar
			    //    System.out.print("Introduce texto a buscar: ");
			     //   String texto = sc.nextLine();
			        String texto = txtAgregarCarta.getText();
			        
			        try {
			        	
			            //guardamos el path del fichero en la variable ruta
			            String ruta = j.getSelectedFile().getAbsolutePath();
			            //creamos un objeto File asociado al fichero seleccionado
			            File f = new File(ruta);
			            //creamos un Scanner para leer el fichero
			            entrada = new Scanner(f);
			            //mostramos el nombre del fichero
			        //    System.out.println("Archivo: " + f.getName());
			            
			    
			            		  //mostramos el texto a buscar
			          //          System.out.println("Texto a buscar: " + texto);
			                    while (entrada.hasNext()) { //mientras no se llegue al final del fichero
			                        linea = entrada.nextLine();  //se lee una línea
			                        if (linea.contains(texto)) {   //si la línea contiene el texto buscado se muestra por pantalla
			                          //  System.out.println("Linea " + numeroDeLinea + ": " + linea);
			                            String[] la=linea.split("\\|");
			                            String la2 = la[1];
			                            cartas.put(texto,la2);
			                        //    System.out.println(cartas);
			                            contiene = true;
			                            
			                            String[] item2= {texto,la2};
			                            
			                            dtm.addRow(item2);
			                            txtAgregarCarta.setText(" ");
			                            table_1.setRowSorter(elQueOrdena);
			                            table_1.setAutoCreateRowSorter(true);
			                          
			                            
			                            
			                        }
			                        numeroDeLinea++; //se incrementa el contador de líneas
			                    }
			                    if(!contiene){ //si el archivo no contienen el texto se muestra un mensaje indicándolo
			                    	
			                    	
			                        //System.out.println(texto + " no se ha encontrado en el archivo");
			                    	JOptionPane.showMessageDialog(null, "Carta no encontrada");
			                    }
			            		
			            	
			            
			          
			        } catch (FileNotFoundException e) {
			        	JOptionPane.showMessageDialog(null, "Archivo no encontrado");
			            //System.out.println(e.toString());
			        } catch (NullPointerException e) {
			        	JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun archivo");
			           // System.out.println(e.toString() + "No ha seleccionado ningún archivo");
			        } catch (Exception e) {
			        	JOptionPane.showMessageDialog(null, "Error, vueleve a intentarlo ");
			            System.out.println(e.toString());
			        } finally {
			            if (entrada != null) {
			                entrada.close();
			            }
			        }
			    }
			
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HashMap<String, String> cartas = new HashMap<String, String>();
				 Scanner entrada = null;
			        String linea;
			        int numeroDeLinea = 1;
			        boolean contiene = false;
			        Scanner sc = new Scanner(System.in);

			        //Para seleccionar el archivo
			        JFileChooser j = new JFileChooser();
			        j.showOpenDialog(j);
			        
			        
			        
			        //Introducimos el texto a buscar
			    //    System.out.print("Introduce texto a buscar: ");
			     //   String texto = sc.nextLine();
			        String texto = txtAgregarCarta.getText();
			        
			        try {
			        	
			            //guardamos el path del fichero en la variable ruta
			            String ruta = j.getSelectedFile().getAbsolutePath();
			            //creamos un objeto File asociado al fichero seleccionado
			            File f = new File(ruta);
			            //creamos un Scanner para leer el fichero
			            entrada = new Scanner(f);
			            //mostramos el nombre del fichero
			        //    System.out.println("Archivo: " + f.getName());
			            
			    
			            		  //mostramos el texto a buscar
			          //          System.out.println("Texto a buscar: " + texto);
			                    while (entrada.hasNext()) { //mientras no se llegue al final del fichero
			                        linea = entrada.nextLine();  //se lee una línea
			                        if (linea.contains(texto)) {   //si la línea contiene el texto buscado se muestra por pantalla
			                          //  System.out.println("Linea " + numeroDeLinea + ": " + linea);
			                            String[] la=linea.split("\\|");
			                            String la2 = la[1];
			                            cartas.put(texto,la2);
			                        //    System.out.println(cartas);
			                            contiene = true;
			                            
			                            //String[] item2= {texto,la2};
			                           // JOptionPane.showMessageDialog(null, "La carta "+ linea + "es tipo : " + la2);
			                            //dtm.addRow(item2);
			                            lblConsultaR.setText("La carta "+ txtConsulta.getText() + "es tipo: "+ la2);
			                            txtConsulta.setText(" ");
			                            
			                        }
			                        numeroDeLinea++; //se incrementa el contador de líneas
			                    }
			                    if(!contiene){ //si el archivo no contienen el texto se muestra un mensaje indicándolo
			                    	
			                    	
			                        //System.out.println(texto + " no se ha encontrado en el archivo");
			                    	JOptionPane.showMessageDialog(null, "Carta no encontrada");
			                    	
			                    }
			            		
			            	
			            
			          
			        } catch (FileNotFoundException e) {
			        	JOptionPane.showMessageDialog(null, "Archivo no encontrado");
			            //System.out.println(e.toString());
			        } catch (NullPointerException e) {
			        	JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun archivo");
			           // System.out.println(e.toString() + "No ha seleccionado ningún archivo");
			        } catch (Exception e) {
			        	JOptionPane.showMessageDialog(null, "Error, vueleve a intentarlo ");
			            System.out.println(e.toString());
			        } finally {
			            if (entrada != null) {
			                entrada.close();
			            }
			        }
			    }
				
			
		});
		btnAlmacen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner entrada = null;
		        String linea;
		        int numeroDeLinea = 1;
		        boolean contiene = false;
		        Scanner sc = new Scanner(System.in);

		        //Para seleccionar el archivo
		        JFileChooser j = new JFileChooser();
		        j.showOpenDialog(j);
		        
		        
		        
		        //Introducimos el texto a buscar
		    //    System.out.print("Introduce texto a buscar: ");
		     //   String texto = sc.nextLine();
		      //  String texto = txtAgregarCarta.getText();
		        
		        try {
		        	
		            //guardamos el path del fichero en la variable ruta
		            String ruta = j.getSelectedFile().getAbsolutePath();
		            //creamos un objeto File asociado al fichero seleccionado
		            File f = new File(ruta);
		            //creamos un Scanner para leer el fichero
		            entrada = new Scanner(f);
		            //mostramos el nombre del fichero
		        //    System.out.println("Archivo: " + f.getName());
		            
		    
		            		  //mostramos el texto a buscar
		          //          System.out.println("Texto a buscar: " + texto);
		                    while (entrada.hasNextLine()) { //mientras no se llegue al final del fichero
		                      //  linea = entrada.nextLine();  //se lee una línea
		                    	 String line = entrada.nextLine();
		      		           //     System.out.println(line);
		      		                String[] la=line.split("\\|");
		                              String la2 = la[1];
		                              
		      		                String[] item = {line,la2};
		      		                total.addRow(item);
		                        numeroDeLinea++; //se incrementa el contador de líneas
		                    }
		                    
		            		
		            	
		            
		          
		        } catch (FileNotFoundException e1) {
		        	JOptionPane.showMessageDialog(null, "Archivo no encontrado");
		            //System.out.println(e.toString());
		        } catch (NullPointerException e1) {
		        	JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun archivo");
		           // System.out.println(e.toString() + "No ha seleccionado ningún archivo");
		        } catch (Exception e1) {
		        	JOptionPane.showMessageDialog(null, "Error, vueleve a intentarlo ");
		            System.out.println(e1.toString());
		        } finally {
		            if (entrada != null) {
		                entrada.close();
		            }
		        }
		    
				
				/*try {
		            Scanner input = new Scanner(new File("C:\\Users\\MACO\\OneDrive\\Escritorio\\UVG S3\\Algoritmos y estructura de datos\\HT6\\HT6\\src\\cards_desc.txt"));
		            while (input.hasNextLine()) {
		            	
		                String line = input.nextLine();
		           //     System.out.println(line);
		                String[] la=line.split("\\|");
                        String la2 = la[1];
                        
		                String[] item = {line,la2};
		                total.addRow(item);
		            }
		            input.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
				
				
			}*/
			}
			
		});
	}
}
