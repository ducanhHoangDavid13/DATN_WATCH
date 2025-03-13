package sd_19.watch.services.san_pham;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import sd_19.watch.model.san_pham.HangDongHo;
import sd_19.watch.model.san_pham.LoaiDongHo;
import sd_19.watch.repository.san_pham.HangDongHoRepository;
import sd_19.watch.repository.san_pham.LoaiDongHoRepository;

import java.util.List;

@Service
public class LoaiDongHoService {


    private final LoaiDongHoRepository loaiDongHoRepository;

    public LoaiDongHoService(LoaiDongHoRepository loaiDongHoRepository) {
        this.loaiDongHoRepository = loaiDongHoRepository;
    }

    public List<LoaiDongHo> getAllLoaiDongHo(){
        return loaiDongHoRepository.findAll();
    }

    public LoaiDongHo getLoaiDongHoById(Integer id) {
        return loaiDongHoRepository.findById(id).orElse(null);
    }

    public LoaiDongHo saveLoaiDongHo(LoaiDongHo loaiDongHo) {
        return loaiDongHoRepository.save(loaiDongHo);
    }

    public LoaiDongHo updateLoaiDongHo(Integer id, LoaiDongHo updateLoaiDongHo) {
        if (!loaiDongHoRepository.existsById(id)) {
            return null;
        }
        updateLoaiDongHo.setId(id);
        return loaiDongHoRepository.save(updateLoaiDongHo);

    }

    public boolean deleteLoaiDongHo(Integer id) {
        if (!loaiDongHoRepository.existsById(id)) {
            return false;
        }
        loaiDongHoRepository.deleteById(id);
        return true;
    }

    public List<LoaiDongHo> findByTen(String tenLoaiDongHo) {
        return loaiDongHoRepository.findByTenLoaiDongHoContainingIgnoreCase(tenLoaiDongHo);
    }

    public Page<LoaiDongHo> getHangDongHoByPage(int page, int size) {
        return loaiDongHoRepository.findAll(PageRequest.of(page - 1, size)); // Spring Boot đánh số trang từ 0
    }
}