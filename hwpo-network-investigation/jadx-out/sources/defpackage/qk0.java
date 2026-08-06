package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qk0 implements bq6 {
    public final ArrayList<bq6.c> a = new ArrayList<>(1);
    public final HashSet<bq6.c> b = new HashSet<>(1);
    public final jq6.a c = new jq6.a();
    public final j83.a d = new j83.a();
    public Looper e;
    public toa f;
    public x38 g;

    @Override // defpackage.bq6
    public final void a(Handler handler, jq6 jq6Var) {
        handler.getClass();
        jq6.a aVar = this.c;
        aVar.getClass();
        CopyOnWriteArrayList<jq6.a.C0186a> copyOnWriteArrayList = aVar.c;
        jq6.a.C0186a c0186a = new jq6.a.C0186a();
        c0186a.a = handler;
        c0186a.b = jq6Var;
        copyOnWriteArrayList.add(c0186a);
    }

    @Override // defpackage.bq6
    public final void b(jq6 jq6Var) {
        CopyOnWriteArrayList<jq6.a.C0186a> copyOnWriteArrayList = this.c.c;
        for (jq6.a.C0186a c0186a : copyOnWriteArrayList) {
            if (c0186a.b == jq6Var) {
                copyOnWriteArrayList.remove(c0186a);
            }
        }
    }

    @Override // defpackage.bq6
    public final void d(Handler handler, j83 j83Var) {
        handler.getClass();
        j83.a aVar = this.d;
        aVar.getClass();
        CopyOnWriteArrayList<j83.a.C0185a> copyOnWriteArrayList = aVar.c;
        j83.a.C0185a c0185a = new j83.a.C0185a();
        c0185a.a = j83Var;
        copyOnWriteArrayList.add(c0185a);
    }

    @Override // defpackage.bq6
    public final void e(bq6.c cVar, yua yuaVar, x38 x38Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        xl7.g(looper == null || looper == looperMyLooper);
        this.g = x38Var;
        toa toaVar = this.f;
        this.a.add(cVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(cVar);
            r(yuaVar);
        } else if (toaVar != null) {
            o(cVar);
            cVar.a(this, toaVar);
        }
    }

    @Override // defpackage.bq6
    public final void f(j83 j83Var) {
        CopyOnWriteArrayList<j83.a.C0185a> copyOnWriteArrayList = this.d.c;
        for (j83.a.C0185a c0185a : copyOnWriteArrayList) {
            if (c0185a.a == j83Var) {
                copyOnWriteArrayList.remove(c0185a);
            }
        }
    }

    @Override // defpackage.bq6
    public final void g(bq6.c cVar) {
        HashSet<bq6.c> hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(cVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        p();
    }

    @Override // defpackage.bq6
    public final void i(bq6.c cVar) {
        ArrayList<bq6.c> arrayList = this.a;
        arrayList.remove(cVar);
        if (!arrayList.isEmpty()) {
            g(cVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        t();
    }

    @Override // defpackage.bq6
    public final void o(bq6.c cVar) {
        this.e.getClass();
        HashSet<bq6.c> hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(cVar);
        if (zIsEmpty) {
            q();
        }
    }

    public abstract void r(yua yuaVar);

    public final void s(toa toaVar) {
        this.f = toaVar;
        ArrayList<bq6.c> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            bq6.c cVar = arrayList.get(i);
            i++;
            cVar.a(this, toaVar);
        }
    }

    public abstract void t();

    public void p() {
    }

    public void q() {
    }
}
