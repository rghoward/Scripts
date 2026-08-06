package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.i;
import defpackage.bo9;
import defpackage.bq6;
import defpackage.j83;
import defpackage.jq6;
import defpackage.kq6;
import defpackage.kt4;
import defpackage.lq6;
import defpackage.mp6;
import defpackage.n48;
import defpackage.n6b;
import defpackage.rb6;
import defpackage.ri;
import defpackage.toa;
import defpackage.up6;
import defpackage.vi6;
import defpackage.w0;
import defpackage.wi6;
import defpackage.x38;
import defpackage.yua;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final x38 a;
    public final e e;
    public final ri h;
    public final kt4 i;
    public boolean k;
    public yua l;
    public bo9 j = new bo9.a();
    public final IdentityHashMap<up6, c> c = new IdentityHashMap<>();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap<c, b> f = new HashMap<>();
    public final HashSet g = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements jq6, j83 {
        public final c t;

        public a(c cVar) {
            this.t = cVar;
        }

        @Override // defpackage.jq6
        public final void D(int i, bq6.b bVar, final rb6 rb6Var, final mp6 mp6Var, final IOException iOException, final boolean z) {
            final Pair<Integer, bq6.b> pairB = b(i, bVar);
            if (pairB != null) {
                i.this.i.e(new Runnable() { // from class: rq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        ri riVar = i.this.h;
                        Pair pair = pairB;
                        riVar.D(((Integer) pair.first).intValue(), (bq6.b) pair.second, rb6Var, mp6Var, iOException, z);
                    }
                });
            }
        }

        public final Pair<Integer, bq6.b> b(int i, bq6.b bVar) {
            bq6.b bVarA;
            c cVar = this.t;
            bq6.b bVar2 = null;
            if (bVar != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= cVar.c.size()) {
                        bVarA = null;
                        break;
                    }
                    if (((bq6.b) cVar.c.get(i2)).d == bVar.d) {
                        Object obj = bVar.a;
                        Object obj2 = cVar.b;
                        int i3 = w0.d;
                        bVarA = bVar.a(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                }
                if (bVarA == null) {
                    return null;
                }
                bVar2 = bVarA;
            }
            return Pair.create(Integer.valueOf(i + cVar.d), bVar2);
        }

        @Override // defpackage.jq6
        public final void g0(int i, bq6.b bVar, final rb6 rb6Var, final mp6 mp6Var, final int i2) {
            final Pair<Integer, bq6.b> pairB = b(i, bVar);
            if (pairB != null) {
                i.this.i.e(new Runnable() { // from class: qq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        ri riVar = i.this.h;
                        Pair pair = pairB;
                        riVar.g0(((Integer) pair.first).intValue(), (bq6.b) pair.second, rb6Var, mp6Var, i2);
                    }
                });
            }
        }

        @Override // defpackage.jq6
        public final void p(int i, bq6.b bVar, final mp6 mp6Var) {
            final Pair<Integer, bq6.b> pairB = b(i, bVar);
            if (pairB != null) {
                i.this.i.e(new Runnable() { // from class: oq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        ri riVar = i.this.h;
                        Pair pair = pairB;
                        riVar.p(((Integer) pair.first).intValue(), (bq6.b) pair.second, mp6Var);
                    }
                });
            }
        }

        @Override // defpackage.jq6
        public final void q(int i, bq6.b bVar, final mp6 mp6Var) {
            final Pair<Integer, bq6.b> pairB = b(i, bVar);
            if (pairB != null) {
                i.this.i.e(new Runnable() { // from class: mq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        ri riVar = i.this.h;
                        Pair pair = pairB;
                        int iIntValue = ((Integer) pair.first).intValue();
                        bq6.b bVar2 = (bq6.b) pair.second;
                        bVar2.getClass();
                        riVar.q(iIntValue, bVar2, mp6Var);
                    }
                });
            }
        }

        @Override // defpackage.jq6
        public final void v(int i, bq6.b bVar, final rb6 rb6Var, final mp6 mp6Var) {
            final Pair<Integer, bq6.b> pairB = b(i, bVar);
            if (pairB != null) {
                i.this.i.e(new Runnable() { // from class: nq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        ri riVar = i.this.h;
                        Pair pair = pairB;
                        riVar.v(((Integer) pair.first).intValue(), (bq6.b) pair.second, rb6Var, mp6Var);
                    }
                });
            }
        }

        @Override // defpackage.jq6
        public final void z(int i, bq6.b bVar, final rb6 rb6Var, final mp6 mp6Var) {
            final Pair<Integer, bq6.b> pairB = b(i, bVar);
            if (pairB != null) {
                i.this.i.e(new Runnable() { // from class: pq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        ri riVar = i.this.h;
                        Pair pair = pairB;
                        riVar.z(((Integer) pair.first).intValue(), (bq6.b) pair.second, rb6Var, mp6Var);
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final bq6 a;
        public final lq6 b;
        public final a c;

        public b(bq6 bq6Var, lq6 lq6Var, a aVar) {
            this.a = bq6Var;
            this.b = lq6Var;
            this.c = aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements kq6 {
        public final wi6 a;
        public int d;
        public boolean e;
        public final ArrayList c = new ArrayList();
        public final Object b = new Object();

        public c(bq6 bq6Var, boolean z) {
            this.a = new wi6(bq6Var, z);
        }

        @Override // defpackage.kq6
        public final Object a() {
            return this.b;
        }

        @Override // defpackage.kq6
        public final toa b() {
            return this.a.o;
        }
    }

    public i(e eVar, ri riVar, kt4 kt4Var, x38 x38Var) {
        this.a = x38Var;
        this.e = eVar;
        this.h = riVar;
        this.i = kt4Var;
    }

    public final toa a(int i, ArrayList arrayList, bo9 bo9Var) {
        if (!arrayList.isEmpty()) {
            this.j = bo9Var;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                c cVar = (c) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.b;
                if (i2 > 0) {
                    c cVar2 = (c) arrayList2.get(i2 - 1);
                    cVar.d = cVar2.a.o.b.o() + cVar2.d;
                    cVar.e = false;
                    cVar.c.clear();
                } else {
                    cVar.d = 0;
                    cVar.e = false;
                    cVar.c.clear();
                }
                int iO = cVar.a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((c) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, cVar);
                this.d.put(cVar.b, cVar);
                if (this.k) {
                    e(cVar);
                    if (this.c.isEmpty()) {
                        this.g.add(cVar);
                    } else {
                        b bVar = this.f.get(cVar);
                        if (bVar != null) {
                            bVar.a.g(bVar.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final toa b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return toa.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            c cVar = (c) arrayList.get(i);
            cVar.d = iO;
            iO += cVar.a.o.b.o();
        }
        return new n48(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.c.isEmpty()) {
                b bVar = this.f.get(cVar);
                if (bVar != null) {
                    bVar.a.g(bVar.b);
                }
                it.remove();
            }
        }
    }

    public final void d(c cVar) {
        if (cVar.e && cVar.c.isEmpty()) {
            b bVarRemove = this.f.remove(cVar);
            bVarRemove.getClass();
            a aVar = bVarRemove.c;
            bq6 bq6Var = bVarRemove.a;
            bq6Var.i(bVarRemove.b);
            bq6Var.b(aVar);
            bq6Var.f(aVar);
            this.g.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [bq6$c, lq6] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(c cVar) {
        wi6 wi6Var = cVar.a;
        ?? r1 = new bq6.c() { // from class: lq6
            @Override // bq6.c
            public final void a(qk0 qk0Var, toa toaVar) {
                kt4 kt4Var = this.a.e.A;
                kt4Var.l(2);
                kt4Var.k(22);
            }
        };
        a aVar = new a(cVar);
        this.f.put(cVar, new b(wi6Var, r1, aVar));
        String str = n6b.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        wi6Var.a(new Handler(looperMyLooper, null), aVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        wi6Var.d(new Handler(looperMyLooper2, null), aVar);
        wi6Var.e(r1, this.l, this.a);
    }

    public final void f(up6 up6Var) {
        IdentityHashMap<up6, c> identityHashMap = this.c;
        c cVarRemove = identityHashMap.remove(up6Var);
        cVarRemove.getClass();
        cVarRemove.a.n(up6Var);
        cVarRemove.c.remove(((vi6) up6Var).t);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(cVarRemove);
    }

    public final void g(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.b;
            c cVar = (c) arrayList.remove(i3);
            this.d.remove(cVar.b);
            int i4 = -cVar.a.o.b.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((c) arrayList.get(i5)).d += i4;
            }
            cVar.e = true;
            if (this.k) {
                d(cVar);
            }
        }
    }
}
