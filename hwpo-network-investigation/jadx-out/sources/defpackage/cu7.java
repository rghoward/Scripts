package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface cu7 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final /* synthetic */ a[] t = {new a("CounterClockwise", 0), new a("Clockwise", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) t.clone();
        }
    }

    default void a(float f, float f2, float f3, float f4) {
        e(f, f2, f3, f4);
    }

    void b(float f, float f2);

    void c(float f, float f2, float f3, float f4, float f5, float f6);

    void close();

    @gy2
    void d(float f, float f2, float f3, float f4);

    @gy2
    void e(float f, float f2, float f3, float f4);

    void f(int i);

    default void g(float f, float f2, float f3, float f4) {
        d(f, f2, f3, f4);
    }

    sk8 getBounds();

    int h();

    void i(float f, float f2);

    void j(float f, float f2, float f3, float f4, float f5, float f6);

    default void k() {
        reset();
    }

    void m(float f, float f2);

    void n(float f, float f2);

    void reset();
}
