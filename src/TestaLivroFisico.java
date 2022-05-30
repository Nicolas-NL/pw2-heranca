
public class TestaLivroFisico {
	public static void main(String[] args) {
		LivroFisico Testa = new LivroFisico();
		Testa.autor = "Ronaldo"; 
		Testa.titulo ="Nunca Antes Visto";
		Testa.categoria ="Esportes";
		Testa.valor= 100.0;
		Testa.aplicarDesconto();
		Testa.getTaxaImpressao();

		
		System.out.println("autor: "+ Testa.autor + "\ntitulo: " + Testa.titulo + "\ncategoria: " + Testa.categoria + "\nvalor: " + Testa.valor + "\nTaxa de Impressão: " + Testa.getTaxaImpressao());
	}

}

