USE [StudentManager_Ex15]
GO
/****** Object:  Table [dbo].[AcademicResult]    Script Date: 25/09/2023 3:38:34 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[AcademicResult](
	[resultId] [int] IDENTITY(1,1) NOT NULL,
	[studentId] [varchar](25) NULL,
	[semesterName] [nvarchar](255) NULL,
	[averageScore] [decimal](3, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[resultId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Faculty]    Script Date: 25/09/2023 3:38:34 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Faculty](
	[facultyId] [int] IDENTITY(1,1) NOT NULL,
	[facultyName] [nvarchar](255) NULL,
	[studentId] [varchar](25) NULL,
PRIMARY KEY CLUSTERED 
(
	[facultyId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Students]    Script Date: 25/09/2023 3:38:34 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Students](
	[studentId] [varchar](25) NOT NULL,
	[fullName] [nvarchar](255) NULL,
	[dateOfBirth] [date] NULL,
	[admissionYear] [int] NULL,
	[entranceScore] [decimal](3, 2) NULL,
	[studentType] [nvarchar](50) NULL,
	[affiliatedLocation] [nvarchar](255) NULL,
 CONSTRAINT [PK__Students__4D11D63C0063A0CE] PRIMARY KEY CLUSTERED 
(
	[studentId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[AcademicResult] ON 

INSERT [dbo].[AcademicResult] ([resultId], [studentId], [semesterName], [averageScore]) VALUES (6, N'SV001', N'Học kỳ 1', CAST(5.50 AS Decimal(3, 2)))
INSERT [dbo].[AcademicResult] ([resultId], [studentId], [semesterName], [averageScore]) VALUES (7, N'SV002', N'Học kỳ 1', CAST(8.00 AS Decimal(3, 2)))
INSERT [dbo].[AcademicResult] ([resultId], [studentId], [semesterName], [averageScore]) VALUES (8, N'SV003', N'Học kỳ 1', CAST(7.50 AS Decimal(3, 2)))
INSERT [dbo].[AcademicResult] ([resultId], [studentId], [semesterName], [averageScore]) VALUES (9, N'SV002', N'Học kỳ 2', CAST(9.00 AS Decimal(3, 2)))
SET IDENTITY_INSERT [dbo].[AcademicResult] OFF
GO
SET IDENTITY_INSERT [dbo].[Faculty] ON 

INSERT [dbo].[Faculty] ([facultyId], [facultyName], [studentId]) VALUES (2, N'CNTT', N'SV001')
INSERT [dbo].[Faculty] ([facultyId], [facultyName], [studentId]) VALUES (3, N'LÝ HÓA SINH', N'SV002')
INSERT [dbo].[Faculty] ([facultyId], [facultyName], [studentId]) VALUES (4, N'TOÁN', N'SV003')
INSERT [dbo].[Faculty] ([facultyId], [facultyName], [studentId]) VALUES (5, N'CNTT', N'SV002')
SET IDENTITY_INSERT [dbo].[Faculty] OFF
GO
INSERT [dbo].[Students] ([studentId], [fullName], [dateOfBirth], [admissionYear], [entranceScore], [studentType], [affiliatedLocation]) VALUES (N'SV001', N'Dũng', CAST(N'1997-08-20' AS Date), 2023, CAST(8.00 AS Decimal(3, 2)), N'1', N'Đà Nẵng')
INSERT [dbo].[Students] ([studentId], [fullName], [dateOfBirth], [admissionYear], [entranceScore], [studentType], [affiliatedLocation]) VALUES (N'SV002', N'Thảo', CAST(N'1999-08-20' AS Date), 2020, CAST(8.00 AS Decimal(3, 2)), N'1', N'Hà Nội')
INSERT [dbo].[Students] ([studentId], [fullName], [dateOfBirth], [admissionYear], [entranceScore], [studentType], [affiliatedLocation]) VALUES (N'SV003', N'Hằng', CAST(N'1999-08-20' AS Date), 2020, CAST(8.00 AS Decimal(3, 2)), N'1', N'Hà Nội')
INSERT [dbo].[Students] ([studentId], [fullName], [dateOfBirth], [admissionYear], [entranceScore], [studentType], [affiliatedLocation]) VALUES (N'SV004', N'Nam', CAST(N'1997-05-10' AS Date), 2019, CAST(2.80 AS Decimal(3, 2)), N'2', N'Cà Mau')
INSERT [dbo].[Students] ([studentId], [fullName], [dateOfBirth], [admissionYear], [entranceScore], [studentType], [affiliatedLocation]) VALUES (N'SV005', N'Trang', CAST(N'2000-01-25' AS Date), 2019, CAST(8.00 AS Decimal(3, 2)), N'1', N'Đà Nẵng')
INSERT [dbo].[Students] ([studentId], [fullName], [dateOfBirth], [admissionYear], [entranceScore], [studentType], [affiliatedLocation]) VALUES (N'SV006', N'Tuấn', CAST(N'1998-07-03' AS Date), 2023, CAST(5.90 AS Decimal(3, 2)), N'2', N'Đà Nẵng')
INSERT [dbo].[Students] ([studentId], [fullName], [dateOfBirth], [admissionYear], [entranceScore], [studentType], [affiliatedLocation]) VALUES (N'SV007', N'Dũng', CAST(N'1997-12-11' AS Date), 2023, CAST(2.00 AS Decimal(3, 2)), N'2', N'Đồng Nai')
INSERT [dbo].[Students] ([studentId], [fullName], [dateOfBirth], [admissionYear], [entranceScore], [studentType], [affiliatedLocation]) VALUES (N'SV008', N'Minh', CAST(N'1998-03-15' AS Date), 2023, CAST(4.50 AS Decimal(3, 2)), N'2', N'Hà Nội')
GO
ALTER TABLE [dbo].[AcademicResult]  WITH CHECK ADD  CONSTRAINT [FK__AcademicR__stude__2F10007B] FOREIGN KEY([studentId])
REFERENCES [dbo].[Students] ([studentId])
GO
ALTER TABLE [dbo].[AcademicResult] CHECK CONSTRAINT [FK__AcademicR__stude__2F10007B]
GO
ALTER TABLE [dbo].[Faculty]  WITH CHECK ADD FOREIGN KEY([studentId])
REFERENCES [dbo].[Students] ([studentId])
GO
