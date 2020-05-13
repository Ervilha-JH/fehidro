package financas.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "tb_avaliador")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Avaliador extends AbstractEntity {
	private static final long serialVersionUID = 1L;
    @Column(name = "nm_avaliador", length = 60)
    private String nome;
    @Column(name = "cd_cpf", length = 120)
    private String cpf;
    @Column(name = "nm_user", length = 120)
    private String usuario;
    @Column(name = "nm_senha", length = 120)
    private String senha;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "avaliador")
    @JoinColumn(name = "avaliador_id")
    private List<Avaliacao> avaliacao = new ArrayList<>();
    
    public Avaliador() { }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
