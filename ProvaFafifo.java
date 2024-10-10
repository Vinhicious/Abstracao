package exercicio.abstracao;

class ProvaFafifo extends ProvaUniversidade{
    
    public ProvaFafifo(double AV1, double AV2){
        super(AV1, AV2);
    }
    
    public boolean Aprovado(){
        double media = calcularMedia();
        return media >= 6.0;
    }
}
