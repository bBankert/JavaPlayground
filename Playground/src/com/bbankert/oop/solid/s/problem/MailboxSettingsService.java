package com.bbankert.oop.solid.s.problem;

import com.bbankert.oop.solid.s.shared.Role;
import com.bbankert.oop.solid.s.shared.User;

public class MailboxSettingsService {
	public void changeSecondaryEmail(User user, String newSecondaryEmail) {
		if (hasAccess(user)) {
			user.setSecondaryEmail(newSecondaryEmail);
		}
	}

	public boolean hasAccess(User user) {
		if (user.getRole() == Role.ADMIN) {
			return true;
		} else {
			return false;
		}
		
	}
}
