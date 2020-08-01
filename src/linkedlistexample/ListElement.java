package linkedlistexample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class ListElement {
    
    public ListElement(String message, int current_index)
    {
        this.message = message;
        this.next = null;
        this.current_index = current_index;
    }
    
    public String message;
    public int current_index;
    public ListElement next;
}
