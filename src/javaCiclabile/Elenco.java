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
		if(elementi[index +1 ] == 0) {
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
		elementi = new int[5];
		slots = elementi.length;
		index = 0;
	};
public void addElemento(int nuovoInt) {
	int indexInterno = 0;
// questo ciclo while serve a trovare il primo slot libero
	while(elementi[indexInterno] != 0) {
		if(indexInterno == slots - 1) {
			System.out.println("Non ci sono altri slots liberi.");
			break;
//		Per ciclare la lista e sovrascrivere dai primi, devo dire in questo if
//		che l'indexInterno = 0 e riparte tutto
		} else { indexInterno++;}
	}
		//if(indexInterno != slots - 1) {
		elementi[indexInterno] = nuovoInt;
		/*}else  if(elementi[slots] != 0) {
			elementi[slots] = nuovoInt;
		} else {
			System.out.println("Non ci sono altri slots liberi.");
		}*/
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
