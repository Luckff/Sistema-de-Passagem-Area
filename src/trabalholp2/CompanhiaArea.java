package trabalholp2;

import java.util.ArrayList;

public class CompanhiaArea {
    private String nome, CNPJ;
    private ArrayList<Passagem> passagens = new ArrayList();
    private ArrayList<Aeronaves> frota = new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();

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

    public ArrayList<Passagem> getPassagens() {
        return passagens;
    }

    public void setPassagens(ArrayList<Passagem> passagens) {
        this.passagens = passagens;
    }

    public ArrayList<Aeronaves> getFrota() {
        return frota;
    }

    public void setFrota(ArrayList<Aeronaves> frota) {
        this.frota = frota;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

   
}
