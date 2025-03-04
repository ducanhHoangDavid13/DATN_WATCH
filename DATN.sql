
-- Danh mục
CREATE DATABASE Watch_Store
GO
USE Watch_Store
GO
USE master;
DROP DATABASE Watch_Store;


-- Danh mục
CREATE TABLE phan_loai (
    id INT PRIMARY KEY IDENTITY(1,1),
    phan_loai NVARCHAR(255),
    trang_thai INT
);

CREATE TABLE chat_lieu (
    id INT PRIMARY KEY IDENTITY(1,1),
    loai_chat_lieu NVARCHAR(255),
    trang_thai INT
);

CREATE TABLE loai_dong_ho (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_loai NVARCHAR(255),
    trang_thai INT
);

CREATE TABLE hang_dong_ho (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_hang NVARCHAR(255),
    trang_thai INT
);

CREATE TABLE xuat_xu (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_xuat_xu NVARCHAR(255),
    trang_thai INT
);

-- Sản phẩm
CREATE TABLE dong_ho (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_dong_ho NVARCHAR(255),
    mo_ta NVARCHAR(255),
    trang_thai INT,
    hinh_anh VARCHAR(255)
);

CREATE TABLE dong_ho_chi_tiet (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_dong_ho INT,
    id_phan_loai INT,
    id_loai INT,
    id_hang_dong_ho INT,
    id_xuat_xu INT, 
    id_chat_lieu INT,
    trang_thai INT,
    gia_tien DECIMAL(10,2),
    gioi_tinh INT,
    chuc_nang NVARCHAR(255),
    FOREIGN KEY (id_dong_ho) REFERENCES dong_ho(id),
    FOREIGN KEY (id_loai) REFERENCES loai_dong_ho(id),
    FOREIGN KEY (id_phan_loai) REFERENCES phan_loai(id),
    FOREIGN KEY (id_xuat_xu) REFERENCES xuat_xu(id),
    FOREIGN KEY (id_hang_dong_ho) REFERENCES hang_dong_ho(id),
    FOREIGN KEY (id_chat_lieu) REFERENCES chat_lieu(id)
);

-- Nhân viên & Khách hàng
CREATE TABLE Nhan_Vien (
    id INT PRIMARY KEY IDENTITY(1,1),
    ma_nhan_vien VARCHAR(50),
    ten_nhan_vien NVARCHAR(255),
    mat_khau VARCHAR(255),
    email VARCHAR(255),
    gioi_tinh BIT,
    sdt VARCHAR(20),
    dia_chi NVARCHAR(255),
    trang_thai INT
);

CREATE TABLE Khach_Hang (
    id INT PRIMARY KEY IDENTITY(1,1),
    ma_khach_hang VARCHAR(50),
    mat_khau VARCHAR(255),
    ho_va_ten NVARCHAR(255),
    email VARCHAR(255),
    gioi_tinh BIT,
    so_dien_thoai VARCHAR(20),
    trang_thai INT
);

-- Phiếu giảm giá
CREATE TABLE phieu_giam_gia (
    id INT PRIMARY KEY IDENTITY(1,1),
    ma_phieu_giam_gia VARCHAR(50),
    ten_phieu_giam_gia NVARCHAR(255),
    so_luong INT,
    muc_giam FLOAT,
    dieu_kien_su_dung FLOAT,
    gia_tri_toi_da FLOAT,
    hinh_thuc_giam_gia BIT,
    ngay_bat_dau DATE,
    ngay_ket_thuc DATE,
    ghi_chu NVARCHAR(255),
    trang_thai INT
);

CREATE TABLE phieu_giam_gia_chi_tiet (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_khach_hang INT,
    id_phieu_giam_gia INT,
    trang_thai INT,
    FOREIGN KEY (id_khach_hang) REFERENCES Khach_Hang(id),
    FOREIGN KEY (id_phieu_giam_gia) REFERENCES phieu_giam_gia(id)
);

-- Hóa đơn & Thanh toán
CREATE TABLE Hoa_Don (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_nhan_vien INT,
    Id_khach_hang INT,
    ma_hoa_don VARCHAR(50),
    ngay_tao DATETIME,
    loai BIT,
    tong_tien DECIMAL(10,2),
    ghi_chu VARCHAR(255),
    trang_thai INT,
    FOREIGN KEY (id_nhan_vien) REFERENCES Nhan_Vien(id),
    FOREIGN KEY (Id_khach_hang) REFERENCES Khach_Hang(id)
);

