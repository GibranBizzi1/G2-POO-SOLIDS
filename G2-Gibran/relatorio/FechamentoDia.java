public class FechamentoDia{
    private Central central;
    private SaidaRelatorio saida;

    public FechamentoDia(Central central, SaidaRelatorio saida){
        this.central = central;
        this.saida = saida;
    }

    public Central getCentral(){
        return central
    }

    public SaidaRelatorio getSaida(){
        return saida
    }

    public double faturamento(){
        double total = 0
        for(Envio e: central.listar()){
            total = total + e.calcularValor()
        }
        return total
    }

    public Envio maisCaro(){
        Envio maisCaro = null
        for(Envio e: central.listar()){
            if(maisCaro == null || e.calcularValor > maisCaro.calcularValor()){
                maisCaro = e.calcularValor
            }
            return maisCaro
        }
    }

    public void Fechar(){
        saida.escrever("Faturamento:" + faturamento()); //não sei se era necessario um for, não pede todos, fiz de forma mais simples.
        top = maisCaro
        if (top != null){
            saida.escrever("Mais caro é:" + top.getNome + top.getPrecoBase())
        }
    }
}