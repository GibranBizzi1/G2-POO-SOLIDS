public class Encomenda{ // principio S - Cada classe com o seu motivo para mudança, sua necessidade individual, tal qual seus proprios metodos de acordo com o seu motivo. - Aqui naão se aplica apenas a Encomenda, mas como o codigo em geral, que sempre pensa em ação individual da classe.
    private String descricao;
    private int peso;
    private Remetente Remetente;

    public Encomenda(String descricao, double peso, Remetente Remetente){
        if(peso < 0){
            throw new PesoNegativoException ("Peso Negativo")
        }
        this.descricao = descricao;
        this.peso = peso;
        this.remetente = remetente;
    }

    public String getDescricao(){
        return descricao
    }

    public int getPeso(){
        return peso
    }

    public remetente getRemetente(){
        return remetente
    }

}