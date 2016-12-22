# XiMaLaYa
## 问题提出 
写程序输出喜马拉雅FM上与“卓老板”相关（相关指用“卓老板”作关键词可以在喜马拉雅上搜索到）的所有专辑的信息，按总播放量倒序排列，每行是一个字符串，形如{"title" : "该专辑的名称", "anchorman" : "该专辑所属的账号名称", "info" : "该专辑的简介", "totalPlayCount" : 该专辑的总播放量}。可以只输出信息，不用下载专辑中的音频mp3文件。可以用C/C++、JavaScript、Java、Python、Go等语言编写。
## 问题解决 
http://www.cnblogs.com/neillee/p/6208003.html#3586531 
## Python实现 
使用 requests 请求数据，使用 json 库解析数据。
<br>效果截图：![](https://github.com/neilleecn/XiMaLaYa/blob/master/screenshot/screenshot_py.png)
## Java实现 
撰写并使用网络请求类（内含方法）请求数据，使用 fastjson 解析数据。
<br>效果截图：![](https://github.com/neilleecn/XiMaLaYa/blob/master/screenshot/screenshot_java.png)
## 使用到的第三方库
[requests](http://www.python-requests.org/en/master/)
[fastjson](https://github.com/alibaba/fastjson)
