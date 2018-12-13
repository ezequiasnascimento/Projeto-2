package pacote1;

public class Funcionario extends Pessoa {
		private String matricula;
		private Double salario;
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public Double getSalario() {
			return salario;
		}
		public void setSalario(Double salario) {
			this.salario = salario;
		}
		public String recuperarInformacao() {
			String retorno = "";
			retorno += "Nome: " + getNome() +"\n";
			retorno += "Cpf: " + getCpf() +"\n";
			retorno += "Matrícula: " + matricula +"\n";
			retorno += "Salário: " + salario +"\n";
			return retorno;
		}
		
}
