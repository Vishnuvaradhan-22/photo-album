/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stateful;

import entity.EventDTO;
import entity.Events;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Vish
 */
@Local
public interface EventsFacadeLocal {

    void create(Events events);

    void edit(Events events);

    void remove(Events events);

    Events find(Object id);

    List<Events> findAll();

    List<Events> findRange(int[] range);

    int count();
    boolean addEvent(EventDTO event);
    
}
