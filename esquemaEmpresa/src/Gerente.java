public class Gerente extends Funcionario{
    private String nivelGerencial;

    public Gerente(){

    }
    public Gerente(String nivelGerencial){
        this.nivelGerencial = nivelGerencial;
    }
    public String getNivelGerencial(){
        return nivelGerencial;
    }
    public void setNivelGerencial(String nivelGerencial){
        this.nivelGerencial = nivelGerencial;
    }

    @Override
    public void pagarImposto(){
    }

    @Override
    public void trabalhar(){
        System.out.println("Eh gerente da empresa");
    }

    public String toString(){
        return "Nivel Gerencial: " +
                nivelGerencial;
    }
}
