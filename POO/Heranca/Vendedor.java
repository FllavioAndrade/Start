package Start.POO.Heranca;

public class Vendedor extends Funcionario{


    private float itensVendidos;
    private float comissao;


    public float getItensVendidos() {
        return itensVendidos;
    }

    public void setItensVendidos(float itensVendidos) {
        this.itensVendidos = itensVendidos;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public Vendedor(){
        super();
    }

    public float calcularSalario(){
        return super.getSalario() + (this.comissao * itensVendidos);
    }

    


}