package com.dataapi.restdemo.Ropository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dataapi.restdemo.Models.Tracks;


public interface TrackRepo extends JpaRepository<Tracks, Long>{}

