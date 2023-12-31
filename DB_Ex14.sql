USE [Student_Ex14]
GO
/****** Object:  Table [dbo].[Student]    Script Date: 25/09/2023 3:39:20 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Student](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[fullName] [nvarchar](255) NULL,
	[doB] [date] NULL,
	[sex] [char](1) NULL,
	[phoneNumber] [varchar](15) NULL,
	[universityName] [nvarchar](255) NULL,
	[gradeLevel] [nvarchar](50) NULL,
	[gpa] [decimal](3, 2) NULL,
	[bestRewardName] [varchar](255) NULL,
	[englishScore] [int] NULL,
	[entryTestScore] [decimal](3, 2) NULL,
	[type] [int] NULL,
 CONSTRAINT [PK__Student__3213E83F076B6771] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Student] ON 

INSERT [dbo].[Student] ([id], [fullName], [doB], [sex], [phoneNumber], [universityName], [gradeLevel], [gpa], [bestRewardName], [englishScore], [entryTestScore], [type]) VALUES (14, N'lemanhdung01', CAST(N'1997-12-11' AS Date), N'1', N'0906158042', N'DHQN', N'dev', CAST(5.50 AS Decimal(3, 2)), N'Dev1', NULL, NULL, 1)
INSERT [dbo].[Student] ([id], [fullName], [doB], [sex], [phoneNumber], [universityName], [gradeLevel], [gpa], [bestRewardName], [englishScore], [entryTestScore], [type]) VALUES (15, N'lemanhdung02', CAST(N'2023-11-20' AS Date), N'1', N'0904123323', N'DHBK', N'dev2', NULL, NULL, 550, CAST(6.50 AS Decimal(3, 2)), 2)
INSERT [dbo].[Student] ([id], [fullName], [doB], [sex], [phoneNumber], [universityName], [gradeLevel], [gpa], [bestRewardName], [englishScore], [entryTestScore], [type]) VALUES (16, N'lemanhdung03', CAST(N'1197-12-11' AS Date), N'1', N'0901234122', N'DHBK', N'None', CAST(5.70 AS Decimal(3, 2)), N'NodeJS', NULL, NULL, 1)
INSERT [dbo].[Student] ([id], [fullName], [doB], [sex], [phoneNumber], [universityName], [gradeLevel], [gpa], [bestRewardName], [englishScore], [entryTestScore], [type]) VALUES (17, N'Lemanhdung04', CAST(N'2011-11-20' AS Date), N'2', N'0984512364', N'DHMC', N'None', NULL, NULL, 500, CAST(6.60 AS Decimal(3, 2)), 2)
INSERT [dbo].[Student] ([id], [fullName], [doB], [sex], [phoneNumber], [universityName], [gradeLevel], [gpa], [bestRewardName], [englishScore], [entryTestScore], [type]) VALUES (18, N'lemanhdung05', CAST(N'2012-11-21' AS Date), N'1', N'0986158042', N'DHQN', N'dev1', CAST(6.50 AS Decimal(3, 2)), N'DEV02', NULL, NULL, 1)
INSERT [dbo].[Student] ([id], [fullName], [doB], [sex], [phoneNumber], [universityName], [gradeLevel], [gpa], [bestRewardName], [englishScore], [entryTestScore], [type]) VALUES (19, N'lemanhdung06', CAST(N'2012-11-21' AS Date), N'1', N'0986158042', N'DHQN', N'dev1', CAST(6.50 AS Decimal(3, 2)), N'DEV02', NULL, NULL, 1)
INSERT [dbo].[Student] ([id], [fullName], [doB], [sex], [phoneNumber], [universityName], [gradeLevel], [gpa], [bestRewardName], [englishScore], [entryTestScore], [type]) VALUES (21, N'lemanhdung08', CAST(N'2012-11-21' AS Date), N'1', N'0986158042', N'DHQN', N'dev1', CAST(6.50 AS Decimal(3, 2)), N'DEV02', NULL, NULL, 1)
INSERT [dbo].[Student] ([id], [fullName], [doB], [sex], [phoneNumber], [universityName], [gradeLevel], [gpa], [bestRewardName], [englishScore], [entryTestScore], [type]) VALUES (23, N'lemanhdung10', CAST(N'2012-11-21' AS Date), N'1', N'0986158042', N'DHQN', N'dev1', CAST(6.50 AS Decimal(3, 2)), N'DEV02', NULL, NULL, 1)
SET IDENTITY_INSERT [dbo].[Student] OFF
GO
