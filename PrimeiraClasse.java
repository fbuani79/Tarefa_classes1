/**
 * @autor fabio.buani
 **/
// classe principal

public class PrimeiraClasse {
    public static void main(String args[]) {

        System.out.println("Ola Fabio");
        //Corrigido a linha endereco
        Cliente cliente = new Cliente();
        cliente.setEndereco("Rua 6");
        cliente.setCodigo(2);
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        //incluido setEndereco

    }
}
