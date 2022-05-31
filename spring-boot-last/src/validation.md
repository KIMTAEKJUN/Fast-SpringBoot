# Spring Boot Validation

### Validation
> Validation 이란 프로그래밍에 있어서 가장 필요한 부분입니다.   
> 특히 Java에서는 null 값에 대해서 접근 하려고 할 때 null pointer exception이 발생 함으로,   
> 이러한 부분을 방지 하기 위해서 미리 검증을 하는 과정을 Validation 이라고 합니다.
> 
> 단순하게는 아래와 같은 코드들 입니다.
> ```java
> public void run(String account, String pw, int age) {
>    if (account == null || pw == null) {
>        return
>    }
>    if (age == 0) {
>        return
>    }
>    // 정상 Logic
> }
> ```