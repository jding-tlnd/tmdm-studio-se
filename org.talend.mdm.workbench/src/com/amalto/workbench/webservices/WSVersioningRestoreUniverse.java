// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSVersioningRestoreUniverse {
    protected java.lang.String versioningSystemName;
    protected java.lang.String tag;
    protected java.lang.String[] encodedClusterNames;
    
    public WSVersioningRestoreUniverse() {
    }
    
    public WSVersioningRestoreUniverse(java.lang.String versioningSystemName, java.lang.String tag, java.lang.String[] encodedClusterNames) {
        this.versioningSystemName = versioningSystemName;
        this.tag = tag;
        this.encodedClusterNames = encodedClusterNames;
    }
    
    public java.lang.String getVersioningSystemName() {
        return versioningSystemName;
    }
    
    public void setVersioningSystemName(java.lang.String versioningSystemName) {
        this.versioningSystemName = versioningSystemName;
    }
    
    public java.lang.String getTag() {
        return tag;
    }
    
    public void setTag(java.lang.String tag) {
        this.tag = tag;
    }
    
    public java.lang.String[] getEncodedClusterNames() {
        return encodedClusterNames;
    }
    
    public void setEncodedClusterNames(java.lang.String[] encodedClusterNames) {
        this.encodedClusterNames = encodedClusterNames;
    }
}
