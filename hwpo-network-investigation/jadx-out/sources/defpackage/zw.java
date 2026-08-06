package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import zw.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zw<O extends c> {
    public final a a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a<T extends e, O> extends d<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, nf1 nf1Var, O o, yn4.a aVar, yn4.b bVar) {
            return (T) b(context, looper, nf1Var, o, (rub) aVar, (rub) bVar);
        }

        public e b(Context context, Looper looper, nf1 nf1Var, Object obj, rub rubVar, rub rubVar2) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b<C> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        public static final C0298c a = new C0298c();

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public interface a extends c {
            Account b();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public interface b extends c {
            GoogleSignInAccount a();
        }

        /* JADX INFO: renamed from: zw$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0298c implements c {
            public C0298c() {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class d<T, O> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface e {
        Set<Scope> b();

        void c(String str);

        boolean d();

        String e();

        void f(qub qubVar);

        void g(ik0.c cVar);

        void h();

        boolean i();

        boolean j();

        int l();

        fu3[] m();

        String n();

        boolean o();

        void p(p55 p55Var, Set<Scope> set);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f<C extends e> extends b<C> {
    }

    public <C extends e> zw(String str, a<C, O> aVar, f<C> fVar) {
        this.b = str;
        this.a = aVar;
    }
}
