package defpackage;

import io.ably.lib.transport.Defaults;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.benchmarks.presentation.benchmarks.BenchmarksViewModel$saveBenchmarks$1", f = "BenchmarksViewModel.kt", l = {79, Defaults.PORT, 82, 87}, m = "invokeSuspend", v = 2)
public final class jp0 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ fp0 u;
    public final /* synthetic */ HashMap v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.benchmarks.presentation.benchmarks.BenchmarksViewModel$saveBenchmarks$1$1", f = "BenchmarksViewModel.kt", l = {81}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<List<? extends ao0>, r02<? super xd3<? extends Exception, ? extends hd8>>, Object> {
        public int t;
        public final /* synthetic */ fp0 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fp0 fp0Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = fp0Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(List<? extends ao0> list, r02<? super xd3<? extends Exception, ? extends hd8>> r02Var) {
            return ((a) create(list, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            fp0 fp0Var = this.u;
            hl4 hl4Var = fp0Var.C;
            hl4.a aVar = new hl4.a(fp0Var.x, fp0Var.y);
            this.t = 1;
            hl4Var.getClass();
            Object objB = g5b.b(hl4Var, aVar, this);
            v72 v72Var = v72.t;
            return objB == v72Var ? v72Var : objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.benchmarks.presentation.benchmarks.BenchmarksViewModel$saveBenchmarks$1$2", f = "BenchmarksViewModel.kt", l = {83}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<hd8, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ fp0 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fp0 fp0Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.v = fp0Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(this.v, r02Var);
            bVar.u = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(hd8 hd8Var, r02<? super g2b> r02Var) {
            return ((b) create(hd8Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            hd8 hd8Var = (hd8) this.u;
            int i = this.t;
            fp0 fp0Var = this.v;
            if (i == 0) {
                dv8.b(obj);
                pf9 pf9Var = fp0Var.D;
                this.u = null;
                this.t = 1;
                Object objEmit = pf9Var.a.emit(hd8Var, this);
                v72 v72Var = v72.t;
                if (objEmit != v72Var) {
                    objEmit = g2b.a;
                }
                if (objEmit == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            int i2 = fp0.K;
            fp0Var.e(fp0.a.b.a);
            fp0Var.A.b();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.benchmarks.presentation.benchmarks.BenchmarksViewModel$saveBenchmarks$1$3", f = "BenchmarksViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ fp0 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fp0 fp0Var, r02<? super c> r02Var) {
            super(2, r02Var);
            this.u = fp0Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            c cVar = new c(this.u, r02Var);
            cVar.t = obj;
            return cVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
            return ((c) create(exc, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Exception exc = (Exception) this.t;
            dv8.b(obj);
            int i = fp0.K;
            fp0 fp0Var = this.u;
            fp0Var.e(fp0.a.b.a);
            fp0Var.f(new gp0(fp0Var.F.a(exc)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0(fp0 fp0Var, HashMap map, r02 r02Var) {
        super(2, r02Var);
        this.u = fp0Var;
        this.v = map;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new jp0(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((jp0) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0135 A[PHI: r1 r3
      0x0135: PHI (r1v11 java.lang.Object) = (r1v10 java.lang.Object), (r1v15 java.lang.Object) binds: [B:47:0x0132, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r3v6 r02) = (r3v5 r02), (r3v8 r02) binds: [B:47:0x0132, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0143, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r1, r2, r17) == r8) goto L51;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
