# -Vue-SpringBoot-
主要技术：

- 前端，Vue.js、ElementUI
- 后端，SpringBoot
- 数据库，MySQL
- 前端服务器：Nginx；后端服务器：Tomcat

<!--more-->

# 前端项目结构

![2019040120135655.png](https://i.loli.net/2020/05/30/uhTCV96FN5Y3cmD.png)

需要重点关注的就是小红旗标注的部分，经常修改的部分就是组件文件夹。

前面提到过前后端分离的意思是前后端之间通过 RESTful API 传递 JSON 数据进行交流。

# 前端页面开发

- Login.vue，组件文件夹下新建，就是输入账号密码的登陆界面
- AppIndex.vue，组件文件夹下，就是登陆成功后显示的界面
- 在src\main.js里设置反向代理
- 在src\router\index.js配置页面路由
- config\index.js配置跨域支持，使后端能够访问到前端资源

# 后端开发

- User类
- Result类，为了构造response，主要是响应码
- LoginController，是对响应进行处理的部分

# 引入数据库

- 创建数据库与表
- 完善登陆控制器
  - 修改User类，以建立对数据库的映射
  - UserDAO，用来操作数据库的对象
  - UserService，对UserDAO的二次封装
  - LoginController，登录控制器是功能的核心部分，具体的实现，就是通过 `UserService` 提供的 `get` 方法查询数据库，如果返回的对象为空，则验证失败，否则就验证成功。
- DAO 用于与数据库的直接交互，定义增删改查等操作。
- Service 负责业务逻辑，跟功能相关的代码一般写在这里，编写、调用各种方法对 DAO 取得的数据进行操作。
- Controller 负责数据交互，即接收前端发送的数据，通过调用 Service 获得处理后的数据并返回。

# 使用Element辅助前端开发

# 利用Nginx实现反向代理