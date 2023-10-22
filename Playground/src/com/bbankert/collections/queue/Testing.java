package com.bbankert.collections.queue;

public class Testing {

	public static void main(String[] args) {
		DefaultHelpDeskFacade helpDesk = new DefaultHelpDeskFacade();
		
		helpDesk.addNewSupportTicket(new DefaultSupportTicket(RequestType.OTHER));
		helpDesk.addNewSupportTicket(new DefaultSupportTicket(RequestType.ACCOUNT_IS_HACKED));
		helpDesk.addNewSupportTicket(new DefaultSupportTicket(RequestType.COOPERATION));
		
		System.out.println("Priority is: " + helpDesk.getNextSupportTicket().getPriority());

	}

}
