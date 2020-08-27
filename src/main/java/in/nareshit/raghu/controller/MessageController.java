package in.nareshit.raghu.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/user/principal")
	public Principal user(Principal principal) {
		return principal;
	}
}