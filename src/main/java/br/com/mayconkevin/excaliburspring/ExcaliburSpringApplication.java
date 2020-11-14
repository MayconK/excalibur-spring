package br.com.mayconkevin.excaliburspring;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mayconkevin.excaliburspring.domain.Tenno;
import br.com.mayconkevin.excaliburspring.domain.Warframe;
import br.com.mayconkevin.excaliburspring.mechanics.Mathematical;


@SpringBootApplication
public class ExcaliburSpringApplication {

	private static Warframe warframe;
	
	static ArrayList<String[]> subsumingLists = new ArrayList<>();
	
	public static void main(String[] args) {
		SpringApplication.run(ExcaliburSpringApplication.class, args);
		
		System.out.println("Hello World! Tenno.");
		
		Build masterBuildWarframe = new Build();
		masterBuildWarframe.aura = new Mod("Spring Boost");
		
		mostraCalc(masterBuildWarframe);
		
//		MASTER BUILD WARFRAME
//		AURA,EXILUS
//		SLOT1,
//		SLOT2,
//		SLOT3,
//		SLOT4,
//		SLOT5,
//		SLOT6,
//		SLOT7,
//		SLOT8.
		
		ArrayList<Warframe> list = new ArrayList<Warframe>();

		list.add( new Warframe("Ash") );
		list.add( new Warframe("Ember"));
		list.add( new Warframe("Excalibur", 100, 100, 300, 150, 1.00) );
		list.add( new Warframe("Loki") );
		list.add( new Warframe("Mag") );
		list.add( new Warframe("Rhino") );
		list.add( new Warframe("Trinity") );
		list.add( new Warframe("Volt") );
		list.add( new Warframe("Excalibur Prime") );
		
		Tenno Nivek = new Tenno();
		Nivek.setList( list );
		Nivek.getList().add( list.get(2) );
		
		warframe = Nivek.getList().get(0);
		
		//helminth.Subsuming("Zephyr");
		//helminth.Subsuming("Chroma");

		

		
		String[] subList = new String[2];
		subList[0] = "ASH";
		subList[1] = "FORGE";
		
		subsumingLists.add( subList );

		System.out.println( subsumingLists.get(0).length );
		
		System.out.println( subsumingLists.get(0)[0] );
		
		//lists.subsumingList.get().add("ASH", "FORGE");

		addSubsuming("BANSHEE", "SUBSUMING");
		addSubsuming("CHROMA", "DONE");
		addSubsuming("EMBER", "DONE");
		addSubsuming("TITANIA", "DONE");
		addSubsuming("ZEPHYR", "DONE");
		addSubsuming("NYX", "WAITING");
		addSubsuming("LIMBO", "WAITING");
		addSubsuming("NEZHA", "WAITING");
		addSubsuming("NIDUS", "WAITING");
		addSubsuming("OBERON", "WAITING");
		addSubsuming("VOLT", "WAITING");
		addSubsuming("KHORA", "FORGE");
		addSubsuming("NEKROS", "FORGE");
		addSubsuming("VAUBAN", "FORGE");
		addSubsuming("WUKONG", "FORGE");
		addSubsuming("ATLAS", "CRAFTING");
		addSubsuming("EQUINOX", "CRAFTING");
		addSubsuming("GAUSS", "CRAFTING");
		addSubsuming("IVARA", "CRAFTING");
		addSubsuming("BARUUK", "?");
		addSubsuming("EXCALIBUR", "?");
		addSubsuming("FROST", "?");
		addSubsuming("GARA", "?");
		addSubsuming("GARUDA", "?");
		addSubsuming("GRENDEL", "?");
		addSubsuming("HARROW", "?");
		addSubsuming("HILDRYN", "?");
		addSubsuming("HYDROID", "?");
		addSubsuming("INAROS", "?");
		addSubsuming("LOKI", "?");
		addSubsuming("MAG", "?");
		addSubsuming("MESA", "?");
		addSubsuming("MIRAGE", "?");
		addSubsuming("NOVA", "?");
		addSubsuming("OCTAVIA", "?");
		addSubsuming("PROTEA", "?");
		addSubsuming("REVENANT", "?");
		addSubsuming("RHINO", "?");
		addSubsuming("SARYN", "?");
		addSubsuming("TRINITY", "?");
		addSubsuming("VALKYR", "?");
		addSubsuming("WISP", "?");
		addSubsuming("XAKU", "?");

		// Using Scanner for Getting Input from User 
        Scanner in = new Scanner(System.in); 
		String opcao;
		while (true) {
			System.out.println(" [1] Módulo Subsumissão"
						   + "\n [2] Módulo Eficiência de Vida");
			System.out.print("Digite o menu correspondente: ");
			
			opcao = in.nextLine();

			if (!isOpcao(opcao)) System.out.println(" Opção inválida!");
			else {
				
				switch (opcao) {
				case "1":
					System.out.println("Opção selecionada 1 - Verificando Módulo de Submissão");
					checkSubsuming();
					listSubsumingDone();
					listSubsumingWaiting();
					listSubsumingForge();
					break;
				case "2":
					System.out.println("Opção selecionada 2 - Verificando Módulo EHP");
					calcAteQuandoAguentoApanha(550, 225);
					betterArmorOrHealth(550, 225);

				default:
					System.out.println("Opção inválida!");
					break;
				}
			}
		}
		/*
		
		
		*/
	}
	
