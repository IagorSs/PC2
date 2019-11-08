package questao2;


//Não é interface, isso aqui ta errado, deletar depois
public class NaoExisteVolumeException extends Exception{

    public NaoExisteVolumeException() {
        super("Não existe volume nesta forma");
    }
}
