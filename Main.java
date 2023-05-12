/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class ContaTerminal
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Por favor, digite o seu Nome!");
		String nome = sc.nextLine();
		
		
		System.out.print("Por favor, digite o número da Agência!");
		String agencia = sc.nextLine();
		
		System.out.print("Por favor, digite o número da Conta!");
		int numero = sc.nextInt();
		
			
		System.out.print("Por favor, digite o seu Saldo");
		float saldo = sc.nextFloat();
		
	
		
		System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");              
	}
}
