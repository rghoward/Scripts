package defpackage;

import j$.time.LocalDate;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f21 {
    public final u11 a;
    public final oz8 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.core.data.storage.CalendarIndicatorsStorage$indicators$1", f = "CalendarIndicatorsStorage.kt", l = {39}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<s54<? super Map<LocalDate, ? extends m21>>, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;

        /* JADX INFO: renamed from: f21$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "com.hwpo_training_app.core.data.storage.CalendarIndicatorsStorage$indicators$1$1", f = "CalendarIndicatorsStorage.kt", l = {26, 38}, m = "invokeSuspend", v = 2)
        public static final class C0083a extends p6a implements ci4<Map<LocalDate, ? extends jd8>, r02<? super g2b>, Object> {
            public int t;
            public /* synthetic */ Object u;
            public final /* synthetic */ s54<Map<LocalDate, m21>> v;
            public final /* synthetic */ f21 w;

            /* JADX INFO: renamed from: f21$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class C0084a<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return eo7.f(Long.valueOf(yk2.x((LocalDate) t)), Long.valueOf(yk2.x((LocalDate) t2)));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0083a(s54<? super Map<LocalDate, m21>> s54Var, f21 f21Var, r02<? super C0083a> r02Var) {
                super(2, r02Var);
                this.v = s54Var;
                this.w = f21Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C0083a c0083a = new C0083a(this.v, this.w, r02Var);
                c0083a.u = obj;
                return c0083a;
            }

            @Override // defpackage.ci4
            public final Object invoke(Map<LocalDate, ? extends jd8> map, r02<? super g2b> r02Var) {
                return ((C0083a) create(map, r02Var)).invokeSuspend(g2b.a);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type r02 to f21$a$a for r25v2 'this'  r02
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.ak0
            public final java.lang.Object invokeSuspend(java.lang.Object r26) {
                /*
                    Method dump skipped, instruction units count: 725
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: f21.a.C0083a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = f21.this.new a(r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(s54<? super Map<LocalDate, ? extends m21>> s54Var, r02<? super g2b> r02Var) {
            return ((a) create(s54Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            s54 s54Var = (s54) this.u;
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return g2b.a;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            f21 f21Var = f21.this;
            li8 li8VarB = f21Var.a.b();
            C0083a c0083a = new C0083a(s54Var, f21Var, null);
            this.u = null;
            this.t = 1;
            li8VarB.collect(new k74.a(jc7.t, c0083a), this);
            return v72.t;
        }
    }

    public f21(u11 u11Var) {
        u11Var.getClass();
        this.a = u11Var;
        this.b = new oz8(new a(null));
    }
}