	private static boolean isOpcao(String opcao) {
		if (isNumber(opcao))
			return true;
		return false;
		 
	}
	private static boolean isNumber(String s) {
		if (s == null) return false;
		try {
			Double.parseDouble(s);
		} catch (Exception e) {
			//System.out.println("Erro: " +e);
			return false;
		}
		return true;
	}
	
	
	private static void calcAteQuandoAguentoApanha(Integer health, Integer armor) {
		Integer dano = 100;
		
		System.out.println(" -- CALCULANDO O QUANTO VOCÊ CONSEGUE APANHAR --");
		
		System.out.println("Você declarou que tem: " + health + " de vida!");
		System.out.println("Você declarou que tem: " + armor + " de armadura!");
		System.out.printf("Sua redução de dano é: %.2f", Mathematical.damageReduction(armor)*100 ); System.out.println("%");
		System.out.println("Você possui o equivalente em: " + Mathematical.effectiveHealth(health, armor) + " de vida.");
		System.out.println("Sua armadura proporcionou +" + (Mathematical.effectiveHealth(health, armor)/health*100) + "% (" + Mathematical.eHPMultiplier(armor) + "x) de vida.");
		System.out.println("\nHORA DA PAULADA!");
		System.out.println(dano + " de dano - Tamaho da paulada que vc tá levando!");
		System.out.println(Mathematical.effectiveHealth(health, armor)/dano + "x < Você aguenta esse tanto de paulada!");
		System.out.println();
	}
	
	private static void betterArmorOrHealth(Integer baseHealth, int baseArmor) {
		double calcVitality = Mathematical.effectiveHealth((int) (baseHealth*4.4+baseHealth*3), baseArmor);
		double calcSteelFiber = Mathematical.effectiveHealth(baseHealth*3, (int) (baseArmor*2.1));
		
		System.out.println("Vida equivalente usando Vitality: " + calcVitality);
		System.out.println("Vida equivalente usando Steel Fiber: " + calcSteelFiber);
		
	}
	
	private static void addSubsuming(String name, String status) {
		String[] subList = new String[2];
		subList[0] = name;
		subList[1] = status;
		
		subsumingLists.add( subList );
	}
	
	private static void checkSubsuming() {
		int done = 0, waiting = 0, subsuming, crafting = 0, forge = 0, total = 0;
		String subsumingWarframe = "";
		
		
		System.out.println(" -- CHECKING SUBSUMING --");
		
		for (int i = 0; i < subsumingLists.size(); i++) {
			if( subsumingLists.get(i)[1].equals("DONE") )
				done++;
			if( subsumingLists.get(i)[1].equals("WAITING") )
				waiting++;
			if( subsumingLists.get(i)[1].equals("CRAFTING") )
				crafting++;
			if( subsumingLists.get(i)[1].equals("FORGE") )
				forge++;
			if( subsumingLists.get(i)[1].equals("SUBSUMING") )
			subsumingWarframe = subsumingLists.get(i)[0];
			if( !subsumingLists.get(i)[1].equals(null) )
				total++;
		}

		System.out.println("Subsuming warframe: " + subsumingWarframe);
		System.out.println("Subsuming done: " + done + "/" + subsumingLists.size() );
		if( !subsumingWarframe.equals("") ) done++;
		System.out.println("Waiting for Subsuming: " + waiting + "/" + (subsumingLists.size()-done) );
		System.out.println("Waiting forge done: " + forge + "/" + (subsumingLists.size()-done-waiting) );
		System.out.println("Crafting parts: " + crafting + "/" + (subsumingLists.size()-done-waiting-forge) );
		System.out.println(" -- END CHECK --" + "" + "\n");
	}

