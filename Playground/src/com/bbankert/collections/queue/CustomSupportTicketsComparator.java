package com.bbankert.collections.queue;

import java.util.Comparator;


public class CustomSupportTicketsComparator implements Comparator<SupportTicket> {

	//Tickets with the higher priority goes first

	//In case two tickets have the same priority - the one that was created earlier should be returned
	@Override
	public int compare(SupportTicket ticket1, SupportTicket ticket2) {
		
		// if we create bad tickets with priority, we should just use the sequence number;
		if(ticket1.getPriority() == null || ticket2.getPriority() == null) {
			return ticket1.getSequentialNumber() > ticket2.getSequentialNumber() ? -1 : 1;
		}
		
		int ticket1Priority = ticket1.getPriority().getPriorityValue(),
				ticket2Priority = ticket2.getPriority().getPriorityValue();
		
		boolean equalPriority = ticket1Priority == ticket2Priority;
				
		if(!equalPriority) {
			return ticket1Priority > ticket2Priority ? -1 : 1;
		}
		
		return ticket1.getSequentialNumber() > ticket2.getSequentialNumber() ? -1 : 1;
	}
	
}
