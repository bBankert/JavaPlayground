package com.bbankert.oop.solid.s.solution;

import com.bbankert.oop.solid.s.shared.User;

public class MailboxSettingsService {
private SecurityService securityService;
	
	{
		securityService = new SecurityService();
	}

	public void changeSecondaryEmail(User user, String newSecondaryEmail) {
		if (securityService.hasAccess(user)) {
			user.setSecondaryEmail(newSecondaryEmail);
		}
	}
}
