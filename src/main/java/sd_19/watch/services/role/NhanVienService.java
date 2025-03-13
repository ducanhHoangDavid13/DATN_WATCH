package sd_19.watch.services.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sd_19.watch.model.role.NhanVien;
import sd_19.watch.repository.role.NhanVienRepository;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;

    public List<NhanVien> getAllNhanViens() {
        return nhanVienRepository.findAll();
    }

    public NhanVien getNhanVienById(Integer id) {
        return nhanVienRepository.findById(id).orElse(null);
    }

    public void saveNhanVien(NhanVien nhanVien) {
        nhanVienRepository.save(nhanVien);
    }

    public void deleteNhanVien(Integer id) {
        nhanVienRepository.deleteById(id);
    }
}
