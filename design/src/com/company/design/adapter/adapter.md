# Adapter Pattern (어댑터 패턴)

Adapter Pattern는 호환성이 없는 기존 클래스의 인터페이스를 변환하여 재사용 할 수 있도록 한다.  
흔히 돼지코라고 불리는 변환기를 예로 들 수 있고, SOLID중에서 개방폐쇄 원칙 (OCP)를 따른다.

### SOLID (객체 지향 설계)
소프트웨어 작업에서 프로그래머가 소스 코드가 읽기 쉽고 확장하기 쉽게 될 때까지 소프트웨어 소스 코드를 리팩터링하여 코드 냄새를 제거하기 위해 적용할 수 있는 지침

### SRP 단일 책임 원칙 (Single responsibility principle)  
작성된 클래스는 단 하나의 기능만 가지며 클래스가 제공하는 모든 서비스는 그 하나의 책임을 수행하는 데 집중되어 있어야 한다.

### OCP 개방-폐쇄 원칙 (Open/closed principle)
소프트웨어의 구성요소(컴포넌트, 클래스, 모듈, 함수)는 확장에는 열려있고, 변경에는 닫혀있어 한다.

### LSP 리스코프 치환 원칙 (Liskov substitution principle)
프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 한다.

### ISP 인터페이스 분리 원칙 (Interface segregation principle)
하나의 일반적인 인터페이스보다는, 여러 개의 구체적인 인터페이스가 낫다.

### DIP 의존관계 역전 원칙 (Dependency inversion principle)
추상화된 것은 구체적인 것에 의존하면 안 된다. 구체적인 것이 추상화된 것에 의존해야 한다.

[SOLID 위키백과](https://ko.wikipedia.org/wiki/SOLID_(%EA%B0%9D%EC%B2%B4_%EC%A7%80%ED%96%A5_%EC%84%A4%EA%B3%84))  
[5가지 원칙 정의](https://www.nextree.co.kr/p6960/)