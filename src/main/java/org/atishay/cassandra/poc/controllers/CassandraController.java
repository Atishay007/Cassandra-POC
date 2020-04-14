package org.atishay.cassandra.poc.controllers;

import java.util.List;

import org.atishay.cassandra.poc.service.VehicleBS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CassandraController {

	@Autowired
	public VehicleBS vehicleBS;

	@GetMapping("/getDatesOfVehicle")
	public List<String> getCassandraDetails() {
		return vehicleBS.getDatesOfLocationTable();
	}
}
