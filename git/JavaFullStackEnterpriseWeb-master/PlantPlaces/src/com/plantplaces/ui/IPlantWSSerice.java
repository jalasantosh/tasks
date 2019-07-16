package com.plantplaces.ui;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
        public class IPlantWSSerice {
	
	@WebMethod
	public String fetchPlants(String plantName) {
		return "foo";
		
	}
}