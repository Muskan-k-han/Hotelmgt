package com.dxctraining.hotelmgt.dao;


import java.util.List;

import com.dxctraining.hotelmgt.entities.Guest;

public interface IguestDao {
	public Guest findById(String id);

	public void remove(String id);

	public void register(Guest guest);

	public List<Guest> guestlist();

}
