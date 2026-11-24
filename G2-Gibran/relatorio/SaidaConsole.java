public class SaidaConsole implements SaidaRelatorio{ // Principio final - D - Possibilidade de inversão de dependencias, um exemplo mais especifico é na classe principal, que na parte de fechamento apenas altero o destino, evitando quebra se fosse criar diretamente na classe, permitindo essa flexibilização, entre console e arquivo.
    @override
    public void escrever(String mensagem){
        system.out.println("Saida console: " + mensagem)
    }
}