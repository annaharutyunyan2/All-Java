import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean sharunak = true;
		while(sharunak){
			System.out.println("nermucel dzer gumari chape");
			double gumar = sc.nextDouble();
			System.out.println("nermucel taradrami anune");
			String taradram = sc.next();
			double dol = 488.71;
			double rub = 7.47;
			double eur = 554.09;
			double canadianDollar = 370.81;
			switch(taradram){
				case "dollar": 
					System.out.println(gumar/dol);
					break;

				case "ruble":
				System.out.println(gumar/rub);
				break;

				case "euro":
				System.out.println(gumar/eur);
				break;

				case "canadianDollar":
				System.out.println(gumar/canadianDollar);
				break;

				default:
				System.out.println("Nermucel eq taradrami sxal anun");

			}
				boolean sharunak2 = true;
				while(sharunak2){
					System.out.println("Cankanum eq sharunakel? ayo kam voch");
					String patasxan = sc.next();
					if(patasxan.equals("voch")){
						sharunak = false;
						sharunak2 = false;
					}else if(!patasxan.equals("ayo")){
						System.out.println("duq nermucel eq sxal patasxan, nermuceq ayo kam voch");
					}else{
						sharunak2 = false;
					}
			}
		}
	}
}