package com.stefanini.controller;


import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

@Path("/denunciantes")
@RequestScoped
public class DenuncianteController {
	/** 
	
	@Inject
	private DenuncianteService denuncianteService;
	
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String salvarDenunciante(Denunciante denunciante) {
    	denuncianteService.salvar(denunciante);
    	return "Denunciante cadastrado com sucesso!";
    }
    
    @POST
    @Path("/consultar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Denunciante> consultar(Denunciante denunciante){
    	
    	return denuncianteService.consultar(denunciante);
    }
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Denunciante> listarDenunciantes() {
    	return denuncianteService.listar();
    }
    
    @DELETE()
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String excluir(@PathParam("id") Integer id) {
    	denuncianteService.excluir(id);
    	return "Denunciante excluído com sucesso!";
    }
    **/
}
