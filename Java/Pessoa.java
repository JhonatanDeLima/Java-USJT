public class Pessoa {

    private String nome;
    private int idade;
    private String endereco;
    private String telefone;

    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }

    public boolean temTelefone() {
        return telefone != null && !telefone.isEmpty();
    }

    public Pessoa(String nome, int idade, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
