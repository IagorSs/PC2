package questao2;

abstract public class Forma {            
    abstract public double obterArea();
    abstract public double obterVolume() throws NaoExisteVolumeException;
}
