package defpackage;

import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface s28 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final y34 a;

        /* JADX INFO: renamed from: s28$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0238a {
            public final y34.a a = new y34.a();

            public final void a(int i, boolean z) {
                y34.a aVar = this.a;
                if (z) {
                    aVar.a(i);
                } else {
                    aVar.getClass();
                }
            }
        }

        static {
            new SparseBooleanArray();
            xl7.r(!false);
            n6b.H(0);
        }

        public a(y34 y34Var) {
            this.a = y34Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final y34 a;

        public b(y34 y34Var) {
            this.a = y34Var;
        }

        public final boolean a(int... iArr) {
            for (int i : iArr) {
                if (this.a.a.get(i)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final Object a;
        public final int b;
        public final co6 c;
        public final Object d;
        public final int e;
        public final long f;
        public final long g;
        public final int h;
        public final int i;

        static {
            ra.b(0, 1, 2, 3, 4);
            n6b.H(5);
            n6b.H(6);
        }

        public d(Object obj, int i, co6 co6Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
            xl7.g(i >= 0);
            xl7.g(i2 >= 0);
            this.a = obj;
            this.b = i;
            this.c = co6Var;
            this.d = obj2;
            this.e = i2;
            this.f = j;
            this.g = j2;
            this.h = i3;
            this.i = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.b == dVar.b && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.i == dVar.i && Objects.equals(this.c, dVar.c) && Objects.equals(this.a, dVar.a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
        }

        public final String toString() {
            String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
            int i = this.h;
            if (i == -1) {
                return str;
            }
            StringBuilder sbB = tn2.b(str, ", contentPos=");
            sbB.append(this.g);
            sbB.append(", adGroup=");
            sbB.append(i);
            sbB.append(", ad=");
            sbB.append(this.i);
            return sbB.toString();
        }
    }

    int A();

    vua B();

    boolean C();

    kc2 D();

    int F();

    int G();

    boolean H(int i);

    void I(int i);

    void J(c cVar);

    void K(SurfaceView surfaceView);

    int L();

    int M();

    toa N();

    Looper O();

    boolean P();

    lsa Q();

    long R();

    void S();

    void T();

    void U(TextureView textureView);

    void V();

    np6 W();

    long X();

    long Y();

    void b();

    void c(k28 k28Var);

    void d();

    k28 e();

    lo3 f();

    boolean g();

    void h();

    long i();

    void j(int i, long j);

    boolean k();

    co6 l();

    void m(boolean z);

    void n(c cVar);

    long o();

    int p();

    void q(TextureView textureView);

    tfb r();

    void s();

    int t();

    void u(SurfaceView surfaceView);

    void v(lsa lsaVar);

    void w(long j);

    void x();

    long y();

    long z();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        default void Q() {
        }

        default void C(boolean z) {
        }

        default void F(kc2 kc2Var) {
        }

        default void J(vua vuaVar) {
        }

        default void K(h28 h28Var) {
        }

        default void L(int i) {
        }

        default void O(np6 np6Var) {
        }

        default void P(int i) {
        }

        default void R(boolean z) {
        }

        @Deprecated
        default void T(List<ec2> list) {
        }

        default void X(k28 k28Var) {
        }

        default void Y(a aVar) {
        }

        default void Z(su6 su6Var) {
        }

        default void b(tfb tfbVar) {
        }

        default void g(h28 h28Var) {
        }

        default void h0(boolean z) {
        }

        default void m(int i) {
        }

        default void n(b bVar) {
        }

        default void r(lsa lsaVar) {
        }

        default void t(boolean z) {
        }

        default void w(int i) {
        }

        default void x(int i) {
        }

        @Deprecated
        default void U(int i, boolean z) {
        }

        default void b0(co6 co6Var, int i) {
        }

        default void d0(int i, int i2) {
        }

        default void u(int i, boolean z) {
        }

        default void o(d dVar, d dVar2, int i) {
        }
    }
}
