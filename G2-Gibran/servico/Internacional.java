public class Internacional extends Envio{

    public Internacional(Encomenda encomenda, LocalDate data, double precoBase){
        super(encomenda, data, precoBase)
    }

    @override
    public double calcularValor(){
        return getPrecoBase() * 2.5
    }
}