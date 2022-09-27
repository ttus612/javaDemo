create database QLNVIEN
go
use QLNVIEN
go
CREATE TABLE PhongBan(
   maPhong  VARCHAR (10) primary key,
   tenPhong NVARCHAR (30) NOT NULL,     
);
CREATE TABLE NhanVien(
   maNV  NVARCHAR (30) primary key,
   ho NVARCHAR (50)  NULL,
   ten NVARCHAR (50)  NULL,
   tuoi int NULL,
   phai bit  NULL,
   maPhong  VARCHAR (10) NULL,  
   tienLuong float,
   Constraint F_LP_HN Foreign key(maPhong) references PhongBan(maPhong),
);
INSERT PhongBan([maPhong], [tenPhong]) VALUES ('PHONG_TC', N'Phòng tổ chức')
INSERT PhongBan([maPhong], [tenPhong]) VALUES ('PHONG_KT', N'Phòng kỹ thuật')
INSERT PhongBan([maPhong], [tenPhong]) VALUES ('PHONG_NS', N'Phòng nhân sự')
SELECT * FROM PhongBan
SELECT * FROM NhanVien
INSERT	NhanVien VALUES ('NV_01', N'Nguyễn', N'Minh', 23, 1, 'PHONG_TC', 3000000)
INSERT	NhanVien VALUES ('NV_02', N'Trần', N'Lâm', 23, 1, 'PHONG_KT', 3500000)
INSERT	NhanVien VALUES ('NV_03', N'Nguyễn', N'Như', 23, 0, 'PHONG_NS', 3100000)
INSERT	NhanVien VALUES ('NV_04', N'Nguyễn', N'Tâm', 23, 1, 'PHONG_KT', 3300000)