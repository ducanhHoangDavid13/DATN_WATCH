CREATE DATABASE Watch_Store_DATN_SD19;
GO
USE Watch_Store_DATN_SD19;
Go
DROP TABLE phan_loai
-- Bảng phân loại
CREATE TABLE phan_loai (
    id INT PRIMARY KEY IDENTITY(1,1),
	ma VARCHAR(255) UNIQUE,
    phan_loai NVARCHAR(255),
    trang_thai INT
);

-- Bảng chất liệu
CREATE TABLE chat_lieu (
   id INT PRIMARY KEY IDENTITY(1,1),
   	ma VARCHAR(255) UNIQUE,
    loai_chat_lieu NVARCHAR(255),
    trang_thai INT
);

-- Bảng xuất xứ
CREATE TABLE xuat_xu (
    id INT PRIMARY KEY IDENTITY(1,1),
		ma VARCHAR(255) UNIQUE,
    ten_xuat_xu NVARCHAR(255),
    trang_thai INT
);

-- Bảng hãng đồng hồ
CREATE TABLE hang_dong_ho (
    id INT PRIMARY KEY IDENTITY(1,1),
	ma VARCHAR(255) UNIQUE,
    ten_hang NVARCHAR(255),
    trang_thai INT
);

-- Bảng loại đồng hồ
CREATE TABLE loai_dong_ho (
    id INT PRIMARY KEY IDENTITY(1,1),
	ma VARCHAR(255) UNIQUE,
    ten_loai NVARCHAR(255),
    trang_thai INT
);

DROP TABLE dong_ho
CREATE TABLE dong_ho(
   id INT PRIMARY KEY IDENTITY(1,1),
   	ma_dong_ho VARCHAR(255)UNIQUE,
    ten_dong_ho NVARCHAR(255),
    trang_thai INT,
	hinh_anh VARCHAR(MAX)
);

-- Bảng đồng hồ
CREATE TABLE dong_ho_chi_tiet (
   id INT PRIMARY KEY IDENTITY(1,1),
    id_dong_ho INT NOT NULL,
    id_phan_loai INT NOT NULL,
    id_xuat_xu INT NOT NULL,
    id_hang_dong_ho INT NOT NULL,
    id_chat_lieu INT NOT NULL,
    id_loai INT NOT NULL,
    gia_tien DECIMAL(10,2),
    gioi_tinh INT,
    so_serial NVARCHAR(255),
    trang_thai INT,
    FOREIGN KEY (id_phan_loai) REFERENCES phan_loai(id),
	FOREIGN KEY (id_dong_ho) REFERENCES dong_ho(id),
    FOREIGN KEY (id_xuat_xu) REFERENCES xuat_xu(id),
    FOREIGN KEY (id_hang_dong_ho) REFERENCES hang_dong_ho(id),
    FOREIGN KEY (id_chat_lieu) REFERENCES chat_lieu(id),
    FOREIGN KEY (id_loai) REFERENCES loai_dong_ho(id)
);
CREATE INDEX idx_so_serial ON dong_ho_chi_tiet(so_serial);

--Hoa don
CREATE TABLE Hoa_Don (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_nhan_vien INT NOT NULL,
    id_khach_hang INT NOT NULL,
    ma_hoa_don VARCHAR(255) UNIQUE,
    ngay_tao DATETIME DEFAULT GETDATE(),
    loai BIT,
    tong_tien DECIMAL(10,2),
    ghi_chu VARCHAR(255),
    trang_thai VARCHAR(255),
    FOREIGN KEY (id_nhan_vien) REFERENCES Nhan_Vien(id),
    FOREIGN KEY (id_khach_hang) REFERENCES Khach_Hang(id)
);
-- Bảng hoa don chi tiet
CREATE TABLE hoa_don_chi_tiet (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_hoa_don INT NOT NULL,
    id_dong_ho_chi_tiet INT NOT NULL,
    id_phieu_giam_gia INT NULL,
    id_hinh_thuc_thanh_toan INT NOT NULL,
    so_luong INT NOT NULL,
    gia_tien DECIMAL(10,2),
    tien_giam_gia DECIMAL(10,2) DEFAULT 0,
    ghi_chu VARCHAR(255),
    trang_thai INT,
    FOREIGN KEY (id_hoa_don) REFERENCES Hoa_Don(id),
    FOREIGN KEY (id_dong_ho_chi_tiet) REFERENCES dong_ho_chi_tiet(id),
    FOREIGN KEY (id_phieu_giam_gia) REFERENCES phieu_giam_gia(id),
    FOREIGN KEY (id_hinh_thuc_thanh_toan) REFERENCES hinh_thuc_thanh_toan(id)
);

