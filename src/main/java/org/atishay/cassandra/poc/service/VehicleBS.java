package org.atishay.cassandra.poc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

@Service
public class VehicleBS {

	@Autowired
	public Session session;

	public List<String> getDatesOfLocationTable() {
		List<String> lst = new ArrayList<>();
		String query = "Select * from vehicle_tracker.location";

		ResultSet results = session.execute(query);

		for (Row row : results) {
			lst.add(row.getString("date"));
		}
		return lst;
	}
}
