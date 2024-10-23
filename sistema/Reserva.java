package sistema;
import java.time.LocalDate;

class Reserva {
	Hospede hospede;
	Quartos quarto;
	LocalDate checkIn;
	LocalDate checkOut;
	
	public Reserva(Hospede hospede, Quartos quarto, LocalDate checkIn, LocalDate checkOut) {	
		this.hospede = hospede;
        this.quarto = quarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        quarto.setDisponibilidadeQuarto(false);
	}
	
	public void checkOut() {
        quarto.setDisponibilidadeQuarto(true); // Libera o quarto
    }

	@Override
	public String toString() {
		return "Reserva [hospede=" + hospede + ", quarto=" + quarto + ", checkIn=" + checkIn + ", checkOut=" + checkOut
				+ "]";
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public Quartos getQuarto() {
		return quarto;
	}

	public void setQuarto(Quartos quarto) {
		this.quarto = quarto;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}
	
	
	
	
	
	
}
