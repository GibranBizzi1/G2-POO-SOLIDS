public class Principal{

    public static void main(String[] args){
        Remetente Joao = new Remetente("Joao", "519999991")
        Remetente Maria = new Remetente("Maria","51929292")

        Encomenda Enc1 = new Encomenda("GTA 6", 7, Joao)
        Encomenda Enc2 = new Encomenda("ErvaMate", 15, Maria)

        LocalDate hoje = LocalDate.now()
        Central central = new Central()

        Envio primeiro = new(Expresso(Enc1, hoje, 20.0))
        Envio segundo = new(Economico(Enc2, hoje, 25.0))
        Envio terceiro = new(Internacional(Enc1, hoje, 30.0))
        envio quarto = new(SuperExpresso(Enc2, hoje, 40.0))
        central.adicionar(primeiro)
        central.adicionar(segundo)
        central.adicionar(terceiro)
        central.adicionar(quarto)

        try{
            Envio quinto = new(Expresso(Enc1, hoje, -20.0))} //esqueci a formatação
        catch{Throw new PesoNegativoException{
                system.out.println("Invalido" + e.getMessage())
            }
        FechamentoDia = new FechamentoDia(new(SaidaConsole()));
        FechamentoDia.fechar() //faturamento total e o mais caro
        }
    }
}