/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adonis's Lenovo 5 15
 */
public class LibriiShkollor extends Librii {
    private String drejtimi;
    
    public LibriiShkollor (String isbn , String titulli,int vitiPublikimit,int nrFaqeve,String drejtimi){
        super(isbn,titulli,vitiPublikimit,nrFaqeve);
        this.drejtimi=drejtimi;
    }
    public boolean kaDetyra(){
        return true;
    }
    public String getdrejtimi(){
        return drejtimi;
    }
    public void setdrejtimi(String drejtimi){
        this.drejtimi=drejtimi;
    }
    public String toString(){
        return "LibriiShkollor"+super.toString()+";"+drejtimi;
    }
    
}
