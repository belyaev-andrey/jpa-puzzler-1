# JPA Puzzler 1 - Lombok

Here you can try some issues that may appear when you use Lombok with JPA entities. You need to rememember that `@Data`
annotation includes lazy fields into `toString()`, `equals()` and `hashcode()` methods, so you might get `LazyInitException`
when working with lazy fields or `StackOverflowException` with eager ones.