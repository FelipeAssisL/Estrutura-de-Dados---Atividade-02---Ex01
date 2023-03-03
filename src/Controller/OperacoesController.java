package Controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public int Soma(int num) {
		if(num <= 0) {
			return 0;
		}else{
			return num + Soma(num-1);
		}
	}

}
