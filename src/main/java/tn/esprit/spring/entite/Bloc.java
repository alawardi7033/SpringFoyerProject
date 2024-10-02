package tn.esprit.spring.entite;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
     long idBloc;
     String nomBloc;
     long capaciteBloc;

    // Many Blocs belong to one Foyer
    @ManyToOne
     Foyer foyer;

    // One Bloc has many Chambres

}
