package pesquers;

import java.util.Scanner;

	/**
	 * @author      Adrian Bravo <theadrirau@gmail.com>  (nom i correu)
	 */


public class Pesquers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int amplada, llargada;
		int vaixells;
		int llargadaV;
		char orientacio;
		int X, Y;
		boolean correcte;
		
		int nCasos = s.nextInt();
		
		for (int x = 0; x < nCasos; x++)
		{
			correcte = true;
			
			//Demanem amplada i llargada de la zona
			amplada = s.nextInt();
			llargada = s.nextInt();
			
			//Creem el tauler que imprimirem i el tauler de booleans
			//String[][]zona = new String [amplada][llargada];
			boolean[][]zonaB = new boolean [amplada][llargada];
			
			//Demanem numero de vaixells
			vaixells = s.nextInt();
			
			//Inicialitzem la zona a falses per en un futur, saber on hi han vaixells
			for(int i = 0; i < amplada; i++)
			{
				for(int j = 0; j < llargada; j++)
				{
					zonaB[i][j] = false;
				}
			}
			
			//Comencem a col·locar tots els vaixells d'aquest cas
			for (int a = 0; a < vaixells; a++)
			{
				
				llargadaV = s.nextInt();
				orientacio = s.next().charAt(0);
				X = s.nextInt();
				X--;
				Y = s.nextInt();
				Y--;
						
				if (orientacio == 'H' || orientacio == 'h')
				{				
					if(Y > (amplada - llargadaV))
					{
						correcte = false;
					}
						
					//Comprobamos si no hay otro barco en esta posición
					if(correcte == true)
					{
						for(int i = 0; i < llargadaV; i++)
						{
							if (zonaB[X][Y+i] == true)
							{
								correcte = false;
							}
						}
					}			
						
						//Si correcto sigue en true, pintamos el barco
					if (correcte == true)
					{
						for(int i = 0; i < llargadaV; i++)
						{
							zonaB[X][Y+i] = true;
						}
					}				
				}
					
				if (orientacio == 'V' || orientacio == 'v')
				{				
					if(X > (llargada - 4))
					{
						correcte = false;
					}
						
					//Comprobamos si no hay otro barco en esta posición
						
					if (correcte == true)
					{
						for(int i = 0; i < llargadaV; i++)
						{
							if (zonaB[X+i][Y] == true)
							{
								correcte = false;
							}
						}
					}			
						
					//Si correcto sigue en true, pintamos el barco
					if (correcte == true)
					{
						for(int i = 0; i < llargadaV; i++)
						{
							zonaB[X+i][Y] = true;
						}
					}				
				}					
			}
			
			//SORTIDA
			if(correcte == false)
			{
				System.out.println("AQUESTA EMPRESA NO PENSA");
			}else
			{
				for(int i = 0; i < amplada; i++)
				{
					for(int j = 0; j < llargada; j++)
					{
						if (zonaB[i][j] == true)
						{
							if (j > 0)
							{
								System.out.print(" X");
							}else
							{
								System.out.print("X");
							}

						}else
						{
							if (j > 0)
							{
								System.out.print(" ~");
							}else
							{
								System.out.print("~");
							}
						}

					}
					System.out.println();
				}
			}
		}
				
		s.close();
	}
	
	/**
	 * Fem el programa del meu problema del DomJutge (descripció curta)
	 * 
	 * <p>
	 * Fem el for dels casos
	 * Demanem amplada i llargada
	 * Creem el tauler que imprimirem i el tauler de booleans
	 * Inicialitzem la zona a falses per en un futur, saber on hi han vaixells
	 * 
	 * Comencem a col·locar tots els vaixells d'aquest cas (2)
	 * (2) Comprobamos si no hay otro barco en esta posición
	 * (2) Si correcto sigue en true, pintamos el barco
	 * (2) Comprobamos si no hay otro barco en esta posición
	 * (2) Si correcto sigue en true, pintamos el barco
	 * 
	 * Comprovem la sortida, si es correcte tot, imprimim el tauler, si no, imprimim un missatge.
	 * 
	 * <p>
	 */


}
