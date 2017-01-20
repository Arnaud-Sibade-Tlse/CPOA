package defaut;

import java.util.Scanner;

import com.Projet.ListProjet;
import com.action.action;
import com.action.actionAddProject;
import com.action.actionAddSubTask;
import com.action.actionAddTask;
import com.action.actionCheck;
import com.action.actionShow;
import com.action.actionUnCheck;

public class main {
	
	public static ListProjet liste = new ListProjet();
	private static action a1 = new actionAddProject();
	private static action a2 = new actionAddTask();
	private static action a3 = new actionCheck();
	private static action a4 = new actionUnCheck();
	private static action a5 = new actionShow();
	private static action a6 = new actionAddSubTask();


	public static void afficherMenu() {

			System.out.println("1 - "+ a1.actionMessage());
			System.out.println("2 - "+ a2.actionMessage());
			System.out.println("3 - "+ a6.actionMessage());
			System.out.println("4 - "+ a3.actionMessage());
			System.out.println("5 - "+ a4.actionMessage());
			System.out.println("6 - "+ a5.actionMessage());
			System.out.println("7 - Quitter");
			System.out.print("Choix -> ");
		}
		
	public static void tempo () {
			Scanner lect ;
			
			lect = new Scanner (System.in );
			
			System.out.print("Tapper un car + return pour continuer ... ");
			lect.next();
	}
	
	
	public static void main(String[] args) throws Exception {
		
		String choix;

		boolean continuer ;
		Scanner lect;
		
		lect = new Scanner ( System.in );

		continuer = true;
		while (continuer) {
			afficherMenu();
			choix = lect.next();
			choix = choix.toLowerCase();
			switch (choix) {
				case "1" :
					a1.execute();
					break;
				case "2" :
					a2.execute();
					break;
				case "3" :
					a6.execute();
					break;
				case "4" :
					a3.execute();
					break;
				case "5" :
					a4.execute();
					break;
				case "6" :
					a5.execute();
					break;
				case "7" :
					System.out.println("Au revoir");
					tempo();
					continuer = false;
					break;
				default :
					System.out.println("Ce choix est incorrect !" );
					break;
			}
		}

	}

}
