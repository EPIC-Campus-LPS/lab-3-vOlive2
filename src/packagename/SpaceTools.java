package packagename;
import java.lang.Math;
public class SpaceTools {
	public static double travelTime(Planet p, double speed) {
		double d = p.getDistanceFromSun() * 1000000;
		double time = d/speed;
		int hours = (int) time / 60;
		int mins = (int) time % 60;
		time = hours + (mins/100);
		return time;
	}
	
	public static Planet compareDistance(Planet a, Planet b) {
		double d1 = a.getDistanceFromSun();
		double d2 = b.getDistanceFromSun();
		if (d1 >= d2) {
			return a;
		}
		return b;
	}
	public static String abbreviation(Planet p) {
		return (p.getName().substring(0,3).toUpperCase());
	}
	
	public static double orbitTime(Planet p, double speed) {
		double d = p.getDistanceFromSun() * 2;
		double c = d * Math.PI;
		return c/(speed/1000000);
	}
	public static double orbitTime(Planet p) {
		double speed = 100000;
		double d = p.getDistanceFromSun() * 2;
		double c = d * Math.PI;
		return c/(speed/1000000);
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
}
