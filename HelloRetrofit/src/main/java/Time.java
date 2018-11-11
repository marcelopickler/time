public class Time {

	private String nome;
	private String Altura;
	private String Golpe;
	private int id;

	@Override
	public String toString() {
		return "Time [id=" + id + ", nome=" + nome + ", Golpe=" + Golpe + ", Altura=" + Altura + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGolpe() {
		return Golpe;
	}

	public void setGolpe(String Golpe) {
		this.Golpe = Golpe;
	}

	public String getAltura() {
		return Altura;
	}

	public void setEstadio(String Altura) {
		this.Altura = Altura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
