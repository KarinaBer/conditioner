public class Conditioner {
    private int currentTemperature; //поле кондиционера с текущей темпой

    public int getCurrentTemperature() { //метод для того, чтобы кто-то мог ПОЛУЧИТЬ (гет) текущую темпу
        return currentTemperature; //простой метод, чтобы получать то значение, кото-е лежит в поле
    }

    public void setCurrentTemperature(int newCurrentTemperature) { //поменять значения. Сет-установить к-то параметр в нужное значение.
        if (newCurrentTemperature < 0) { //делаем НЕтривиальным тест. Если новая темпа, кот-ю просят выставить < 0, то её нельзя поставить текущей темпой
            return; //и сразу выходим из метода
        } //в итоге, выйдя из метода, мы не дойдем до строки, кот-я меняет темпу, и она не будет изменена
        if (newCurrentTemperature > 30) { //новая темпа не > макс, т.е новая темпа > макс, то
            return; //то уходим из этого метода
        }
        currentTemperature = newCurrentTemperature;
    }

    public void increaseTemp50p() { //метод- увеличить темпу в полтора раза
        int target = currentTemperature * 3 / 2; //текущую темпу увеличим в полтора раза
        setCurrentTemperature(target);
    }

     public void setToMaxTemp() { //метод функции выставления макс.темпы
         currentTemperature = 30; //поле. текущая темпа равна 30, т.е максимальной

     }

}
