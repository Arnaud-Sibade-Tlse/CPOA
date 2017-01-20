package com.Task;
import java.util.*;


public class Taches extends typeTask{
	
    public ArrayList<Taches> sousTache = new ArrayList<Taches>();


    /** Creates a new instance of ProduitComposite */

	public Taches(String desc,int id){
		this.id=id;
		this.description=desc;
	}

    /** Ajoute un produit à la liste des composants
     * @param produit le produit que l'on veux ajouter au composite
     * @throws ProduitException Si le produit est null.
     */
    public void addSousTache(Taches ST) {
        assert null != sousTache;
        if(ST.getClass().getName()=="sousTache"){
        	System.out.println("Impossible d'ajouter une sous-tache a une sousTache");
        } else {
        	sousTache.add(ST);
        }
    }

    /** Enlève un produit de la composition.
     * @param produit le produit à retirer de la composition.
     * @throws ProduitException Si le produit est null ou n'est pas dans la liste.
     */
    public void remove(typeTask maTache){
        assert null != sousTache;
        boolean bNull = false;
        boolean bInexist = false;
        if (null == maTache) {
            System.out.println("Impossible d'enlever un produit null");
            bNull=true;
        }

        if ( ! sousTache.contains(maTache)) {
            System.out.println("Impossible d'enlever le produit, il n'est pas dans la liste");
            bInexist=true;
        }
        if(bNull==false && bInexist==false){
        	sousTache.remove(maTache);
        }
    }


   
   public String toString(){
   	String maTache = "";
   	maTache+="[";
   	if(done==true){ maTache += "x"; }
   	else { maTache += " ";}
   	maTache+="] "+getId()+" : "+getDescription();
   	return maTache;
   }

}
