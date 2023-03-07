/****** Object:  Table [Sistema].[usuarios]    Script Date: 07/03/2023 13:50:47 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [users](
	[usr_nro] [numeric](19, 2) NOT NULL,
	[usr_activo] [bit] NOT NULL,
	[usr_numero_documento] [varchar](50) NULL,
	[usr_tdoc_tipo_documento] [smallint] NULL,
	[usr_fultmodificacion] [datetime2](7) NOT NULL,
	[usr_bloc_nosis] [smallint] NOT NULL,
	[usr_tori_tipo_origen] [smallint] NULL,
	[usr_pwd] [varchar](255) NOT NULL,
	[usr_falta] [datetime2](7) NOT NULL,
	[usr_talt_tipo_alta] [smallint] NULL,
	[usr_tusr_tipo_usuario_sistema] [smallint] NOT NULL,
	[usr_fbaja] [datetime2](7) NULL,
	[usr_mail] [varchar](255) NOT NULL,
	[usr_rol_id] [int] NULL,
	[usr_name] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[usr_nro] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [users] ADD  DEFAULT ('') FOR [usr_name]
GO