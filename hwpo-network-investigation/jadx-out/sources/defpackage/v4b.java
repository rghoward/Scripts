package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v4b {
    public final Context a;
    public final ai0 b;
    public final an3 c;
    public final vob d;
    public final Executor e;
    public final n7a f;
    public final uf1 g;
    public final uf1 h;
    public final kf1 i;

    public v4b(Context context, ai0 ai0Var, an3 an3Var, vob vobVar, Executor executor, n7a n7aVar, uf1 uf1Var, uf1 uf1Var2, kf1 kf1Var) {
        this.a = context;
        this.b = ai0Var;
        this.c = an3Var;
        this.d = vobVar;
        this.e = executor;
        this.f = n7aVar;
        this.g = uf1Var;
        this.h = uf1Var2;
        this.i = kf1Var;
    }

    public final void a(final ef0 ef0Var, int i) {
        tc0 tc0VarA;
        dxa dxaVar = this.b.get(ef0Var.a);
        bi0.a aVar = bi0.a.t;
        new tc0(aVar, 0L);
        final long j = 0;
        while (true) {
            n7a.a aVar2 = new n7a.a() { // from class: o4b
                @Override // n7a.a
                public final Object execute() {
                    return Boolean.valueOf(this.t.c.D(ef0Var));
                }
            };
            n7a n7aVar = this.f;
            if (!((Boolean) n7aVar.m(aVar2)).booleanValue()) {
                final v4b v4bVar = this;
                final ef0 ef0Var2 = ef0Var;
                n7aVar.m(new n7a.a() { // from class: u4b
                    @Override // n7a.a
                    public final Object execute() {
                        v4b v4bVar2 = this.t;
                        v4bVar2.c.l(v4bVar2.g.getTime() + j, ef0Var2);
                        return null;
                    }
                });
                return;
            }
            final Iterable iterable = (Iterable) n7aVar.m(new n7a.a() { // from class: p4b
                @Override // n7a.a
                public final Object execute() {
                    return this.t.c.h0(ef0Var);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (dxaVar == null) {
                be6.a("Uploader", ef0Var, "Unknown backend for %s, deleting event batch for it...");
                tc0VarA = new tc0(bi0.a.v, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((gw7) it.next()).a());
                }
                if (ef0Var.b() != null) {
                    kf1 kf1Var = this.i;
                    Objects.requireNonNull(kf1Var);
                    mf1 mf1Var = (mf1) n7aVar.m(new b30(kf1Var));
                    be0.a aVar3 = new be0.a();
                    aVar3.f = new HashMap();
                    aVar3.d = Long.valueOf(this.g.getTime());
                    aVar3.e = Long.valueOf(this.h.getTime());
                    aVar3.a = "GDT_CLIENT_METRICS";
                    ag3 ag3Var = new ag3("proto");
                    mf1Var.getClass();
                    ef8 ef8Var = se8.a;
                    ef8Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ef8Var.a(mf1Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    aVar3.c = new vf3(ag3Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(dxaVar.b(aVar3.b()));
                }
                tc0VarA = dxaVar.a(new sc0(arrayList, ef0Var.b));
            }
            bi0.a aVar4 = tc0VarA.a;
            if (aVar4 == bi0.a.u) {
                final v4b v4bVar2 = this;
                final ef0 ef0Var3 = ef0Var;
                n7aVar.m(new n7a.a() { // from class: q4b
                    @Override // n7a.a
                    public final Object execute() {
                        v4b v4bVar3 = this.t;
                        an3 an3Var = v4bVar3.c;
                        an3Var.m0(iterable);
                        an3Var.l(v4bVar3.g.getTime() + j, ef0Var3);
                        return null;
                    }
                });
                v4bVar2.d.b(ef0Var3, i + 1, true);
                return;
            }
            final v4b v4bVar3 = this;
            ef0 ef0Var4 = ef0Var;
            n7aVar.m(new n7a.a() { // from class: r4b
                @Override // n7a.a
                public final Object execute() {
                    this.t.c.o(iterable);
                    return null;
                }
            });
            if (aVar4 == aVar) {
                long jMax = Math.max(j, tc0VarA.b);
                if (ef0Var4.b() != null) {
                    n7aVar.m(new n7a.a() { // from class: s4b
                        @Override // n7a.a
                        public final Object execute() {
                            this.t.i.h();
                            return null;
                        }
                    });
                }
                j = jMax;
            } else if (aVar4 == bi0.a.w) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strK = ((gw7) it2.next()).a().k();
                    if (map.containsKey(strK)) {
                        map.put(strK, Integer.valueOf(((Integer) map.get(strK)).intValue() + 1));
                    } else {
                        map.put(strK, 1);
                    }
                }
                n7aVar.m(new n7a.a() { // from class: t4b
                    @Override // n7a.a
                    public final Object execute() {
                        for (Map.Entry entry : map.entrySet()) {
                            this.t.i.p(((Integer) entry.getValue()).intValue(), pd6.a.INVALID_PAYLOD, (String) entry.getKey());
                        }
                        return null;
                    }
                });
            }
            this = v4bVar3;
            ef0Var = ef0Var4;
        }
    }
}
