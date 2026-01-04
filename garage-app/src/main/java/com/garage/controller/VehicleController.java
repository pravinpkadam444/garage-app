package com.garage.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garage.model.Vehicle;
import com.garage.service.VehicleService;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

	 private final VehicleService service;

	    public VehicleController(VehicleService service) {
	        this.service = service;
	    }

	    @PostMapping("/add")
	    public String addVehicle(@RequestBody Vehicle v) {
	        service.addVehicle(v);
	        return "Added";
	    }
	    @GetMapping("/getAll")
	    public List<Vehicle> getAllVehicle() {
	        return service.getAll();
	    }
	    @PutMapping("/status/{plate}/{status}")
	    public String updateStatus(
	            @PathVariable String plate,
	            @PathVariable String status) {
	        service.changeStatus(plate, status);
	        return "Updated";
	    }

	    @GetMapping("/search/{plate}")
	    public List<Vehicle> searchByPlate(@PathVariable String plate) {
	        return service.searchByPlate(plate);
	    }

	    @GetMapping("/search/description/{key}")
	    public List<Vehicle> searchByDescription(@PathVariable String key) {
	        return service.searchByDescription(key);
	    }

	    @GetMapping("/list/status/{status}")
	    public List<Vehicle> listByStatus(@PathVariable String status) {
	        return service.listByStatus(status);
	    }

	    @GetMapping("/sort/year")
	    public List<Vehicle> sortByYear() {
	        return service.sortByYear();
	    }

	    @GetMapping("/profit")
	    public int totalProfit() {
	        return service.totalProfit();
	    }
	
}
