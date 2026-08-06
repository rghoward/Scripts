package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b5d implements w40 {
    public List a;
    public final /* synthetic */ g4d b;

    public /* synthetic */ b5d(g4d g4dVar) {
        this.b = g4dVar;
    }

    @Override // defpackage.w40
    public final ListenableFuture call() {
        g4d g4dVar = this.b;
        String strValueOf = String.valueOf(g4dVar.a);
        p50 p50Var = g4dVar.h;
        String strConcat = "Initialize ".concat(strValueOf);
        p50Var.getClass();
        z6d z6dVarD = p50.d(strConcat);
        try {
            synchronized (g4dVar.g) {
                try {
                    if (this.a == null) {
                        this.a = g4dVar.i;
                        g4dVar.i = Collections.EMPTY_LIST;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            i5d i5dVar = new i5d(this.b);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((x40) it.next()).apply(i5dVar));
                } catch (Exception e) {
                    arrayList.add(ti4.j1(e));
                }
            }
            k95 k95VarP = k95.p(arrayList);
            Callable callable = new Callable() { // from class: a5d
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    b5d b5dVar = this.a;
                    synchronized (b5dVar.b.g) {
                        b5dVar.a = null;
                    }
                    return null;
                }
            };
            ij1 ij1Var = new ij1(k95VarP, true);
            ij1Var.H = new ij1.b(callable);
            ij1Var.s();
            z6dVarD.h(ij1Var);
            z6dVarD.close();
            return ij1Var;
        } catch (Throwable th2) {
            try {
                z6dVarD.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
