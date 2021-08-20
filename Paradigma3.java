public class Paradigma3{
	public static void main(String[] args){
		
		Auto.acelerar();
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto("Ford","Ka","Azul");
		Auto.acelerar();
		Auto.acelerar();
		System.out.println(auto1.getEstado());
		System.out.println(Auto.getVelocidad());
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto("Fiat","Toro","Blanco");
		Auto.acelerar();
		System.out.println(auto2.getEstado());
		System.out.println(Auto.getVelocidad());
			
	}
	
}

class Auto{
	private String marca;
	private String modelo;
	private String color;
	private static int velocidad;
	
	public Auto(String marca, String modelo, String color){
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
	}
	
	public static void acelerar(){
		velocidad=velocidad+10;
	}
	
	public static void frenar(){
		velocidad=velocidad-10;
	}
	
	public static int getVelocidad(){
		return velocidad;
	}
	
	public String getEstado(){
		return marca+" "+modelo+" "+color;
	}
	
}
