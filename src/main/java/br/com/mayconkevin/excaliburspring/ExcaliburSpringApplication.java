package br.com.mayconkevin.excaliburspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ExcaliburSpringApplication {

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

