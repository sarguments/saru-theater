# 개인 정리

참고 : http://aeternum.egloos.com/, https://effectiveprogramming.tistory.com/ 등...

### 추상화
목적에 중요한 세부사항에만 초점을 맞추는 것.
추상화는 큰 문제를 작은 구성요소로 분리하는 것이고, 각각의 구성요소들은 상대적으로 격리되어 동작될 수 있다.

### 인터페이스 = 계약
사용자 측에서는 계약서, 즉 interface를 구현하기만 한다면 구체적인 객체가 어떤 일을 하든지 상관하지 않는다. 대신 계약서(interface)는 반드시 지켜져야만 한다.

### 다형성
서로 다른 객체들의 고유 타입을 은닉하고 동일한 상위 타입을 통해 다수의 객체를 동일하게 다루는 것.

### 정보 은닉의 종류
- 객체의 구체적인 타입 은닉(= 상위 타입 캐스팅)
- 객체의 필드 및 메소드 은닉(= 캡슐화)
- 구현 은닉(= 인터페이스 및 추상 클래스 기반의 구현)

### 정보 은닉의 목적
- 코드가 구체적인 것들(타입, 메소드, 구현)에 의존하는 것을 막아줌으로써 객체 간의 구체적인 결합도를 약화시켜 기능의 교체나 변경이 쉽도록 함.
- 동일한 타입의 다른 구현 객체들을 교체함으로써 동적 기능 변경이 가능함.
- 연동할 구체적인 구현이 없는 상태에서도 (인터페이스 만으로) 정확한 연동 코드의 생성이 가능함.

### 정보 은닉의 장점

- 재사용성 : 객체가 다른 객체의 고유 타입에 의존하지 않도록 함으로써 다른 소프트웨어나 다른 모듈에서도 쉽게 이용할 수 있음.
- 유연성 : 위임 객체의 고유 타입에 의존하지 않게 함으로써 위임 객체를 교체하기 쉽게 만들어 소프트웨어 기능을 교체/확장하기 용이하도록 함.
- 유지보수성 : 객체가 가져야 할 기능들을 각각 고유한 클래스에 구현하도록 함으로써 기능의 수정 시 다른 기능에 영향을 주는 것을 최소화 함. 객체가 가진 최소한의 공개 메소드만을 호출함으로써 설계 변경 시 변경할 코드의 양을 최소화 함.

### 제네릭
- [Generic](generic.md)

### 공변 & 반공변
- [공변_반공변](variant.md)

### ETC

## 객체
1. 객체는 내면과 내면을 감싸는 외피를 가진다.
2. 내면은 외피 내부로 숨겨지며 이를 추상이라고 한다.
3. 객체는 외피를 가짐으로써 주변사물과 독립적으로 구분될 수 있다.
4. 객체는 외피를 가짐으로써 관찰대상이 될 수 있다.
5. 구체적인 형태를 가지지 않는 것들 - 경제, 국가 - 도 객체가 될 수 있다.
6. 객체에 대한 정의는 상대적이다.
7. 객체는 객체를 포함할 수 있다.

https://www.joinc.co.kr/w/Site/SoftWare_engineering/OOP


## Discussing differences between abstract classes and interfaces

**Abstract class** and **interface** both are used to achieve abstraction where we can declare the abstract methods. We cannot create instances of abstract classes and interfaces directly, only through classes inherited them.

Since Java 8, an interface can have default and static methods that contain an implementation. It makes interface more similar to an abstract class.

There is a list of some important differences between these concepts.

- an **abstract class** can have *abstract* and *non-abstract* instance methods when an **interface**can have *abstract* or *default* instance methods;
- an **abstract class** can extend another abstract or regular class when an **interface** can only extend another interface;
- an **abstract class** can extend only one class when an **interface** can extend any number of interfaces;
- an abstract class can have *final*, *non-final*, *static*, *non-static* *variables* (regular fields) when an interface has only *static final variables*;
- an **abstract class** can provide an implementation of an interface when an **interface** can't provide an implementation of an abstract class;
- an **abstract class** can have a constructor when an **interface** cannot;
- in an **abstract class**, the keyword `abstract` is mandatory to declare a method as an *abstract* when in an **interface** this keyword is optional.

Remember, a class **extends** another class, a class **implements** an interface, but an interface **extends** another interface.

The list of differences is not full. **Abstract classes** and **interfaces** have a lot of other differences. But the main difference is their appointment.

Typically, interfaces are used to decouple the interface of a component (class) from the implementation when abstract classes are often used as base classes with common fields for extending by subclasses.

https://hyperskill.org/learn/step/3563


