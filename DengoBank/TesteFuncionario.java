public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario nico = new Funcionario();

        nico.setNome("Nico Spook");
        nico.setCpf("122.303.456-22");
        nico.setSalario(3000);

        System.out.println(nico.getNome()); //Nico Spook
        System.out.println(nico.getBonificacao());//300.0


    }
}
