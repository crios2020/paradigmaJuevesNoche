<?php
	echo 'Hola Mundo!<br>';


	class Cuenta{
		private $nro;
		private $moneda;
		private $saldo;
		
		public function Cuenta($nro,$moneda){
			$this->nro = $nro;
			$this->moneda = $moneda;
			$this->saldo = 0;
		}
		
		public function depositar($monto){
			$this->saldo=$this->saldo+$monto;
		}
		
		public function debitar($monto){
			if($this->saldo>=$monto){
				$this->saldo-=$monto;
			} else {
				echo 'No Hay Fondos Suficientes!<br>';
			}
		}
		
		public function getEstado(){
			return $this->nro.' '.$this->moneda.' '.$this->saldo;
		}
	} // end class
	
	echo '-- cuenta1 --<br>';
	$cuenta1=new Cuenta(1,'arg$');
	$cuenta1->depositar(140000);
	$cuenta1->depositar(25000);
	$cuenta1->debitar(80000);
	echo $cuenta1->getEstado().'<br>';
	
	
	class Cliente{
		private $nro;
		private $nombre;
		private $cuenta;
		
		//método constructor
		public function Cliente($nro, $nombre,$nroCuenta){
			$this->nro=$nro;
			$this->nombre=$nombre;
			$this->cuenta=new Cuenta($nroCuenta,'arg$');
		}
		
		public function getCuenta(){
			return $this->cuenta;
		}
		
		public function getEstado(){
			return $this->nro.' '.$this->nombre;
		}
	}// end class
	
	echo '--$cliente1--<br>';
	$cliente1=new Cliente(1, 'Juan', 2);
	//$cliente1->depositar(5000);	//error!
	$cliente1->getCuenta()->depositar(70000);
	echo $cliente1->getEstado().'<br>';
	echo $cliente1->getCuenta()->getEstado().'<br>';
	
	echo '-- Fin del Programa --';
?>
