package javaCiclabile;

public class Elenco {
	private int[] elementi;
	private int index;
	private int slots;
	
	public Elenco(int[] elementi) {
		this.elementi = elementi;
		slots = elementi.length;
		index = 0;
	}
//		METODI
	public int getElementoAttuale() {
		return elementi[index];
	}
	
	public int getElementoSuccessivo() {
		int nextInt = 0;
		if(index == slots - 1) {
			index = - 1;
		}
		nextInt = elementi[index + 1];
		index++;
		return nextInt;
	}
	
	public boolean hasAncoraElementi() {
		return index == slots ? true : false;
	}

//		BONUS
	public Elenco() {
		slots = 5;
		elementi = new int[5];
		index = 0;
	};
public void addElemento(int nuovoInt) {
	int indexInterno = 0;
	while(elementi[indexInterno] != 0) {
		if(indexInterno == slots) {
			System.out.println("Non ci sono altri slots liberi.");
			break;
		}
		indexInterno++;
	}
		if(indexInterno != slots) {
		elementi[indexInterno] = nuovoInt;
	}
	}
	
//		GETTER E SETTER
	public int[] getElementi() {
		return elementi;
	}

	public void setElementi(int[] elementi) {
		this.elementi = elementi;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getSlots() {
		return slots;
	}

	public void setSlots(int slots) {
		this.slots = slots;
	}
//		/GETTER E SETTER
	
	
}
