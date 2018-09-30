package com.mahesh.threads;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement (name="nodeTypes")
@XmlAccessorType(XmlAccessType.FIELD)
public class NodeTypesMap {
     
    private Map<String, NodeType> nodeType = new HashMap<String, NodeType>();
 
    public Map<String, NodeType> getEmployeeMap() {
        return nodeType;
    }
 
    public void setEmployeeMap(Map<String, NodeType> employeeMap) {
        this.nodeType = employeeMap;
    }
}