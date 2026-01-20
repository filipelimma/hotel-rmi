import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class GerenciadorQuartosImpl extends UnicastRemoteObject implements GerenciadorQuartos {

    private final int[] totalPorTipo = {10, 20, 5, 3, 2};
    private int[] disponiveisPorTipo = {10, 20, 5, 3, 2};
    private List<String> hospedes = new ArrayList<>();

    protected GerenciadorQuartosImpl() throws RemoteException {
        super();
    }

    @Override
    public synchronized String listagem() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== QUARTOS DISPONÍVEIS ===\n");
        for (int i = 0; i < disponiveisPorTipo.length; i++) {
            sb.append("Tipo ").append(i)
              .append(" -> ").append(disponiveisPorTipo[i])
              .append(" quartos livres\n");
        }
        return sb.toString();
    }

    @Override
    public synchronized String reserva(int tipo, String nome) {
        if (tipo < 0 || tipo > 4) {
            return "Tipo inválido! Escolha de 0 a 4.";
        }
        if (disponiveisPorTipo[tipo] > 0) {
            disponiveisPorTipo[tipo]--;
            hospedes.add(nome);
            return "Reserva realizada com sucesso para " + nome + " no quarto tipo " + tipo + ".";
        } else {
            return "Não há quartos disponíveis do tipo " + tipo + ".";
        }
    }

    @Override
    public synchronized List<String> hospede() {
        return new ArrayList<>(hospedes);
    }
}
