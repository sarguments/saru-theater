참고 목록
- https://medium.com/@joongwon/java-java%EC%9D%98-generics-604b562530b3
- https://javacan.tistory.com/tag/%EB%B0%98%EA%B3%B5%EB%B3%80
- http://happinessoncode.com/2017/05/21/java-generic-and-variance-1/
- https://vandbt.tistory.com/41

## 매개변수화 타입(Parameterized type)
- 하나 이상의 타입 매개변수(type parameter)를 선언하고 있는 클래스나 인터페이스를 제네릭 클래스, 또는 제네릭 인터페이스라고 하며 이를 합쳐 제네릭 타입이라고 한다

## 바운드 타입 매개변수(Bounded type parameter)
- 바운드 타입은 특정 타입으로 제한한다는 의미이다. 특정 타입의 서브타입으로만 제한을 시키겠다는 것으로 해석하면 된다

## 제네릭의 서브타이핑(Subtyping in generics)
- 매개변수화 타입은 무공변(invariant)이기 때문에 Box<Number>는 Box<Integer>의 서브타입도, 슈퍼 타입도 아니다. 오로지 Box<Number>에서는 Number 타입만 허용하고 Box<Integer>는 Integer 타입만 허용하기 때문에 둘은 다른 존재다

## 바운드 와일드카드 타입(Bounded wildcard type)
- 바운드 와일드카드 타입에는 Upper bounded wildcard와 Lower bounded wildcard가 있다. Collection 계열 클래스들의 소스코드를 살펴보면 자주 볼 수 있는 <? extends T>가 Upper bounded wildcard이고 <? super T>가 Lower bounded wildcard이다.
다른 말로 전자를 공변(covariant)이라 하고 후자를 반공변(contravariance)이라 부르는데 각각이 의미하는 내용은 다음과 같다.

1. 무공변(invariant) : 오로지 자기 타입만 허용하는 것 <T>
2. 공변 (covariant) : 구체적인 방향으로 타입 변환을 허용하는 것 (자기 자신과 자식 객체만 허용) <? extends T>
3. 반공변 (contravariant) : 추상적인 방향으로의 타입 변환을 허용하는 것(자기 자신과 부모 객체만 허용) <? super T>

---

1. 공변성(covariant) : T’가 T의 서브타입이면, C<T’>는 C<? extends T>의 서브타입이다.
2. 반공변성(contravariant) : T’가 T의 서브타입이면, C<T>는 C<? super T’>의 서브타입이다.

- PECS : Producer(생산자)-extends, Consumer(소비자)-super

> 데이터 구조에서 값을 가져오면 공변, 데이터 구조에 값을 넣으면 반공변 타입을 사용한다

하위 타입인지 여부는 다음 LSP(Liskov Substitution Principle)로 확인해 볼 수 있다.

> A <: B이면 B 타입의 값을 사용하는 모든 것은 A 타입 값을 사용할 수 있어야 한다.

- 메서드의 반환 타입은 공변적이고, 메서드의 파라미터 타입은 반공변적
