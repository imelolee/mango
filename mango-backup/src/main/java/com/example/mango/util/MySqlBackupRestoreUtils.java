package com.example.mango.util;

import java.io.File;
import java.io.IOException;

/**
 * MySQL备份还原工具类
 *
 * @author genleel
 */
public class MySqlBackupRestoreUtils {
    /**
     * 备份数据库
     *
     * @param host     host地址，可以是本机也可以是远程
     * @param userName 数据库的用户名
     * @param password 数据库的密码
     * @param savePath 备份的路径
     * @param fileName 备份的文件名
     * @param database 需要备份的数据库的名称
     * @return
     */
    public static boolean backup(String host, String userName, String password, String savePath, String fileName, String database) throws Exception {
        File backupFolderFile = new File(savePath);
        if (!backupFolderFile.exists()) {
            // 目录不存在则创建
            backupFolderFile.mkdirs();
        }
        if (!savePath.endsWith(File.separator) && !savePath.endsWith("/")) {
            savePath = savePath + File.separator;
        }

        // 命令行的命令
        String backupFilePath = savePath + fileName;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mysqldump --opt ").append(" --add-drop-database ").append(" --add-drop-table ");
        stringBuilder.append(" -h").append(host).append(" -u").append(userName).append(" -p").append(password);
        stringBuilder.append(" --result-file=").append(backupFilePath).append(" --default-character-set=utf8 ").append(database);
        // 调用执行exe的Java Api
        try {
            Process process = Runtime.getRuntime().exec(getCommand(stringBuilder.toString()));
            if (process.waitFor() == 0) {
                // 0表示线程正常停止
                System.out.println("数据已经备份到 " + backupFilePath + " 文件中");
                return true;
            }
        }  catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return false;
    }

    /**
     * 还原数据库
     *
     * @param restoreFilePath 数据库备份的脚本路径
     * @param host            IP地址
     * @param database        数据库名称
     * @param userName        用户名
     * @param password        密码
     * @return
     */
    public static boolean restore(String restoreFilePath, String host, String userName, String password, String database) throws Exception {
        File restoreFile = new File(restoreFilePath);
        if (restoreFile.isDirectory()) {
            for (File file : restoreFile.listFiles()) {
                if (file.exists() && file.getPath().endsWith(".sql")) {
                    restoreFilePath = file.getAbsolutePath();
                    break;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mysql -h").append(host).append(" -u").append(userName).append(" -p").append(password);
        stringBuilder.append(" ").append(database).append(" < ").append(restoreFilePath);
        try {
            Process process = Runtime.getRuntime().exec(getCommand(stringBuilder.toString()));
            if (process.waitFor() == 0) {
                System.out.println("数据已经从 " + restoreFilePath + " 导入");
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private static String[] getCommand(String command) {
        String os = System.getProperty("os.name");
        String shell = "/bin/bash";
        String c = "-c";
        String execDocker = null;
        if (os.toLowerCase().startsWith("win")) {
            shell = "cmd";
            c = "/c";

        }
        String[] cmd = {shell, c, command};
        return cmd;
    }

    public static void main(String[] args) throws Exception {
        String host = "localhost";
        String userName = "root";
        String password = "password";
        String database = "mango";

        System.out.println("开始备份");
        String backupFolderPath = "c:/dev/";
        String fileName = "mango.sql";
        backup(host, userName, password, backupFolderPath, fileName, database);
        System.out.println("备份成功");

        System.out.println("开始还原");
        String restoreFilePath = "c:/dev/mango.sql";
        restore(restoreFilePath, host, userName, password, database);
        System.out.println("还原成功");

    }
}
