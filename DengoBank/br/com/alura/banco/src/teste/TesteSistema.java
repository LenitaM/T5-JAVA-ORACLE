package teste;

import modelo.Administrador;
import modelo.Cliente;
import modelo.Gerente;

public class TesteSistema {

    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

       /*
        modelo.SistemaInterno si = new modelo.SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cliente);*/

    }
}
