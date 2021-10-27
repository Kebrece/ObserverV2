public class Grafico  extends Archivo implements EventListener
{

    @Override
    public void update(String nombre)
    {
        System.out.println(nombre + "aplicamos en "+getNombre());
    }

    public Grafico(int id, String nombre)
    {
        super(id, nombre);
    }
}
