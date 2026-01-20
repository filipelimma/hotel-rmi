import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorHotel {
    public static void main(String[] args) {
        try {
            GerenciadorQuartosImpl gerenciador = new GerenciadorQuartosImpl();

            Registry registry = LocateRegistry.createRegistry(1099);

            registry.rebind("HotelService", gerenciador);

            System.out.println("Servidor do Hotel está no ar!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
