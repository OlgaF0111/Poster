package ru.netology.domain;

public class BillboardManager {
    // хранит все фильмы в массиве
    private String[] films = new String[0]; //здесь весь массив длинною 0
    private int limit;  // переменная int для хранения лимита


    // конструктор без параметров
    public BillboardManager() {

        this.limit = 10;
    }

    // конструктор с параметрами
    public BillboardManager(int limit) {

        this.limit = limit;
    }

    // метод добавления фильмов в массив- репозиторий
    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1]; // новый массив на 1 ед больше чем предыдущий
        for (int i = 0; i < films.length; i++) {   // циклом копируем все из старого массива в новый
            tmp[i] = films[i];                     // Скопируем в новый массив все элементы из старого массива
        }
        tmp[tmp.length - 1] = film;                //заполняем самую последнюю ячейку кладем фильм
        films = tmp;                              // запоминаем/присваиваем новый массив

    }

    // метод возвращающий все запомненные фильмы  в виде массива
    public String[] findAll() {

        return films;   // отдаем массив
    }

    // метод получения последних нескольких фильмов в обратном порядке
    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }
}

