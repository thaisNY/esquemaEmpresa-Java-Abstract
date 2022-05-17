public abstract class Cidadao {
    private String nome;
    private Integer cpf;

    public Cidadao(){

    }
    public Cidadao(String nome, Integer cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Integer getCpf(){
        return cpf;
    }

    public abstract void pagarImposto();
    public void trabalhar(){
        System.out.println("Possivelmente trabalha");
    }

    public String toString(){
        return "Nome: " +
                nome +
                "Cpf: " +
                cpf ;
    }
}
