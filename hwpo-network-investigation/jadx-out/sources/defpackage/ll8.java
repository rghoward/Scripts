package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ll8 {
    public static final ml8 a;
    public static final wn5[] b;

    static {
        ml8 ml8Var = null;
        try {
            ml8Var = (ml8) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ml8Var == null) {
            ml8Var = new ml8();
        }
        a = ml8Var;
        b = new wn5[0];
    }

    public static sd1 a(Class cls) {
        a.getClass();
        return new sd1(cls);
    }
}
