public class Economico extends Envio{
    
    public Economico(Encomenda encomenda, LocalDate data, double precoBase){
        super(encomenda, data, precoBase)
    }

    @override
    public double calcularValor(){
        return getPrecoBase()
    }
}