package sd_19.watch.services.san_pham;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import sd_19.watch.model.san_pham.HangDongHo;
import sd_19.watch.model.san_pham.PhanLoai;
import sd_19.watch.repository.san_pham.HangDongHoRepository;
import sd_19.watch.repository.san_pham.PhanLoaiRepository;

import java.util.List;

@Service
public class HangDongHoService {
    private final HangDongHoRepository hangDongHoRepository;

    public HangDongHoService(HangDongHoRepository hangDongHoRepository) {
        this.hangDongHoRepository = hangDongHoRepository;
    }

    public List<HangDongHo> getAllHangDongHo() {
        return hangDongHoRepository.findAll();
    }

    public HangDongHo getHangDongHoById(Integer id) {
        return hangDongHoRepository.findById(id).orElse(null);
    }

    public HangDongHo saveHangDongHo(HangDongHo hangDongHo) {
        return hangDongHoRepository.save(hangDongHo);
    }

    public HangDongHo updateHanGDongHo(Integer id, HangDongHo updateHangDongHo) {
        if (!hangDongHoRepository.existsById(id)) {
            return null;
        }
        updateHangDongHo.setId(id);
        return hangDongHoRepository.save(updateHangDongHo);
    }

    public boolean deleteHangDongHo(Integer id) {
        if (!hangDongHoRepository.existsById(id)) {
            return false;
        }
        hangDongHoRepository.deleteById(id);
        return true;
    }

    public List<HangDongHo> findByTen(String tenHangDongHo) {
        return hangDongHoRepository.findByTenHangContainingIgnoreCase(tenHangDongHo);
    }
    public Page<HangDongHo> getHangDongHoByPage(int page, int size) {
        return hangDongHoRepository.findAll(PageRequest.of(page - 1, size)); // Spring Boot đánh số trang từ 0
    }
}
