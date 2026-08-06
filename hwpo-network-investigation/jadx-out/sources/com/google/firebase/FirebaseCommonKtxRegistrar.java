package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ay2;
import defpackage.ci0;
import defpackage.fg8;
import defpackage.hr0;
import defpackage.n72;
import defpackage.o1b;
import defpackage.pn3;
import defpackage.qp1;
import defpackage.qq1;
import defpackage.ws0;
import defpackage.x76;
import defpackage.xu8;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements qq1 {
        public static final a<T> t = new a<>();

        @Override // defpackage.qq1
        public final Object a(xu8 xu8Var) {
            Object objG = xu8Var.g(new fg8<>(ci0.class, Executor.class));
            objG.getClass();
            return new pn3((Executor) objG);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> implements qq1 {
        public static final b<T> t = new b<>();

        @Override // defpackage.qq1
        public final Object a(xu8 xu8Var) {
            Object objG = xu8Var.g(new fg8<>(x76.class, Executor.class));
            objG.getClass();
            return new pn3((Executor) objG);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<T> implements qq1 {
        public static final c<T> t = new c<>();

        @Override // defpackage.qq1
        public final Object a(xu8 xu8Var) {
            Object objG = xu8Var.g(new fg8<>(hr0.class, Executor.class));
            objG.getClass();
            return new pn3((Executor) objG);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d<T> implements qq1 {
        public static final d<T> t = new d<>();

        @Override // defpackage.qq1
        public final Object a(xu8 xu8Var) {
            Object objG = xu8Var.g(new fg8<>(o1b.class, Executor.class));
            objG.getClass();
            return new pn3((Executor) objG);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qp1<?>> getComponents() {
        qp1.a aVarA = qp1.a(new fg8(ci0.class, n72.class));
        aVarA.a(new ay2((fg8<?>) new fg8(ci0.class, Executor.class), 1, 0));
        aVarA.f = a.t;
        qp1 qp1VarB = aVarA.b();
        qp1.a aVarA2 = qp1.a(new fg8(x76.class, n72.class));
        aVarA2.a(new ay2((fg8<?>) new fg8(x76.class, Executor.class), 1, 0));
        aVarA2.f = b.t;
        qp1 qp1VarB2 = aVarA2.b();
        qp1.a aVarA3 = qp1.a(new fg8(hr0.class, n72.class));
        aVarA3.a(new ay2((fg8<?>) new fg8(hr0.class, Executor.class), 1, 0));
        aVarA3.f = c.t;
        qp1 qp1VarB3 = aVarA3.b();
        qp1.a aVarA4 = qp1.a(new fg8(o1b.class, n72.class));
        aVarA4.a(new ay2((fg8<?>) new fg8(o1b.class, Executor.class), 1, 0));
        aVarA4.f = d.t;
        return ws0.i(qp1VarB, qp1VarB2, qp1VarB3, aVarA4.b());
    }
}
