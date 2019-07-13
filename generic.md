# 제네릭 프로그래밍

1. 제네릭 클래스는 타입 매개변수를 한 개 이상 받는 클래스다.

2. 제네릭 메서드는 타입 매개변수를 받는 메서드다.

3. 타입 매개변수가 타입 한 개 이상의 서브타입이 되도록 요구할 수 있다.

4. 제네릭 타입은 불변 타입이다. 즉, `S`가 `T`의 서브타입일 때 `G<S>`와 `G<T>` 사이에는 아무런 관계가 없다.

5. 와일드카드 `G<? extends T>` 또는 `G<? super T>`를 사용해 메서드가 서브클래스나 슈퍼클래스 인수로 넘긴 제네릭 타입의 인스턴스를 수용할 수 있음을 명시할 수 있다.

6. 제네릭 클래스와 제네릭 메서드를 컴파일할 때 타입 매개변수가 소거된다(지워진다).

7. 타입 소거로 제네릭 타입에 많은 제약이 생긴다. 특히 제네릭 클래스나 배열의 인스턴스 생성, 제네릭 타입으로 캐스트, 제네릭 타입 객체를 예외로 던지는 일을 할 수 없다.

8. `Class<T>` 클래스는 제네릭이다. 덕분에 cast 같은 메서드가 `T` 타입 값을 만들어 내도록 선언되어 유용하다.

9. 제네릭 클래스와 제네릭 메서드의 타입 매개변수는 가상 머신에서 소거되지만, 실행 시간에 이들이 어떻게 선언되어 있는지 알아낼 수 있다.



## 타입 경계

제네릭 클래스나 제네릭 메서드가 받는 타입 매개변수의 타입을 제한해야 할 때도 있다. 이때 **타입 경계**(type bound)를 지정하면 특정 클래스를 확장하거나 특정 인터페이스를 구현하도록 할 수 있다.

다음과 같이 타입 매개변수에 다중 경계를 지정할 수도 있다.

`T extends Runnable & AutoCloseable`