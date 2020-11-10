package br.com.mayconkevin.excaliburspring;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mayconkevin.excaliburspring.domain.Tenno;
import br.com.mayconkevin.excaliburspring.domain.Warframe;


@SpringBootApplication
public class ExcaliburSpringApplication {

	private static Warframe warframe;
	
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
		Nivek.getList().add( list.get(2) );
		
		warframe = Nivek.getList().get(0);
		
	}
	
	
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

