package com.bbankert.oop.solid.s.solution;

import com.bbankert.oop.solid.s.shared.Role;
import com.bbankert.oop.solid.s.shared.User;

public class SecurityService {
	public boolean hasAccess(User user) {
		if (user.getRole() == Role.ADMIN) {
			return true;
		} else {
			return false;
		}
	}
}
