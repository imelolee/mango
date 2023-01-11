package com.example.mango.service.impl;

import com.example.mango.service.MysqlBackupService;
import com.example.mango.util.MySqlBackupRestoreUtils;
import org.springframework.stereotype.Service;

@Service
public class MysqlBackupServiceImpl implements MysqlBackupService {
    @Override
    public boolean backup(String host, String userName, String password, String savePath, String fileName, String databaseName) throws Exception {
        return MySqlBackupRestoreUtils.backup(host, userName, password, savePath, fileName, databaseName);
    }

    @Override
    public boolean restore(String restoreFilePath, String host, String userName, String password, String database) throws Exception {
        return MySqlBackupRestoreUtils.restore(restoreFilePath, host, userName, password, database);
    }
}
