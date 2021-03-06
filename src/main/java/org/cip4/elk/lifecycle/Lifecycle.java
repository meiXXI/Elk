package org.cip4.elk.lifecycle;

/**
 * A lifecycle interface for Elk components.
 * 
 * @author Claes Buckwalter (clabu@itn.liu.se)
 * @version $Id: Lifecycle.java,v 1.1 2005/06/08 15:06:11 buckwalter Exp $
 */
public interface Lifecycle {

    /**
     * A lifecycle method that gets called when Elk is started. Allows an implementor
     * to initialize any resources it needs and load its previously
     * persisted state before starting.
     */
    public void init();

    /**
     * A lifecycle method that gets called when Elk shuts down. Allows the implementor
     * to free any resources, persist its state, etc before shutting down.
     */
    public void destroy();
}
