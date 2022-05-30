
public class TestaEBook {
	public static void main(String[] args) {
		EBook Testa = new EBook();
		Testa.autor = "Ronaldo"; 
		Testa.titulo ="Nunca Antes Visto";
		Testa.categoria ="Esportes";
		Testa.valor= 50.0;
		Testa.aplicarDesconto();
		
		System.out.println("autor: "+ Testa.autor + " titulo: " + Testa.titulo + " categoria: " + Testa.categoria + " valor: " + Testa.valor );
	}

}