CREATE TABLE hoa_don_chi_tiet (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_dong_ho_chi_tiet INT,
    id_phieu_giam_gia INT,
    id_nhan_vien INT,
    id_hoa_don INT,
    id_hinh_thuc_thanh_toan INT,
    ma_hoa_don_chi_tiet NVARCHAR(50),
    tien_giam_gia INT,
    ghi_chu VARCHAR(255),
    trang_thai INT,
    FOREIGN KEY (id_dong_ho_chi_tiet) REFERENCES dong_ho_chi_tiet(id),
    FOREIGN KEY (id_phieu_giam_gia) REFERENCES phieu_giam_gia(id),
    FOREIGN KEY (id_nhan_vien) REFERENCES Nhan_Vien(id),
    FOREIGN KEY (id_hoa_don) REFERENCES Hoa_Don(id)
);

CREATE TABLE hinh_thuc_thanh_toan (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_hoa_don_chi_tiet INT,
    hinh_thuc_thanh_toan VARCHAR(100) NOT NULL,
    so_tien DECIMAL(10,2) NOT NULL,
    trang_thai INT,
    FOREIGN KEY (id_hoa_don_chi_tiet) REFERENCES hoa_don_chi_tiet(id)
);

-- Giỏ hàng
CREATE TABLE gio_hang (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_khach_hang INT,
    ma VARCHAR(50) UNIQUE,
    ngay_tao DATETIME DEFAULT CURRENT_TIMESTAMP,
    trang_thai INT,
    FOREIGN KEY (id_khach_hang) REFERENCES Khach_Hang(id)
);

CREATE TABLE gio_hang_chi_tiet (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_gio_hang INT,
    id_dong_ho_chi_tiet INT,
    so_luong INT NOT NULL,
    gia_tien DECIMAL(10,2) NOT NULL,
    trang_thai INT,
    ngay_tao DATE DEFAULT CURRENT_TIMESTAMP,
    ngay_sua DATE,
    thoi_gian_voucher DATETIME,
    FOREIGN KEY (id_gio_hang) REFERENCES gio_hang(id) ON DELETE CASCADE,
    FOREIGN KEY (id_dong_ho_chi_tiet) REFERENCES dong_ho_chi_tiet(id)
);

-- Hệ thống quyền
CREATE TABLE role (
    id INT PRIMARY KEY IDENTITY(1,1),
    name VARCHAR(50)
);

CREATE TABLE users (
    id INT PRIMARY KEY IDENTITY(1,1),
    user_name NVARCHAR(255),
    email VARCHAR(255),
    phone_number VARCHAR(20),
    password VARCHAR(255),
    enabled BIT
);

