package com.essat.springfootball.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Administrateurs")
public class Administrateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String username;
    private String password;
	public Object getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
}