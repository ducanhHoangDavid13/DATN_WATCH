package sd_19.watch.repository.san_pham;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sd_19.watch.model.san_pham.XuatXu;

import java.util.List;

@Repository
public interface XuatXuRepository extends JpaRepository<XuatXu,Integer> {
    List<XuatXu> findXuatXuByMaXuatXu(@NotBlank(message = "Mã xuất xứ đồng hồ không được để trống") String maXuatXu);
}
