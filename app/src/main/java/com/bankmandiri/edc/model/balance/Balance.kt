package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class Balance(

	@field:SerializedName("cashDepositThisCycle")
	val cashDepositThisCycle: String? = null,

	@field:SerializedName("overdraftProtection")
	val overdraftProtection: String? = null,

	@field:SerializedName("accountWHInfo")
	val accountWHInfo: AccountWHInfo? = null,

	@field:SerializedName("dateLastDeposit")
	val dateLastDeposit: String? = null,

	@field:SerializedName("noTimesOnKiteSuspectReport")
	val noTimesOnKiteSuspectReport: String? = null,

	@field:SerializedName("yearBaseCode")
	val yearBaseCode: String? = null,

	@field:SerializedName("accrualMethod")
	val accrualMethod: String? = null,

	@field:SerializedName("minimumBalToMaintain")
	val minimumBalToMaintain: String? = null,

	@field:SerializedName("dateOpened")
	val dateOpened: String? = null,

	@field:SerializedName("groupedFields")
	val groupedFields: String? = null,

	@field:SerializedName("statementCycle")
	val statementCycle: String? = null,

	@field:SerializedName("creditInfo")
	val creditInfo: CreditInfo? = null,

	@field:SerializedName("totalDepositToday")
	val totalDepositToday: String? = null,

	@field:SerializedName("stopCode")
	val stopCode: String? = null,

	@field:SerializedName("overDraftCycleInfo")
	val overDraftCycleInfo: OverDraftCycleInfo? = null,

	@field:SerializedName("odInterestRateNo")
	val odInterestRateNo: String? = null,

	@field:SerializedName("totalLCDepositedToday")
	val totalLCDepositedToday: String? = null,

	@field:SerializedName("signatureVerification")
	val signatureVerification: String? = null,

	@field:SerializedName("commitmentFee")
	val commitmentFee: String? = null,

	@field:SerializedName("atmDebitAndCreditInfo")
	val atmDebitAndCreditInfo: AtmDebitAndCreditInfo? = null,

	@field:SerializedName("othFloatOSOC")
	val othFloatOSOC: String? = null,

	@field:SerializedName("minimumAccrualBalance")
	val minimumAccrualBalance: String? = null,

	@field:SerializedName("insiderCode")
	val insiderCode: String? = null,

	@field:SerializedName("amtOfLastDeposit")
	val amtOfLastDeposit: String? = null,

	@field:SerializedName("noDebitsUpTo6")
	val noDebitsUpTo6: String? = null,

	@field:SerializedName("dateLastMaintenance")
	val dateLastMaintenance: String? = null,

	@field:SerializedName("residentCode")
	val residentCode: String? = null,

	@field:SerializedName("minimumCharge")
	val minimumCharge: String? = null,

	@field:SerializedName("noDebitsUpTo3")
	val noDebitsUpTo3: String? = null,

	@field:SerializedName("specialInstructionCode")
	val specialInstructionCode: String? = null,

	@field:SerializedName("creditAccrInt")
	val creditAccrInt: String? = null,

	@field:SerializedName("othFloatOSFS")
	val othFloatOSFS: String? = null,

	@field:SerializedName("odLimit")
	val odLimit: String? = null,

	@field:SerializedName("dateLastActive")
	val dateLastActive: String? = null,

	@field:SerializedName("accountAmountDetails")
	val accountAmountDetails: AccountAmountDetails? = null,

	@field:SerializedName("threeDayFloatLC")
	val threeDayFloatLC: String? = null,

	@field:SerializedName("customerTypeCode")
	val customerTypeCode: Any? = null,

	@field:SerializedName("accountRateInfo")
	val accountRateInfo: AccountRateInfo? = null,

	@field:SerializedName("interestRate0")
	val interestRate0: String? = null,

	@field:SerializedName("idNumber")
	val idNumber: String? = null,

	@field:SerializedName("totalOCDepositedToday")
	val totalOCDepositedToday: String? = null,

	@field:SerializedName("availableBalance")
	val availableBalance: String? = null,

	@field:SerializedName("dateLastCARCodeMaint")
	val dateLastCARCodeMaint: String? = null,

	@field:SerializedName("relatedAccountNo")
	val relatedAccountNo: String? = null,

	@field:SerializedName("averageLedgerBalance")
	val averageLedgerBalance: String? = null,

	@field:SerializedName("oneDayFloatLC")
	val oneDayFloatLC: String? = null,

	@field:SerializedName("noCksDepositForeign")
	val noCksDepositForeign: String? = null,

	@field:SerializedName("userCodeInfo")
	val userCodeInfo: UserCodeInfo? = null,

	@field:SerializedName("firstReachedExcessDate")
	val firstReachedExcessDate: String? = null,

	@field:SerializedName("totalDrawLimit")
	val totalDrawLimit: String? = null,

	@field:SerializedName("holdMailCode")
	val holdMailCode: String? = null,

	@field:SerializedName("totalAvailibilityFloat")
	val totalAvailibilityFloat: String? = null,

	@field:SerializedName("highVolumeAccount")
	val highVolumeAccount: String? = null,

	@field:SerializedName("noCksDepositOnUs")
	val noCksDepositOnUs: String? = null,

	@field:SerializedName("accountNumber")
	val accountNumber: String? = null,

	@field:SerializedName("selectionNumber")
	val selectionNumber: String? = null,

	@field:SerializedName("debitAccrInt")
	val debitAccrInt: String? = null,

	@field:SerializedName("vipCustomerCode")
	val vipCustomerCode: String? = null,

	@field:SerializedName("nsfItemsExist")
	val nsfItemsExist: String? = null,

	@field:SerializedName("holdCode")
	val holdCode: String? = null,

	@field:SerializedName("aggregateBalanceInfo")
	val aggregateBalanceInfo: AggregateBalanceInfo? = null,

	@field:SerializedName("validForCheckBook")
	val validForCheckBook: String? = null,

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("accrueOnLedColMinBal")
	val accrueOnLedColMinBal: String? = null,

	@field:SerializedName("atmCard")
	val atmCard: String? = null,

	@field:SerializedName("dateLastStatement")
	val dateLastStatement: String? = null,

	@field:SerializedName("twoDayFloatLC")
	val twoDayFloatLC: String? = null,

	@field:SerializedName("noDebitsUpTo6Exceed")
	val noDebitsUpTo6Exceed: String? = null,

	@field:SerializedName("highestInterestRateEarned")
	val highestInterestRateEarned: String? = null,

	@field:SerializedName("balanceInfo")
	val balanceInfo: BalanceInfo? = null,

	@field:SerializedName("totalAccrualFloat")
	val totalAccrualFloat: String? = null,

	@field:SerializedName("dateLastOverdrawn")
	val dateLastOverdrawn: String? = null,

	@field:SerializedName("noLargeBalanceFluctuationMTD")
	val noLargeBalanceFluctuationMTD: String? = null,

	@field:SerializedName("tellerStatus")
	val tellerStatus: String? = null,

	@field:SerializedName("relatedAccountType")
	val relatedAccountType: String? = null,

	@field:SerializedName("includeOnCombinedStatement")
	val includeOnCombinedStatement: String? = null,

	@field:SerializedName("interestCycle")
	val interestCycle: String? = null,

	@field:SerializedName("clubPlan")
	val clubPlan: String? = null,

	@field:SerializedName("eftFlag")
	val eftFlag: String? = null,

	@field:SerializedName("nonperformingStatus")
	val nonperformingStatus: String? = null,

	@field:SerializedName("countryOfHeritage")
	val countryOfHeritage: String? = null,

	@field:SerializedName("noDebitsUpTo3Exceed")
	val noDebitsUpTo3Exceed: String? = null,

	@field:SerializedName("totalCashFloat")
	val totalCashFloat: String? = null,

	@field:SerializedName("automaticNSFCharge")
	val automaticNSFCharge: String? = null,

	@field:SerializedName("overdraftLimitCode")
	val overdraftLimitCode: String? = null,

	@field:SerializedName("previousIntPayDate")
	val previousIntPayDate: String? = null,

	@field:SerializedName("whRate")
	val whRate: String? = null,

	@field:SerializedName("alertCode")
	val alertCode: String? = null,

	@field:SerializedName("noLargeBalanceFluctuationYTD")
	val noLargeBalanceFluctuationYTD: String? = null,

	@field:SerializedName("specialMessage")
	val specialMessage: String? = null,

	@field:SerializedName("badCheckIncident")
	val badCheckIncident: String? = null,

	@field:SerializedName("dateEntered")
	val dateEntered: String? = null,

	@field:SerializedName("aftCode")
	val aftCode: String? = null,

	@field:SerializedName("noOfEnclosures")
	val noOfEnclosures: String? = null,

	@field:SerializedName("total1DayFloat")
	val total1DayFloat: String? = null,

	@field:SerializedName("serviceChargeCycle")
	val serviceChargeCycle: String? = null,

	@field:SerializedName("printInterestCheck")
	val printInterestCheck: String? = null,

	@field:SerializedName("dateLastContact")
	val dateLastContact: String? = null,

	@field:SerializedName("interestInfo")
	val interestInfo: InterestInfo? = null,

	@field:SerializedName("printChecksInOrderOnStatement")
	val printChecksInOrderOnStatement: String? = null,

	@field:SerializedName("nsfCycleInfo")
	val nsfCycleInfo: NsfCycleInfo? = null,

	@field:SerializedName("specialInstructionInfo")
	val specialInstructionInfo: SpecialInstructionInfo? = null,

	@field:SerializedName("timesBadCheques")
	val timesBadCheques: String? = null,

	@field:SerializedName("serviceChargeMode")
	val serviceChargeMode: String? = null,

	@field:SerializedName("dateOfStatus")
	val dateOfStatus: String? = null,

	@field:SerializedName("dateSCWaiveExpires")
	val dateSCWaiveExpires: String? = null,

	@field:SerializedName("statementCode")
	val statementCode: String? = null,

	@field:SerializedName("automaticalyMaintainNPLStatus")
	val automaticalyMaintainNPLStatus: String? = null,

	@field:SerializedName("priorLastActiveDate")
	val priorLastActiveDate: String? = null,

	@field:SerializedName("listPostCode")
	val listPostCode: String? = null,

	@field:SerializedName("debitInfo")
	val debitInfo: DebitInfo? = null,

	@field:SerializedName("accountInfo")
	val accountInfo: AccountInfo? = null,

	@field:SerializedName("totalWithdrawalToday")
	val totalWithdrawalToday: String? = null,

	@field:SerializedName("totalAuthLimit")
	val totalAuthLimit: String? = null,

	@field:SerializedName("cashPaidThisCycle")
	val cashPaidThisCycle: String? = null,

	@field:SerializedName("sexCode")
	val sexCode: String? = null,

	@field:SerializedName("bnmbumiNRCCCode")
	val bnmbumiNRCCCode: String? = null,

	@field:SerializedName("accountMTDInfo")
	val accountMTDInfo: AccountMTDInfo? = null,

	@field:SerializedName("depositTypeCode")
	val depositTypeCode: String? = null,

	@field:SerializedName("dateLastInterestPaid")
	val dateLastInterestPaid: String? = null,

	@field:SerializedName("statementPassbookCode")
	val statementPassbookCode: String? = null,

	@field:SerializedName("businessType")
	val businessType: String? = null,

	@field:SerializedName("amountOfNSFItems")
	val amountOfNSFItems: String? = null,

	@field:SerializedName("classCARCode")
	val classCARCode: String? = null
)