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

CREATE TABLE thuong_hieu (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_thuong_hieu NVARCHAR(255),
    trang_thai INT
);

-- Sản phẩm
CREATE TABLE dong_ho (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_dong_ho NVARCHAR(255),
    dia_chi NVARCHAR(255),
    trang_thai INT,
    hinh_anh VARCHAR(255)
);

CREATE TABLE dong_ho_chi_tiet (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_dong_ho INT,
    id_phan_loai INT,
    id_thuong_hieu INT,
    id_hang_dong_ho INT,
    id_chat_lieu INT,
    trang_thai INT,
    gia_tien DECIMAL(10,2),
    gioi_tinh INT,
    chuc_nang NVARCHAR(255),
    FOREIGN KEY (id_dong_ho) REFERENCES dong_ho(id),
    FOREIGN KEY (id_phan_loai) REFERENCES phan_loai(id),
    FOREIGN KEY (id_thuong_hieu) REFERENCES thuong_hieu(id),
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

-- Hệ thống quyền
CREATE TABLE role (
    id INT PRIMARY KEY IDENTITY(1,1),
    name VARCHAR(50)
);

CREATE TABLE users(
    id INT PRIMARY KEY IDENTITY(1,1),
    user_name NVARCHAR(255),
    Email VARCHAR(255),
    phone_number VARCHAR(20),
    password VARCHAR(255),
    enabled BIT
);

CREATE TABLE user_role (
    role_id INT,
    user_id INT,
    FOREIGN KEY (role_id) REFERENCES role(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);
