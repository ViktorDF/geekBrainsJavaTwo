package lessones.two;

public class Main {
    /*
    1. Напишите метод, на вход которого подаётся двумерный
    строковый массив размером 4х4, при подаче массива другого размера необходимо бросить
    исключение MyArraySizeException.
    2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
    Если в каком-то элементе массива преобразование не удалось
    (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
    MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
    3. В методе main() вызвать полученный метод, обработать возможные исключения
    MySizeArrayException и MyArrayDataException, и вывести результат расчета.
     */
    public static void main(String[] args) {
        String[][] strings = {
                {"1","2","3","r"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"}};
        try {
            System.out.println(sumArrayFourByFour(strings));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int sumArrayFourByFour (String[][] arrayString) throws MyArrayDataException, MyArraySizeException{
        int sum = 0;

        if (arrayString.length > 4)
            throw new MyArraySizeException("Размер массива неправильный! Должно быть 4 на 4!");
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].length > 4)
                throw  new MyArraySizeException("Размер массива неправильный! Должно быть 4 на 4!");
        }

        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString.length; j++) {
                try {
                    sum += Integer.parseInt(arrayString[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удалось преобразовать строку в число!\n" +
                            "Ошибка в ячейке: [" + (i+1) + "][" + (j+1) + "]");
                }
            }
        }

        return sum;
    }
}
