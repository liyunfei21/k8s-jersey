package com.yfl.jerseyclient;

/**
 * Created by 云飞 on 2016/12/5.
 */
public enum ResourceType {

    NODES("nodes"),
    NAMESPACES("namespaces"),
    SERVICES("services"),
    REPLICATIONCONTROLLERS("replicationcontrollers"),
    PODS("pods"),
    BINDINGS("bindings"),
    ENDPOINTS("endpoints"),
    SERVICEACCOUNTS("serviceaccounts"),
    SECRETS("secrets"),
    EVENT("event"),
    COMPONETSTATUSES("componentstatuses"),
    LIMITRANGES("limitranges"),
    RESOURCEQUOTAS("resourcequotas"),
    PODTEMPLATES("podtemplates"),
    PERSISTENTVOLUMECLAIMS("persistentvolumeclaims");

    private String type;

    ResourceType(String type) {
        this.type = type;
    }



    public String getType() {
        return type;
    }


}
