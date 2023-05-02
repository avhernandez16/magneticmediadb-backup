package co.edu.ucatolica.hexa.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IronLlegada {
    private Long id;
    private String numeroRemision;
    private LocalDate dateCreated;
    private String TipoTransporte;
    private String Usuario;
    private String Medio;
    private String Ubicacion;
}
