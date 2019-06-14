package com.zhanhao.apollodemo1.entity;

import java.io.IOException;

/**
 * @Author: ZhanHao
 * @Description:
 * @Date: 18:13 2019/6/11
 * @Modified By:
 */
public class OfflineConfigEntity {
    private String repoType;

    private String downloadHost;

    private String descFile;

    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }

    public String getDownloadHost() {
        return downloadHost;
    }

    public void setDownloadHost(String downloadHost) {
        this.downloadHost = downloadHost;
    }

    public String getDescFile() {
        return descFile;
    }

    public void setDescFile(String descFile) throws IOException {
        this.descFile = descFile;
    }
}
