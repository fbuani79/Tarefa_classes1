/**
 * @autor fabio.buani
 */
//classe cliente e suas atribuicoes

public class Cliente {

    private int codigo;

    private String nome;

    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    //correcao do endereco na primeira classe
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    }


