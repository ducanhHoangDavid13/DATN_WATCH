INSERT INTO phan_loai (ma, phan_loai, trang_thai) VALUES
('PL001', N'Đồng hồ cơ', 1),
('PL002', N'Đồng hồ quartz', 1),
('PL003', N'Đồng hồ thông minh', 1),
('PL004', N'Đồng hồ hybrid', 1),
('PL005', N'Đồng hồ chronograph', 1),
('PL006', N'Đồng hồ thể thao', 1),
('PL007', N'Đồng hồ thời trang', 1),
('PL008', N'Đồng hồ cổ điển', 1),
('PL009', N'Đồng hồ lặn', 1),
('PL010', N'Đồng hồ quân đội', 1);
select * from phan_loai
--Bảng
INSERT INTO chat_lieu (ma, loai_chat_lieu, trang_thai) VALUES
('CL001', N'Thép không gỉ', 1),
('CL002', N'Vàng 18K', 1),
('CL003', N'Titan', 1),
('CL004', N'Da thật', 1),
('CL005', N'Nhựa cao cấp', 1),
('CL006', N'Hợp kim', 1),
('CL007', N'Gốm sứ', 1),
('CL008', N'Vàng hồng', 1),
('CL009', N'Bạc', 1),
('CL010', N'Nhôm', 1);
select * from chat_lieu
--Bảng
INSERT INTO xuat_xu (ma, ten_xuat_xu, trang_thai) VALUES
('XX001', N'Thụy Sĩ', 1),
('XX002', N'Nhật Bản', 1),
('XX003', N'Đức', 1),
('XX004', N'Mỹ', 1),
('XX005', N'Trung Quốc', 1),
('XX006', N'Pháp', 1),
('XX007', N'Ý', 1),
('XX008', N'Hàn Quốc', 1),
('XX009', N'Anh', 1),
('XX010', N'Nga', 1);
select *from xuat_xu
--Bảng
INSERT INTO hang_dong_ho (ma, ten_hang, trang_thai) VALUES
('HDH001', N'Rolex', 1),
('HDH002', N'Omega', 1),
('HDH003', N'Casio', 1),
('HDH004', N'Seiko', 1),
('HDH005', N'Citizen', 1),
('HDH006', N'Patek Philippe', 1),
('HDH007', N'Tissot', 1),
('HDH008', N'Longines', 1),
('HDH009', N'Hublot', 1),
('HDH010', N'Cartier', 1);
select *from hang_dong_ho
--Bảng
INSERT INTO loai_dong_ho (ma, ten_loai, trang_thai) VALUES
('LDH001', N'Đồng hồ nam', 1),
('LDH002', N'Đồng hồ nữ', 1),
('LDH003', N'Đồng hồ unisex', 1),
('LDH004', N'Đồng hồ trẻ em', 1),
('LDH005', N'Đồng hồ đôi', 1),
('LDH006', N'Đồng hồ thể thao', 1),
('LDH007', N'Đồng hồ thời trang', 1),
('LDH008', N'Đồng hồ luxury', 1),
('LDH009', N'Đồng hồ thông minh', 1),
('LDH010', N'Đồng hồ cổ điển', 1);
select *from loai_dong_ho
--Bảng
INSERT INTO dong_ho (ma_dong_ho, ten_dong_ho, trang_thai, hinh_anh) VALUES
('DH001', N'Rolex Submariner', 1, NULL),
('DH002', N'Omega Seamaster', 1, NULL),
('DH003', N'Casio G-Shock', 1, NULL),
('DH004', N'Seiko Prospex', 1, NULL),
('DH005', N'Citizen Eco-Drive', 1, NULL),
('DH006', N'Patek Philippe Nautilus', 1, NULL),
('DH007', N'Tissot Le Locle', 1, NULL),
('DH008', N'Longines Master', 1, NULL),
('DH009', N'Hublot Big Bang', 1, NULL),
('DH010', N'Cartier Tank', 1, NULL);
select *from dong_ho
--Bảng
INSERT INTO dong_ho_chi_tiet (id_dong_ho, id_phan_loai, id_xuat_xu, id_hang_dong_ho, id_chat_lieu, id_loai, gia_tien, gioi_tinh, so_serial, trang_thai) VALUES
(1, 1, 1, 1, 1, 1, 15000.00, 1, 'SER001', 1),
(2, 2, 2, 2, 2, 2, 5000.00, 0, 'SER002', 1),
(3, 3, 3, 3, 3, 3, 200.00, 1, 'SER003', 1),
(4, 4, 4, 4, 4, 1, 300.00, 1, 'SER004', 1),
(5, 5, 5, 5, 5, 2, 250.00, 0, 'SER005', 1),
(6, 6, 6, 6, 6, 3, 25000.00, 1, 'SER006', 1),
(7, 7, 7, 7, 7, 1, 400.00, 1, 'SER007', 1),
(8, 8, 8, 8, 8, 2, 1200.00, 0, 'SER008', 1),
(9, 9, 9, 9, 9, 3, 8000.00, 1, 'SER009', 1),
(10, 10, 10, 10, 10, 1, 6000.00, 0, 'SER010', 1);
select *from dong_ho_chi_tiet
--Bảng
INSERT INTO Khach_Hang (ma_khach_hang, mat_khau, ho_va_ten, email, gioi_tinh, so_dien_thoai, trang_thai) VALUES
('KH001', 'pass123', N'Nguyễn Văn A', 'nva@gmail.com', 1, '0901234567', 'Active'),
('KH002', 'pass456', N'Trần Thị B', 'ttb@gmail.com', 0, '0912345678', 'Active'),
('KH003', 'pass789', N'Lê Văn C', 'lvc@gmail.com', 1, '0923456789', 'Active'),
('KH004', 'pass101', N'Phạm Thị D', 'ptd@gmail.com', 0, '0934567890', 'Active'),
('KH005', 'pass112', N'Hoàng Văn E', 'hve@gmail.com', 1, '0945678901', 'Active'),
('KH006', 'pass131', N'Vũ Thị F', 'vtf@gmail.com', 0, '0956789012', 'Active'),
('KH007', 'pass415', N'Đỗ Văn G', 'dvg@gmail.com', 1, '0967890123', 'Active'),
('KH008', 'pass161', N'Bùi Thị H', 'bth@gmail.com', 0, '0978901234', 'Active'),
('KH009', 'pass718', N'Ngô Văn I', 'nvi@gmail.com', 1, '0989012345', 'Active'),
('KH010', 'pass192', N'Lý Thị K', 'ltk@gmail.com', 0, '0990123456', 'Active');
select * from Khach_Hang
--Bảng
INSERT INTO Nhan_Vien (ma_nhan_vien, ten_nhan_vien, mat_khau, email, gioi_tinh, sdt, dia_chi, trang_thai) VALUES
('NV001', N'Nguyễn Văn X', 'nv123', 'nvx@gmail.com', 1, '0901112233', N'Hà Nội', 'Active'),
('NV002', N'Trần Thị Y', 'nv456', 'tty@gmail.com', 0, '0912223344', N'TP.HCM', 'Active'),
('NV003', N'Lê Văn Z', 'nv789', 'lvz@gmail.com', 1, '0923334455', N'Đà Nẵng', 'Active'),
('NV004', N'Phạm Thị T', 'nv101', 'ptt@gmail.com', 0, '0934445566', N'Hải Phòng', 'Active'),
('NV005', N'Hoàng Văn U', 'nv112', 'hvu@gmail.com', 1, '0945556677', N'Cần Thơ', 'Active'),
('NV006', N'Vũ Thị V', 'nv131', 'vtv@gmail.com', 0, '0956667788', N'Huế', 'Active'),
('NV007', N'Đỗ Văn W', 'nv415', 'dvw@gmail.com', 1, '0967778899', N'Nha Trang', 'Active'),
('NV008', N'Bùi Thị Q', 'nv161', 'btq@gmail.com', 0, '0978889900', N'Vũng Tàu', 'Active'),
('NV009', N'Ngô Văn R', 'nv718', 'nvr@gmail.com', 1, '0989990011', N'Quy Nhơn', 'Active'),
('NV010', N'Lý Thị S', 'nv192', 'lts@gmail.com', 0, '0990001122', N'Pleiku', 'Active');
select * from Nhan_Vien
--Bảng
INSERT INTO Hoa_Don (id_nhan_vien, id_khach_hang, ma_hoa_don, ngay_tao, loai, tong_tien, ghi_chu, trang_thai) VALUES
(1, 1, 'HD001', '2025-03-01', 1, 15000.00, 'Thanh toán tiền mặt', 'Completed'),
(2, 2, 'HD002', '2025-03-02', 0, 5000.00, 'Thanh toán online', 'Completed'),
(3, 3, 'HD003', '2025-03-03', 1, 200.00, 'Giao hàng', 'Pending'),
(4, 4, 'HD004', '2025-03-04', 0, 300.00, 'Khách quen', 'Completed'),
(5, 5, 'HD005', '2025-03-05', 1, 250.00, 'Thanh toán thẻ', 'Completed'),
(6, 6, 'HD006', '2025-03-06', 0, 25000.00, 'Hàng cao cấp', 'Completed'),
(7, 7, 'HD007', '2025-03-07', 1, 400.00, 'Khách VIP', 'Pending'),
(8, 8, 'HD008', '2025-03-08', 0, 1200.00, 'Thanh toán chuyển khoản', 'Completed'),
(9, 9, 'HD009', '2025-03-09', 1, 8000.00, 'Giao hàng nhanh', 'Completed'),
(10, 10, 'HD010', '2025-03-09', 0, 6000.00, 'Khuyến mãi', 'Completed');
select * from Hoa_Don
--Bảng
INSERT INTO hoa_don_chi_tiet (id_hoa_don, id_dong_ho_chi_tiet, id_phieu_giam_gia, id_hinh_thuc_thanh_toan, so_luong, gia_tien, tien_giam_gia, ghi_chu, trang_thai) VALUES
(1, 1, NULL, 1, 1, 15000.00, 0.00, N'Đồng hồ cao cấp', 1),
(2, 2, NULL, 2, 1, 5000.00, 0.00, N'Đồng hồ nữ', 1),
(3, 3, NULL, 3, 2, 200.00, 0.00, N'Mua số lượng lớn', 1),
(4, 4, NULL, 4, 1, 300.00, 0.00, N'Khách quen', 1),
(5, 5, NULL, 5, 1, 250.00, 0.00, N'Thanh toán nhanh', 1),
(6, 6, NULL, 6, 1, 25000.00, 0.00, N'Hàng luxury', 1),
(7, 7, NULL, 7, 1, 400.00, 0.00, N'Đồng hồ nam', 1),
(8, 8, NULL, 8, 1, 1200.00, 0.00, N'Khuyến mãi', 1),
(9, 9, NULL, 9, 1, 8000.00, 0.00, N'Giao hàng', 1),
(10, 10, NULL, 10, 1, 6000.00, 0.00, N'Đồng hồ unisex', 1);
select * from hoa_don_chi_tiet
--Bảng
INSERT INTO gio_hang (id_khach_hang, id_dong_ho, ma, so_luong, gia_tien, trang_thai, ngay_tao, ngay_sua, thoi_gian_voucher) VALUES
(1, 1, 'GH001', 1, 15000.00, 1, '2025-03-01', '2025-03-02', NULL),
(2, 2, 'GH002', 2, 5000.00, 1, '2025-03-02', '2025-03-03', NULL),
(3, 3, 'GH003', 1, 200.00, 1, '2025-03-03', '2025-03-04', NULL),
(4, 4, 'GH004', 1, 300.00, 1, '2025-03-04', '2025-03-05', NULL),
(5, 5, 'GH005', 3, 250.00, 1, '2025-03-05', '2025-03-06', NULL),
(6, 6, 'GH006', 1, 25000.00, 1, '2025-03-06', '2025-03-07', NULL),
(7, 7, 'GH007', 2, 400.00, 1, '2025-03-07', '2025-03-08', NULL),
(8, 8, 'GH008', 1, 1200.00, 1, '2025-03-08', '2025-03-09', NULL),
(9, 9, 'GH009', 1, 8000.00, 1, '2025-03-09', '2025-03-09', NULL),
(10, 10, 'GH010', 1, 6000.00, 1, '2025-03-09', '2025-03-09', NULL);
select *from gio_hang
--Bảng
INSERT INTO phieu_giam_gia (id, ma_phieu_giam_gia, ten_phieu_giam_gia, so_luong, muc_giam, dieu_kien_su_dung, gia_tri_toi_da, hinh_thuc_giam_gia, ngay_bat_dau, ngay_ket_thuc, ghi_chu, trang_thai) VALUES
(1, 'PGG001', N'Giảm giá 10%', 100, 10.0, 500.00, 1000.00, 1, '2025-03-01', '2025-03-31', N'Áp dụng toàn cửa hàng', 'Active'),
(2, 'PGG002', N'Giảm 500k', 50, 500.00, 5000.00, 500.00, 0, '2025-03-02', '2025-03-15', N'Hàng cao cấp', 'Active'),
(3, 'PGG003', N'Giảm giá 20%', 200, 20.0, 1000.00, 2000.00, 1, '2025-03-03', '2025-03-20', N'Khuyến mãi đặc biệt', 'Active'),
(4, 'PGG004', N'Giảm 200k', 80, 200.00, 2000.00, 200.00, 0, '2025-03-04', '2025-03-25', N'Khách VIP', 'Active'),
(5, 'PGG005', N'Giảm giá 15%', 150, 15.0, 800.00, 1500.00, 1, '2025-03-05', '2025-03-30', N'Mua sắm online', 'Active'),
(6, 'PGG006', N'Giảm 1000k', 30, 1000.00, 10000.00, 1000.00, 0, '2025-03-06', '2025-03-12', N'Hàng luxury', 'Active'),
(7, 'PGG007', N'Giảm giá 5%', 300, 5.0, 300.00, 500.00, 1, '2025-03-07', '2025-03-28', N'Đồng hồ cơ bản', 'Active'),
(8, 'PGG008', N'Giảm 300k', 60, 300.00, 3000.00, 300.00, 0, '2025-03-08', '2025-03-22', N'Khách mới', 'Active'),
(9, 'PGG009', N'Giảm giá 25%', 120, 25.0, 1500.00, 2500.00, 1, '2025-03-09', '2025-03-18', N'Sale lớn', 'Active'),
(10, 'PGG010', N'Giảm 700k', 40, 700.00, 7000.00, 700.00, 0, '2025-03-09', '2025-03-16', N'Đồng hồ cao cấp', 'Active');
select *from phieu_giam_gia
--Bảng
INSERT INTO phieu_giam_gia_chi_tiet (id, id_khach_hang, id_phieu_giam_gia, trang_thai) VALUES
(1, 1, 1, 'Used'),
(2, 2, 2, 'Active'),
(3, 3, 3, 'Active'),
(4, 4, 4, 'Used'),
(5, 5, 5, 'Active'),
(6, 6, 6, 'Used'),
(7, 7, 7, 'Active'),
(8, 8, 8, 'Active'),
(9, 9, 9, 'Used'),
(10, 10, 10, 'Active');
select * from phieu_giam_gia_chi_tiet
--Bảng
INSERT INTO hinh_thuc_thanh_toan (id_hoa_don, hinh_thuc_thanh_toan, so_tien, trang_thai) VALUES
(1, 'Tiền mặt', 15000.00, 1),
(2, 'Chuyển khoản', 5000.00, 1),
(3, 'Thẻ tín dụng', 200.00, 1),
(4, 'Ví điện tử', 300.00, 1),
(5, 'Tiền mặt', 250.00, 1),
(6, 'Chuyển khoản', 25000.00, 1),
(7, 'Thẻ tín dụng', 400.00, 1),
(8, 'Ví điện tử', 1200.00, 1),
(9, 'Tiền mặt', 8000.00, 1),
(10, 'Chuyển khoản', 6000.00, 1);
select * FROm hinh_thuc_thanh_toan
--Bảng
INSERT INTO role (name) VALUES
('Admin'),
('Staff'),
('Customer')
select *from role
--bảng
INSERT INTO users (user_name, email, phone_number, password, enabled) VALUES
(N'admin1', 'admin1@gmail.com', '0901112233', 'admin123', 1),
(N'staff1', 'staff1@gmail.com', '0912223344', 'staff123', 1),
(N'customer1', 'customer1@gmail.com', '0923334455', 'cust123', 1),
(N'staff2', 'manager1@gmail.com', '0934445566', 'man123', 1),
(N'staff3', 'sales1@gmail.com', '0945556677', 'sale123', 1),
(N'customer2', 'support1@gmail.com', '0956667788', 'sup123', 1),
(N'customer3', 'guest1@gmail.com', '0967778899', 'guest123', 1),
(N'customer4', 'dev1@gmail.com', '0978889900', 'dev123', 1),
(N'customer5', 'audit1@gmail.com', '0989990011', 'audit123', 1),
(N'customer6', 'marketing1@gmail.com', '0990001122', 'mark123', 1);
select *from users
--Bảng
INSERT INTO user_role (role_id, user_id) VALUES
(1, 1), 
(2, 2), 
(3, 3), 
(2, 4), 
(2, 5),
(3, 6), 
(3, 7), 
(3, 8),
(3, 9), 
(3, 10); 

SELECT * FROM user_role;