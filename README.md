# mango
## 项目结构
- mango-common： 公共代码模块，主要放置一些工具类
- mango-core： 封装业务模块，主要封装公共业务模块
- mango-admin： 后台管理模块，包含用户、角色、菜单管理等
- mango-backup： 系统数据备份还原模块，可选择独立部署
- mango-monitor： 系统监控服务端，监控Spring Boot应用
- mango-producer： 服务提供者示例，方便在此基础上搭建模块
- mango-consumer： 服务消费者示例，方便在此基础上搭建模块
- mango-hystrix： 服务熔断监控模块，收集汇总熔断统计信息
- mango-zuul： API服务网关模块，统一管理和转发外部调用请求
- mango-config： 配置中心服务端，生成GIT配置文件的访问接口
- mango-consul： 注册中心，安装说明目录，内附安装引导说明
- mango-zipkin： 链路追踪，安装说明目录，内附安装引导说明
- config-repo： 配置中心仓库，在GIT上统一存储系统配置文件
- mango-pom： 聚合模块，仅为简化打包，一键执行打包所有模块
