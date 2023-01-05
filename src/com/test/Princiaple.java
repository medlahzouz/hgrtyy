package com.test;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.exemple.Utils.HibernateUtils;
import com.ismo.crjj.model.Produit;

public class Princiaple {

	public static void afficheProduits(List<Produit> pr) {
		for (Produit p : pr)
			System.out.println(p);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Session session = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = session.beginTransaction();

		/*************** Requete 1 ***************/
		List<Produit> prds = session.createNamedQuery("q1").getResultList();
		System.out.println("-------------- Requete 1 --------------");
		afficheProduits(prds);
		
		/*************** Requete 2 ***************/
		prds = session.createNamedQuery("q2").getResultList();
		System.out.println("-------------- Requete 2 --------------");
		afficheProduits(prds);
		
		/*************** Requete 3 ***************/
		prds = session.createNamedQuery("q3").getResultList();
		System.out.println("-------------- Requete 3 --------------");
		afficheProduits(prds);
		
		/*************** Requete 4 ***************/
		List<Object[]> res= session.createNamedQuery("q4").getResultList();
		System.out.println("-------------- Requete 4 --------------");
		for(Object[] o : res) {
			System.out.println(o[0] + " - " + o[1] + " - " + o[2]);
		}

		/*************** Requete 5 ***************/
		System.out.print("Donner une famille : ");
		String famille = sc.nextLine();
		prds = session.createNamedQuery("q5")
				.setParameter("fam", famille)
				.getResultList();
		System.out.println("-------------- Requete 5 --------------");
		afficheProduits(prds);
		
		/*************** Requete 7 ***************/
		System.out.print("Donner une famille : ");
		famille = sc.nextLine();
		int nb = session.createNamedQuery("q7")
				.setParameter("fam", famille)
				.executeUpdate();
		System.out.println("-------------- Requete 7 --------------");
		System.out.println("Le nombre de lignes modifiees est : " + nb);
		
		
		
		t.commit();
		session.close();
	}
}
