# Проект песочница на базе SmartGwt и JavaEE

Для ускоренной разработки приложений и максимально удобной отладки на клиенте и сервере

## Usage: Apache Maven

### Command line tools

Запуск в режиме отладки(профиль **dev**)

1. Внутри папки проекта
        
        cd sgwt-app

2. Запускаем код-сервер клиентской части.

        mvn gwt:codeserver -am -pl *-client

3.  В другой командной строке, в этой же директории запускаем servlet-контейнер

        mvn jetty:run -Pdev -pl *-server

4. Ждем когда запуск на шагах 2,3 будет завершен и проверяем в браузере <http://localhost:8081/index.jsp>
(порт зависит от настроек сервера **jetty** в модуле **server**)

5. Чтобы использовать **серверный** отладчик, перед командой на шаге 3 добавляем:

        export MAVEN_OPTS="-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=8000,server=y,suspend=n"

6. Чтобы использовать **клиентский** отладчик(точки останова на Java и т.п.) можно использовать 
Chrome - sources - <название приложения>/127.0.0.1:9786/sourcemaps/

## Related Topics

- Refer to the [Reify for Developers](https://www.smartclient.com/smartclient-latest/isomorphic/system/reference/?id=group..reifyForDevelopers) documentation topic for tips on importing UI assets from the Reify environment.

- Hosted Mode is being being phased out by GWT and replaced with Super Dev Mode.  You can find an overview of SDM at:

  <http://www.gwtproject.org/articles/superdevmode.html>

- For more details about how to set up or use SDM, see our online Smart GWT SDM Troubleshooting help topic at 

  <http://www.smartclient.com/smartgwt/javadoc/com/smartgwt/client/docs/SuperDevModeTroubleshooting.html>

- See our debugging overview at <http://www.smartclient.com/smartgwt/javadoc/com/smartgwt/client/docs/Debugging.html>

