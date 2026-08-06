package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface k83 {
    public static final a a = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        public static final l83 a = new l83();

        void a();
    }

    i83 e(j83.a aVar, id4 id4Var);

    void f(Looper looper, x38 x38Var);

    int g(id4 id4Var);

    default void a() {
    }

    default void d() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements k83 {
        @Override // defpackage.k83
        public final i83 e(j83.a aVar, id4 id4Var) {
            if (id4Var.s == null) {
                return null;
            }
            return new em3(new i83.a(new o3b(), 6001));
        }

        @Override // defpackage.k83
        public final int g(id4 id4Var) {
            return id4Var.s != null ? 1 : 0;
        }

        @Override // defpackage.k83
        public final void f(Looper looper, x38 x38Var) {
        }
    }
}
