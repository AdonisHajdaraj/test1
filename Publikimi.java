/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adonis's Lenovo 5 15
 */
public  abstract class Publikimi {
    private String isbn;
    private String titulli;
    private int vitiPublikimit;
    
    
    public Publikimi (String isbn,String titulli,int vitiPublikimit){
        this.isbn=isbn;
        this.titulli=titulli;
        this.vitiPublikimit=vitiPublikimit;
    
}
    public String getisbn(){
        return isbn;
        
    }
    public String gettitulli(){
        return titulli;
        
    }
    public void setlloji(String titulli){
        this.titulli=titulli;
    }
    public int getvitiPublikimit(){
        return vitiPublikimit;
    }
    public void setvitiPublikimit(int vitiPublikimit){
        this.vitiPublikimit=vitiPublikimit;
    }
    public abstract boolean eshteDigjitale();
    
    public String toString(){
        return isbn+";"+titulli+";"+vitiPublikimit;
    }
    public boolean equals (Object obj){
        if (obj instanceof Publikimi){
            Publikimi p = (Publikimi) obj;
            if(p.getisbn().equals(isbn)){
                return true;
            }
        }
        return false;
    }
            
    
}
