package sistema;

public class Quartos {
    int codQuarto;
    private String tipoQuarto;
    private double precoDiarioQuarto;
    boolean disponibilidadeQuarto;

    // Construtor
    public Quartos(int codQuarto, String tipoQuarto, double precoDiarioQuarto) {
        this.codQuarto = codQuarto;
        this.tipoQuarto = tipoQuarto;
        this.precoDiarioQuarto = precoDiarioQuarto;
        this.disponibilidadeQuarto = true; // Quarto está disponível por padrão
    }
    
    
    

    // Getters e Setters
    public int getCodQuarto() {
        return codQuarto;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public double getPrecoDiarioQuarto() {
        return precoDiarioQuarto;
    }

    public boolean isDisponivel() {
        return disponibilidadeQuarto;
    }

    public void setDisponibilidadeQuarto(boolean disponibilidadeQuarto) {
        this.disponibilidadeQuarto = disponibilidadeQuarto;
    }

    @Override
    public String toString() {
        return "Quarto [Número: " + codQuarto + ", Tipo: " + tipoQuarto + 
               ", Preço Diário: R$" + precoDiarioQuarto + 
               ", Disponível: " + (disponibilidadeQuarto ? "Sim" : "Não") + "]";
    }
}
