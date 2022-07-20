package User;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
    
    private JPanel painel;
    private JPanel botao;
    
    private FlowLayout layout;
    
    
    public CadastroCli(){
        
     super("CadastroCli"); 
     
     this.layout = new FlowLayout();
     this.setLayout(layout);
     
     
     this.nome = new JLabel("Nome"); 
     this.cpflable = new JLabel("Cpf");
     this.emaillable = new JLabel("Email");
     this.passwordlable = new JLabel("Senha");
     
     this.cadastro = new JButton("Cadastro");
     
     this.painel = new JPanel();
     this.botao = new JPanel();
     
     
     //Painel de informações
     
     this.painel.setLayout(new MigLayout());
     this.painel.setPreferredSize(new Dimension(400, 500));
     this.painel.setBackground(Color.cyan);
     
     
     this.painel.add(nome, "wrap");
     this.painel.add(cpflable, "wrap");
     this.painel.add(emaillable, "wrap");
     this.painel.add(passwordlable);
     
     //painel de botões
     
     this.botao.setLayout(new BorderLayout());
     this.botao.setPreferredSize(new Dimension(100,100));
     this.botao.setBackground(Color.blue);
     
     this.botao.add(cadastro);
     
     //area para adicionar no layout
        
     add(painel);
     add(botao);
        
        
    }
    
}
