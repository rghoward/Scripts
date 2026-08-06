package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface fq3 extends jsa {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final esa a;
        public final int[] b;

        public a(esa esaVar, int... iArr) {
            if (iArr.length == 0) {
                md6.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.a = esaVar;
            this.b = iArr;
        }
    }

    void i();

    boolean j(int i, long j);

    void k(long j, long j2, long j3, List<? extends xm6> list, ym6[] ym6VarArr);

    int l();

    default boolean m(long j, vc1 vc1Var, List<? extends xm6> list) {
        return false;
    }

    void o();

    int p(long j, List<? extends xm6> list);

    int q();

    id4 r();

    int s();

    boolean t(int i, long j);

    void u(float f);

    Object v();

    default void w() {
    }

    default void x() {
    }

    default void n(boolean z) {
    }
}
