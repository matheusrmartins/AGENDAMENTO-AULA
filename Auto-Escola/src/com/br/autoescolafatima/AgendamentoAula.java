package com.br.autoescolafatima;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AgendamentoAula extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNomeCompleto;
	private JTextField txtCPF;
	private JTextField txtRG;
	private JTextField txtEndereco;
	private JTextField txtTelPrincipal;
	private JTextField txtTelAlternativo;
	private JTextField txtCEP;
	private JTextField txtCategoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendamentoAula frame = new AgendamentoAula();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AgendamentoAula() {
		setTitle("Cadastro de alunos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtNomeCompleto = new JTextField();
		txtNomeCompleto.setBounds(138, 5, 256, 20);
		txtNomeCompleto.setToolTipText("Digite o nome completo do aluno");
		txtNomeCompleto.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(15, 228, 247, 23);
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {	
				Cadastro aluno = new Aluno(txtCPF.getText(), //CPF
						                   txtNomeCompleto.getText(), //Nome
						                   txtTelPrincipal.getText(),
						                   txtTelAlternativo.getText(),
						                   txtEndereco.getText(),
						       			   txtRG.getText(),
						       			   txtCEP.getText(),
						       			   txtCategoria.getText());
				aluno.cadastrarAluno();
			}
		});
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo");
		lblNomeCompleto.setBounds(15, 8, 105, 14);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(138, 31, 256, 20);
		txtCPF.setToolTipText("Digite o CPF do aluno sem pontos ou tra\u00E7os");
		txtCPF.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(15, 34, 105, 14);
		
		txtRG = new JTextField();
		txtRG.setBounds(138, 57, 256, 20);
		txtRG.setToolTipText("Digite o RG do aluno");
		txtRG.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(138, 83, 256, 20);
		txtEndereco.setToolTipText("Digite o endere\u00E7o do aluno");
		txtEndereco.setColumns(10);
		
		txtTelPrincipal = new JTextField();
		txtTelPrincipal.setBounds(138, 135, 256, 20);
		txtTelPrincipal.setToolTipText("Digite o telefone principal do aluno");
		txtTelPrincipal.setColumns(10);
		
		txtTelAlternativo = new JTextField();
		txtTelAlternativo.setBounds(138, 161, 256, 20);
		txtTelAlternativo.setToolTipText("Digite o telefone alternativo do aluno");
		txtTelAlternativo.setColumns(10);
		
		txtCEP = new JTextField();
		txtCEP.setBounds(138, 109, 256, 20);
		txtCEP.setToolTipText("Digite o CEP do aluno");
		txtCEP.setColumns(10);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(138, 187, 256, 20);
		txtCategoria.setToolTipText("Digite a categoria do aluno");
		txtCategoria.setColumns(10);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(15, 60, 105, 14);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(15, 86, 105, 14);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(15, 112, 105, 14);
		
		JLabel lblTelefonePrincipal = new JLabel("Telefone Principal");
		lblTelefonePrincipal.setBounds(15, 138, 105, 14);
		
		JLabel lblTelefoneAlternativo = new JLabel("Telefone Alternativo");
		lblTelefoneAlternativo.setBounds(15, 164, 105, 14);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(15, 190, 105, 14);
		contentPane.setLayout(null);
		contentPane.add(btnCadastrar);
		contentPane.add(lblCpf);
		contentPane.add(lblNomeCompleto);
		contentPane.add(lblRg);
		contentPane.add(lblEndereo);
		contentPane.add(lblCep);
		contentPane.add(lblTelefonePrincipal);
		contentPane.add(lblTelefoneAlternativo);
		contentPane.add(lblCategoria);
		contentPane.add(txtCategoria);
		contentPane.add(txtTelAlternativo);
		contentPane.add(txtCPF);
		contentPane.add(txtNomeCompleto);
		contentPane.add(txtRG);
		contentPane.add(txtCEP);
		contentPane.add(txtEndereco);
		contentPane.add(txtTelPrincipal);
	}
}
