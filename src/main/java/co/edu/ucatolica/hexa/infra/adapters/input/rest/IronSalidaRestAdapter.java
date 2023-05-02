package co.edu.ucatolica.hexa.infra.adapters.input.rest;

import co.edu.ucatolica.hexa.application.ports.input.CreateIronSalidaUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetAllIronSalidaUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetIronSalidaUseCase;
import co.edu.ucatolica.hexa.domain.model.IronSalida;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ironsalida")
@RequiredArgsConstructor
public class IronSalidaRestAdapter {

    private final CreateIronSalidaUseCase createIronSalidaUseCase;
    private final GetIronSalidaUseCase getIronSalidaUseCase;
    private final GetAllIronSalidaUseCase getAllIronSalidaUseCase;

    @PostMapping(value = "/save")
    public ResponseEntity<IronSalida> createIronSalida(@RequestBody @Valid IronSalida ironSalidaRequest){
        //Req to Domain
        IronSalida ironSalida;
        ironSalida = createIronSalidaUseCase.createIronSalida(ironSalidaRequest);
        //Domain to response
        return new ResponseEntity<>(ironSalida, HttpStatus.CREATED);
    }

    @PostMapping(value = "/{id}")
    public ResponseEntity<IronSalida> getIronSalida(@PathVariable Long id){
        IronSalida ironSalida = getIronSalidaUseCase.getIronSalidaById(id);
        return new ResponseEntity<>(ironSalida, HttpStatus.OK);
    }

    @GetMapping(value = "/all")
    public List<IronSalida> getAll(){
        return getAllIronSalidaUseCase.getAll();
    }
}
