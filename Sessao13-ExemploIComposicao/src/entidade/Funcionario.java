package entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.enums.NivelFuncionario;

public class Funcionario {
	
	private String name;
	private NivelFuncionario nivelFuncionario;
	private Double baseSalarial;

	//Associação: 1:1 (1 funcionario tem 1 departamento)	
	private Departamento departamento;
	
	//Associação: 1:n (1 funcionario tem varios contratos)
	//Quando a composição for de 1 pra muitos, deve ser criada da maneira abaixo, sendo que a lista a seguir não deve ser inserida no construtor
	private List<HorasContrato> contratos = new ArrayList<>();
	
	public Funcionario() {
		
	}

	//O construtor foi gerado sem a lista
	public Funcionario(String name, NivelFuncionario nivelFuncionario, Double baseSalarial, Departamento departamento) {
		this.name = name;
		this.nivelFuncionario = nivelFuncionario;
		this.baseSalarial = baseSalarial;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NivelFuncionario getNivelFuncionario() {
		return nivelFuncionario;
	}

	public void setNivelFuncionario(NivelFuncionario nivelFuncionario) {
		this.nivelFuncionario = nivelFuncionario;
	}

	public Double getBaseSalarial() {
		return baseSalarial;
	}

	public void setBaseSalarial(Double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContrato> getContratos() {
		return contratos;
	}

	//Esse metodo não pode ser permitido, pois ele esta recebendo no parametro uma nova lista e setando na lista de contratos
	/*public void setContratos(List<HorasContrato> contratos) {
		this.contratos = contratos;
	}*/
	
	//adicionando um contrato na lista
	public void addContrato(HorasContrato contrato) {
		contratos.add(contrato);
	}
	
	//removendo um contrato na lista
	public void removerContrato(HorasContrato contrato) {
		contratos.remove(contrato);
	}
	
	//Somando o salário base mais o salario dos contratos do mês do funcionário
	public Double rendaTotal(int ano, int mes) {
		
		double soma = this.baseSalarial;
		
		Calendar calendario = Calendar.getInstance();
		
		//Percorrendo quais os contratos são do mês e do ano
		//O laço funciona da seguinte forma: Para cada contrato c (nome da variavel) na lista de contratos, testa o mes e o ano do contrato para que o valor do mesmo seja acrescentado
		for (HorasContrato c : contratos) {	
			calendario.setTime(c.getDate());
			int c_ano = calendario.get(Calendar.YEAR);
			int c_mes = 1 + calendario.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma = soma+c.valorTotal();
			}	
		}
		
		return soma; 
	}
	
}
