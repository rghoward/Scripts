package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wqb {
    public static final wqb b;
    public yn7 a;

    static {
        wqb wqbVar = new wqb();
        wqbVar.a = null;
        b = wqbVar;
    }

    public static yn7 a(Context context) {
        yn7 yn7Var;
        wqb wqbVar = b;
        synchronized (wqbVar) {
            try {
                if (wqbVar.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    wqbVar.a = new yn7(context);
                }
                yn7Var = wqbVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yn7Var;
    }
}
