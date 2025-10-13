# Проект песочница на базе SmartGwt и JavaEE

Для ускоренной разработки приложений и максимально удобной отладки на клиенте и сервере

### Install Smartgwt LGPL

1. Загрузка библиотеки
```shell
mvn com.isomorphic:isc-maven-plugin:1.4.5:install \
     -Dproduct=SMARTGWT -Dlicense=LGPL -DbuildNumber=13.1p
```

2. Указать версию библиотеки

```xml
    <smartgwt.version>13.1-p20251011</smartgwt.version>
```

### Command line tools

1. Сборка 

```shell
mvn clean install
```

2. Запуск

Если запускать через командную строку, то предварительно собрать

```shell
java \
  -cp "runner/target/classes:sgwt-app-server/target/classes:$(find ~/.m2/repository/org/apache/tomcat -name '*.jar' | tr '\n' ':')" \
  com.example.sgwt.runner.Main
```

3. Запуск через Intellij IDEA

Просто вызывать **main** в классе **com.example.sgwt.runner.Main**

Открыть страницу приложения http://localhost:8080/app/

4. Для отладки фронтенд-части нужно поднять сервер

```shell
mvn gwt:codeserver
```

Перейти по адресу код-сервера http://127.0.0.1:9876/ и сохранить ссылки(кнопки) **Dev Mode On** и **Dev Mode Off**
в закладки. Далее перейти на страницу с приложением и использовать эти кнопки для включения/отключения обновлений изменений в коде фронтенда.

5. Чтобы использовать **клиентский** отладчик(точки останова на Java и т.п.) можно использовать 
Chrome - sources - <название приложения>/127.0.0.1:9786/sourcemaps/
