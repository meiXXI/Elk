/*
 * Created on 2005-apr-27
 */
package org.cip4.elk.device.process;

import java.util.EventListener;

/**
 * A listener that listens for process Amount changes.
 * 
 * @author Ola Stering (olst6875@student.uu.se)
 * @version $Id: ProcessAmountListener.java,v 1.1 2005/05/26 19:27:02 ola.stering Exp $
 */
public interface ProcessAmountListener extends EventListener {
    
    /**
	 * Invoked each time any of the processes that are listened to change
	 * their Amount.
	 * 
	 * @param processStatusEvent
	 */
	public void processAmountChanged(ProcessAmountEvent processAmountEvent);

}
