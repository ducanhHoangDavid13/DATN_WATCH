package sd_19.watch.services.san_pham;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import sd_19.watch.model.san_pham.XuatXu;
import sd_19.watch.repository.san_pham.XuatXuRepository;

import java.util.List;

@Service
public class XuatXuService {
    private final XuatXuRepository xuatXuRepository;

    public XuatXuService(XuatXuRepository xuatXuRepository) {
        this.xuatXuRepository = xuatXuRepository;
    }

    public List<XuatXu> getAllXuatXu() {
        return xuatXuRepository.findAll();
    }

    public XuatXu getXuatXuById(Integer id) {
        return xuatXuRepository.findById(id).orElse(null);
    }

    public XuatXu saveXuatXu(XuatXu xuatXu) {
        return xuatXuRepository.save(xuatXu);
    }

    public XuatXu updateXuatXu(Integer id, XuatXu updatedXuatXu) {
        if (!xuatXuRepository.existsById(id)) {
            return null;
        }
        updatedXuatXu.setId(id);
        return xuatXuRepository.save(updatedXuatXu);
    }

    public boolean deleteXuatXu(Integer id) {
        if (!xuatXuRepository.existsById(id)) {
            return false;
        }
        xuatXuRepository.deleteById(id);
        return true;
    }

    public List<XuatXu> findByLoaiXuatXu(String loaiXuatXu) {
        return xuatXuRepository.findByLoaiXuatXuContainingIgnoreCase(loaiXuatXu);
    }
    public Page<XuatXu> getXuatXuByPage(int page, int size) {
        return xuatXuRepository.findAll(PageRequest.of(page - 1, size)); // Spring Boot đánh số trang từ 0
    }
}