CREATE TABLE user_role (
    role_id INT,
    user_id INT,
    PRIMARY KEY (role_id, user_id),
    FOREIGN KEY (role_id) REFERENCES role(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);


-- Bảng phan_loai
INSERT INTO phan_loai (phan_loai, trang_thai) VALUES
(N'Casual', 1),
(N'Formal', 1),
(N'Sports', 1),
(N'Luxury', 1);

-- Bảng chat_lieu
INSERT INTO chat_lieu (loai_chat_lieu, trang_thai) VALUES
(N'Thép không gỉ', 1),
(N'Vàng', 1),
(N'Nhựa', 1),
(N'Da', 1);

-- Bảng loai_dong_ho
INSERT INTO loai_dong_ho (ten_loai, trang_thai) VALUES
(N'Analog', 1),
(N'Digital', 1),
(N'Smartwatch', 1),
(N'Automatic', 1);

-- Bảng hang_dong_ho
INSERT INTO hang_dong_ho (ten_hang, trang_thai) VALUES
(N'Rolex', 1),
(N'Omega', 1),
(N'Casio', 1),
(N'Seiko', 1);

-- Bảng xuat_xu
INSERT INTO xuat_xu (ten_xuat_xu, trang_thai) VALUES
(N'Thụy Sĩ', 1),
(N'Nhật Bản', 1),
(N'Hoa Kỳ', 1),
(N'Đức', 1);

-- Bảng dong_ho
INSERT INTO dong_ho (ten_dong_ho, mo_ta, trang_thai, hinh_anh) VALUES
(N'Rolex Submariner', N'Đồng hồ lặn chuyên dụng', 1, 'rolex.jpg'),
(N'Omega Speedmaster', N'Đồng hồ phi hành gia', 1, 'omega.jpg'),
(N'Casio G-Shock', N'Đồng hồ thể thao bền bỉ', 1, 'casio.jpg'),
(N'Seiko 5', N'Đồng hồ tự động phổ thông', 1, 'seiko.jpg');

-- Bảng dong_ho_chi_tiet
INSERT INTO dong_ho_chi_tiet (id_dong_ho, id_phan_loai, id_loai, id_hang_dong_ho, id_xuat_xu, id_chat_lieu, trang_thai, gia_tien, gioi_tinh, chuc_nang) VALUES
(1, 4, 4, 1, 1, 2, 1, 5000.00, 1, N'Chống nước, chống sốc'),
(2, 3, 1, 2, 1, 1, 1, 3000.00, 1, N'Chronograph, chống nước'),
(3, 2, 2, 3, 2, 3, 1, 200.00, 0, N'Chống nước, báo thức'),
(4, 1, 4, 4, 2, 4, 1, 150.00, 0, N'Tự động lên dây');

-- Bảng Nhan_Vien
INSERT INTO Nhan_Vien (ma_nhan_vien, ten_nhan_vien, mat_khau, email, gioi_tinh, sdt, dia_chi, trang_thai) VALUES
('NV001', N'Nguyễn Văn A', 'password123', 'a@email.com', 1, '0123456789', N'Hà Nội', 1),
('NV002', N'Trần Thị B', 'password456', 'b@email.com', 0, '0987654321', N'Hồ Chí Minh', 1),
('NV003', N'Lê Văn C', 'password789', 'c@email.com', 1, '0345678912', N'Đà Nẵng', 1),
('NV004', N'Phạm Thị D', 'password000', 'd@email.com', 0, '0765432109', N'Cần Thơ', 1);

-- Bảng Khach_Hang
INSERT INTO Khach_Hang (ma_khach_hang, mat_khau, ho_va_ten, email, gioi_tinh, so_dien_thoai, trang_thai) VALUES
('KH001', 'pass123', N'Nguyễn An', 'an@email.com', 1, '0912345678', 1),
('KH002', 'pass456', N'Trần Bình', 'binh@email.com', 0, '0923456789', 1),
('KH003', 'pass789', N'Lê Cường', 'cuong@email.com', 1, '0934567890', 1),
('KH004', 'pass000', N'Phạm Dung', 'dung@email.com', 0, '0945678901', 1);

INSERT INTO phieu_giam_gia (ma_phieu_giam_gia, ten_phieu_giam_gia, so_luong, muc_giam, dieu_kien_su_dung, gia_tri_toi_da, hinh_thuc_giam_gia, ngay_bat_dau, ngay_ket_thuc, ghi_chu, trang_thai)
VALUES
('GIAM50K', N'Giảm 50K cho đơn từ 500K', 100, 50000, 500000, 50000, 0, '2025-03-01', '2025-03-31', N'Chỉ áp dụng cho khách hàng mới', 1),
('GIAM10%', N'Giảm 10% cho đơn từ 1 triệu', 200, 10, 1000000, 200000, 1, '2025-03-05', '2025-04-05', N'Không áp dụng cho sản phẩm khuyến mãi', 1),
('FREESHIP', N'Miễn phí vận chuyển cho đơn từ 300K', 500, 30000, 300000, 30000, 0, '2025-03-10', '2025-03-25', N'Áp dụng toàn quốc', 1),
('FLASHSALE', N'Giảm 20% tối đa 100K', 50, 20, 200000, 100000, 1, '2025-03-15', '2025-03-20', N'Chỉ áp dụng cho sản phẩm flash sale', 1);

INSERT INTO phieu_giam_gia_chi_tiet (id_khach_hang, id_phieu_giam_gia, trang_thai)
VALUES
(1, 1, 1),  -- Khách hàng 1 sử dụng phiếu giảm giá 1, đang hoạt động
(2, 2, 0),  -- Khách hàng 2 đã nhận phiếu giảm giá 2 nhưng chưa sử dụng
(3, 3, 1),  -- Khách hàng 3 sử dụng phiếu giảm giá 3, đang hoạt động
(4, 4, 1);  -- Khách hàng 4 đã sử dụng phiếu giảm giá 4 (trạng thái 2: đã sử dụng)

INSERT INTO Hoa_Don (id_nhan_vien, Id_khach_hang, ma_hoa_don, ngay_tao, loai, tong_tien, ghi_chu, trang_thai)
VALUES
(1, 1, 'HD20250301A', '2025-03-01 10:30:00', 0, 1500000.00, 'Thanh toán tiền mặt', 1),
(2, 2, 'HD20250302B', '2025-03-02 14:45:00', 1, 750000.00, 'Thanh toán chuyển khoản', 1),
(3, 3, 'HD20250303C', '2025-03-03 16:20:00', 0, 2000000.00, 'Đã áp dụng mã giảm giá', 1),
(4, 4, 'HD20250304D', '2025-03-04 18:10:00', 1, 500000.00, 'Hóa đơn hoàn trả', 2);

INSERT INTO hoa_don_chi_tiet (id_dong_ho_chi_tiet, id_phieu_giam_gia, id_nhan_vien, id_hoa_don, id_hinh_thuc_thanh_toan, ma_hoa_don_chi_tiet, tien_giam_gia, ghi_chu, trang_thai)
VALUES
(1, 1, 1, 1, 1, N'HDCT20250301A', 50000, N'Áp dụng mã giảm giá 50K', 1),
(2, NULL, 2, 2, 2, N'HDCT20250302B', 0, N'Không sử dụng mã giảm giá', 1),
(3, 2, 3, 3, 1, N'HDCT20250303C', 200000, N'Giảm giá 10%', 1),
(4, 3, 4, 4, 2, N'HDCT20250304D', 30000, N'Miễn phí vận chuyển', 2);

INSERT INTO hinh_thuc_thanh_toan (id_hoa_don_chi_tiet, hinh_thuc_thanh_toan, so_tien, trang_thai)
VALUES
(1, 'Tiền mặt', 1450000.00, 1),
(2, 'Chuyển khoản', 750000.00, 1),
(3, 'Thẻ tín dụng', 1800000.00, 1),
(4, 'Ví điện tử', 470000.00, 2);

INSERT INTO gio_hang (id_khach_hang, ma, ngay_tao, trang_thai)
VALUES
(1, 'GH20250301A', '2025-03-01 08:30:00', 1),
(2, 'GH20250302B', '2025-03-02 12:45:00', 1),
(3, 'GH20250303C', '2025-03-03 15:20:00', 0),
(4, 'GH20250304D', '2025-03-04 18:10:00', 2);

INSERT INTO gio_hang_chi_tiet (id_gio_hang, id_dong_ho_chi_tiet, so_luong, gia_tien, trang_thai, ngay_tao, ngay_sua, thoi_gian_voucher)
VALUES
(1, 1, 2, 500000.00, 1, '2025-03-01', NULL, NULL),
(2, 3, 1, 1200000.00, 1, '2025-03-02', '2025-03-02', '2025-03-10 23:59:59'),
(3, 2, 3, 750000.00, 0, '2025-03-03', NULL, NULL),
(4, 4, 1, 2000000.00, 2, '2025-03-04', '2025-03-05', NULL);

INSERT INTO role (name)
VALUES 
('ADMIN'),
('USER');

INSERT INTO users (user_name, email, phone_number, password, enabled)
VALUES 
(N'NguyenTienHai', 'hai.nguyen@example.com', '0987654321', 'hashedpassword1', 1),
(N'TranVanB', 'b.tran@example.com', '0976543210', 'hashedpassword2', 1),
(N'LeThiC', 'c.le@example.com', '0965432109', 'hashedpassword3', 0),
(N'PhamD', 'd.pham@example.com', '0954321098', 'hashedpassword4', 1);

INSERT INTO user_role (role_id, user_id)
VALUES 
(1, 1), -- Admin cho user 1
(2, 2) -- User thường cho user 2

-- Danh mục
SELECT * FROM phan_loai;
SELECT * FROM chat_lieu;
SELECT * FROM loai_dong_ho;
SELECT * FROM hang_dong_ho;
SELECT * FROM xuat_xu;

-- Sản phẩm
SELECT * FROM dong_ho;
SELECT * FROM dong_ho_chi_tiet;

-- Nhân viên & Khách hàng
SELECT * FROM Nhan_Vien;
SELECT * FROM Khach_Hang;

-- Phiếu giảm giá
SELECT * FROM phieu_giam_gia;
SELECT * FROM phieu_giam_gia_chi_tiet;

-- Hóa đơn & Thanh toán
SELECT * FROM Hoa_Don;
SELECT * FROM hoa_don_chi_tiet;
SELECT * FROM hinh_thuc_thanh_toan;

-- Giỏ hàng
SELECT * FROM gio_hang;
SELECT * FROM gio_hang_chi_tiet;

-- Hệ thống quyền
SELECT * FROM role;
SELECT * FROM users;
SELECT * FROM user_role;



