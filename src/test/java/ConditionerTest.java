import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {

    @Test
    public void shouldSetTemperature() {  //проверяем, что кондеру можно выставить темпу
        Conditioner cond = new Conditioner(); //подготовка, создаем объект кондера и кладем  него новосозданный объект

        cond.setCurrentTemperature(15); //тестируемое действие, кладем туда темпу 15

        int expected = 15; //проверка, действительно ли он выставит темпу 15
        int actual = cond.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetTemperatureAboveMax() { //не должен выставлять темпу выше макс.
        Conditioner cond = new Conditioner(); //подготовительный этап

        cond.setCurrentTemperature(50); //тестируем-е действие, проверяем, что текущая темпа 50 (на самом деле нет)

        int expected = 0; //ожидаем, что рез-т 0, т.к кондер не должен высталять темпу выше макс.
        int actual = cond.getCurrentTemperature(); //

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldToMaxTemperature() { //тест, действительно ли выставилась макс.темпа
        Conditioner cond = new Conditioner(); //подготавливаем най кондер, кладем новосозданный объект

        cond.setToMaxTemp(); //тестируемое действие,

        int expected = 30; //проверяем, что текущая макс темпа = 30
        int actual = cond.getCurrentTemperature(); //спрашиваем через обращение к полю

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTemperature50p() {
        Conditioner cond = new Conditioner(); //создаём кондер
        cond.setCurrentTemperature(25); //подготовка. Говорим кондеру выставить темпу 10.

        cond.increaseTemp50p();

        int expected = 25;
        int actual = cond.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }
}
