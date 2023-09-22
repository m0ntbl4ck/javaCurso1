/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author mont_
 */

 public enum Equipo
{
	MONDAY("lunes");
        
	private String spanish;

    public String getSpanish() {
        return spanish;
    }
	
	
	private Equipo (String spanish){
		this.spanish = spanish;
		
	}

	

		
	
}
