package Start.POO.IMC;

public class Pessoa{

    //Atributos
    private float peso;
    private float altura;

    //o Metodo contrutor sempre é executadado cquando o objeto é instanciado.
    public Pessoa(){
        System.out.print("null");
    }

    public float calcularIMC(){
        float imc = peso / (altura*altura);
        return imc;
    }
    public void setPeso (float peso){
        this.peso = peso;
    }
    public float getPeso (){
        return peso;
    }

    public void setAltura (float altura){
        this.altura = altura;
    }
    public float getAltura (){
        return altura;
    }
}