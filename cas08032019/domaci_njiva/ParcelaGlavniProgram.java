package domaci0803;

public class ParcelaGlavniProgram {

	public static void main(String[] args) {

		Parcela [] parcela= new Parcela[5];
		
		
		
		Njiva n1=new Njiva(33, 15);
		parcela [0]=n1;
		Njiva n2= new Njiva(78, 15);
		parcela[1]=n2;
		Suma s1= new Suma(200,4,6,3);
		parcela[2]=s1;
		
		
		Suma s2= new Suma(150, 4, 6, 3);
		parcela[3]=s2;
		
		
		for(int i=0;i<parcela.length;i++) {
			if(parcela[i]==null)continue;
			System.out.println(parcela[i].prinos(3));
			
		}
	}

}
