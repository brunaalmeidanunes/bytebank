
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("32165498798");
		nico.setSalario(2530.80);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
