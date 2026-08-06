package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.LongSparseArray;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import io.ably.lib.rest.Auth;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cn implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ cn(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.t) {
            case 0:
                bn.b.a((bn) this.u, (LongSparseArray) this.v);
                return;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.u;
                t9a t9aVar = (t9a) this.v;
                firebaseMessaging.getClass();
                try {
                    nn4 nn4Var = firebaseMessaging.d;
                    nn4Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    caa.a(nn4Var.a(nn4Var.c(tu6.b(nn4Var.a), Auth.WILDCARD_CLIENTID, bundle)));
                    a aVarE = FirebaseMessaging.e(firebaseMessaging.c);
                    String strF = firebaseMessaging.f();
                    String strB = tu6.b(firebaseMessaging.a);
                    synchronized (aVarE) {
                        String strA = a.a(strF, strB);
                        SharedPreferences.Editor editorEdit = aVarE.a.edit();
                        editorEdit.remove(strA);
                        editorEdit.commit();
                    }
                    t9aVar.b(null);
                    return;
                } catch (Exception e) {
                    t9aVar.a(e);
                    return;
                }
        }
    }
}
