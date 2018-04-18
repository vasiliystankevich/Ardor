Readme

Ниже я описываю как имплементировать ethereumj в виде jar файла в ArdorCreationKit
Все эти действия уже проделаны в текущих исходниках
Нужно просто отдельно открыть папки ethereumj или ArdorCreationKit в виде проекта в Intelij Idea


Как получить ethereumj.jar

1) ставим SDKMAN

в консоли пишем 
$ curl -s "https://get.sdkman.io" | bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh" 

2) ставим Gradle

в консоли пишем 
$ sdk install gradle 4.6

3) ставим Intelij Idea 

$ sudo add-apt-repository ppa:ubuntu-desktop/ubuntu-make
$ sudo apt-get update
$ sudo apt-get install ubuntu-make
$ umake ide idea-ultimate

3) собираем исходники ethereumj через gradle
открываем консоль в папке исходников и выполняем
$ gradlew build

4) потом запускаем Intelij Idea
5) создаем пустой проект из исходников и вкачестве основного файла указываем ethereumj/build.gradle 
6) ждем пока Intelij Idea разбереться с Gradle
7) билдим исходники
8) после успешной сборки в Intelij Idea открываем File->Project Structure->Artefacts->Add->Jar->"From modules with dependecies"
9) настраиваем сборку Jar в виде 1 файла, либо набора библиотек
10) собираем необходимые Jar файлы через меню Buid->Build Artefacts 

Перенос ethereumj.jar в ArdorCreationKit
1) копируем получившийся ethereumj.jar и его зависимости в ArdorCreationKit/lib/ethereumj
2) запускаем Intelij Idea
3) создаем проект из исходников действуя по умолчанию
4) после загрузки проекта открываем File->Project Structure->Libraries
5) Добавляем новую Java библиотеку "ethereumj" c указанием зависимостей по пути ArdorCreationKit/lib/ethereumj
6) собираем проект
 