-- Bảng giỏ hàng
CREATE TABLE gio_hang (
  id INT PRIMARY KEY IDENTITY(1,1),
    id_khach_hang INT NOT NULL,
    id_dong_ho INT NOT NULL,
	ma VARCHAR(255),
    so_luong INT,
    gia_tien DECIMAL(10,2),
    trang_thai INT,
    ngay_tao DATE,
    ngay_sua DATE,
    thoi_gian_voucher DATETIME,
    FOREIGN KEY (id_khach_hang) REFERENCES Khach_Hang(id),
    FOREIGN KEY (id_dong_ho) REFERENCES dong_ho(id)
);

-- Bảng khách hàng
CREATE TABLE Khach_Hang (
    id INT PRIMARY KEY IDENTITY(1,1),
    ma_khach_hang VARCHAR(255),
    mat_khau VARCHAR(255),
    ho_va_ten NVARCHAR(255),
    email VARCHAR(255),
    gioi_tinh INT,
    so_dien_thoai VARCHAR(255),
    trang_thai VARCHAR(255)
);

-- Bảng nhân viên
CREATE TABLE Nhan_Vien (
   id INT PRIMARY KEY IDENTITY(1,1),
    ma_nhan_vien VARCHAR(255),
    ten_nhan_vien NVARCHAR(255),
    mat_khau VARCHAR(255),
    email VARCHAR(255),
    gioi_tinh BIT,
    sdt VARCHAR(255),
    dia_chi NVARCHAR(255),
    trang_thai VARCHAR(255)
);

-- Bảng hóa đơn
CREATE TABLE Hoa_Don (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_nhan_vien INT,
    id_khach_hang INT,
    ma_hoa_don VARCHAR(255),
    ngay_tao DATETIME,
    loai BIT,
    tong_tien DECIMAL(10,2),
    ghi_chu VARCHAR(255),
    trang_thai VARCHAR(255),
    FOREIGN KEY (id_nhan_vien) REFERENCES Nhan_Vien(id),
    FOREIGN KEY (id_khach_hang) REFERENCES Khach_Hang(id)
);
-- Bảng phiếu giảm giá
CREATE TABLE phieu_giam_gia (
    id INT PRIMARY KEY,
    ma_phieu_giam_gia VARCHAR(255),
    ten_phieu_giam_gia NVARCHAR(255),
    so_luong INT,
    muc_giam FLOAT,
    dieu_kien_su_dung FLOAT,
    gia_tri_toi_da FLOAT,
    hinh_thuc_giam_gia BIT,
    ngay_bat_dau DATE,
    ngay_ket_thuc DATE,
    ghi_chu NVARCHAR(255),
    trang_thai VARCHAR(255)
);

-- Bảng phiếu giảm giá chi tiết
CREATE TABLE phieu_giam_gia_chi_tiet (
    id INT PRIMARY KEY,
    id_khach_hang INT,
    id_phieu_giam_gia INT,
    trang_thai VARCHAR(255),
    FOREIGN KEY (id_khach_hang) REFERENCES Khach_Hang(id),
    FOREIGN KEY (id_phieu_giam_gia) REFERENCES phieu_giam_gia(id)
);

-- Bảng hình thức thanh toán
CREATE TABLE hinh_thuc_thanh_toan (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_hoa_don INT,
    hinh_thuc_thanh_toan VARCHAR(255),
    so_tien DECIMAL(10,2),
    trang_thai INT,
    FOREIGN KEY (id_hoa_don) REFERENCES Hoa_Don(id)
);

-- Bảng quyền
CREATE TABLE role (
   id INT PRIMARY KEY IDENTITY(1,1),
    name VARCHAR(50)
);

-- Bảng người dùng
CREATE TABLE users (
  id INT PRIMARY KEY IDENTITY(1,1),
    user_name NVARCHAR(255),
    email VARCHAR(255),
    phone_number VARCHAR(20),
    password VARCHAR(255),
    enabled BIT
);

-- Bảng quyền người dùng
CREATE TABLE user_role (
    role_id INT,
    user_id INT,
    FOREIGN KEY (role_id) REFERENCES role(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);
