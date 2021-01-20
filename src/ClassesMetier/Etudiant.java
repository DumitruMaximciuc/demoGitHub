/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author maxim
 */
public class Etudiant 
{
    private int nrEtudiant;
    private String prenom;
    private int age;
    
    public Etudiant(int nrEtudiant, String prenom, int age)
    {
        this.nrEtudiant=nrEtudiant;
        this.prenom=prenom;
        this.age=age;
    }

    public Etudiant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the nrEtudiant
     */
    public int getNrEtudiant() {
        return nrEtudiant;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    
}
