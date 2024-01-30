package dev.rebecamf;

import dev.rebecamf.model.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
          Person robert = new Person("Robert","Smith","45892135G",1961);
          
        robert.render();
        
    }
}
