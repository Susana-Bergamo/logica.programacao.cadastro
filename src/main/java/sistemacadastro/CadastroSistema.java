package sistemacadastro;


import java.util.List;

public class CadastroSistema {
    private List<Usuarios> listaPessoas;


    //contrutor que inicializa a lista de usuarios
    public CadastroSistema() {
        listaPessoas = UsuariosCadastradosSistema.getListaUsuarios();
    }


    public void cadastrarPessoa(int id, String nome, int idade) {
        // Verifica se o nome já existe na lista
        boolean nomeExistente = listaPessoas.stream().anyMatch(p -> p.getNome().equalsIgnoreCase(nome));

        if (!nomeExistente) {
            Usuarios pessoa = new Usuarios(id, nome, idade);
            listaPessoas.add(pessoa);
            System.out.println("Pessoa cadastrada com sucesso!");
        } else {
            System.out.println("Nome já existe. Não é possível cadastrar.");
        }
    }


    public void excluirPessoa(int id) {
        Usuarios pessoaParaExcluir = null;
        for (Usuarios pessoa : listaPessoas) {
            if (pessoa.getId() == id) {
                pessoaParaExcluir = pessoa;
                break;
            }
        }

        if (pessoaParaExcluir != null) {
            listaPessoas.remove(pessoaParaExcluir);
            System.out.println("\nPessoa excluída com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public void listarPessoas() {
        if (listaPessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (Usuarios pessoa : listaPessoas) {
                System.out.println(pessoa);
            }
        }
    }

    public void alterarPessoa(int id, String novoNome, int novaIdade) {
        for (Usuarios pessoa : listaPessoas) {
            if (pessoa.getId() == id) {
                pessoa.setNome(novoNome);
                pessoa.setIdade(novaIdade);
                System.out.println("\nPessoa alterada com sucesso!");
                return;
            }
        }

        System.out.println("\nPessoa não encontrada.");
    }
}