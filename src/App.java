import javadraw.*;

public class App extends Window{
    //Initialize movement boolean variables, all set to false
    boolean up, down, left, right = false;
    
    public static void main(String[] args) throws Exception {
        Window.open();
    }

    public void start(){
        Oval hero = new Oval(screen, 400, 300, 20, 20);

        while(true){
            //constantly calls the move method
            move(hero);
            screen.update();
            screen.sleep(1/30.0);
        }

    }
    //Constantly running in animation loop, performing movement if variable is true
    //Put into own method to save space, given access to 'hero' variable
    //Use if, not else-if so multiple actions can be happening each loop
    public void move(Oval hero){
        
        if(left){
            hero.move(-5,0);
        }
        if(right){
            hero.move(5,0);
        }
        if(up){
            hero.move(0,-5);
        }
        if(down){
            hero.move(0,5);
        }
    }
    //When up/down/left/right is pressed, boolean equivalent is set to true
    //Use if, not else-if so multiple actions can be happening each loop
    public void keyDown(Key key){
        if(key == Key.UP){
            up = true;
        }
        if(key == Key.DOWN){
            down = true;
        }
        if(key == Key.LEFT){
            left = true;
        }
        if(key == Key.RIGHT){
            right = true;
        }
    }
    
    //When up/down/left/right is released, boolean equivalent is set to false
    public void keyUp(Key key){
        if(key == Key.UP){
            up = false;
        }
        if(key == Key.DOWN){
            down = false;
        }
        if(key == Key.LEFT){
            left = false;
        }
        if(key == Key.RIGHT){
            right = false;
        }

    }
}
