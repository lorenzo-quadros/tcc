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
    
    
    public CadastroCli(){
        
     super("CadastroCli"); 
     this.setLayout(new FlowLayout());
     
     this.nome = new JLabel("Nome"); 
     this.cpflable = new JLabel("Cpf");
     this.emaillable = new JLabel("Email");
     this.passwordlable = new JLabel("Senha");
     
     this.cadastro = new JButton();
     
     this.painel = new JPanel();
     this.botao = new JPanel();
     
     
     
     
     this.painel.setLayout(new MigLayout());
     this.painel.setPreferredSize(new Dimension(400, 500));
     this.painel.setBackground(Color.cyan);
     
     this.painel.add(nome, "wrap");
     this.painel.add(cpflable, "wrap");
     this.painel.add(emaillable, "wrap");
     this.painel.add(passwordlable);
        
       
        
     add(painel, BorderLayout.CENTER);   
        
        
    }
    
}
