/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author David Acosta
 */
public class ModeloComboCargos extends DefaultComboBoxModel{

    public ModeloComboCargos() {
        for(Cargo cargo : Cargo.values())
            this.addElement(cargo);
    }
    
    public Cargo ObtenerCargo(){
        return (Cargo)this.getSelectedItem();
    }
    
    public void SeleccionarCargo(Cargo cargo){
        this.setSelectedItem(cargo);
    }
    
}
