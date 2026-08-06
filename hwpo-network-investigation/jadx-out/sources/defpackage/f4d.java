package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f4d implements x40 {
    public final k95 a;
    public final Executor b;

    public f4d(k95 k95Var, Executor executor) {
        this.a = k95Var;
        this.b = executor;
    }

    @Override // defpackage.x40
    public final ListenableFuture apply(Object obj) {
        z3d z3dVar = (z3d) obj;
        k95 k95Var = this.a;
        final int size = k95Var.size();
        final ArrayList arrayList = new ArrayList(size);
        int size2 = k95Var.size();
        int i = 0;
        while (i < size2) {
            E e = k95Var.get(i);
            i++;
            arrayList.add(((a4d) e).a());
        }
        x40 x40Var = new x40() { // from class: e4d
            @Override // defpackage.x40
            public final ListenableFuture apply(Object obj2) {
                final g3c g3cVar = (g3c) obj2;
                final ArrayList arrayList2 = arrayList;
                k95 k95VarP = k95.p(arrayList2);
                final f4d f4dVar = this;
                final int i2 = size;
                l7d l7dVarA = v7d.a(new w40() { // from class: c4d
                    @Override // defpackage.w40
                    public final ListenableFuture call() {
                        ListenableFuture listenableFutureK1 = ti4.k1(g3cVar);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if (((Boolean) ti4.i1((Future) arrayList2.get(i3))).booleanValue()) {
                                final a4d a4dVar = (a4d) f4dVar.a.get(i3);
                                x40 x40Var2 = new x40() { // from class: d4d
                                    @Override // defpackage.x40
                                    public final /* synthetic */ ListenableFuture apply(Object obj3) {
                                        return a4dVar.c();
                                    }
                                };
                                int i4 = v7d.a;
                                listenableFutureK1 = ti4.n1(listenableFutureK1, new m7d(m6d.a(), x40Var2), y03.t);
                            }
                        }
                        return listenableFutureK1;
                    }
                });
                Executor executor = f4dVar.b;
                ij1 ij1Var = new ij1(k95VarP, false);
                ij1Var.H = new ij1.a(ij1Var, l7dVarA, executor);
                ij1Var.s();
                return ij1Var;
            }
        };
        int i2 = v7d.a;
        return ti4.n1(z3dVar.a(new m7d(m6d.a(), x40Var)), new m7d(m6d.a(), new x40() { // from class: b4d
            @Override // defpackage.x40
            public final ListenableFuture apply(Object obj2) {
                int i3 = size;
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    if (((Boolean) ti4.i1((Future) arrayList.get(i4))).booleanValue()) {
                        arrayList2.add(((a4d) this.a.get(i4)).b());
                    }
                }
                k95 k95VarP = k95.p(arrayList2);
                t21 t21Var = new t21();
                ij1 ij1Var = new ij1(k95VarP, true);
                ij1Var.H = new ij1.b(ij1Var, t21Var);
                ij1Var.s();
                return ij1Var;
            }
        }), y03.t);
    }
}
