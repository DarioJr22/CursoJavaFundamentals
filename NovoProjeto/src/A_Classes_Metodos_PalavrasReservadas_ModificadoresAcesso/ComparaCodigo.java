package A_Classes_Metodos_PalavrasReservadas_ModificadoresAcesso;

import java.util.Comparator;

public class ComparaCodigo implements Comparator<Cliente> {
    @Override
    public int compare(Cliente c1, Cliente c2){
        return Double.compare(c1.getCodigo(),c2.getCodigo());
    }
}
