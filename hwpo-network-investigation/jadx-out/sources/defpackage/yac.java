package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yac {
    public final sec a;
    public cgc b;
    public final zyb c;
    public final t9d d;

    public yac() {
        sec secVar = new sec();
        this.a = secVar;
        this.b = secVar.b.c();
        this.c = new zyb();
        this.d = new t9d();
        Callable callable = new Callable() { // from class: i9c
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new o5d(this.a.d);
            }
        };
        nmc nmcVar = secVar.d;
        nmcVar.a.put("internal.registerCallback", callable);
        nmcVar.a.put("internal.eventLogger", new Callable() { // from class: wxb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new ooc(this.a.c);
            }
        });
    }

    public final boolean a(zxb zxbVar) throws dcc {
        zyb zybVar = this.c;
        try {
            zybVar.a = zxbVar;
            zybVar.b = zxbVar.clone();
            zybVar.c.clear();
            this.a.c.e("runtime.counter", new d5c(Double.valueOf(0.0d)));
            this.d.a(this.b.c(), zybVar);
            return (zybVar.b.equals(zybVar.a) && zybVar.c.isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new dcc(th);
        }
    }

    public final void b(umc umcVar) {
        g6c g6cVar;
        try {
            sec secVar = this.a;
            this.b = secVar.b.c();
            if (secVar.a(this.b, (bnc[]) umcVar.x().toArray(new bnc[0])) instanceof d4c) {
                throw new IllegalStateException("Program loading failed");
            }
            for (imc imcVar : umcVar.y().x()) {
                List listY = imcVar.y();
                String strX = imcVar.x();
                Iterator it = listY.iterator();
                while (it.hasNext()) {
                    a8c a8cVarA = secVar.a(this.b, (bnc) it.next());
                    if (!(a8cVarA instanceof u7c)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    cgc cgcVar = this.b;
                    if (cgcVar.d(strX)) {
                        a8c a8cVarG = cgcVar.g(strX);
                        if (!(a8cVarG instanceof g6c)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strX)));
                        }
                        g6cVar = (g6c) a8cVarG;
                    } else {
                        g6cVar = null;
                    }
                    if (g6cVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strX)));
                    }
                    g6cVar.a(this.b, Collections.singletonList(a8cVarA));
                }
            }
        } catch (Throwable th) {
            throw new dcc(th);
        }
    }
}
