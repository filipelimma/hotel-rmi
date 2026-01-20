import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Scanner;

public class ClienteHotel {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            GerenciadorQuartos hotel = (GerenciadorQuartos) registry.lookup("HotelService");

            Scanner sc = new Scanner(System.in);

            System.out.println("=== Cliente Hotel RMI ===");

            while (true) {
                System.out.print("\nComando: ");
                String cmd = sc.nextLine();
                String[] partes = cmd.split(" ");

                if (partes[0].equalsIgnoreCase("listagem")) {
                    System.out.println(hotel.listagem());
                }
                else if (partes[0].equalsIgnoreCase("reserva")) {
                    if (partes.length < 3) {
                        System.out.println("Uso: reserva <tipo> <nome>");
                        continue;
                    }
                    int tipo = Integer.parseInt(partes[1]);
                    String nome = partes[2];
                    System.out.println(hotel.reserva(tipo, nome));
                }
                else if (partes[0].equalsIgnoreCase("hospede")) {
                    List<String> h = hotel.hospede();
                    System.out.println("Hóspedes cadastrados:");
                    for (String s : h) System.out.println("- " + s);
                }
                else if (partes[0].equalsIgnoreCase("sair")) {
                    break;
                }
                else {
                    System.out.println("Comando inválido!");
                }
            }

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
