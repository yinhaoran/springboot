/**
 * XZWebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.example.ws;


/**
 *  XZWebServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class XZWebServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public XZWebServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public XZWebServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getParentAndFirstCompannyInfo method
     * override this method for handling normal response from getParentAndFirstCompannyInfo operation
     */
    public void receiveResultgetParentAndFirstCompannyInfo(
        com.example.ws.XZWebServiceStub.GetParentAndFirstCompannyInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getParentAndFirstCompannyInfo operation
     */
    public void receiveErrorgetParentAndFirstCompannyInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addCancelVacationInfo method
     * override this method for handling normal response from addCancelVacationInfo operation
     */
    public void receiveResultaddCancelVacationInfo(
        com.example.ws.XZWebServiceStub.AddCancelVacationInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addCancelVacationInfo operation
     */
    public void receiveErroraddCancelVacationInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateMeetingState method
     * override this method for handling normal response from updateMeetingState operation
     */
    public void receiveResultupdateMeetingState(
        com.example.ws.XZWebServiceStub.UpdateMeetingStateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateMeetingState operation
     */
    public void receiveErrorupdateMeetingState(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for insertDataTo_I_AssetsItemsTable method
     * override this method for handling normal response from insertDataTo_I_AssetsItemsTable operation
     */
    public void receiveResultinsertDataTo_I_AssetsItemsTable(
        com.example.ws.XZWebServiceStub.InsertDataTo_I_AssetsItemsTableResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from insertDataTo_I_AssetsItemsTable operation
     */
    public void receiveErrorinsertDataTo_I_AssetsItemsTable(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addTravelInfo_Batch method
     * override this method for handling normal response from addTravelInfo_Batch operation
     */
    public void receiveResultaddTravelInfo_Batch(
        com.example.ws.XZWebServiceStub.AddTravelInfo_BatchResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addTravelInfo_Batch operation
     */
    public void receiveErroraddTravelInfo_Batch(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateApprovalComment method
     * override this method for handling normal response from updateApprovalComment operation
     */
    public void receiveResultupdateApprovalComment(
        com.example.ws.XZWebServiceStub.UpdateApprovalCommentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateApprovalComment operation
     */
    public void receiveErrorupdateApprovalComment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getSubsidyApplyByUserName method
     * override this method for handling normal response from getSubsidyApplyByUserName operation
     */
    public void receiveResultgetSubsidyApplyByUserName(
        com.example.ws.XZWebServiceStub.GetSubsidyApplyByUserNameResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getSubsidyApplyByUserName operation
     */
    public void receiveErrorgetSubsidyApplyByUserName(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for refuseTrainProcess method
     * override this method for handling normal response from refuseTrainProcess operation
     */
    public void receiveResultrefuseTrainProcess(
        com.example.ws.XZWebServiceStub.RefuseTrainProcessResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from refuseTrainProcess operation
     */
    public void receiveErrorrefuseTrainProcess(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for mixedMeeting method
     * override this method for handling normal response from mixedMeeting operation
     */
    public void receiveResultmixedMeeting(
        com.example.ws.XZWebServiceStub.MixedMeetingResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from mixedMeeting operation
     */
    public void receiveErrormixedMeeting(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testRturnData method
     * override this method for handling normal response from testRturnData operation
     */
    public void receiveResulttestRturnData(
        com.example.ws.XZWebServiceStub.TestRturnDataResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testRturnData operation
     */
    public void receiveErrortestRturnData(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addRepCardInfoByShenFenZhen method
     * override this method for handling normal response from addRepCardInfoByShenFenZhen operation
     */
    public void receiveResultaddRepCardInfoByShenFenZhen(
        com.example.ws.XZWebServiceStub.AddRepCardInfoByShenFenZhenResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addRepCardInfoByShenFenZhen operation
     */
    public void receiveErroraddRepCardInfoByShenFenZhen(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createFileCode_XS method
     * override this method for handling normal response from createFileCode_XS operation
     */
    public void receiveResultcreateFileCode_XS(
        com.example.ws.XZWebServiceStub.CreateFileCode_XSResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createFileCode_XS operation
     */
    public void receiveErrorcreateFileCode_XS(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addLeaveInfoByShenFenZhen method
     * override this method for handling normal response from addLeaveInfoByShenFenZhen operation
     */
    public void receiveResultaddLeaveInfoByShenFenZhen(
        com.example.ws.XZWebServiceStub.AddLeaveInfoByShenFenZhenResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addLeaveInfoByShenFenZhen operation
     */
    public void receiveErroraddLeaveInfoByShenFenZhen(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getUnitPostMembers_ByUnitKeyWords method
     * override this method for handling normal response from getUnitPostMembers_ByUnitKeyWords operation
     */
    public void receiveResultgetUnitPostMembers_ByUnitKeyWords(
        com.example.ws.XZWebServiceStub.GetUnitPostMembers_ByUnitKeyWordsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getUnitPostMembers_ByUnitKeyWords operation
     */
    public void receiveErrorgetUnitPostMembers_ByUnitKeyWords(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAbstractApartment_XS method
     * override this method for handling normal response from getAbstractApartment_XS operation
     */
    public void receiveResultgetAbstractApartment_XS(
        com.example.ws.XZWebServiceStub.GetAbstractApartment_XSResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAbstractApartment_XS operation
     */
    public void receiveErrorgetAbstractApartment_XS(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getMaxCodeForFile method
     * override this method for handling normal response from getMaxCodeForFile operation
     */
    public void receiveResultgetMaxCodeForFile(
        com.example.ws.XZWebServiceStub.GetMaxCodeForFileResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getMaxCodeForFile operation
     */
    public void receiveErrorgetMaxCodeForFile(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addDocAttachment method
     * override this method for handling normal response from addDocAttachment operation
     */
    public void receiveResultaddDocAttachment(
        com.example.ws.XZWebServiceStub.AddDocAttachmentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addDocAttachment operation
     */
    public void receiveErroraddDocAttachment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for autoCommit method
     * override this method for handling normal response from autoCommit operation
     */
    public void receiveResultautoCommit(
        com.example.ws.XZWebServiceStub.AutoCommitResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from autoCommit operation
     */
    public void receiveErrorautoCommit(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for submitTrainProcess method
     * override this method for handling normal response from submitTrainProcess operation
     */
    public void receiveResultsubmitTrainProcess(
        com.example.ws.XZWebServiceStub.SubmitTrainProcessResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from submitTrainProcess operation
     */
    public void receiveErrorsubmitTrainProcess(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addLeaveInfo_Batch method
     * override this method for handling normal response from addLeaveInfo_Batch operation
     */
    public void receiveResultaddLeaveInfo_Batch(
        com.example.ws.XZWebServiceStub.AddLeaveInfo_BatchResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addLeaveInfo_Batch operation
     */
    public void receiveErroraddLeaveInfo_Batch(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getMaxCodeForFile_Other method
     * override this method for handling normal response from getMaxCodeForFile_Other operation
     */
    public void receiveResultgetMaxCodeForFile_Other(
        com.example.ws.XZWebServiceStub.GetMaxCodeForFile_OtherResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getMaxCodeForFile_Other operation
     */
    public void receiveErrorgetMaxCodeForFile_Other(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for insertDataTo_I_OM_AssetsItemsTable method
     * override this method for handling normal response from insertDataTo_I_OM_AssetsItemsTable operation
     */
    public void receiveResultinsertDataTo_I_OM_AssetsItemsTable(
        com.example.ws.XZWebServiceStub.InsertDataTo_I_OM_AssetsItemsTableResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from insertDataTo_I_OM_AssetsItemsTable operation
     */
    public void receiveErrorinsertDataTo_I_OM_AssetsItemsTable(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateEmail method
     * override this method for handling normal response from updateEmail operation
     */
    public void receiveResultupdateEmail(
        com.example.ws.XZWebServiceStub.UpdateEmailResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateEmail operation
     */
    public void receiveErrorupdateEmail(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateState_SheetInvalid method
     * override this method for handling normal response from updateState_SheetInvalid operation
     */
    public void receiveResultupdateState_SheetInvalid(
        com.example.ws.XZWebServiceStub.UpdateState_SheetInvalidResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateState_SheetInvalid operation
     */
    public void receiveErrorupdateState_SheetInvalid(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createFileCode_XS_SaveDB method
     * override this method for handling normal response from createFileCode_XS_SaveDB operation
     */
    public void receiveResultcreateFileCode_XS_SaveDB(
        com.example.ws.XZWebServiceStub.CreateFileCode_XS_SaveDBResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createFileCode_XS_SaveDB operation
     */
    public void receiveErrorcreateFileCode_XS_SaveDB(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for validateEmailName method
     * override this method for handling normal response from validateEmailName operation
     */
    public void receiveResultvalidateEmailName(
        com.example.ws.XZWebServiceStub.ValidateEmailNameResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from validateEmailName operation
     */
    public void receiveErrorvalidateEmailName(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getMaxCodeForFile_2Table method
     * override this method for handling normal response from getMaxCodeForFile_2Table operation
     */
    public void receiveResultgetMaxCodeForFile_2Table(
        com.example.ws.XZWebServiceStub.GetMaxCodeForFile_2TableResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getMaxCodeForFile_2Table operation
     */
    public void receiveErrorgetMaxCodeForFile_2Table(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateApprovalCommentOM method
     * override this method for handling normal response from updateApprovalCommentOM operation
     */
    public void receiveResultupdateApprovalCommentOM(
        com.example.ws.XZWebServiceStub.UpdateApprovalCommentOMResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateApprovalCommentOM operation
     */
    public void receiveErrorupdateApprovalCommentOM(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for finishWait method
     * override this method for handling normal response from finishWait operation
     */
    public void receiveResultfinishWait(
        com.example.ws.XZWebServiceStub.FinishWaitResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from finishWait operation
     */
    public void receiveErrorfinishWait(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testExportWorkflowSetting method
     * override this method for handling normal response from testExportWorkflowSetting operation
     */
    public void receiveResulttestExportWorkflowSetting(
        com.example.ws.XZWebServiceStub.TestExportWorkflowSettingResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testExportWorkflowSetting operation
     */
    public void receiveErrortestExportWorkflowSetting(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addAttendanceInfo method
     * override this method for handling normal response from addAttendanceInfo operation
     */
    public void receiveResultaddAttendanceInfo(
        com.example.ws.XZWebServiceStub.AddAttendanceInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addAttendanceInfo operation
     */
    public void receiveErroraddAttendanceInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addRepCardInfo_Batch method
     * override this method for handling normal response from addRepCardInfo_Batch operation
     */
    public void receiveResultaddRepCardInfo_Batch(
        com.example.ws.XZWebServiceStub.AddRepCardInfo_BatchResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addRepCardInfo_Batch operation
     */
    public void receiveErroraddRepCardInfo_Batch(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getWorkflowPostSetting method
     * override this method for handling normal response from getWorkflowPostSetting operation
     */
    public void receiveResultgetWorkflowPostSetting(
        com.example.ws.XZWebServiceStub.GetWorkflowPostSettingResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getWorkflowPostSetting operation
     */
    public void receiveErrorgetWorkflowPostSetting(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for ismemberOf method
     * override this method for handling normal response from ismemberOf operation
     */
    public void receiveResultismemberOf(
        com.example.ws.XZWebServiceStub.IsmemberOfResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from ismemberOf operation
     */
    public void receiveErrorismemberOf(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for addEmail method
     * override this method for handling normal response from addEmail operation
     */
    public void receiveResultaddEmail(
        com.example.ws.XZWebServiceStub.AddEmailResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from addEmail operation
     */
    public void receiveErroraddEmail(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for helloWorld method
     * override this method for handling normal response from helloWorld operation
     */
    public void receiveResulthelloWorld(
        com.example.ws.XZWebServiceStub.HelloWorldResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from helloWorld operation
     */
    public void receiveErrorhelloWorld(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for triggerForAddEmail method
     * override this method for handling normal response from triggerForAddEmail operation
     */
    public void receiveResulttriggerForAddEmail(
        com.example.ws.XZWebServiceStub.TriggerForAddEmailResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from triggerForAddEmail operation
     */
    public void receiveErrortriggerForAddEmail(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getYLTrainSchedule method
     * override this method for handling normal response from getYLTrainSchedule operation
     */
    public void receiveResultgetYLTrainSchedule(
        com.example.ws.XZWebServiceStub.GetYLTrainScheduleResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getYLTrainSchedule operation
     */
    public void receiveErrorgetYLTrainSchedule(java.lang.Exception e) {
    }
}
