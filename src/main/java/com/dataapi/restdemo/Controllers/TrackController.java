package com.dataapi.restdemo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dataapi.restdemo.Models.Tracks;
import com.dataapi.restdemo.Ropository.TrackRepo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/tracks")
public class TrackController {

	@Autowired
	private TrackRepo trackRepo;
	
	
	@GetMapping(value = "/")
	public String getPage() {
		return "Welcom To Track Controller";
	}
	
	@GetMapping(value = "getalltracks")
	public List<Tracks> getTracks(){
		return trackRepo.findAll();
	}
	
	
	@PostMapping(value = "addtrack")
	public String addTrack(@RequestBody Tracks track){
		trackRepo.save(track);
		return "track has saved successfully!";
	}
	
	
	@PutMapping(value = "update/{id}")
	public String updateTrack(@PathVariable Long id , @RequestBody Tracks track) {		
		Tracks targetTrack =  trackRepo.findById(id).get();
		targetTrack.setName(track.getName());
		trackRepo.save(targetTrack);
		return "track has updated successfully!";
	}
	
	@DeleteMapping(value = "delete/{id}")
	public String updateTrack(@PathVariable Long id) {
		Tracks targetTrack =  trackRepo.findById(id).get();
		trackRepo.delete(targetTrack);
		return "track has deleted successfully!";
	}
	
	
}
