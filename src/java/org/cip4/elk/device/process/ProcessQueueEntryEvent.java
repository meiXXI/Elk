/*
 * Created on 2005-jun-06 
 */
package org.cip4.elk.device.process;

import org.cip4.elk.ElkEvent;
import org.cip4.jdflib.jmf.JDFQueueEntry;
import org.cip4.jdflib.resource.JDFNotification;

/**
 * An event that is genereated when a <em>QueueEntry</em>'s (in the Queue)
 * status is changed.
 * 
 * @author Ola Stering (olst6875@student.uu.se)
 * @version $Id$
 */
public class ProcessQueueEntryEvent extends ElkEvent {

    JDFQueueEntry _queueEntry;

    /**
     * Creates a ProcessQueueEntryEvent.
     * 
     * @param source The object that genereated this event.
     * @param queueEntry The <em>QueueEntry</em> which status has changed.
     */
    public ProcessQueueEntryEvent(Object source, JDFQueueEntry queueEntry) {
        super(JDFNotification.EnumClass.Event, source,
                "QueueEntry status event");
        _queueEntry = queueEntry;
    }

    /**
     * Returns the <em>QueueEntry</em> of this event.
     * 
     * @return the <em>QueueEntry</em> of this event.
     */
    public JDFQueueEntry getQueueEntry() {
        return _queueEntry;
    }
}
