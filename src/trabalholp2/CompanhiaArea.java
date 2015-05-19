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
    public void addCliente(Cliente cliInsert){
        this.clientes.add(cliInsert);
    }
    public void addPassagem(Passagem pasInsert){
        this.passagens.add(pasInsert);
    }
    public void addAeronaves(Aeronaves aerInsert){
        this.frota.add(aerInsert);
    }
    public void comprarPassagemDin(Cliente clienteLogin, Voo vooEscolhido, boolean bebida, String classe,String comida){
        int codigoPassagem = 12;
        Passagem passagemCliente = new Passagem(codigoPassagem,bebida,comida,classe,clienteLogin,vooEscolhido);
        addPassagem(passagemCliente);
        clienteLogin.setPontosCartao(clienteLogin.getPontosCartao() -  vooEscolhido.getValorReal());  
    }
    public void comprarPassagemPon(Cliente clienteLogin, Voo vooEscolhido, boolean bebida, String classe,String comida){
        int codigoPassagem = 13;
        if(clienteLogin.getPontosCartao() >= vooEscolhido.getValorPontos()){
            Passagem passagemCliente = new Passagem(codigoPassagem,bebida,comida,classe,clienteLogin,vooEscolhido);
            addPassagem(passagemCliente);
            clienteLogin.setPontosCartao(clienteLogin.getPontosCartao() - vooEscolhido.getValorPontos());
        }
        else {
            System.out.println("Pontos Insuficientes");
        }
    }
    public void cancelarPassagem(Cliente clienteLogin){
        int j = -1,i = 0;
        if(passagens.isEmpty()) return;
        while(i <= passagens.size() ){
            if(passagens.get(i).getCliente() == clienteLogin){ 
                j = i;
                break;
            }
        }
        if(j != -1){
            clienteLogin.setPontosCartao(clienteLogin.getPontosCartao() + passagens.get(j).getVoo().getValorPontos());
            passagens.remove(j);
            System.out.println("Compra cancelada.");
        }
    }
    public void consultarPassagem(Cliente clienteLogin){
        int j = -1,i = 0;
        while(i < passagens.size() ){
            if(passagens.get(i).getCliente() == clienteLogin){ 
                j = i;
                break;
            }
            i++;
        }
        if(j != -1){//precisa incluir o horario ainda
            System.out.println("Código: "+ passagens.get(j).getCodigoPassagem());
            System.out.println("Nome: "+ passagens.get(j).getCliente().getNome());
            System.out.println("Vôo "+passagens.get(j).getVoo().getIdVoo()+"    Origem: "+passagens.get(j).getVoo().getCidadeOrigem()+"  Destino: "+ passagens.get(j).getVoo().getCidadeDestino());
            System.out.println("Classe "+ passagens.get(j).getClasseDoAviao());
        }
        else{
            System.out.println("Passagem não encontrada.");
        }
    }
}
