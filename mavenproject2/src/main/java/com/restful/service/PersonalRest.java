
package com.restful.service;


import com.restful.entidades.Peliculas;
import com.restful.session.PeliculasFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("Peliculas")
public class PersonalRest {
   @EJB
   
   private PeliculasFacade pelicualasFacade;
   
   @GET
   @Produces({MediaType.APPLICATION_JSON})

   public List<Peliculas>findAll (){
       return pelicualasFacade.findAll();
   }
}
