
public class nombre {
	public static void main(String[] args) {

	int numero_a;
		int numero_b;
		int numero_c;
		int elmayor;
	

		Scanner teclado = new Scanner(System.in);//
		System.out.printf("introduzca numero");
		numero_a =teclado.nextInt();

		Scanner tecladox = new Scanner(System.in);
		System.out.printf("introduzca numero");
		numero_b =tecladox.nextInt();

		Scanner tecladoy = new Scanner(System.in);//
		System.out.printf("introduzca numero");
		numero_c =teclado.nextInt();

		 if(numero_a>numero_b)
			
		      if( numero_a>numero_c )
		    	  elmayor=numero_a;  		
		      else
		          elmayor=numero_c;
		 else
			 if(numero_b>numero_c)
				 elmayor=numero_b;
			 else
				 elmayor=numero_c;
			System.out.printf("El mayor es:"+elmayor);
		 

	}
	}

