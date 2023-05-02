package co.edu.ucatolica.hexa.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IronSalida {
    private Long id;
    private String tipo_transporte;
    private String medio;
    private String ubicacion;
}
