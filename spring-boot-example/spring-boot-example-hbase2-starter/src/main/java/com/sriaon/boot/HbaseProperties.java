package com.sriaon.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xielongwang
 * @create 2019-05-1313:44
 * @email xielong.wang@nvr-china.com
 * @description
 */
@ConfigurationProperties(prefix = "spring.data.hbase")
public class HbaseProperties {

    private String quorum;

    private String rootDir;

    private String nodeParent;

    public String getQuorum() {
        return quorum;
    }

    public void setQuorum(String quorum) {
        this.quorum = quorum;
    }

    public String getRootDir() {
        return rootDir;
    }

    public void setRootDir(String rootDir) {
        this.rootDir = rootDir;
    }

    public String getNodeParent() {
        return nodeParent;
    }

    public void setNodeParent(String nodeParent) {
        this.nodeParent = nodeParent;
    }
}