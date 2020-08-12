package com.dxctraining.hotelmgt.service;


import java.util.List;

import com.dxctraining.hotelmgt.entities.Guest;

public interface IguestService {
	public void register(Guest guest);

	public void removeGuest(String id);

	public List<Guest> display();

	public Guest findById(String id);
}
