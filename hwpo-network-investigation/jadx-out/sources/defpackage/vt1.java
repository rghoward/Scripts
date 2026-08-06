package defpackage;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vt1<T> extends qk0 {
    public final HashMap<T, b<T>> h = new HashMap<>();
    public Handler i;
    public yua j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements jq6, j83 {
        public final T t;
        public jq6.a u;
        public j83.a v;

        public a(T t) {
            this.u = new jq6.a(vt1.this.c.c, 0, null);
            this.v = new j83.a(vt1.this.d.c, 0, null);
            this.t = t;
        }

        @Override // defpackage.jq6
        public final void D(int i, bq6.b bVar, rb6 rb6Var, mp6 mp6Var, IOException iOException, boolean z) {
            if (b(i, bVar)) {
                jq6.a aVar = this.u;
                mp6 mp6VarG = g(mp6Var, bVar);
                aVar.getClass();
                aVar.a(new fq6(aVar, rb6Var, mp6VarG, iOException, z));
            }
        }

        public final boolean b(int i, bq6.b bVar) {
            bq6.b bVarU;
            T t = this.t;
            vt1 vt1Var = vt1.this;
            if (bVar != null) {
                bVarU = vt1Var.u(t, bVar);
                if (bVarU == null) {
                    return false;
                }
            } else {
                bVarU = null;
            }
            int iW = vt1Var.w(i, t);
            jq6.a aVar = this.u;
            if (aVar.a != iW || !Objects.equals(aVar.b, bVarU)) {
                this.u = new jq6.a(vt1Var.c.c, iW, bVarU);
            }
            j83.a aVar2 = this.v;
            if (aVar2.a == iW && Objects.equals(aVar2.b, bVarU)) {
                return true;
            }
            this.v = new j83.a(vt1Var.d.c, iW, bVarU);
            return true;
        }

        public final mp6 g(mp6 mp6Var, bq6.b bVar) {
            long j = mp6Var.f;
            vt1 vt1Var = vt1.this;
            T t = this.t;
            long jV = vt1Var.v(j, t);
            long j2 = mp6Var.g;
            long jV2 = vt1Var.v(j2, t);
            return (jV == j && jV2 == j2) ? mp6Var : new mp6(mp6Var.a, mp6Var.b, mp6Var.c, mp6Var.d, mp6Var.e, jV, jV2);
        }

        @Override // defpackage.jq6
        public final void g0(int i, bq6.b bVar, rb6 rb6Var, mp6 mp6Var, int i2) {
            if (b(i, bVar)) {
                jq6.a aVar = this.u;
                mp6 mp6VarG = g(mp6Var, bVar);
                aVar.getClass();
                aVar.a(new dq6(aVar, rb6Var, mp6VarG, i2));
            }
        }

        @Override // defpackage.jq6
        public final void p(int i, bq6.b bVar, mp6 mp6Var) {
            if (b(i, bVar)) {
                jq6.a aVar = this.u;
                mp6 mp6VarG = g(mp6Var, bVar);
                aVar.getClass();
                aVar.a(new cq6(aVar, mp6VarG));
            }
        }

        @Override // defpackage.jq6
        public final void q(int i, bq6.b bVar, mp6 mp6Var) {
            if (b(i, bVar)) {
                jq6.a aVar = this.u;
                mp6 mp6VarG = g(mp6Var, bVar);
                bq6.b bVar2 = aVar.b;
                bVar2.getClass();
                aVar.a(new hq6(aVar, bVar2, mp6VarG));
            }
        }

        @Override // defpackage.jq6
        public final void v(int i, bq6.b bVar, rb6 rb6Var, mp6 mp6Var) {
            if (b(i, bVar)) {
                jq6.a aVar = this.u;
                mp6 mp6VarG = g(mp6Var, bVar);
                aVar.getClass();
                aVar.a(new gq6(aVar, rb6Var, mp6VarG));
            }
        }

        @Override // defpackage.jq6
        public final void z(int i, bq6.b bVar, rb6 rb6Var, mp6 mp6Var) {
            if (b(i, bVar)) {
                jq6.a aVar = this.u;
                mp6 mp6VarG = g(mp6Var, bVar);
                aVar.getClass();
                aVar.a(new eq6(aVar, rb6Var, mp6VarG));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> {
        public final bq6 a;
        public final ut1 b;
        public final vt1<T>.a c;

        public b(bq6 bq6Var, ut1 ut1Var, a aVar) {
            this.a = bq6Var;
            this.b = ut1Var;
            this.c = aVar;
        }
    }

    @Override // defpackage.bq6
    public void j() {
        Iterator<b<T>> it = this.h.values().iterator();
        while (it.hasNext()) {
            it.next().a.j();
        }
    }

    @Override // defpackage.qk0
    public final void p() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.g(bVar.b);
        }
    }

    @Override // defpackage.qk0
    public final void q() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.o(bVar.b);
        }
    }

    @Override // defpackage.qk0
    public void t() {
        HashMap<T, b<T>> map = this.h;
        for (b<T> bVar : map.values()) {
            bq6 bq6Var = bVar.a;
            vt1<T>.a aVar = bVar.c;
            bq6Var.i(bVar.b);
            bq6Var.b(aVar);
            bq6Var.f(aVar);
        }
        map.clear();
    }

    public abstract bq6.b u(T t, bq6.b bVar);

    public abstract void x(Object obj, qk0 qk0Var, toa toaVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [bq6$c, ut1] */
    public final void y(final Integer num, bq6 bq6Var) {
        HashMap<T, b<T>> map = this.h;
        xl7.g(!map.containsKey(num));
        ?? r1 = new bq6.c() { // from class: ut1
            @Override // bq6.c
            public final void a(qk0 qk0Var, toa toaVar) {
                this.a.x(num, qk0Var, toaVar);
            }
        };
        a aVar = new a(num);
        map.put(num, new b<>(bq6Var, r1, aVar));
        Handler handler = this.i;
        handler.getClass();
        bq6Var.a(handler, aVar);
        Handler handler2 = this.i;
        handler2.getClass();
        bq6Var.d(handler2, aVar);
        yua yuaVar = this.j;
        x38 x38Var = this.g;
        x38Var.getClass();
        bq6Var.e(r1, yuaVar, x38Var);
        if (this.b.isEmpty()) {
            bq6Var.g(r1);
        }
    }

    public long v(long j, Object obj) {
        return j;
    }

    public int w(int i, Object obj) {
        return i;
    }
}
