### 关于 sealed, non-sealed, final, permit 关键字的一些法则

sealed 的意思就是说，我只允许我认识的的子类能够继承我，下面就是一个典型的：

public sealed interface Flyable permits Pajaro, Pajaro2, Pajaro3 {}

它本身可以是类，也可以是接口


### 关于继承者的写法：
public sealed class Pajaro3 implements Flyable permits SubPajaro3 {}
继承者可以在前面有三种修饰的选择，"sealed", "non-sealed", "final"，并且必须选择这三种之一，没有默认


### 关于继承者的继承者
继承者如果是选择 final, 那么就没有继承者了
继承者如果是选择 non-sealed, 那么它的继承者就能正常工作了
继承者如果是选择 sealed, 那么他的继承者还是要面临 final, non-sealed, sealed 之间的选择