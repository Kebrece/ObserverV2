public class Principal {
    public static void main(String[] args)
    {
        HojaCalculo newHoja = new HojaCalculo(1, "HojaCalculo1");

        newHoja.subscribe(new TablaDinamica(2, "tabla2"));
        newHoja.subscribe(new TablaDinamica(3, "tabla3"));
        newHoja.subscribe(new TablaDinamica(4, "tabla4"));
        newHoja.subscribe(new TablaDinamica(5, "tabla5"));

        newHoja.subscribe(new Grafico(21, "Grafico 21"));
        newHoja.subscribe(new Grafico(22, "Grafico 22"));
        newHoja.subscribe(new Grafico(23, "Grafico 23"));

        Grafico gf = new Grafico(24, "Grafico 24");
        newHoja.subscribe(gf);

        newHoja.deleteData();

        newHoja.unsubscribe(gf);

        newHoja.modifyData("HojaCalculo1");

    }
}
