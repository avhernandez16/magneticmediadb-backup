package co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="iron_llegada")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IronLlegadaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idiron_llegada")
    private Long id;
    private String numeroRemision;
    private LocalDate dateCreated;
    private String TipoTransporte;
    private String Usuario;
    private String Medio;
    private String Ubicacion;

}
