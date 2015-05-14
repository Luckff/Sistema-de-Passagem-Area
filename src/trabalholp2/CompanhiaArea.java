package trabalholp2;

public class CompanhiaArea { //Ana Patricia.
    private String nome, CNPJ;
    private Passagem[] passagens = new Passagem[50];
    private Aeronaves[] frota = new Aeronaves[50];
    private Cliente[] clientes = new Cliente[50];

    public CompanhiaArea(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Aeronaves[] getFrota() {
        return frota;
    }

    public void setFrota(Aeronaves[] frota) {
        this.frota = frota;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
}
