/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewMessage;
import models.ModelMessage;
import extras.DataValidation;
/**
*
* @author abi montes
*/
public class ControllerMessage implements ActionListener{
ModelMessage modelmessage;
ViewMessage viewmessage;
ActionListener actionlistener;
DataValidation datavalidation = new DataValidation();


public ControllerMessage(ModelMessage modelmessage, ViewMessage
viewmessage) {
this.modelmessage = modelmessage;
this.viewmessage = viewmessage;
this.viewmessage.jb_calcular.addActionListener(this);
initComponents();
}
@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource() == viewmessage.jb_calcular){
jb_calcular_action_performed();
}

}

public void ObtenerValores() {
modelmessage.setNombre(viewmessage.jtf_nombre.getText());
modelmessage.setApellidop(viewmessage.jtf_ap.getText());
modelmessage.setApellidom(viewmessage.jtf_am.getText());
modelmessage.setAnioo(viewmessage.jtf_anio.getText());
modelmessage.setMess(viewmessage.jtf_mes.getText());
modelmessage.setDiaa(viewmessage.jtf_dia.getText());
modelmessage.setAnio(datavalidation.stringInt(viewmessage.jtf_anio.getText()));
modelmessage.setMes(datavalidation.stringInt(viewmessage.jtf_mes.getText()));
modelmessage.setDia(datavalidation.stringInt(viewmessage.jtf_dia.getText()));
}
public void Asignacion() {

viewmessage.jl_rfc.setText("Resultado: "+modelmessage.getRfc().toUpperCase());


}

public void jb_calcular_action_performed() {
this.ObtenerValores();
modelmessage.rfc();
this.Asignacion();
}

public void initComponents() {
viewmessage.setVisible(true);
}
}