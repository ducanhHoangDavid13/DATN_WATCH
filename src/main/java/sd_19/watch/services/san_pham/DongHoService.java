package sd_19.watch.services.san_pham;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import sd_19.watch.model.san_pham.DongHo;
import sd_19.watch.repository.san_pham.DongHoRepository;

import java.util.List;

@Service
public class DongHoService {
    private final DongHoRepository dongHoRepository;

    public DongHoService(DongHoRepository dongHoRepository) {
        this.dongHoRepository = dongHoRepository;
    }

    public List<DongHo> getAllDongHo() {
        return dongHoRepository.findAll();
    }

    public DongHo getDongHoById(Integer id) {
        return dongHoRepository.findById(id).orElse(null);
    }

    public DongHo saveDongHo(DongHo dongHo) {
        return dongHoRepository.save(dongHo);
    }

    public DongHo updateDongHo(Integer id, DongHo updatedDongHo) {
        if (!dongHoRepository.existsById(id)) {
            return null;
        }
        updatedDongHo.setId(id);
        return dongHoRepository.save(updatedDongHo);
    }

    public boolean deleteDongHo(Integer id) {
        if (!dongHoRepository.existsById(id)) {
            return false;
        }
        dongHoRepository.deleteById(id);
        return true;
    }

    public List<DongHo> findByTen(String tenDongHo) {
        return dongHoRepository.findByTenDongHoContainingIgnoreCase(tenDongHo);
    }
    public Page<DongHo> getDongHoByPage(int page, int size) {
        return dongHoRepository.findAll(PageRequest.of(page - 1, size)); // Spring Boot đánh số trang từ 0
    }
}
