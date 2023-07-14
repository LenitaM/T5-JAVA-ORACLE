public class TestaContaComExcecaoChecked {

    Conta c = new Conta();
    try {
        c.deposita();
    }catch(MinhaExcecao excecao) {
        System.out.println("Tratamento...");
    }

}
