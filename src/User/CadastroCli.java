package User;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Database.DatabaseCon;
import net.miginfocom.swing.MigLayout;

public class CadastroCli extends JFrame {
	
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel nome;
    private JLabel cpflable;
    private JLabel emaillable;
    private JLabel passwordlable;
    
    private JButton cadastro;
    
    private JTextField nometxt;
    private JTextField cpftxt;
    private JTextField emailtxt;
    private JTextField passwordtxt;
    
    private JPanel painel;
    
    private FlowLayout layout;
    
    private Font myFont;
    
    
    
    
    public CadastroCli(){
        
     super("CadastroCli"); 
     
     this.layout = new FlowLayout();
     this.setLayout(layout);

     
     //Inicializar variaveis
     
     this.myFont = new Font("Serif", Font.BOLD, 20);
     
     this.nometxt = new JTextField("");
     this.cpftxt = new JTextField("");
     this.emailtxt = new JTextField("");
     this.passwordtxt = new JTextField("");
     
     this.nome = new JLabel("Nome:"); 
     this.nome.setFont(myFont);
     this.cpflable = new JLabel("Cpf:");
     this.cpflable.setFont(myFont);
     this.emaillable = new JLabel("Email:");
     this.emaillable.setFont(myFont);
     this.passwordlable = new JLabel("Senha:");
     this.passwordlable.setFont(myFont);
     
     this.cadastro = new JButton("Cadastro");
     
     this.painel = new JPanel();
     
    
     
     
     
     
     //definições do textfield
     this.nometxt.setPreferredSize(new Dimension(180, 20));
     this.nometxt.setBackground(Color.cyan);
     this.cpftxt.setPreferredSize(new Dimension(180, 20));
     this.cpftxt.setBackground(Color.cyan);
     this.emailtxt.setPreferredSize(new Dimension(180, 20));
     this.emailtxt.setBackground(Color.cyan);
     this.passwordtxt.setPreferredSize(new Dimension(180, 20));
     this.passwordtxt.setBackground(Color.cyan);
     
     //Painel de informações
     
     this.painel.setLayout(new MigLayout());
     this.painel.setPreferredSize(new Dimension(400, 550));
     this.painel.setBackground(Color.cyan);
     
     this.nome.setBorder(BorderFactory.createEmptyBorder(200, 60, 0, 0));
     this.cpflable.setBorder(BorderFactory.createEmptyBorder(10, 60, 0, 0));
     this.emaillable.setBorder(BorderFactory.createEmptyBorder(10, 60, 0, 0));
     this.passwordlable.setBorder(BorderFactory.createEmptyBorder(10, 60, 30, 0));
    
     
     
     this.painel.add(nome);
     this.painel.add(nometxt, "wrap");
     this.painel.add(cpflable);
     this.painel.add(cpftxt, "wrap");
     this.painel.add(emaillable);
     this.painel.add(emailtxt, "wrap");
     this.painel.add(passwordlable);
     this.painel.add(passwordtxt, "wrap");
     this.painel.add(cadastro);
     
     
     //painel de botões
    /* 
     this.botao.setLayout(new BorderLayout());
     this.botao.setPreferredSize(new Dimension(100,100));
     this.botao.setBackground(Color.blue);
     
     this.botao.add(cadastro);
     */
     
     //area para adicionar no layout
        
     add(painel);
        
        
    }
    
    public void Cadastro() {
    	
    	DatabaseCon con = new DatabaseCon();
    	String sql = "INSERT into cliente(id, name, cpf, email, password)";
    	
    	
    }
    
    
    
}
