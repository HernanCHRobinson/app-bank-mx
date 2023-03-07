SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Hernan Velo
-- Developer:	Andres Gonzalez
-- Description:	Visualizador de pagos
-- =============================================
CREATE PROCEDURE viewPaymentsMx
		(@ABHDueDate	datetime)
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

	SELECT 
		VoucherID, T1.CompanyCode, VoucherType, CreationDateTime, CreationUser, VoucherAmount, PaidAmount, VoucherBalance, OpenStatusFlag, CompanyInvoiceNumber, CompanyInvoiceDate, 
		CompanyInvoiceDueDate, CompanyTerms, AdjustedAmount, LoadNum, LoadBookID, DebitAccount, CreditAccount, Notes, LastPaidDate, LastCheckNumber, DiscountPercent, DiscountAmount, 
		ABHDueDate, ApprovalUser, ApprovalDateTime, ReleasedDate, VoucherBatchID, LoadBillTo, Batchnotes, ReleasedBy, FirstInvoicePrintDate, RateApproved, ownedbyabh, BranchCode, 
		T4.GLCompanyCode, 
		SourceMode, PaymentStyle, SalesRep, ActivityDate, CHRApplication, OrderNum, PAOID, QuickPayFlag, 
		[Role], RoleSeqNum, ExchangeRate, SourceCurrencyCode, SourceVoucherAmount, SourceVoucherBalance, PFLFlag, SourcePaidAmount, SourceAdjustedAmount, FunctionalCurrency, RollupID, 
		AssetID, VoucherHeaderID, VATRateCode, PayStatus, FinancialStatusID, FinancialItemID, VoucherDocID, CommissionItemID, ExchangeSetID,
		EftDFI, EftDFIType, EftBankAccount, EftBankAccountType, DBNum, RailEft, NormalPaymentMethod, QuickPaymentMethod, RemittanceMethod, FaxRemittanceTo, EmailRemittanceTo,
		NameOnAccount, BankName, BankPhone, QuickPay, DiscAllowed, DiscPercent, TChekAcctNum, PinChangedDate, PinMailedFlag, LastUpdateUser, LastUpdateDate, Pin, AttnFaxTo, TChekCurrencies,
		WireNotes, WireRoutingNumber, WireAcctNum, WireCurrency, WireBankName, WireCity, WireCountry, NoTChek, ClaimAmount, BillStatus, DaysToPay, ClaimAmountCurrency, FactoringID, 
		EFTBankCountry, IBANCountry, IBANKey, TraiteDaysToPay, QuickPayPercent, BillStatusNotes, TChekAcctNumCAD, CurrencyCode, AllowIVRSettlement, IVRSettlementCode, KeepNegsInBranch,
		T3.PartyName
	FROM [FinancialsReportView].[dbo].[Voucher] T1 
		INNER JOIN [FinancialsReportView].[dbo].[CarrierPaymentOptions] T2 ON T1.CompanyCode = T2.CompanyCode
			AND T1.SourceCurrencyCode = T2.WireCurrency
			AND LEN(T2.WireAcctNum) = 18
			AND T2.WireCountry = 'Mexico'
		INNER JOIN [MDMPublicReadOnly].[mdm].[Carrier] T3 ON T1.CompanyCode = T3.PartyCode
		INNER JOIN [MDMPublicReadOnly].[mdm].[BranchGLCompany] T4 ON T1.BranchCode = T4.PartyCode
	WHERE T1.CompanyCode IS NOT NULL
		AND T1.ReleasedDate IS NOT NULL
		AND T4.GLCompanyCode IN ('012', '006')
		AND T1.VoucherType = 'T'
		AND T2.NormalPaymentMethod = 'Wire'
		AND T1.PaymentStyle = 'Wire'
		AND T1.VoucherBalance != 0
		AND T1.ABHDueDate = @ABHDueDate ORDER BY T1.CompanyCode ASC

END
GO
