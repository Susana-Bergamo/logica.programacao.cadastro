package sistemacadastro;

//atributos criados para cada usuario para o cadastro
public class Usuarios {
    private int id;
    private String nome;
    private int idade;

    // metodo construtor
    public Usuarios(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    // getters e setters vriado para acessar e modificar os valores dos atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    //retorno
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Idade: " + idade;
    }
}