package co.edu.ucatolica.hexa.infra.adapters.input.rest;

import co.edu.ucatolica.hexa.application.ports.input.CreateIronLlegadaUseCase;
import co.edu.ucatolica.hexa.application.ports.input.DeleteIronLlegadaUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetAllIronLlegadaUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetIronLlegadaUseCase;
import co.edu.ucatolica.hexa.domain.model.IronLlegada;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ironllegada")
@RequiredArgsConstructor
public class IronLlegadaRestAdapter {

    private final CreateIronLlegadaUseCase createIronLlegadaUseCase;
    private final GetIronLlegadaUseCase getIronLlegadaUseCase;
    private final GetAllIronLlegadaUseCase getAllIronLlegadaUseCase;
    private final DeleteIronLlegadaUseCase deleteIronLlegadaUseCase;

    @PostMapping(value = "/save")
    public ResponseEntity<IronLlegada> createIronLlegada(@RequestBody @Valid IronLlegada ironLlegadaRequest){
        //Req to Domain
        IronLlegada ironLlegada;
        ironLlegada = createIronLlegadaUseCase.createIronLlegada(ironLlegadaRequest);
        //Domain to response
        return new ResponseEntity<>(ironLlegada, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<IronLlegada> getIronLlegada(@PathVariable Long id){
        IronLlegada ironLlegada = getIronLlegadaUseCase.getIronLlegadaById(id);
        return new ResponseEntity<>(ironLlegada, HttpStatus.OK);
    }

    @GetMapping(value = "/all")
    public List<IronLlegada> getAll(){
        return getAllIronLlegadaUseCase.getAll();
    }

    @DeleteMapping("/{ironLlegadaId}")
    public ResponseEntity<Void> deleteIronLlegadaById(@PathVariable Long ironLlegadaId){//no es necesario devolver un objeto ya que solo se debe saber si elimina o no
        if (deleteIronLlegadaUseCase.deleteIronLlegada(ironLlegadaId)){//si es true
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
