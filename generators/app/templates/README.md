# <%= projectName %>
- <%= projectName %>是一个jud插件，可以通过judpack快速集成，可以丰富jud功能

# 功能

# 快速使用
- 通过judpack初始化一个<%= projectName %>工程
   ```
   jud create dev <%= projectName %>
   ```
- 添加插件
  ```
  jud plugin add <%= projectName %>
  ```

# 已有工程集成
## iOS集成插件<%= iOSProjectName %>
- 命令行集成
  ```
  jud plugin add <%= projectName %>
  ```
- 手动集成
  在podfile 中添加
  ```
  pod '<%= iOSProjectName %>'
  ```

## 安卓集成插件<%= AndroidProjectName %>
- 命令行集成
  ```
  jud plugin add <%= projectName %>
  ```
- 手动集成
  在相应工程的build.gradle文件的dependencies中添加
  ```
  compile '${groupId}:<%= AndroidProjectName %>:{$version}'
  ``` 
  注意：您需要自行指定插件的groupId和version并将构建产物发布到相应的依赖管理仓库内去（例如maven）, 您也可以对插件的name进行自定义，默认将使用插件工程的名称作为name


## 浏览器端集成 <%= projectName %>
- 命令行集成
  ```
  npm install  <%= projectName %>
  ```
- 手动集成
  在相应工程的package.json文件的dependencies中添加
  ```
  <%= projectName %>:{$version}'
  ``` 
  
