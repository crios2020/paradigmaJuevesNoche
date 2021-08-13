import javax.swing.JOptionPane;
public class Paradigma{
	public static void main(String[] args){
		//Punto de entrada del proyecto
		System.out.println("Hola Mundo!");
		
		//Objetos de clase Auto
		System.out.println("-- auto1 --");
		Auto auto1=new Auto();
		auto1.marca = "Ford";
		auto1.modelo = "Ka";
		auto1.color = "Verde";
		auto1.acelerar();		// 10
		auto1.acelerar();		// 20
		auto1.acelerar();		// 30
		auto1.frenar();			// 20
		auto1.acelerar(12);		// 32
		auto1.acelerar(23);		// 55
		//System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.velocidad);
		
		//auto1.imprimirEstado();
		System.out.println(auto1.obtenerEstado());
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto();
		auto2.marca="Fiat";
		auto2.modelo="Idea";
		auto2.color="Rojo";
		for(int a=0;a<=60;a++){
			auto2.acelerar();
		}
		//auto2.velocidad = 1350;
		//System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.color+" "+auto2.velocidad);
		
		//auto2.imprimirEstado();
		System.out.println(auto2.obtenerEstado());
		
		JOptionPane.showMessageDialog(null,auto2.obtenerEstado());
		
	}
}

//declaración de clases
class Auto{
	
	//Atributos 
	String marca;
	String modelo;
	String color;
	private int velocidad;
		
	//Métodos
	void acelerar(){																	//acelerar
		//velocidad=velocidad+10;
		//if(velocidad>100) velocidad=100;
		acelerar(10);		//Llamado a método de la misma clase
	}
	
	void acelerar(int kilometros){			//método con parámetro de entrada			//acelerarInt
		velocidad=velocidad+kilometros;
		if(velocidad>100) velocidad=100;
	}
	
	void acelerar(int km, boolean tieneNitro){											//acelerarIntBoolean
		if(tieneNitro == false){
			acelerar(km);
		} else {
			acelerar(km*2);
		}
	}
	
	//int acelerar(int x){																//acelerarInt
		//método sobrecargado
	//}
	
	int acelerar(String x){																//acelerarString
		//método sobrecargado
		return 0;
	}
	
	void acelerar(String x,String y){													//acelerarStringString
		//método sobrecargado
	}
	
	void frenar(){
		velocidad=velocidad-10;
	}
	
	void imprimirEstado(){
		System.out.println(marca+" "+modelo+" "+color+" "+velocidad);
	}
	
	String obtenerEstado(){
		return marca+" "+modelo+" "+color+" "+velocidad;
	}
	
}//end class


class Combo{
	
	void venderNombre(String nombre){
		vender(nombre, false, "CocaCola");
	}
	
	void venderNombreAgrandado(String nombre, boolean agrandado){
		vender(nombre, agrandado, "CocaCola");
	}
	
	void vender(String nombre, boolean agrandado, String gaseosa){
		/*
			Proceso
			* de
			* Venta!!
		*/
	}
	
}




