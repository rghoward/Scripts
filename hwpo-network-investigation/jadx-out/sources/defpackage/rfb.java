package defpackage;

import android.os.Handler;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.d;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface rfb {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final Handler a;
        public final rfb b;

        public a(Handler handler, d.b bVar) {
            if (bVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.a = handler;
            this.b = bVar;
        }

        public final void a(final tfb tfbVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ifb
                    @Override // java.lang.Runnable
                    public final void run() {
                        rfb rfbVar = this.t.b;
                        String str = n6b.a;
                        rfbVar.b(tfbVar);
                    }
                });
            }
        }
    }

    default void a(b bVar) {
    }

    default void b(tfb tfbVar) {
    }

    default void c(ln2 ln2Var) {
    }

    default void d(String str) {
    }

    default void f(ln2 ln2Var) {
    }

    default void j(Exception exc) {
    }

    default void e(int i, long j) {
    }

    default void h(int i, long j) {
    }

    default void i(id4 id4Var, pn2 pn2Var) {
    }

    default void k(long j, Object obj) {
    }

    default void l(long j, long j2, String str) {
    }
}
