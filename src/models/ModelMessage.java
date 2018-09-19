/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.JOptionPane;

/**
*
* @author abi montes

Tecnologías de la Información y Comunicación
Rubrica de Práctica

*/
public class ModelMessage {

private String nombre;
private String apellidop;
private String apellidom;
private int anio;
private int mes;
private int dia;
private String Anioo;
private String Mess;
private String Diaa;
private String rfc;

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public String getApellidop() {
return apellidop;
}

public void setApellidop(String apellp) {
this.apellidop = apellp;
}

public String getApellidom() {
return apellidom;
}

public void setApellidom(String apellm) {
this.apellidom = apellm;
}

public int getAnio() {
return anio;

}

public void setAnio(int anio) {
this.anio = anio;
if (anio >= 1930 && anio >= 2018 ) {
}
else {
JOptionPane.showMessageDialog(null, "Error solo se admiten numeros enteros");
}
}

public int getMes() {
return mes;
}

public void setMes(int mes) {


this.mes = mes;
if (mes >= 01 && mes <= 12 ) {
}
else {
JOptionPane.showMessageDialog(null,"Error digite su mes en numero");
}
}

public int getDia() {
return dia;
}

public void setDia(int dia) {
this.dia = dia;
if (dia >= 01 && dia <= 31 ) {
}
else {
JOptionPane.showMessageDialog(null, "Error digite su dia en numero");
}
}
public String getAnioo() {
return Anioo;
}

public void setAnioo(String Anioo) {
this.Anioo = Anioo;
}

public String getMess() {
return Mess;


}

public void setMess(String Mess) {
this.Mess = Mess;
}

public String getDiaa() {
return Diaa;
}

public void setDiaa(String Diaa) {
this.Diaa = Diaa;
}
public String getRfc() {
return rfc;
}

public void setRfc(String rfc) {
this.rfc = rfc;
}

public void rfc() {
rfc = apellidop.trim().substring(0, 2);
rfc = rfc.concat(apellidom.trim().substring(0, 1));
rfc = rfc.concat(nombre.trim().substring(0, 1));
rfc = rfc.concat(Anioo.substring(2, 4));
rfc = rfc.concat(Mess);
rfc = rfc.concat(Diaa);


}

}