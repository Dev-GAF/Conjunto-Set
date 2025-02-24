package conjunto;

public class Programa
{
    public static void main (String[] args)
    {
        try
        {
            Conjunto<String> a1 = new Conjunto<String>(10);
            a1.inclua("C");
            a1.inclua("C++");
            a1.inclua("Java");
            //a1.inclua(7); // erro

            /*Conjunto<String> a2 = new Conjunto<String> (8);
            a2.inclua("Azul");
            a2.inclua("Vermelho");
            a2.inclua("Verde");
            //a2.inclua(11); // erro

            Conjunto<Integer> b = new Conjunto <Integer> (10);
            b.inclua(2);
            b.inclua(3);
            b.inclua(5);
            //b.inclua("Amarelo"); // erro

            Conjunto<Data> c = new Conjunto<Data> ();
            Data niverMaligno = new Data ((byte)19,(byte)1,(short)1966);
            c.inclua(niverMaligno);
            niverMaligno.setAno((short)1976);
            c.inclua(new Data ((byte)25,(byte)12,(short)2024));
            //c.inclua("Python"); // erro
            //c.inclua(22); // erro

            Conjunto<Conjunto<String>> d = new Conjunto<Conjunto<String>> ();
            d.inclua(a1);
            d.inclua(a2);
            //d.inclua(new Data ((byte)25,(byte)12,(short)2024)); // erro
            //d.inclua("Kotlin"); // erro
            //d.inclua(22); // erro

            Conjunto<Object> e = new Conjunto<Object> ();
            e.inclua("Javascript");
            e.inclua(new Data ((byte)19,(byte)1,(short)1966));
            e.inclua(13);
            e.inclua(a1);*/
        }
        catch (Exception erro)
        {
            System.err.println (erro.getMessage());
        }
    }
}

