package com.dxctraining.hotelmgt.ui;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.hotelmgt.entities.Guest;
import com.dxctraining.hotelmgt.service.GuestServiceImplementation;
import com.dxctraining.hotelmgt.service.IguestService;

@Component
public class GuestUI {

	@Autowired
	private IguestService guestservice;

	@PostConstruct
	private void runApp() {
		Guest guest1 = new Guest("harsha", "b44");
		Guest guest2 = new Guest("khadar", "b45");
		guestservice.register(guest1);
		guestservice.register(guest2);
		showGuests();
	}

	private void showGuests() {
		List<Guest> list = guestservice.display();
		System.out.println("DISPLAYING ALL THE GUESTS");
		for (Guest guest : list) {
			displayGuest(guest);
		}
	}

	private void displayGuest(Guest guest) {
		String name = guest.getName();
		String id = guest.getId();
		System.out.println("The Name is=" + name + " The id is=" + id);
	}
}