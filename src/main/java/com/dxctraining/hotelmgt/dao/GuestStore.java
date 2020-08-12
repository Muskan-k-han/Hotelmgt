package com.dxctraining.hotelmgt.dao;

import java.util.HashMap;
import java.util.Map;

import com.dxctraining.hotelmgt.entities.Guest;

public class GuestStore {
	private static Map<String, Guest> guestMap = new HashMap<>();

	public static Map<String, Guest> getGuestMap() {
		return guestMap;
	}
}