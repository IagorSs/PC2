package questao2;


abstract public class FormaBidimensional extends Forma{

    public FormaBidimensional() {
        super();
    }
    
    @Override
    public double obterVolume() throws NaoExisteVolumeException{
        throw new NaoExisteVolumeException();
    }
}
