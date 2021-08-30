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

go
create table testKey(
	ID int primary key,
	NAME nvarchar(100)
)

go
alter table HOCSINH add primary key (MaHS)
go
CREATE TABLE TEST
(
	ID int,
	Name nvarchar(50)
	primary key (ID)
)
go
insert into TEST (ID)
values (3)

go
create table testKey1(
	ID int not null,
	NAME nvarchar(100)
)

go
alter table testKey1 add constraint PK_Test1 primary key (ID)

go
create table testKey2(
	ID1 int not null,
	ID2 int not null,
	NAME nvarchar(100)
	constraint PK_Test2
	primary key (ID1,ID2)
)

go
create table BoMon
(
	MaBM char(10) primary key,
	Name nvarchar(50)
)

go
create table GiangVien
(
	MaGV char(10) primary key,
	Name nvarchar(50),
	DiaChi nvarchar(10),
	MaBM char(10)
	Foreign key (MaBM) references BoMon(MaBM)
)
go
create table ThacSi
(
	MaTS char(10) primary key,
	Name nvarchar(50),
	DiaChi nvarchar(10),
	MaBM char(10)
)

go
alter table ThacSi add foreign key(MaBM) references BoMon(MaBM)

--insert BoMon--
go
insert into BoMon (MaBM, Name)
values ('BM01', N'Tên bộ môn')
go
insert into BoMon (MaBM, Name)
values ('BM02', N'Tên bộ môn')
go
insert into BoMon (MaBM, Name)
values ('BM03', N'Tên bộ môn')

--insert ThacSi--
go
insert into ThacSi(MaTS, Name, DiaChi, MaBM)
values ('TS01',N'Tên Thạc Sĩ',N'Địa chỉ TS','BM01')

go
insert into ThacSi(MaTS, Name, DiaChi, MaBM)
values ('TS02',N'Tên Thạc Sĩ',N'Địa chỉ TS','BM02')
