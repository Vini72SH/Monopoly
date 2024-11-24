package Nucleo.Atributos;
import Nucleo.Atributos.Casa;
import Nucleo.Atributos.Jogador;

public class Propriedades extends Casa {
    private boolean temDono;
    private Jogador dono;
    private int valor;

    public void setDono(Jogador novoDono) {
        this.temDono = true;
        this.dono = novoDono;
    }

    public void removeDono() {
        this.temDono = false;
        this.dono = null;
    }
}

final class Imovel extends Propriedades {
    public Imovel(int id) {
        this.id = id;
        this.tipo = Config.tipoImovel;
    }
}

final class Empresa extends Propriedades {
    public Empresa(int id) {
        this.id = id;
        this.tipo = Config.tipoEmpresa;
    }
}