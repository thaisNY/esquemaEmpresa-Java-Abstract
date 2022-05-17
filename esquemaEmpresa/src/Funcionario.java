public class Funcionario extends Cidadao{
    private String cargo;
    private Double salario;

    public Funcionario(){

    }
    public Funcionario(String nome, Integer cpf, String cargo, Double salario){
        super(nome, cpf);
        this.cargo = cargo;
        this.salario = salario;

    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    @Override
    public void pagarImposto(){
        System.out.println("Paga imposto de acordo com salario");
    }

    @Override
    public void trabalhar(){
        System.out.println("Eh funcionario da empresa");
    }

    public String toString(){
        return
                "Cargo: " +
                cargo + " " +
                "Salario: " +
                " " +
                salario;
    }
}
