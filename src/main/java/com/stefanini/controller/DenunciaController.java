package com.stefanini.controller;


  import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

@Path("/denuncias")
@RequestScoped
public class DenunciaController {
	 /**
	
	@Inject
	private DenunciaService denunciaService;
	
   /** @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Denuncia> get() {
        return denunciaService.listar();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void post(Denuncia denuncia) {
        denunciaService.salvar(denuncia);
    }
    **/
}
