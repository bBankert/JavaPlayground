package com.bbankert.collections.queue;

public class DefaultSupportTicket implements SupportTicket {
	
	private static int ticketCount;
		
	private RequestType requestType;
	
	
	{
		ticketCount++;
	}
	
	public DefaultSupportTicket() {
		
	}
	
	public DefaultSupportTicket(RequestType requestType) {
		this.requestType = requestType;
	}

	@Override
	public Priority getPriority() {
		if(this.requestType == null) {
			return null;
		}
		return this.requestType.getPriority();
	}

	@Override
	public int getSequentialNumber() {
		return this.ticketCount;
	}

	@Override
	public RequestType getRequestType() {
		return this.requestType;
	}

}
