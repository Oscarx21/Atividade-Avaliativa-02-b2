package sistema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Hotel {
	List<Quartos> quartos = new ArrayList<>();
    List<Reserva> reservas = new ArrayList<>();
    
    public void cadastrarQuarto(int codQuarto, String tipoQuarto, double preco) {
        Quartos quarto = new Quartos(quartos.size() + 1, tipoQuarto, preco);
        quartos.add(quarto);
    }
    
    public void listarQuartos() {
        if (quartos.isEmpty()) {
            System.out.println("Não há quartos cadastrados.");
        } else {
            System.out.println("\n----- Lista de Quartos -----");
            for (Quartos quarto : quartos) {
                System.out.println(quarto); // Exibe a string retornada pelo método toString da classe Quarto
            }
        }
    }

    
    public void cadastrarReserva(Hospede hospede, int codQuarto, LocalDate checkIn, LocalDate checkOut) {
    	
        for (Quartos quarto : quartos) {
        	
            if (quarto.codQuarto == codQuarto && quarto.disponibilidadeQuarto) {
                Reserva reserva = new Reserva(hospede, quarto, checkIn, checkOut);
                reservas.add(reserva);
                System.out.println("Reserva realizada com sucesso!");
                return;
            }
        }
        System.out.println("Quarto indisponível.");
    }

    public void listarReservas() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
    
 // Realizar check-in
    public void realizarCheckIn(Hospede hospede, int numeroQuarto) {
        for (Reserva reserva : reservas) {
            if (reserva.quarto.codQuarto == numeroQuarto && reserva.hospede.nomeHospede.equals(hospede.nomeHospede) && reserva.quarto.disponibilidadeQuarto) {
                reserva.quarto.setDisponibilidadeQuarto(false);
                System.out.println("Check-in realizado com sucesso!");
                return;
            }
        }
        System.out.println("Reserva não encontrada ou quarto já ocupado.");
    }

    // Realizar check-out
    public void realizarCheckOut(int numeroQuarto) {
        for (Reserva reserva : reservas) {
            if (reserva.quarto.codQuarto == numeroQuarto && !reserva.quarto.disponibilidadeQuarto) {
                reserva.checkOut();
                System.out.println("Check-out realizado com sucesso!");
                return;
            }
        }
        System.out.println("Check-out não pode ser realizado. Verifique o número do quarto.");
    }
    
 // Histórico de reservas por hóspede
    public void exibirHistoricoReservas(String nomeHospede) {
        for (Reserva reserva : reservas) {
            if (reserva.hospede.nomeHospede.equals(nomeHospede)) {
                System.out.println(reserva);
            }
        }
    }
    
    
}
