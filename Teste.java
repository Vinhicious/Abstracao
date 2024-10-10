package exercicio.abstracao;


class Teste {
    public static void main(String[] args){
        ProvaUCB provaucb = new ProvaUCB(8.5, 9);
        ProvaFafifo provafafifo = new ProvaFafifo(5.5, 3.6);
        
        System.out.println("Prova UCB");
        System.out.println("Media: " + provaucb.calcularMedia());
        System.out.println("Situação: " + (provaucb.Aprovado()? "Aprovado" : "Não Aprovado"));
        
        System.out.println("Prova Fafifo");
        System.out.println("Media: " + provafafifo.calcularMedia());
        System.out.println("Situação: " + (provafafifo.Aprovado()? "Aprovado" : "Não Aprovado"));
        
    }
}
