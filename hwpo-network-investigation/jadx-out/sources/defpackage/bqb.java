package defpackage;

import j$.time.LocalDate;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.workouts.presentation.workouts.WorkoutsViewModel$loadNewWeek$1", f = "WorkoutsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bqb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public final /* synthetic */ wpb t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ LocalDate v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.workouts.presentation.workouts.WorkoutsViewModel$loadNewWeek$1$1", f = "WorkoutsViewModel.kt", l = {169, 170, 171}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public long t;
        public long u;
        public int v;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ wpb x;
        public final /* synthetic */ LocalDate y;

        /* JADX INFO: renamed from: bqb$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final /* synthetic */ class C0033a extends wa implements ci4<k49, r02<? super g2b>, Object> {
            @Override // defpackage.ci4
            public final Object invoke(k49 k49Var, r02<? super g2b> r02Var) {
                Object next;
                Object next2;
                k49 k49Var2 = k49Var;
                wpb wpbVar = (wpb) this.receiver;
                eo4 eo4Var = wpbVar.K;
                if (eo4Var != null) {
                    int i = eo4Var.a;
                    Iterator<T> it = k49Var2.a.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((sc8) next).a != i);
                    sc8 sc8Var = (sc8) next;
                    if (sc8Var != null) {
                        Iterator<T> it2 = sc8Var.f.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                            hd8 hd8Var = (hd8) next2;
                            int iOrdinal = eo4Var.c.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1) {
                                    u.b();
                                    return null;
                                }
                                if (hd8Var.c == o89.y) {
                                    break;
                                }
                            } else if (hd8Var.c == o89.x) {
                                break;
                            }
                        }
                        hd8 hd8Var2 = (hd8) next2;
                        if (hd8Var2 != null) {
                            fp1.a aVar = new fp1.a(i, hd8Var2.a);
                            wpbVar.K = null;
                            oy0.d(rhb.b(wpbVar), null, null, new xpb(wpbVar, aVar, k49Var2, eo4Var, sc8Var, null), 3);
                        }
                    }
                }
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final /* synthetic */ class b extends wa implements ci4<Exception, r02<? super g2b>, Object> {
            @Override // defpackage.ci4
            public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
                Exception exc2 = exc;
                wpb wpbVar = (wpb) this.receiver;
                wpb.a aVar = wpb.Companion;
                wpbVar.getClass();
                if (!(exc2 instanceof b41)) {
                    rma.a.b(exc2);
                    wpbVar.f(new dpb(wpbVar.D.a(exc2)));
                }
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r02 r02Var, wpb wpbVar, LocalDate localDate, boolean z) {
            super(2, r02Var);
            this.w = z;
            this.x = wpbVar;
            this.y = localDate;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(r02Var, this.x, this.y, this.w);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d4, code lost:
        
            if (r0 == r11) goto L25;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bqb.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqb(r02 r02Var, wpb wpbVar, LocalDate localDate, boolean z) {
        super(2, r02Var);
        this.t = wpbVar;
        this.u = z;
        this.v = localDate;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        boolean z = this.u;
        return new bqb(r02Var, this.t, this.v, z);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((bqb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dz9 dz9Var;
        dv8.b(obj);
        wpb wpbVar = this.t;
        dz9 dz9Var2 = wpbVar.L;
        if (dz9Var2 != null && dz9Var2.h() && (dz9Var = wpbVar.L) != null) {
            dz9Var.A(new b41());
        }
        wpbVar.L = oy0.d(rhb.b(wpbVar), null, null, new a(null, wpbVar, this.v, this.u), 3);
        return g2b.a;
    }
}
