package Vetores_Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario[] func = new Funcionario[] {
				new Funcionario("Diego Faria", "Estagiário", 3500),
				new Funcionario("Andreza Oliveira", "Engenheira", 7500)
		};
		
		func[1].abonoSalario(75);
		func[0].abonoSalario(25);
		
		for(int i = 0; i < func.length; i++) {
			double Abono = 200;
			System.out.printf("\nNome Funcionário: " + func[i].getNome() + " - Cargo: " 
					+ func[i].getCargo() + " - Salario:" + func[i].getSalario());
			System.out.printf("\nAbono: " + Abono + " - Salario com abono: "
					+ " - " + func[i].abonoSalario(Abono));
		}

	}

}
