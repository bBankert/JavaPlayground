package com.bbankert.oop.solid.s.solution;

import com.bbankert.oop.solid.s.shared.User;

public class SingleResponsibilityDemo {

	public static void main(String[] args) {
		MailboxSettingsService settingsService = new MailboxSettingsService();
		User user = new User();
		
		// responsibility #1 of the MilboxSettingsService - change settings in mailbox
		settingsService.changeSecondaryEmail(user, "newemail@email.com");
		
		// responsibility #1 of the SecurityService - verify access
		SecurityService securityService = new SecurityService();
		if (securityService.hasAccess(user)) {
			user.sendMoney(new User(), 1000);
		}

	}

}
