public class Gerente implements Registrar{
    private arraylist<Envio> envios = new arraylist<>(); 

    @override
    public void adicionar(Envio e){
        envios.add(e)
    }
}