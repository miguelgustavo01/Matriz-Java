package application;  //Programa para estudar o uso de matriz, o programa irá construir uma matriz quadrada que o usuario decidir, mostrará a diagonal principal
                      // e tambem quantos numeros negativos existe nela.
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Qual vai ser o tamanho da matriz? ");
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int[][] mat = new int[n][n];  //criação de uma matriz com N numero de linha N numero de coluna
		
		System.out.println("Informe os "+n +" numeros consecutivos ");
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {   //São necessarios 2 for para criar uma matriz, um le a coluna outro le as linhas
				mat[i][j]= sc.nextInt();
			}
		}
		
		
		System.out.println("Main diagonal: ");
		for(int i=0; i<mat.length; i++ ) {
			System.out.print(mat[i][i]+" ");
		}
		System.out.println();
		
		int count=0;
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length; j++) {   
				if (mat[i][j] <0) {    //Testando se tem algum numero negativo na matriz
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers: "+count);
		
		
		
		sc.close();
	}

}
