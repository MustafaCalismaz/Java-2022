package kodlama.io.rentACar.dataAcces.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository //bu sinif bir data acces nesnesidir
public interface BrandRepository {
    List<Brand> gerAll();
}
