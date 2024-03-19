package sistemacadastro;

public class TesteCadastro {

    public static void main(String[] args) {
        CadastroSistema cadastro = new CadastroSistema();

        //cadastrar nova pessoa como usuario que nao esteja no banco de dados do sistema
        cadastro.cadastrarPessoa(4, "Bebe", 12);

        //caso o usuário já conste no banco de dados e deseja realizar novamente cadastro mensagem de cadastro xiste irá ser apresentada como no abaixo:
        cadastro.cadastrarPessoa(5, "Tite", 9);

        System.out.println("\nListagem inicial:");
        cadastro.listarPessoas();

        cadastro.excluirPessoa(2);

        System.out.println("\nListagem após exclusão:");
        cadastro.listarPessoas();

        cadastro.alterarPessoa(1, "Gigi", 15);

        System.out.println("\nListagem após alteração:");
        cadastro.listarPessoas();
    }
}
