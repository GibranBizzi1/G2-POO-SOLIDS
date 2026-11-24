public abstract class Envio{ 
    private Encomenda encomenda;
    private LocalDate data;
    private double precoBase;

    public Envio(Encomenda encomenda, LocalDate data, double precoBase){
        if(encomenda == null){
            throw new IllegalArgumenttException ("Encomenda não encontrada")
        }
        if(precoBase < 0){
            throw new PrecoNegativoException("Preco Invalido")
        }
        this.encomenda = encomenda;
        this.data = data;
        this.precoBase = precoBase;
    }

    public Encomenda getEncomenda(){
        return encomenda
    }

    public LocalDate getData{
        return data
    }

    protected double getPrecoBase(){
        return precoBase
    }

    public abstract double calcularValor()

}