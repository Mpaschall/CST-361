package beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Act3Bean
 */
@Stateless
@LocalBean
public class Act3Bean {

    /**
     * Default constructor. 
     */
    public Act3Bean() {
        System.out.println("This is my bean");
    }

}
