import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        print(myObjs);
        copy(myDoubles, myObjs);
        print(myObjs);
    }

    // O método recebe duas listas: uma lista de qualquer tipo que "extends" o tipo
    // Number
    // (Integer, Byte, Long, Short, Double, Float) e também uma lista de qualquer
    // tipo Number ou qualquer supertipo deste (Number ou Object).
    public static void copy(List<? extends Number> origem, List<? super Number> destino) {

        // For percorre a lista de origem e adiciona os objs presentes na mesma na lista
        // de destino
        for (Number numb : origem) {
            destino.add(numb);
        }

    }

    //Metodo que recebe como parametro uma lista de um tipo curinga <?>
    public static void print(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }
}
