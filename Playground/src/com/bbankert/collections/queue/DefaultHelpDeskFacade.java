package com.bbankert.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;


public class DefaultHelpDeskFacade implements HelpDeskFacade {
	
	
	Queue<SupportTicket> ticketQueue;
	
	{
		ticketQueue = new PriorityQueue<SupportTicket>(new CustomSupportTicketsComparator());
	}

	@Override
	public void addNewSupportTicket(SupportTicket supportTicket) {
		ticketQueue.add(supportTicket);

	}

	@Override
	public SupportTicket getNextSupportTicket() {
		return ticketQueue.poll();
	}

	@Override
	public int getNumberOfTickets() {
		return ticketQueue.size();
	}

}
