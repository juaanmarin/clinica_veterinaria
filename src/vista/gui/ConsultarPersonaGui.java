package vista.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.mysql.cj.jdbc.JdbcPropertySetImpl;

import controlador.Coordinador;
import modelo.vo.PersonaVo;

public class ConsultarPersonaGui extends JFrame implements ActionListener {
	
	private JPanel contentPanel;
	private JButton btnConsultar;
	private JTextField txtNombre;
	private JTextField txtProfesion;
	private JTextField txtTelefono;
	private JTextField txtTipo;
	private JTextField txtCiudad;
	private JTextField txtDepartamento;
	private JTextField txtPais;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAnio;
	private JTextField txtDocumento;
	private Coordinador miCoordinador;
	
	public ConsultarPersonaGui() {
		//super(ventanaPrincipal,modal);
		setSize( 624, 423);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		iniciarComponentes();
		setTitle("Gestion de Personas");
	}
	
	private void iniciarComponentes() {
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(271, 29, 86, 20);
		contentPanel.add(txtDocumento);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(100, 81, 358, 20);
		contentPanel.add(txtNombre);
		
		txtProfesion = new JTextField();
		txtProfesion.setBounds(244, 136, 86, 20);
		contentPanel.add(txtProfesion);
		
		txtTipo = new JTextField();
		txtTipo.setBounds(372, 136, 86, 20);
		contentPanel.add(txtTipo);
		
		txtDia = new JTextField();
		txtDia.setBounds(133, 201, 28, 20);
		contentPanel.add(txtDia);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(100, 136, 86, 20);
		contentPanel.add(txtDocumento);
		
		txtAnio = new JTextField();
		txtAnio.setBounds(209, 201, 52, 20);
		contentPanel.add(txtAnio);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setBounds(100, 274, 86, 20);
		contentPanel.add(txtDepartamento);
		
		txtMes = new JTextField();
		txtMes.setBounds(171, 201, 28, 20);
		contentPanel.add(txtMes);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(256, 274, 86, 20);
		contentPanel.add(txtCiudad);
		
		//textField_9.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(372, 28, 89, 23);
		contentPanel.add(btnNewButton);
		
		txtPais = new JTextField();
		txtPais.setBounds(372, 274, 86, 20);
		contentPanel.add(txtPais);
		txtPais.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(372, 327, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(26, 84, 46, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(26, 139, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(77, 204, 46, 14);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(101, 257, 46, 14);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(196, 139, 46, 14);
		contentPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(256, 257, 46, 14);
		contentPanel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(372, 257, 46, 14);
		contentPanel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(372, 122, 46, 14);
		contentPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(209, 32, 46, 14);
		contentPanel.add(lblNewLabel_8);
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnConsultar) {
			
			Long idDocumento=Long.parseLong(txtDocumento.getText());
			PersonaVo p=miCoordinador.setConsultarPersona(idDocumento);
			
			if (p!=null) {
				
				p.setNacimiento(miCoordinador.consultarNacimiento(p.getNacimiento().getIdNacimiento()));
				System.out.println(p);				
				txtNombre.setText(p.getNombre());
				txtProfesion.setText(p.getProfesion());
				txtTelefono.setText(p.getTelefono());
				txtTipo.setText(p.getTipo()+"");
				
				txtCiudad.setText(p.getNacimiento().getCiudadNacimiento());
				txtDepartamento.setText(p.getNacimiento().getDepartamentoNacimiento());
				txtPais.setText(p.getNacimiento().getPaisNacimiento());
				txtDia.setText(p.getNacimiento().getFechaNacimiento().getDayOfMonth()+"");
				txtMes.setText(p.getNacimiento().getFechaNacimiento().getMonthValue()+"");
				txtAnio.setText(p.getNacimiento().getFechaNacimiento().getYear()+"");
					
			}else {
				JOptionPane.showMessageDialog(null,"No se encuentra la persona, verifique el documento","ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
			}			
		}


	}
}

