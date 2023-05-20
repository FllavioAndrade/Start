package Start.POO.Heranca;

import java.util.Date;

public class Main{

    public static void main(String[] args){

        Vendedor v = new Vendedor();
        v.setNome("Flavio");
        v.setSalario(1000.0f);
        v.setCpf("123456789");
        v.setDataNascimento(new Date());
        v.setComissao(10.0f);
        v.setItensVendidos(10);

        System.out.println("O Salario do vendedor " + v.getNome() + " é: " + v.calcularSalario());

    }


}