Задача №1 - CashbackHacker
Введение
Вы участвуете в проекте CashbackHacker - небольшой сервис, который сообщает пользователю о том, сколько ему нужно "докупить" в рамках конкретной траты, чтобы получить максимальное количетство кэшбека.

Подробнее: кэшбек начисляется за каждую потраченную полную тысячу рублей, поэтому если вы покупаете что-то на 900 рублей, сервис должен посоветовать вам докупить "ещё чего-нибудь" на 100 рублей.

Код сервиса выглядит следующим образом:

package ru.netology.service;

public class CashbackHackService {
private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
Вам нужно создать проект на базе Gradle (как на лекции), не добавляя в него внешних зависимостей.

Выложите полученный проект на GitHub. Не забудьте про файл .gitignore. Подключите Github Actions.

Легенда
Поскольку вы уже умеете работать с JUnit5 вам поручили провести небольшое исследование, в рамках которого попробовать использовать TestNG и JUnit4 (тот самый пресловутый кейс - попробуем что-то сделать, а потом уже будем принимать решения).

Часть 1. TestNG
Описание
TestNG сравнительно неплохо документирован.

На этом уровне, с точки зрения пользователя, почти всё*, что поменяется - мы подключим другую библиотеку и будем использовать аннотации из неё и assert'ы.

Ключевые аннотации (вы можете прочитать JavaDoc'и на них).

Ключевые Assert'ы (вы можете прочитать JavaDoc'и на них).

Что нужно сделать
Сделайте ветку testng, в которой:

1. Добавьте в зависимости TestNG:

dependencies {
testImplementation 'org.testng:testng:7.1.0'

}

test {
useTestNG()
}
2. Напишите простые автотесты (без параметризации) на основании материала следующего раздела.

Особенности
На этом уровне для нас поменяется всего три вещи:

Аннотация @Test должна имеет Fully Qualified Name org.testng.annotations.Test
Assert'ы расположены в классе org.testng.Assert (обратите внимание: в TestNG принято actual, expected вместо expected, actual)
Класс и тестовые методы должны иметь модификатор доступа public (именно поэтому мы вам рекомендовали прописывать модификаторы в тестовых классах)