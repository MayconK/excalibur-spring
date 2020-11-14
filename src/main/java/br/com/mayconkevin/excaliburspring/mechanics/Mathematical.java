package br.com.mayconkevin.excaliburspring.mechanics;

public class Mathematical {

	public static double damageReduction(double netArmor) {
		return netArmor / (netArmor+300);
	}
	
	public static Integer effectiveHealth(Integer health, int netArmor) {
		return  health * (netArmor+300)/300 ;
	}
	
	public static Double eHPMultiplier(int netArmor) {
		return ( (double)(netArmor)+300 ) /300 ;
	}
}
