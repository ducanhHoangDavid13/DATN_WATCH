package sd_19.watch.services.san_pham;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import sd_19.watch.model.san_pham.PhanLoai;
import sd_19.watch.repository.san_pham.PhanLoaiRepository;

import java.util.List;

@Service
public class PhanLoaiService {
    private final PhanLoaiRepository phanLoaiRepository;

    public PhanLoaiService(PhanLoaiRepository phanLoaiRepository) {
        this.phanLoaiRepository = phanLoaiRepository;
    }

    public List<PhanLoai> getAllPhanLoai() {
        return phanLoaiRepository.findAll();
    }

    public PhanLoai getPhanLoaiById(Integer id) {
        return phanLoaiRepository.findById(id).orElse(null);
    }

    public PhanLoai savePhanLoai(PhanLoai phanLoai) {
        return phanLoaiRepository.save(phanLoai);
    }

    public PhanLoai updatePhanLoai(Integer id, PhanLoai updatedPhanLoai) {
        if (!phanLoaiRepository.existsById(id)) {
            return null;
        }
        updatedPhanLoai.setId(id);
        return phanLoaiRepository.save(updatedPhanLoai);
    }

    public boolean deletePhanLoai(Integer id) {
        if (!phanLoaiRepository.existsById(id)) {
            return false;
        }
        phanLoaiRepository.deleteById(id);
        return true;
    }

    public List<PhanLoai> findByTen(String tenPhanLoai) {
        return phanLoaiRepository.findByTenPhanLoaiContainingIgnoreCase(tenPhanLoai);
    }
    public Page<PhanLoai> getPhanLoaiByPage(int page, int size) {
        return phanLoaiRepository.findAll(PageRequest.of(page - 1, size)); // Spring Boot đánh số trang từ 0
    }
}