	private static void listSubsumingDone() {
		System.out.println(" -- LISTING DONE SUBSUMINGS --");
		for (int i = 0; i < subsumingLists.size(); i++) {
			if( subsumingLists.get(i)[1].equals("DONE") )
				System.out.println( " " + subsumingLists.get(i)[0]);
		}
		System.out.println(" -- END LIST --\n");
	}
	
	private static void listSubsumingWaiting() {
		System.out.println(" -- LISTING WARFRAMES WAITING FOR SUBSUMING --");
		for (int i = 0; i < subsumingLists.size(); i++) {
			if( subsumingLists.get(i)[1].equals("WAITING") )
				System.out.println( " " + subsumingLists.get(i)[0]);
		}
		System.out.println(" -- END LIST --\n");
	}
	
	private static void listSubsumingForge() {
		System.out.println(" -- LISTING WARFRAMES IN FORGE FOR SUBSUMING --");
		for (int i = 0; i < subsumingLists.size(); i++) {
			if( subsumingLists.get(i)[1].equals("FORGE") )
				System.out.println( " " + subsumingLists.get(i)[0]);
		}
		System.out.println(" -- END LIST --\n");
	}
		
		//subsumingLists.add("teste", "teste")
		/*
		
		
		
	}
	
	/*	3 x Trocáveis Mod, Item, Platinum
	 *   Equipamento > Item > 
	 *   						Tipo, Nome, Nível Máximo
	 *  
	Categoria Warframe
		Lista
		 * Mod
		 * Estado
		 
	Ex.
	Blind Rage | OK
	 */
	
	
	private static void mostraCalc(Build build) {
		System.out.println(" -- CARREGANDO A BUILD ... -- ");
		System.out.println("    . . .");
		System.out.println(" -- BUILD CARREGADA COM SUCESSO ! -- ");
		System.out.println(" -- MODS ENCONTRADOS -- ");

		System.out.println("   SLOT AURA: " + build.aura.name);
		System.out.println(" SLOT EXILUS: " + build.exilus);
		System.out.println("      SLOT 1: " + build.slot1);
		System.out.println("      SLOT 2: " + build.slot2);
		System.out.println("      SLOT 3: " + build.slot3);
		System.out.println("      SLOT 4: " + build.slot4);
		System.out.println("      SLOT 5: " + build.slot5);
		System.out.println("      SLOT 6: " + build.slot6);
		System.out.println("      SLOT 7: " + build.slot7);
		System.out.println("      SLOT 8: " + build.slot8);
	}
	/*
	private static void ExaltedBlade() {
		Integer damage = 250;
		
		calculaModsWarframe(  ) {
			powerDrift.calculo();
		}
	}
	
	powerDrift() {
		warframe.setStrenght( warframe.getStrenght()  + 15);
	}
	
	umbralIntensify() {
		warframe.setStrenght( warframe.getStrenght()  + 44);
	}
	
	blindRage() {
		warframe.setStrenght( warframe.getStrenght()+99 );
		warframe.setEfficiency( warframe.getEfficiency()-55 );
	}

	
	umbralIntensify() {
		warframe.setStrenght( warframe.getStrenght()  + 44);
	}
	
	private static void x() {
		System.out.println("Dano por tiro: " + total / tiroMultiplo);
		System.out.println("Dano Total em Infestado: " + calculaDanoInfestado() );
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
	*/
	
	private static void calculaModsWarframe() {
		
		Build build;
		
		
	}
	
	
}

class Mod {
	public String name;
	
	public Mod(String name) {
		this.name = name;
	}
	
}

class Build {
	
	public Mod aura;
	public Mod exilus;
	
	public Mod slot1;
	public Mod slot2;
	public Mod slot3;
	public Mod slot4;
	public Mod slot5;
	public Mod slot6;
	public Mod slot7;
	public Mod slot8;
	
	public Build() {}
}

