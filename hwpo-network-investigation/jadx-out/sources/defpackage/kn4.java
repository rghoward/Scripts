package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kn4<T extends IInterface> extends ik0<T> implements zw.e {
    public final Set S;
    public final Account T;

    /* JADX WARN: Illegal instructions before constructor call */
    public kn4(Context context, Looper looper, int i, nf1 nf1Var, yn4.a aVar, yn4.b bVar) {
        j0d j0dVarK0 = ln4.K0(context);
        wn4 wn4Var = wn4.e;
        a78.g(aVar);
        a78.g(bVar);
        super(context, looper, j0dVarK0, wn4Var, i, new lwb(aVar), new mwb(bVar), nf1Var.f);
        this.T = nf1Var.a;
        Set set = nf1Var.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                aa0.c("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.S = set;
    }

    @Override // zw.e
    public final Set<Scope> b() {
        return o() ? this.S : Collections.EMPTY_SET;
    }

    @Override // defpackage.ik0
    public final Account s() {
        return this.T;
    }

    @Override // defpackage.ik0
    public final Executor u() {
        return null;
    }

    @Override // defpackage.ik0
    public final Set<Scope> w() {
        return this.S;
    }
}
