/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;




/**
 *
 * @author Dusan
 */
public class Paper {
    private State state;
    
    public Paper(State state) {
        this.state = state;
    }
    

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
   
   
  

}
