/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewMessage;
import models.ModelMessage;
import controllers.ControllerMessage;
/**
*
* @author abi montes
*/
public class Main {

/**
* @param args the command line arguments
*/


public static void main(String[] args) {
    ModelMessage modelmessage = new ModelMessage();
    ViewMessage viewmessage = new ViewMessage();
    ControllerMessage controllermessage = new
        ControllerMessage(modelmessage , viewmessage );
}

}
    


