public class SuperExpresso extends Envio{ // Principio O : Adicionar e não editar, a vantagem em evitar varios ifs, e futuras possiveis quebras no codigo, aqui temos o exemplo do superexpresso, que foi pedido futuramente pra ser criado, com isso apenas usei o polimorfismo na classe abstrata mãe.
    
    public SuperExpresso(Encomenda encomenda, LocalDate data, double precoBase){
        super(encomenda, data, precoBase)
    }

    @override
    public double calcularValor(){
        return getPrecoBase()
    }
}