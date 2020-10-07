package br.com.housecode.models;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank
	private String titulo;
	
	@Lob
	@NotBlank
	private String descricao;
	private String paginas;
	@DecimalMin("20")
	private BigDecimal preco;
	
	@ManyToMany
	@Size(min=1)
	@NotNull
	private List<Autor> autores = new ArrayList<>();

	
	public List<Autor> getAutores() {
		return autores;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPaginas() {
		return paginas;
	}
	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", descricao=" + descricao + ", paginas=" + paginas + ", preco=" + preco
				+ "]";
	}

}
