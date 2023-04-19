package E_Collections;
import A_Classes_Metodos_PalavrasReservadas_ModificadoresAcesso.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class ExercicioColecoes {

    public static void main(String args[]){
        getSex();
    }

    public static void getSex(){
        List<Pessoa> data = new ArrayList<Pessoa>();

        Pessoa pessoa1 = new Pessoa("Ester",20,"F");
        Pessoa pessoa2 = new Pessoa("Tchetheume",19,"M");
        Pessoa pessoa3 = new Pessoa("Dario",22,"M");
        Pessoa pessoa4 = new Pessoa("Kerol",24,"F");
        Pessoa pessoa5 = new Pessoa("Tchoice",26,"F");

        data.add(pessoa1);
        data.add(pessoa2);
        data.add(pessoa3);
        data.add(pessoa4);
        data.add(pessoa5);

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        for(Pessoa i:data){
            if(i.getSexo() == "F") {
                feminino.add(i.getNome());
            }else{
                masculino.add(i.getNome());
            }
        }

        System.out.println("Homens: " + masculino);
        System.out.println("Mulheres: " + feminino);


    }

}
