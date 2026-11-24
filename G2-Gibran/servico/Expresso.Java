public class Expresso extends Envio{ -- // Principio Liskov - A abstração da classe mãe para garantia de que as filhas possam substitui-la, tal qual sua verificação nos construtores que é justamente para evitar alguma quebra surpresa futura no codigo.

    public Expresso(Encomenda encomenda, LocalDate data, double precoBase){ 
        super(encomenda,data,precoBase)
    }

    @override
    public double calcularValor(){
        if(getPeso() > 10){
            return getPrecoBase() + 15.0 * getPeso()
        }
    }
}