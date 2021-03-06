package gomes.filipe.exercicio5.domain;

public class Cliente {

    private int id = 0;
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;

    public Cliente(String nome, String cpf, String endereco, String email, String telefone) {
        id++;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public Cliente() {

    }

    public boolean nomeValido(String nome) {
        return nome.length() >= 3 && nome.length() <= 50;
    }

    public boolean cpfValido(String cpf) {
        return cpf.length() == 11;
    }

    public boolean emailValido(String email) {
        return email.contains("@");
    }

    public boolean telefoneValido(String telefone) {
        return telefone.length() == 11;
    }

    public void cadastraCliente(String nome, String cpf, String endereco, String email, String telefone) {
        if (nomeValido(this.nome) && cpfValido(this.cpf) && emailValido(this.email) && telefoneValido(this.telefone)) {
            Cliente cliente = new Cliente(nome, cpf, endereco, email, telefone);
            System.out.println(cliente);
        } else {
            System.out.println("Cliente registrou dados inválidos, cadastro não realizado!");
        }

    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
