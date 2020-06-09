package com.mera.gokhmak.les8;

public abstract class Deserializator<T1,T2> {
    public abstract T2 serialize(T1 input, Class<?> type);
    public abstract  T1 deserialize(T2 input);
    public abstract T1 deserialize(T2 input, Class<?> type);
    public abstract <T3> T3 deserialize1(T2 input, Class<?> type, T3 out);
}
