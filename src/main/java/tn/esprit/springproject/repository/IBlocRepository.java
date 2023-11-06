package tn.esprit.springproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entity.Bloc;
import tn.esprit.springproject.Entity.Foyer;
import tn.esprit.springproject.Entity.TypeChambre;

import java.util.List;
@Repository

public interface IBlocRepository extends CrudRepository<Bloc,Long> {

    List<Bloc> findByFoyerAndCapaciteBlocGreaterThanEqualAndNomBlocContainingOrderByChambresIdChambre(Foyer foyer, long capaciteBloc, String nomBloc);

    List<Bloc> findByFoyerAndChambresTypeCAndCapaciteBlocGreaterThanEqual(Foyer foyer, TypeChambre typeChambre, long capaciteBloc);

}
