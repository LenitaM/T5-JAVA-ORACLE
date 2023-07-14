public class TestaContaComExcecaoChecked {

    Conta2 c = new Conta2();
    try {
        c.deposita();
    }catch(MinhaExcecao excecao) {
        System.out.println("Tratamento...");
    }

}
