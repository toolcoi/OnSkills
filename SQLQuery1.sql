CREATE DATABASE SQLTest

USE SQLTest
GO

CREATE TABLE GIAOVIEN
(
	MaGV nvarchar(10),
	Name nvarchar(50)
)

CREATE TABLE HOCSINH
(
	MaHS nvarchar(10),
	Name nvarchar(50)
)
--Xóa bảng học sinh--
DROP TABLE HOCSINH
GO
--Sửa bảng, thêm cột email--
ALTER TABLE GIAOVIEN ADD Email nvarchar(100);

--Xóa dữ liệu trong table--
go
truncate table GIAOVIEN

go
insert into GIAOVIEN (MaGV,Name,Email)
values (21702048,N'Tạ Kim Ngân', 'tvtrong@gmail.com')

go
delete GIAOVIEN where MaGV = 51702048 or Name = N'Tạ Kim Ngân'

go 
update GIAOVIEN set MaGV = 1, Name = N'Tạ Văn Trọng'