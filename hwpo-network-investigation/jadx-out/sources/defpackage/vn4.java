package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Collection;
import java.util.Collections;
import zw.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vn4<O extends zw.c> {
    public final Context a;
    public final String b;
    public final p70 c;
    public final zw d;
    public final zw.c e;
    public final ux f;
    public final Looper g;
    public final int h;
    public final n3a i;
    public final zn4 j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static final a c = new a(new n3a(), Looper.getMainLooper());
        public final n3a a;
        public final Looper b;

        public a(n3a n3aVar, Looper looper) {
            this.a = n3aVar;
            this.b = looper;
        }
    }

    public vn4(Context context, zw<O> zwVar, O o, a aVar) {
        a78.h(context, "Null context is not permitted.");
        a78.h(zwVar, "Api must not be null.");
        a78.h(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        a78.h(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String attributionTag = (i < 30 || i < 30) ? null : context.getAttributionTag();
        this.b = attributionTag;
        this.c = i >= 31 ? new p70(context.getAttributionSource()) : null;
        this.d = zwVar;
        this.e = o;
        this.g = aVar.b;
        this.f = new ux(zwVar, o, attributionTag);
        zn4 zn4VarC = zn4.c(applicationContext);
        this.j = zn4VarC;
        this.h = zn4VarC.A.getAndIncrement();
        this.i = aVar.a;
        rwb rwbVar = zn4VarC.F;
        rwbVar.sendMessage(rwbVar.obtainMessage(7, this));
    }

    public final nf1.a a() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        nf1.a aVar = new nf1.a();
        zw.c cVar = this.e;
        boolean z = cVar instanceof zw.c.b;
        Account accountB = null;
        if (z && (googleSignInAccountA2 = ((zw.c.b) cVar).a()) != null) {
            String str = googleSignInAccountA2.v;
            if (str != null) {
                accountB = new Account(str, "com.google");
            }
        } else if (cVar instanceof zw.c.a) {
            accountB = ((zw.c.a) cVar).b();
        }
        aVar.a = accountB;
        Collection collectionJ = (!z || (googleSignInAccountA = ((zw.c.b) cVar).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.j();
        if (aVar.b == null) {
            aVar.b = new r30(0);
        }
        aVar.b.addAll(collectionJ);
        Context context = this.a;
        aVar.d = context.getClass().getName();
        aVar.c = context.getPackageName();
        return aVar;
    }

    public final q6d b(int i, mvb mvbVar) {
        t9a t9aVar = new t9a();
        zn4 zn4Var = this.j;
        zn4Var.getClass();
        evb evbVar = new evb(new zvb(i, mvbVar, t9aVar, this.i), zn4Var.B.get(), this);
        rwb rwbVar = zn4Var.F;
        rwbVar.sendMessage(rwbVar.obtainMessage(4, evbVar));
        return t9aVar.a;
    }
}
