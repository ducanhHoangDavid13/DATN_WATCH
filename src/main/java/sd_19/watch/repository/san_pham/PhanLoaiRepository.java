package sd_19.watch.repository.san_pham;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.san_pham.PhanLoai;

import java.util.List;

@Repository
public interface PhanLoaiRepository extends JpaRepository<PhanLoai,Integer> {
    List<PhanLoai> findPhanLoaiByMaPhanLoai(@NotBlank(message = "Mã phân loại không được để trống") String maPhanLoai);
}
