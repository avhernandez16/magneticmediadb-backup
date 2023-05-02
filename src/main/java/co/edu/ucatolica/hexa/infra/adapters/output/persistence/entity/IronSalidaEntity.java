package co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name="iron_salida")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IronSalidaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idironSalida")
    private Long id;
    private String tipo_transporte;
    private String medio;
    private String ubicacion;

}
