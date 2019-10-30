package com.example.demo;

import com.example.Rest.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class main {

    
    @RequestMapping(value = "/Consultanormalizacion", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
    public ResponseEntity<?> getSolicitud(@RequestParam("direccion") String dir){
      try{
        String uri =  "http://servicios.usig.buenosaires.gob.ar/normalizar/?direccion=" + dir;
        ResponseEntity<String> response = Controller.ExecuteGET(uri);

        if(response.getStatusCodeValue() == 200) {
                System.out.println(response.getBody());
                return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
                

        }else {
        
            return new ResponseEntity<Object>(response.getStatusCode(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }catch(Exception ex){
        System.out.println("General Error getSolicitud: " + ex.getMessage());
        return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        
    }
}



}