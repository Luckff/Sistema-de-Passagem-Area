package trabalholp2;

public class Cliente {
    private String nome, cpf, dataNascimento;
    private int pontosCartao;

    public Cliente(String nome, String cpf, String dataNascimento, int pontosCartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.pontosCartao = pontosCartao;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getPontosCartao() {
        return pontosCartao;
    }

    public void setPontosCartao(int pontosCartao) {
        this.pontosCartao = pontosCartao;
    }
    
    
}
