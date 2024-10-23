package sistema;

class Hospede {
	String nomeHospede;

	
	
	
	@Override
	public String toString() {
		return "Hospede [nomeHospede=" + nomeHospede + "]";
	}

	public String getNomeHospede() {
		return nomeHospede;
	}

	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}



	public Hospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}
	
	
}
