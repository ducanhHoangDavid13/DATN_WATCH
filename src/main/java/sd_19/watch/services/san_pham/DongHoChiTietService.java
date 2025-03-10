package sd_19.watch.services.san_pham;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sd_19.watch.model.san_pham.DongHo;
import sd_19.watch.model.san_pham.DongHoChiTiet;
import sd_19.watch.repository.san_pham.DongHoChiTietRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DongHoChiTietService {

    @Autowired
    private DongHoChiTietRepository dongHoChiTietRepository;

    public Page<DongHoChiTiet> getAllDongHo(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return dongHoChiTietRepository.findAll(pageable);
    }

    public List<DongHoChiTiet> searchByAttribute(String tenDongHo, String hang, String phanLoai, String chatLieu, String xuatXu) {
        if (tenDongHo != null && !tenDongHo.isEmpty()) return dongHoChiTietRepository.findByDongHo_TenDongHoContainingIgnoreCase(tenDongHo);
        if (hang != null && !hang.isEmpty()) return dongHoChiTietRepository.findByHangDongHo_TenHangContainingIgnoreCase(hang);
        if (phanLoai != null && !phanLoai.isEmpty()) return dongHoChiTietRepository.findByPhanLoai_TenPhanLoaiContainingIgnoreCase(phanLoai);
        if (chatLieu != null && !chatLieu.isEmpty()) return dongHoChiTietRepository.findByChatLieu_TenChatLieuContainingIgnoreCase(chatLieu);
        if (xuatXu != null && !xuatXu.isEmpty()) return dongHoChiTietRepository.findByXuatXu_TenXuatXuContainingIgnoreCase(xuatXu);
        return dongHoChiTietRepository.findAll();
    }

    public DongHoChiTiet findById(Integer id) {
        return dongHoChiTietRepository.findById(id).orElse(null);
    }

    public DongHoChiTiet getById(Integer id) {
        return dongHoChiTietRepository.findById(id).orElse(null);
    }

    public DongHoChiTiet save(DongHoChiTiet dongHoChiTiet) {
        return dongHoChiTietRepository.save(dongHoChiTiet);
    }

    public DongHoChiTiet update(Integer id, DongHoChiTiet updatedDongHoChiTiet) {
        if (!dongHoChiTietRepository.existsById(id)) {
            return null;
        }
        updatedDongHoChiTiet.setId(id);
        return dongHoChiTietRepository.save(updatedDongHoChiTiet);
    }

    public boolean delete(Integer id) {
        if (!dongHoChiTietRepository.existsById(id)) {
            return false;
        }
        dongHoChiTietRepository.deleteById(id);
        return true;
    }
//    public List<DongHoChiTiet> searchByAttribute(String tenDongHo, String hang, String phanLoai, String chatLieu, String xuatXu) {
//        if (tenDongHo != null && !tenDongHo.isEmpty()) {
//            return dongHoChiTietRepository.findByDongHo_TenDongHoContainingIgnoreCase(tenDongHo);
//        }
//        if (hang != null && !hang.isEmpty()) {
//            return dongHoChiTietRepository.findByHangDongHo_TenHangContainingIgnoreCase(hang);
//        }
//        if (phanLoai != null && !phanLoai.isEmpty()) {
//            return dongHoChiTietRepository.findByPhanLoai_TenPhanLoaiContainingIgnoreCase(phanLoai);
//        }
//        if (chatLieu != null && !chatLieu.isEmpty()) {
//            return dongHoChiTietRepository.findByChatLieu_TenChatLieuContainingIgnoreCase(chatLieu);
//        }
//        if (xuatXu != null && !xuatXu.isEmpty()) {
//            return dongHoChiTietRepository.findByXuatXu_TenXuatXuContainingIgnoreCase(xuatXu);
//        }
//        return dongHoChiTietRepository.findAll();
//    }

}
