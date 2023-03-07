SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DataCompany](
	[dc_id] [numeric](18, 0) NOT NULL,
	[dc_name] [varchar](50) NOT NULL,
	[dc_direction] [varchar](50) NULL,
	[dc_cuit] [char](13) NULL,
	[dc_phone] [varchar](1000) NULL,
	[dc_iibb] [varchar](1000) NULL,
	[dc_startofactivity] [datetime] NULL,
) 
GO


