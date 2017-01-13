package com.Task;
import java.util.*;


public class Composite extends typeTask{

    /** Creates a new instance of ProduitComposite */
   /* public Composite() {
       ArrayList<typeTask> sousTache = new ArrayList<typeTask>();
    } */
	public Composite(String desc){
		this.id=1;
		this.description=desc;
	}

    /** Ajoute un produit à la liste des composants
     * @param produit le produit que l'on veux ajouter au composite
     * @throws ProduitException Si le produit est null.
     */
    public void addSousTache(typeTask ST) {
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

    /** Renvoie la liste des composantes du produit sous la forme d'un itérateur.<p>
     * Voir le pattern itérateur.
     * @return La liste des composantes.
     */
    public Iterator<typeTask> getChildren() {
        assert null != sousTache;
        return sousTache.iterator();
    }

  

    /** Descriptif du produit. Peut être le résultat d'une accumulation de
     * descriptifs si le produit est composé
     * @return  le descriptif composé
     */
   public String getListeTache() {
        assert null != sousTache;

        StringBuffer result = new StringBuffer();
        result.append(" : (");

        for (Iterator<typeTask> i = sousTache.iterator(); i.hasNext(); ) {
            Object objet = i.next();

            assert null != objet : "Un objet null a été trouvé dans la liste des composantes";
            assert objet instanceof typeTask : "Une \"non tache\" a été trouvé dans la liste des composantes";

            typeTask composant = (typeTask)objet;

            result.append(composant.getSousTache()); //j'ai voler du code sur internet, je ne sais pas ce que cest sensé faire mais ca a lair de marcher...
            if (i.hasNext()) { 
                result.append("sous-tache :\n");
            }
        }

        result.append(" )");
        return result.toString();
    }
    private ArrayList<typeTask> sousTache;

}
