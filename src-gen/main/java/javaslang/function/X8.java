/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
// @@ GENERATED FILE - DO NOT MODIFY @@
package javaslang.function;

import javaslang.Tuple8;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface X8<T1, T2, T3, T4, T5, T6, T7, T8, R> extends λ<R> {

    R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) throws Throwable;

    @Override
    default int arity() {
        return 8;
    }

    @Override
    default X1<T1, X1<T2, X1<T3, X1<T4, X1<T5, X1<T6, X1<T7, X1<T8, R>>>>>>>> curried() {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> t7 -> t8 -> apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    @Override
    default X1<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> tupled() {
        return t -> apply(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8);
    }

    @Override
    default X8<T8, T7, T6, T5, T4, T3, T2, T1, R> reversed() {
        return (t8, t7, t6, t5, t4, t3, t2, t1) -> apply(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    @Override
    default <V> X8<T1, T2, T3, T4, T5, T6, T7, T8, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (t1, t2, t3, t4, t5, t6, t7, t8) -> after.apply(apply(t1, t2, t3, t4, t5, t6, t7, t8));
    }

}