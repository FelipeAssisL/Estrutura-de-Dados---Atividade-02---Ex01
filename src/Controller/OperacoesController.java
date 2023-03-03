package Controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public int Soma(int num) {
		if(num <= 0) { // CONDIÇÃO DE PARADA QUANDO N FOR <= 0
			return 0;
		}else{
			return num + Soma(num-1); // CHAMADA DA FUNÇÃO EM RELAÇÃO A N + A FUNÇÃO DECREMENTANDO N EM 1
		}
	}

}
