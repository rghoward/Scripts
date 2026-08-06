package defpackage;

import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wpb extends dl0<fqb, vpb> implements as2 {
    public static final a Companion = new a();
    public static final DateTimeFormatter M;
    public final fp1 A;
    public final rl4 B;
    public final i7a C;
    public final cm3 D;
    public final bu8 E;
    public final yq6 F;
    public final yq6 G;
    public final yq6 H;
    public final yq6 I;
    public final bp1 J;
    public eo4 K;
    public dz9 L;
    public final spb x;
    public final q09 y;
    public final xk4 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.workouts.presentation.workouts.WorkoutsViewModel$onDateSelected$1", f = "WorkoutsViewModel.kt", l = {151}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ LocalDate v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LocalDate localDate, r02<? super b> r02Var) {
            super(2, r02Var);
            this.v = localDate;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return wpb.this.new b(this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            LocalDate localDate = this.v;
            wpb wpbVar = wpb.this;
            if (i == 0) {
                dv8.b(obj);
                a aVar = wpb.Companion;
                dz9 dz9VarD = oy0.d(rhb.b(wpbVar), null, null, new dqb(wpbVar, localDate, null), 3);
                this.t = 1;
                Object objP0 = dz9VarD.p0(this);
                v72 v72Var = v72.t;
                if (objP0 == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            qm2.Companion.getClass();
            vpb.c cVar = new vpb.c(qm2.a.a(localDate));
            a aVar2 = wpb.Companion;
            wpbVar.e(cVar);
            wpbVar.e(new vpb.a(localDate));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.workouts.presentation.workouts.WorkoutsViewModel$onStart$1", f = "WorkoutsViewModel.kt", l = {286}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public c(r02<? super c> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return wpb.this.new c(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            wpb wpbVar = wpb.this;
            if (i == 0) {
                dv8.b(obj);
                bp1 bp1Var = wpbVar.J;
                this.t = 1;
                Object objW = bp1Var.w(this);
                v72 v72Var = v72.t;
                if (objW == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            i7a i7aVar = wpbVar.C;
            LocalDate localDate = i7aVar.a;
            i7aVar.a = null;
            if (localDate != null) {
                wpbVar.g(localDate);
            }
            return g2b.a;
        }
    }

    static {
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("MMMM yyyy");
        dateTimeFormatterOfPattern.getClass();
        M = dateTimeFormatterOfPattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wpb(spb spbVar, q09 q09Var, xk4 xk4Var, f49 f49Var, ue7 ue7Var, fp1 fp1Var, rl4 rl4Var, i7a i7aVar, cm3 cm3Var, bu8 bu8Var) {
        spbVar.getClass();
        q09Var.getClass();
        xk4Var.getClass();
        f49Var.getClass();
        ue7Var.getClass();
        fp1Var.getClass();
        rl4Var.getClass();
        i7aVar.getClass();
        cm3Var.getClass();
        bu8Var.getClass();
        LocalDate localDateB = mp0.b(q09Var, i7aVar.a);
        qlb.a aVar = qlb.Companion;
        localDateB.getClass();
        aVar.getClass();
        List<LocalDate> list = qlb.a.a(localDateB).a;
        qm2.Companion.getClass();
        qm2 qm2VarA = qm2.a.a(localDateB);
        LocalDate localDate = list.get(0);
        LocalDate localDate2 = list.get(6);
        String str = localDateB.format(M);
        str.getClass();
        super(new fqb(localDateB, localDateB, qm2VarA, localDate, 0, localDate2, str, false, hf3.t));
        this.x = spbVar;
        this.y = q09Var;
        this.z = xk4Var;
        this.A = fp1Var;
        this.B = rl4Var;
        this.C = i7aVar;
        this.D = cm3Var;
        this.E = bu8Var;
        this.F = oh7.a(this.u, new bj3(2));
        this.G = oh7.a(this.u, new cj3(1));
        this.H = oh7.a(this.u, new dj3(2));
        this.I = oh7.a(this.u, new ej3(2));
        this.J = cp1.a();
        oy0.d(rhb.b(this), null, null, new ypb(this, null), 3);
        oy0.d(rhb.b(this), null, null, new bqb(null, this, b().b, true), 3);
        g2b g2bVar = g2b.a;
        yk2.o(new k74(yk2.i(ue7Var.b(g2bVar)), new zpb(this, null)), rhb.b(this));
        yk2.o(new k74(f49Var.b(g2bVar), new aqb(this, null)), rhb.b(this));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof vpb.f) {
            return fqb.a(b(), null, null, null, null, 0, null, null, true, null, 383);
        }
        if (bl0Var instanceof vpb.e) {
            return fqb.a(b(), null, null, null, null, 0, null, null, false, null, 383);
        }
        if (bl0Var instanceof vpb.c) {
            return fqb.a(b(), null, null, ((vpb.c) bl0Var).a, null, 0, null, null, false, null, 507);
        }
        if (bl0Var instanceof vpb.d) {
            vpb.d dVar = (vpb.d) bl0Var;
            return fqb.a(b(), null, null, null, null, dVar.a, null, null, false, dVar.b, 239);
        }
        boolean z = bl0Var instanceof vpb.a;
        DateTimeFormatter dateTimeFormatter = M;
        if (z) {
            fqb fqbVarB = b();
            LocalDate localDate = ((vpb.a) bl0Var).a;
            String str = localDate.format(dateTimeFormatter);
            str.getClass();
            qlb.Companion.getClass();
            return fqb.a(fqbVarB, localDate, localDate, null, qlb.a.a(localDate).a.get(0), 0, qlb.a.a(localDate).a.get(6), str, false, null, 404);
        }
        if (!(bl0Var instanceof vpb.b)) {
            return b();
        }
        fqb fqbVarB2 = b();
        LocalDate localDate2 = ((vpb.b) bl0Var).a;
        String str2 = localDate2.format(dateTimeFormatter);
        str2.getClass();
        qlb.Companion.getClass();
        return fqb.a(fqbVarB2, null, localDate2, null, qlb.a.a(localDate2).a.get(0), 0, qlb.a.a(localDate2).a.get(6), str2, false, null, 405);
    }

    public final void g(LocalDate localDate) {
        localDate.getClass();
        oy0.d(rhb.b(this), null, null, new b(localDate, null), 3);
    }

    @Override // defpackage.as2
    public final void onStart(m76 m76Var) {
        m76Var.getClass();
        oy0.d(rhb.b(this), null, null, new c(null), 3);
    }
}
