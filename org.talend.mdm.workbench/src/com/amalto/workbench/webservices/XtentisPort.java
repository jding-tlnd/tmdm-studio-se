// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;

public interface XtentisPort extends java.rmi.Remote {
    public com.amalto.workbench.webservices.WSVersion getComponentVersion(com.amalto.workbench.webservices.WSGetComponentVersion wsGetComponentVersion) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString ping(com.amalto.workbench.webservices.WSPing wsPing) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString logout(com.amalto.workbench.webservices.WSLogout wsLogout) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSInt initMDM(com.amalto.workbench.webservices.WSInitData initData) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSDataModelPKArray getDataModelPKs(com.amalto.workbench.webservices.WSRegexDataModelPKs regexp) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSDataModel getDataModel(com.amalto.workbench.webservices.WSGetDataModel wsDataModelget) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsDataModel(com.amalto.workbench.webservices.WSExistsDataModel wsDataModelExists) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSDataModelPK putDataModel(com.amalto.workbench.webservices.WSPutDataModel wsDataModel) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSDataModelPK deleteDataModel(com.amalto.workbench.webservices.WSDeleteDataModel wsDeleteDataModel) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString checkSchema(com.amalto.workbench.webservices.WSCheckSchema wsSchema) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString deleteBusinessConcept(com.amalto.workbench.webservices.WSDeleteBusinessConcept wsDeleteBusinessConcept) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray getBusinessConcepts(com.amalto.workbench.webservices.WSGetBusinessConcepts wsGetBusinessConcepts) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString putBusinessConcept(com.amalto.workbench.webservices.WSPutBusinessConcept wsPutBusinessConcept) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString putBusinessConceptSchema(com.amalto.workbench.webservices.WSPutBusinessConceptSchema wsPutBusinessConceptSchema) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSConceptKey getBusinessConceptKey(com.amalto.workbench.webservices.WSGetBusinessConceptKey wsGetBusinessConceptKey) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSDataClusterPKArray getDataClusterPKs(com.amalto.workbench.webservices.WSRegexDataClusterPKs regexp) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSDataCluster getDataCluster(com.amalto.workbench.webservices.WSGetDataCluster wsDataClusterPK) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsDataCluster(com.amalto.workbench.webservices.WSExistsDataCluster wsExistsDataCluster) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsDBDataCluster(com.amalto.workbench.webservices.WSExistsDBDataCluster wsExistsDBDataCluster) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSDataClusterPK putDataCluster(com.amalto.workbench.webservices.WSPutDataCluster wsDataCluster) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean putDBDataCluster(com.amalto.workbench.webservices.WSPutDBDataCluster wsDataCluster) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSDataClusterPK deleteDataCluster(com.amalto.workbench.webservices.WSDeleteDataCluster wsDeleteDataCluster) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray getConceptsInDataCluster(com.amalto.workbench.webservices.WSGetConceptsInDataCluster wsGetConceptsInDataCluster) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSConceptRevisionMap getConceptsInDataClusterWithRevisions(com.amalto.workbench.webservices.WSGetConceptsInDataClusterWithRevisions wsGetConceptsInDataClusterWithRevisions) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSViewPKArray getViewPKs(com.amalto.workbench.webservices.WSGetViewPKs regexp) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSView getView(com.amalto.workbench.webservices.WSGetView wsViewPK) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsView(com.amalto.workbench.webservices.WSExistsView wsViewPK) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSViewPK putView(com.amalto.workbench.webservices.WSPutView wsView) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSViewPK deleteView(com.amalto.workbench.webservices.WSDeleteView wsViewDel) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString getBusinessConceptValue(com.amalto.workbench.webservices.WSGetBusinessConceptValue wsGetBusinessConceptValue) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray getFullPathValues(com.amalto.workbench.webservices.WSGetFullPathValues wsGetFullPathValues) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItem getItem(com.amalto.workbench.webservices.WSGetItem wsGetItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsItem(com.amalto.workbench.webservices.WSExistsItem wsExistsItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray getItems(com.amalto.workbench.webservices.WSGetItems wsGetItems) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItemPKsByCriteriaResponse getItemPKsByCriteria(com.amalto.workbench.webservices.WSGetItemPKsByCriteria wsGetItemPKsByCriteria) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItemPKsByCriteriaResponse getItemPKsByFullCriteria(com.amalto.workbench.webservices.WSGetItemPKsByFullCriteria wsGetItemPKsByFullCriteria) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray viewSearch(com.amalto.workbench.webservices.WSViewSearch wsViewSearch) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray xPathsSearch(com.amalto.workbench.webservices.WSXPathsSearch wsXPathsSearch) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray getItemsPivotIndex(com.amalto.workbench.webservices.WSGetItemsPivotIndex wsGetItemsPivotIndex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray getChildrenItems(com.amalto.workbench.webservices.WSGetChildrenItems wsGetChildrenItems) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString count(com.amalto.workbench.webservices.WSCount wsCount) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray quickSearch(com.amalto.workbench.webservices.WSQuickSearch wsQuickSearch) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItemPK putItem(com.amalto.workbench.webservices.WSPutItem wsPutItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItemPK putItemByOperatorType(com.amalto.workbench.webservices.WSPutItemByOperatorType putItemByOperatorType) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItemPKArray putItemArray(com.amalto.workbench.webservices.WSPutItemArray wsPutItemArray) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItemPKArray putItemWithReportArray(com.amalto.workbench.webservices.WSPutItemWithReportArray wsPutItemWithReportArray) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItemPK putItemWithReport(com.amalto.workbench.webservices.WSPutItemWithReport wsPutItemWithReport) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItemPK putItemWithCustomReport(com.amalto.workbench.webservices.WSPutItemWithCustomReport wsPutItemWithCustomReport) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean isItemModifiedByOther(com.amalto.workbench.webservices.WSIsItemModifiedByOther wsItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSPipeline extractUsingTransformer(com.amalto.workbench.webservices.WSExtractUsingTransformer wsExtractUsingTransformer) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSPipeline extractUsingTransformerThruView(com.amalto.workbench.webservices.WSExtractUsingTransformerThruView wsExtractUsingTransformerThruView) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItemPK deleteItem(com.amalto.workbench.webservices.WSDeleteItem wsDeleteItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSInt deleteItems(com.amalto.workbench.webservices.WSDeleteItems wsDeleteItems) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSDroppedItemPK dropItem(com.amalto.workbench.webservices.WSDropItem wsDropItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray runQuery(com.amalto.workbench.webservices.WSRunQuery wsRunQuery) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSConnectorInteractionResponse connectorInteraction(com.amalto.workbench.webservices.WSConnectorInteraction wsConnectorInteraction) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRoutingRulePKArray getRoutingRulePKs(com.amalto.workbench.webservices.WSGetRoutingRulePKs regexp) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRoutingRule getRoutingRule(com.amalto.workbench.webservices.WSGetRoutingRule wsRoutingRulePK) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsRoutingRule(com.amalto.workbench.webservices.WSExistsRoutingRule wsExistsRoutingRule) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRoutingRulePK putRoutingRule(com.amalto.workbench.webservices.WSPutRoutingRule wsRoutingRule) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRoutingRulePK deleteRoutingRule(com.amalto.workbench.webservices.WSDeleteRoutingRule wsRoutingRuleDel) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString serviceAction(com.amalto.workbench.webservices.WSServiceAction wsServiceAction) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString getServiceConfiguration(com.amalto.workbench.webservices.WSServiceGetConfiguration wsGetConfiguration) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString putServiceConfiguration(com.amalto.workbench.webservices.WSServicePutConfiguration wsPutConfiguration) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSServicesList getServicesList(com.amalto.workbench.webservices.WSGetServicesList wsGetServicesList) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSServiceGetDocument getServiceDocument(com.amalto.workbench.webservices.WSString serviceName) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStoredProcedure getStoredProcedure(com.amalto.workbench.webservices.WSGetStoredProcedure wsGetStoredProcedure) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsStoredProcedure(com.amalto.workbench.webservices.WSExistsStoredProcedure wsExistsStoredProcedure) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStoredProcedurePKArray getStoredProcedurePKs(com.amalto.workbench.webservices.WSRegexStoredProcedure regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStoredProcedurePK putStoredProcedure(com.amalto.workbench.webservices.WSPutStoredProcedure wsStoredProcedure) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStoredProcedurePK deleteStoredProcedure(com.amalto.workbench.webservices.WSDeleteStoredProcedure wsStoredProcedureDelete) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray executeStoredProcedure(com.amalto.workbench.webservices.WSExecuteStoredProcedure wsExecuteStoredProcedure) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSTransformer getTransformer(com.amalto.workbench.webservices.WSGetTransformer wsGetTransformer) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsTransformer(com.amalto.workbench.webservices.WSExistsTransformer wsExistsTransformer) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSTransformerPKArray getTransformerPKs(com.amalto.workbench.webservices.WSGetTransformerPKs regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSTransformerPK putTransformer(com.amalto.workbench.webservices.WSPutTransformer wsTransformer) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSTransformerPK deleteTransformer(com.amalto.workbench.webservices.WSDeleteTransformer wsTransformerDelete) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSPipeline processBytesUsingTransformer(com.amalto.workbench.webservices.WSProcessBytesUsingTransformer wsProcessBytesUsingTransformer) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSPipeline processFileUsingTransformer(com.amalto.workbench.webservices.WSProcessFileUsingTransformer wsProcessFileUsingTransformer) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJobPK processBytesUsingTransformerAsBackgroundJob(com.amalto.workbench.webservices.WSProcessBytesUsingTransformerAsBackgroundJob wsProcessBytesUsingTransformerAsBackgroundJob) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJobPK processFileUsingTransformerAsBackgroundJob(com.amalto.workbench.webservices.WSProcessFileUsingTransformerAsBackgroundJob wsProcessFileUsingTransformerAsBackgroundJob) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSTransformerV2 getTransformerV2(com.amalto.workbench.webservices.WSGetTransformerV2 wsGetTransformerV2) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsTransformerV2(com.amalto.workbench.webservices.WSExistsTransformerV2 wsExistsTransformerV2) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSTransformerV2PKArray getTransformerV2PKs(com.amalto.workbench.webservices.WSGetTransformerV2PKs regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSTransformerV2PK putTransformerV2(com.amalto.workbench.webservices.WSPutTransformerV2 wsTransformerV2) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSTransformerV2PK deleteTransformerV2(com.amalto.workbench.webservices.WSDeleteTransformerV2 wsDeleteTransformerV2) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSTransformerContext executeTransformerV2(com.amalto.workbench.webservices.WSExecuteTransformerV2 wsExecuteTransformerV2) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJobPK executeTransformerV2AsJob(com.amalto.workbench.webservices.WSExecuteTransformerV2AsJob wsExecuteTransformerV2AsJob) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSTransformerContext extractThroughTransformerV2(com.amalto.workbench.webservices.WSExtractThroughTransformerV2 wsExtractThroughTransformerV2) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsTransformerPluginV2(com.amalto.workbench.webservices.WSExistsTransformerPluginV2 wsExistsTransformerPluginV2) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString getTransformerPluginV2Configuration(com.amalto.workbench.webservices.WSTransformerPluginV2GetConfiguration wsGetConfiguration) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString putTransformerPluginV2Configuration(com.amalto.workbench.webservices.WSTransformerPluginV2PutConfiguration wsPutConfiguration) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSTransformerPluginV2Details getTransformerPluginV2Details(com.amalto.workbench.webservices.WSGetTransformerPluginV2Details wsGetTransformerPluginV2Details) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSTransformerPluginV2SList getTransformerPluginV2SList(com.amalto.workbench.webservices.WSGetTransformerPluginV2SList wsGetTransformerPluginV2SList) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRole getRole(com.amalto.workbench.webservices.WSGetRole wsGetRole) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsRole(com.amalto.workbench.webservices.WSExistsRole wsExistsRole) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRolePKArray getRolePKs(com.amalto.workbench.webservices.WSGetRolePKs regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRolePK putRole(com.amalto.workbench.webservices.WSPutRole wsRole) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRolePK deleteRole(com.amalto.workbench.webservices.WSDeleteRole wsRoleDelete) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray getObjectsForRoles(com.amalto.workbench.webservices.WSGetObjectsForRoles wsRoleDelete) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSMenu getMenu(com.amalto.workbench.webservices.WSGetMenu wsGetMenu) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsMenu(com.amalto.workbench.webservices.WSExistsMenu wsExistsMenu) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSMenuPKArray getMenuPKs(com.amalto.workbench.webservices.WSGetMenuPKs regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSMenuPK putMenu(com.amalto.workbench.webservices.WSPutMenu wsMenu) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSMenuPK deleteMenu(com.amalto.workbench.webservices.WSDeleteMenu wsMenuDelete) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJobPK versioningCommitItems(com.amalto.workbench.webservices.WSVersioningCommitItems wsVersioningCommitItems) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean versioningRestoreItemByRevision(com.amalto.workbench.webservices.WSVersioningRestoreItemByRevision wsVersioningRestoreItemByRevision) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSVersioningItemHistory versioningGetItemHistory(com.amalto.workbench.webservices.WSVersioningGetItemHistory wsVersioningGetItemHistory) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSVersioningItemsVersions versioningGetItemsVersions(com.amalto.workbench.webservices.WSVersioningGetItemsVersions wsVersioningGetItemsVersions) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString versioningGetItemContent(com.amalto.workbench.webservices.WSVersioningGetItemContent wsVersioningGetItemContent) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSVersioningObjectsVersions versioningGetObjectsVersions(com.amalto.workbench.webservices.WSVersioningGetObjectsVersions wsVersioningGetObjectsVersions) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSVersioningUniverseVersions versioningGetUniverseVersions(com.amalto.workbench.webservices.WSVersioningGetUniverseVersions wsVersioningGetUniverseVersions) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSVersioningSystemConfiguration getVersioningSystemConfiguration(com.amalto.workbench.webservices.WSGetVersioningSystemConfiguration wsGetVersioningSystemConfiguration) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString putVersioningSystemConfiguration(com.amalto.workbench.webservices.WSPutVersioningSystemConfiguration wsPutVersioningSystemConfiguration) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSVersioningInfo versioningGetInfo(com.amalto.workbench.webservices.WSVersioningGetInfo wsVersioningGetInfo) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJobPK versioningTagObjects(com.amalto.workbench.webservices.WSVersioningTagObjects wsVersioningTagObjects) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJobPK versioningTagUniverse(com.amalto.workbench.webservices.WSVersioningTagUniverse wsVersioningTagUniverse) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJobPK versioningTagItems(com.amalto.workbench.webservices.WSVersioningTagItems wsVersioningTagItems) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJobPK versioningRestoreObjects(com.amalto.workbench.webservices.WSVersioningRestoreObjects wsVersioningRestoreObjects) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJobPK versioningRestoreUniverse(com.amalto.workbench.webservices.WSVersioningRestoreUniverse wsVersioningRestoreUniverse) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJobPK versioningRestoreItems(com.amalto.workbench.webservices.WSVersioningRestoreItems wsVersioningRestoreItems) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJobPKArray findBackgroundJobPKs(com.amalto.workbench.webservices.WSFindBackgroundJobPKs status) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJob getBackgroundJob(com.amalto.workbench.webservices.WSGetBackgroundJob wsGetBackgroundJob) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBackgroundJobPK putBackgroundJob(com.amalto.workbench.webservices.WSPutBackgroundJob wsPutBackgroundJob) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRoutingOrderV2 getRoutingOrderV2(com.amalto.workbench.webservices.WSGetRoutingOrderV2 wsGetRoutingOrderV2) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRoutingOrderV2 existsRoutingOrderV2(com.amalto.workbench.webservices.WSExistsRoutingOrderV2 wsExistsRoutingOrder) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRoutingOrderV2PK deleteRoutingOrderV2(com.amalto.workbench.webservices.WSDeleteRoutingOrderV2 wsDeleteRoutingOrder) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRoutingOrderV2PK executeRoutingOrderV2Asynchronously(com.amalto.workbench.webservices.WSExecuteRoutingOrderV2Asynchronously wsExecuteRoutingOrderAsynchronously) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString executeRoutingOrderV2Synchronously(com.amalto.workbench.webservices.WSExecuteRoutingOrderV2Synchronously wsExecuteRoutingOrderSynchronously) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRoutingOrderV2PKArray getRoutingOrderV2PKsByCriteria(com.amalto.workbench.webservices.WSGetRoutingOrderV2PKsByCriteria wsGetRoutingOrderV2PKsByCriteria) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRoutingOrderV2Array getRoutingOrderV2SByCriteria(com.amalto.workbench.webservices.WSGetRoutingOrderV2SByCriteria wsGetRoutingOrderV2SByCriteria) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRoutingRulePKArray routeItemV2(com.amalto.workbench.webservices.WSRouteItemV2 wsRouteItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSRoutingEngineV2Status routingEngineV2Action(com.amalto.workbench.webservices.WSRoutingEngineV2Action wsRoutingEngineAction) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSUniverse getUniverse(com.amalto.workbench.webservices.WSGetUniverse wsGetUniverse) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsUniverse(com.amalto.workbench.webservices.WSExistsUniverse wsExistsUniverse) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSUniversePKArray getUniversePKs(com.amalto.workbench.webservices.WSGetUniversePKs regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSUniversePKArray getUniverseByRevision(com.amalto.workbench.webservices.WSGetUniverseByRevision wsUniverseByRevision) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSUniversePK putUniverse(com.amalto.workbench.webservices.WSPutUniverse wsUniverse) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSUniversePK deleteUniverse(com.amalto.workbench.webservices.WSDeleteUniverse wsUniverseDelete) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray getObjectsForUniverses(com.amalto.workbench.webservices.WSGetObjectsForUniverses regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSUniverse getCurrentUniverse(com.amalto.workbench.webservices.WSGetCurrentUniverse wsGetCurrentUniverse) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSSynchronizationPlan getSynchronizationPlan(com.amalto.workbench.webservices.WSGetSynchronizationPlan wsGetSynchronizationPlan) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsSynchronizationPlan(com.amalto.workbench.webservices.WSExistsSynchronizationPlan wsExistsSynchronizationPlan) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSSynchronizationPlanPKArray getSynchronizationPlanPKs(com.amalto.workbench.webservices.WSGetSynchronizationPlanPKs regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSSynchronizationPlanPK putSynchronizationPlan(com.amalto.workbench.webservices.WSPutSynchronizationPlan wsSynchronizationPlan) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSSynchronizationPlanPK deleteSynchronizationPlan(com.amalto.workbench.webservices.WSDeleteSynchronizationPlan wsSynchronizationPlanDelete) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray getObjectsForSynchronizationPlans(com.amalto.workbench.webservices.WSGetObjectsForSynchronizationPlans regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray getSynchronizationPlanObjectsAlgorithms(com.amalto.workbench.webservices.WSGetSynchronizationPlanObjectsAlgorithms regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray getSynchronizationPlanItemsAlgorithms(com.amalto.workbench.webservices.WSGetSynchronizationPlanItemsAlgorithms regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSSynchronizationPlanStatus synchronizationPlanAction(com.amalto.workbench.webservices.WSSynchronizationPlanAction wsSynchronizationPlanAction) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSStringArray synchronizationGetUnsynchronizedObjectsIDs(com.amalto.workbench.webservices.WSSynchronizationGetUnsynchronizedObjectsIDs wsSynchronizationGetUnsynchronizedObjectsIDs) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString synchronizationGetObjectXML(com.amalto.workbench.webservices.WSSynchronizationGetObjectXML wsSynchronizationGetObjectXML) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString synchronizationPutObjectXML(com.amalto.workbench.webservices.WSSynchronizationPutObjectXML wsSynchronizationPutObjectXML) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItemPKArray synchronizationGetUnsynchronizedItemPKs(com.amalto.workbench.webservices.WSSynchronizationGetUnsynchronizedItemPKs wsSynchronizationGetUnsynchronizedItemPKs) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSString synchronizationGetItemXML(com.amalto.workbench.webservices.WSSynchronizationGetItemXML wsSynchronizationGetItemXML) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItemPK synchronizationPutItemXML(com.amalto.workbench.webservices.WSSynchronizationPutItemXML wsSynchronizationPutItemXML) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSSynchronizationItem getSynchronizationItem(com.amalto.workbench.webservices.WSGetSynchronizationItem wsGetSynchronizationItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean existsSynchronizationItem(com.amalto.workbench.webservices.WSExistsSynchronizationItem wsExistsSynchronizationItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSSynchronizationItemPKArray getSynchronizationItemPKs(com.amalto.workbench.webservices.WSGetSynchronizationItemPKs regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSSynchronizationItemPK putSynchronizationItem(com.amalto.workbench.webservices.WSPutSynchronizationItem wsSynchronizationItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSSynchronizationItemPK deleteSynchronizationItem(com.amalto.workbench.webservices.WSDeleteSynchronizationItem wsSynchronizationItemDelete) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSSynchronizationItem resolveSynchronizationItem(com.amalto.workbench.webservices.WSResolveSynchronizationItem wsResolveSynchronizationItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSItemPK recoverDroppedItem(com.amalto.workbench.webservices.WSRecoverDroppedItem wsRecoverDroppedItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSDroppedItemPKArray findAllDroppedItemsPKs(com.amalto.workbench.webservices.WSFindAllDroppedItemsPKs regex) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSDroppedItem loadDroppedItem(com.amalto.workbench.webservices.WSLoadDroppedItem wsLoadDroppedItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSDroppedItemPK removeDroppedItem(com.amalto.workbench.webservices.WSRemoveDroppedItem wsRemoveDroppedItem) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSMDMConfig getMDMConfiguration() throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSCheckServiceConfigResponse checkServiceConfiguration(com.amalto.workbench.webservices.WSCheckServiceConfigRequest serviceName) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSWorkflowProcessDefinitionUUIDArray workflowGetProcessDefinitions(com.amalto.workbench.webservices.WSWorkflowGetProcessDefinitions wsworkflowProcessDefinitions) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSWorkflowProcessDefinitionUUID workflowDeploy(com.amalto.workbench.webservices.WSWorkflowDeploy wsWorkflowDeploy) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean workflowUnDeploy(com.amalto.workbench.webservices.WSWorkflowUnDeploy wsWorkflowUnDeploy) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSProcessTaskInstanceArray workflowGetTaskList(com.amalto.workbench.webservices.WSWorkflowGetTaskList uuid) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSProcessInstanceArray workflowGetProcessInstances(com.amalto.workbench.webservices.WSWorkflowGetProcessInstances uuid) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean workflowDeleteProcessInstances(com.amalto.workbench.webservices.WSWorkflowDeleteProcessInstancesRequest deleteWolkflowRequest) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSMDMJobArray getMDMJob(com.amalto.workbench.webservices.WSMDMNULL mdmJobRequest) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean putMDMJob(com.amalto.workbench.webservices.WSPUTMDMJob putMDMJobRequest) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSBoolean deleteMDMJob(com.amalto.workbench.webservices.WSDELMDMJob deleteMDMJobRequest) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSCategoryData getMDMCategory(com.amalto.workbench.webservices.WSCategoryData wsCategoryDataRequest) throws 
         java.rmi.RemoteException;
    public com.amalto.workbench.webservices.WSAutoIncrement getAutoIncrement(com.amalto.workbench.webservices.WSAutoIncrement wsAutoIncrementRequest) throws 
         java.rmi.RemoteException;
}
