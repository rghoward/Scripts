package defpackage;

import android.os.Build;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lj2 {
    public static final ko7 a = eo7.c(0.0f, 0.0f, 12.0f, 12.0f, 3);
    public static final ko7 b = eo7.c(24.0f, 16.0f, 12.0f, 0.0f, 8);
    public static final ko7 c = eo7.c(24.0f, 0.0f, 12.0f, 12.0f, 2);
    public static final float d = 16.0f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$1", f = "DatePicker.kt", l = {1552}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ nz5 u;
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nz5 nz5Var, int i, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = nz5Var;
            this.v = i;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                nz5 nz5Var = this.u;
                if (!nz5Var.j.a()) {
                    int iH = nz5Var.h();
                    int i2 = this.v;
                    if (iH != i2) {
                        this.t = 1;
                        Object objK = nz5.k(nz5Var, i2, this);
                        v72 v72Var = v72.t;
                        if (objK == v72Var) {
                            return v72Var;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1", f = "DatePicker.kt", l = {1572}, m = "invokeSuspend")
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ nz5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(nz5 nz5Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = nz5Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new b(this.u, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            try {
                if (i == 0) {
                    dv8.b(obj);
                    nz5 nz5Var = this.u;
                    int iH = nz5Var.h() + 1;
                    this.t = 1;
                    Object objF = nz5Var.f(iH, 0, this);
                    v72 v72Var = v72.t;
                    if (objF == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", l = {1584}, m = "invokeSuspend")
    public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ nz5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(nz5 nz5Var, r02<? super c> r02Var) {
            super(2, r02Var);
            this.u = nz5Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new c(this.u, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            try {
                if (i == 0) {
                    dv8.b(obj);
                    nz5 nz5Var = this.u;
                    int iH = nz5Var.h() - 1;
                    this.t = 1;
                    Object objF = nz5Var.f(iH, 0, this);
                    v72 v72Var = v72.t;
                    if (objF == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
            } catch (IllegalArgumentException unused) {
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements ei4<jv, jt1, Integer, g2b> {
        public final /* synthetic */ i21 A;
        public final /* synthetic */ lh2 B;
        public final /* synthetic */ long t;
        public final /* synthetic */ h37<Boolean> u;
        public final /* synthetic */ t72 v;
        public final /* synthetic */ nz5 w;
        public final /* synthetic */ fg5 x;
        public final /* synthetic */ l21 y;
        public final /* synthetic */ s99 z;

        public d(long j, h37<Boolean> h37Var, t72 t72Var, nz5 nz5Var, fg5 fg5Var, l21 l21Var, s99 s99Var, i21 i21Var, lh2 lh2Var) {
            this.t = j;
            this.u = h37Var;
            this.v = t72Var;
            this.w = nz5Var;
            this.x = fg5Var;
            this.y = l21Var;
            this.z = s99Var;
            this.A = i21Var;
            this.B = lh2Var;
        }

        @Override // defpackage.ei4
        public final g2b invoke(jv jvVar, jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            num.intValue();
            String strB = ws3.b(jt1Var2, R.string.m3c_date_picker_year_picker_pane_title);
            boolean zJ = jt1Var2.J(strB);
            Object objF = jt1Var2.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new m5(1, strB);
                jt1Var2.C(objF);
            }
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarB = pb9.b(aVar, false, (oh4) objF);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var2, 0);
            int iD = jt1Var2.D();
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC = it1.c(jt1Var2, ox6VarB);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (jt1Var2.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var2.q();
            if (jt1Var2.l()) {
                jt1Var2.k(aVar2);
            } else {
                jt1Var2.z();
            }
            rd7.d(jt1Var2, bt1.a.f, aj1VarA);
            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
            bt1.a.b bVar = bt1.a.g;
            if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                rh.b(iD, jt1Var2, iD, bVar);
            }
            rd7.d(jt1Var2, bt1.a.d, ox6VarC);
            ko7 ko7Var = lj2.a;
            ox6 ox6VarK = eo7.k(ir9.f(aVar, 336.0f - q33.a), 12.0f, 0.0f, 2);
            final h37<Boolean> h37Var = this.u;
            boolean zJ2 = jt1Var2.J(h37Var);
            final t72 t72Var = this.v;
            boolean zJ3 = zJ2 | jt1Var2.j(t72Var);
            final nz5 nz5Var = this.w;
            boolean zJ4 = zJ3 | jt1Var2.J(nz5Var);
            final fg5 fg5Var = this.x;
            boolean zJ5 = zJ4 | jt1Var2.j(fg5Var);
            final l21 l21Var = this.y;
            boolean zJ6 = zJ5 | jt1Var2.J(l21Var);
            Object objF2 = jt1Var2.f();
            if (zJ6 || objF2 == c0187a) {
                oh4 oh4Var = new oh4() { // from class: mj2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        int iIntValue = ((Integer) obj).intValue();
                        ko7 ko7Var2 = lj2.a;
                        h37 h37Var2 = h37Var;
                        h37Var2.setValue(Boolean.valueOf(!((Boolean) h37Var2.getValue()).booleanValue()));
                        oy0.d(t72Var, null, null, new nj2(nz5Var, iIntValue, fg5Var, l21Var, null), 3);
                        return g2b.a;
                    }
                };
                jt1Var2.C(oh4Var);
                objF2 = oh4Var;
            }
            long j = this.t;
            s99 s99Var = this.z;
            i21 i21Var = this.A;
            lh2 lh2Var = this.B;
            lj2.n(ox6VarK, j, (oh4) objF2, s99Var, i21Var, fg5Var, lh2Var, jt1Var2, 6);
            v33.a(null, 0.0f, lh2Var.x, jt1Var2, 0, 3);
            jt1Var2.I();
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ int t;
        public final /* synthetic */ oh4<n23, g2b> u;
        public final /* synthetic */ ox6 v;

        /* JADX WARN: Multi-variable type inference failed */
        public e(int i, oh4<? super n23, g2b> oh4Var, ox6 ox6Var) {
            this.t = i;
            this.u = oh4Var;
            this.v = ox6Var;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                int i = this.t;
                jt1.a.C0187a c0187a = jt1.a.a;
                final oh4<n23, g2b> oh4Var = this.u;
                if (i == 0) {
                    jt1Var2.K(-101264927);
                    n85 n85VarB = o65.b;
                    if (n85VarB == null) {
                        n85.a aVar = new n85.a("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        int i2 = zcb.a;
                        aw9 aw9Var = new aw9(uh1.b);
                        fu7 fu7Var = new fu7();
                        fu7Var.f(3.0f, 17.25f);
                        ju7.s sVar = new ju7.s(21.0f);
                        ArrayList<ju7> arrayList = fu7Var.a;
                        arrayList.add(sVar);
                        fu7Var.c(3.75f);
                        fu7Var.d(17.81f, 9.94f);
                        fu7Var.e(-3.75f, -3.75f);
                        fu7Var.d(3.0f, 17.25f);
                        fu7Var.a();
                        fu7Var.f(20.71f, 7.04f);
                        fu7Var.b(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        fu7Var.e(-2.34f, -2.34f);
                        fu7Var.b(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        fu7Var.e(-1.83f, 1.83f);
                        fu7Var.e(3.75f, 3.75f);
                        fu7Var.e(1.83f, -1.83f);
                        fu7Var.a();
                        n85.a.a(aVar, arrayList, aw9Var);
                        n85VarB = aVar.b();
                        o65.b = n85VarB;
                    }
                    String strB = ws3.b(jt1Var2, R.string.m3c_date_picker_switch_to_input_mode);
                    boolean zJ = jt1Var2.J(oh4Var);
                    Object objF = jt1Var2.f();
                    if (zJ || objF == c0187a) {
                        objF = new qj2(oh4Var, 0);
                        jt1Var2.C(objF);
                    }
                    lj2.h((mh4) objF, n85VarB, strB, this.v, false, jt1Var2, 0, 16);
                    jt1Var2.B();
                } else {
                    jt1Var2.K(-100967048);
                    n85 n85VarB2 = o65.c;
                    if (n85VarB2 == null) {
                        n85.a aVar2 = new n85.a("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        int i3 = zcb.a;
                        aw9 aw9Var2 = new aw9(uh1.b);
                        fu7 fu7Var2 = new fu7();
                        fu7Var2.f(9.0f, 11.0f);
                        fu7Var2.d(7.0f, 11.0f);
                        fu7Var2.g(2.0f);
                        fu7Var2.c(2.0f);
                        fu7Var2.g(-2.0f);
                        fu7Var2.a();
                        fu7Var2.f(13.0f, 11.0f);
                        fu7Var2.c(-2.0f);
                        fu7Var2.g(2.0f);
                        fu7Var2.c(2.0f);
                        fu7Var2.g(-2.0f);
                        fu7Var2.a();
                        fu7Var2.f(17.0f, 11.0f);
                        fu7Var2.c(-2.0f);
                        fu7Var2.g(2.0f);
                        fu7Var2.c(2.0f);
                        fu7Var2.g(-2.0f);
                        fu7Var2.a();
                        fu7Var2.f(19.0f, 4.0f);
                        fu7Var2.c(-1.0f);
                        fu7Var2.d(18.0f, 2.0f);
                        fu7Var2.c(-2.0f);
                        fu7Var2.g(2.0f);
                        fu7Var2.d(8.0f, 4.0f);
                        fu7Var2.d(8.0f, 2.0f);
                        fu7Var2.d(6.0f, 2.0f);
                        fu7Var2.g(2.0f);
                        fu7Var2.d(5.0f, 4.0f);
                        fu7Var2.b(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        fu7Var2.d(3.0f, 20.0f);
                        fu7Var2.b(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        fu7Var2.c(14.0f);
                        fu7Var2.b(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        fu7Var2.d(21.0f, 6.0f);
                        fu7Var2.b(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        fu7Var2.a();
                        fu7Var2.f(19.0f, 20.0f);
                        fu7Var2.d(5.0f, 20.0f);
                        fu7Var2.d(5.0f, 9.0f);
                        fu7Var2.c(14.0f);
                        fu7Var2.g(11.0f);
                        fu7Var2.a();
                        n85.a.a(aVar2, fu7Var2.a, aw9Var2);
                        n85VarB2 = aVar2.b();
                        o65.c = n85VarB2;
                    }
                    String strB2 = ws3.b(jt1Var2, R.string.m3c_date_picker_switch_to_calendar_mode);
                    boolean zJ2 = jt1Var2.J(oh4Var);
                    Object objF2 = jt1Var2.f();
                    if (zJ2 || objF2 == c0187a) {
                        objF2 = new mh4() { // from class: rj2
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                oh4Var.invoke(new n23(0));
                                return g2b.a;
                            }
                        };
                        jt1Var2.C(objF2);
                    }
                    lj2.h((mh4) objF2, n85VarB2, strB2, this.v, false, jt1Var2, 0, 16);
                    jt1Var2.B();
                }
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ yh2 A;
        public final /* synthetic */ s99 B;
        public final /* synthetic */ lh2 C;
        public final /* synthetic */ nz5 t;
        public final /* synthetic */ fg5 u;
        public final /* synthetic */ i21 v;
        public final /* synthetic */ l21 w;
        public final /* synthetic */ oh4<Long, g2b> x;
        public final /* synthetic */ b21 y;
        public final /* synthetic */ Long z;

        /* JADX WARN: Multi-variable type inference failed */
        public f(nz5 nz5Var, fg5 fg5Var, i21 i21Var, l21 l21Var, oh4<? super Long, g2b> oh4Var, b21 b21Var, Long l, yh2 yh2Var, s99 s99Var, lh2 lh2Var) {
            this.t = nz5Var;
            this.u = fg5Var;
            this.v = i21Var;
            this.w = l21Var;
            this.x = oh4Var;
            this.y = b21Var;
            this.z = l;
            this.A = yh2Var;
            this.B = s99Var;
            this.C = lh2Var;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                Object objF = jt1Var2.f();
                jt1.a.C0187a c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = new p32(1);
                    jt1Var2.C(objF);
                }
                ox6 ox6VarB = pb9.b(ox6.a.t, false, (oh4) objF);
                ph2 ph2Var = ph2.a;
                bn2 bn2Var = new bn2(new s44());
                a04 a04VarE = zs4.e(wy6.v, jt1Var2);
                boolean zJ = jt1Var2.J(bn2Var);
                nz5 nz5Var = this.t;
                boolean zJ2 = zJ | jt1Var2.J(nz5Var);
                Object objF2 = jt1Var2.f();
                if (zJ2 || objF2 == c0187a) {
                    xt9 xt9Var = new xt9(new qh2(new ez5(nz5Var, du9.a.a)), bn2Var, a04VarE);
                    jt1Var2.C(xt9Var);
                    objF2 = xt9Var;
                }
                n9a n9aVar = (n9a) objF2;
                boolean zJ3 = jt1Var2.j(this.u) | jt1Var2.j(this.v) | jt1Var2.J(this.w) | jt1Var2.J(this.x) | jt1Var2.J(this.y) | jt1Var2.J(this.z) | jt1Var2.j(this.A) | jt1Var2.J(this.B) | jt1Var2.J(this.C);
                Object objF3 = jt1Var2.f();
                if (zJ3 || objF3 == c0187a) {
                    final fg5 fg5Var = this.u;
                    final i21 i21Var = this.v;
                    final l21 l21Var = this.w;
                    final oh4<Long, g2b> oh4Var = this.x;
                    final b21 b21Var = this.y;
                    final Long l = this.z;
                    final yh2 yh2Var = this.A;
                    final s99 s99Var = this.B;
                    final lh2 lh2Var = this.C;
                    oh4 oh4Var2 = new oh4() { // from class: sj2
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            ko7 ko7Var = lj2.a;
                            fg5 fg5Var2 = fg5Var;
                            ((bz5) obj).a(((fg5Var2.u - fg5Var2.t) + 1) * 12, null, az5.t, new fr1(true, 72599078, new uj2(i21Var, l21Var, oh4Var, b21Var, l, yh2Var, s99Var, lh2Var)));
                            return g2b.a;
                        }
                    };
                    jt1Var2.C(oh4Var2);
                    objF3 = oh4Var2;
                }
                ys5.b(ox6VarB, nz5Var, null, null, null, n9aVar, false, null, (oh4) objF3, jt1Var2, 0, 444);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", f = "DatePicker.kt", l = {1754}, m = "invokeSuspend")
    public static final class g extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ nz5 u;
        public final /* synthetic */ oh4<Long, g2b> v;
        public final /* synthetic */ i21 w;
        public final /* synthetic */ fg5 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(nz5 nz5Var, oh4<? super Long, g2b> oh4Var, i21 i21Var, fg5 fg5Var, r02<? super g> r02Var) {
            super(2, r02Var);
            this.u = nz5Var;
            this.v = oh4Var;
            this.w = i21Var;
            this.x = fg5Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new g(this.u, this.v, this.w, this.x, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((g) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                ko7 ko7Var = lj2.a;
                nz5 nz5Var = this.u;
                Object objCollect = bl7.k(new u22(1, nz5Var)).collect(new ek2(nz5Var, this.v, this.w, this.x), this);
                v72 v72Var = v72.t;
                if (objCollect != v72Var) {
                    objCollect = g2b.a;
                }
                if (objCollect == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h implements ei4<bra, jt1, Integer, g2b> {
        public final /* synthetic */ String t;

        public h(String str) {
            this.t = str;
        }

        @Override // defpackage.ei4
        public final g2b invoke(bra braVar, jt1 jt1Var, Integer num) {
            bra braVar2 = braVar;
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? jt1Var2.J(braVar2) : jt1Var2.j(braVar2) ? 4 : 2;
            }
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 19) != 18)) {
                yqa.a(braVar2, null, 0.0f, null, 0L, 0L, gr1.b(1905952188, new vj2(this.t), jt1Var2), jt1Var2, (iIntValue & 14) | 805306368);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ mh4<g2b> t;
        public final /* synthetic */ ox6 u;
        public final /* synthetic */ boolean v;
        public final /* synthetic */ n85 w;
        public final /* synthetic */ String x;

        public i(mh4<g2b> mh4Var, ox6 ox6Var, boolean z, n85 n85Var, String str) {
            this.t = mh4Var;
            this.u = ox6Var;
            this.v = z;
            this.w = n85Var;
            this.x = str;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                h65.b(1572864, 56, jt1Var2, this.t, gr1.b(-1301085432, new wj2(this.w, this.x), jt1Var2), null, this.u, null, this.v);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ String t;
        public final /* synthetic */ lh2 u;

        public j(String str, lh2 lh2Var) {
            this.t = str;
            this.u = lh2Var;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                String str = this.t;
                boolean zJ = jt1Var2.J(str);
                Object objF = jt1Var2.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new xj2(0, str);
                    jt1Var2.C(objF);
                }
                mia.b(str, pb9.b(ox6.a.t, false, (oh4) objF), this.u.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262136);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ mh4<g2b> t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ mh4<g2b> v;
        public final /* synthetic */ boolean w;

        public k(mh4<g2b> mh4Var, boolean z, mh4<g2b> mh4Var2, boolean z2) {
            this.t = mh4Var;
            this.u = z;
            this.v = mh4Var2;
            this.w = z2;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                ny8 ny8VarA = ly8.a(c30.a, di.a.j, jt1Var2, 0);
                int iD = jt1Var2.D();
                kw7 kw7VarY = jt1Var2.y();
                ox6 ox6VarC = it1.c(jt1Var2, ox6.a.t);
                bt1.c.getClass();
                qr5.a aVar = bt1.a.b;
                if (jt1Var2.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var2.q();
                if (jt1Var2.l()) {
                    jt1Var2.k(aVar);
                } else {
                    jt1Var2.z();
                }
                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                bt1.a.b bVar = bt1.a.g;
                if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                    rh.b(iD, jt1Var2, iD, bVar);
                }
                rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                n85 n85VarB = n65.a;
                if (n85VarB == null) {
                    n85.a aVar2 = new n85.a("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                    int i = zcb.a;
                    aw9 aw9Var = new aw9(uh1.b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new ju7.f(15.41f, 16.59f));
                    arrayList.add(new ju7.e(10.83f, 12.0f));
                    arrayList.add(new ju7.m(4.58f, -4.59f));
                    arrayList.add(new ju7.e(14.0f, 6.0f));
                    arrayList.add(new ju7.m(-6.0f, 6.0f));
                    arrayList.add(new ju7.m(6.0f, 6.0f));
                    arrayList.add(new ju7.m(1.41f, -1.41f));
                    arrayList.add(ju7.b.c);
                    n85.a.a(aVar2, arrayList, aw9Var);
                    n85VarB = aVar2.b();
                    n65.a = n85VarB;
                }
                lj2.h(this.t, n85VarB, ws3.b(jt1Var2, R.string.m3c_date_picker_switch_to_previous_month), null, this.u, jt1Var2, 0, 8);
                n85 n85VarB2 = n65.b;
                if (n85VarB2 == null) {
                    n85.a aVar3 = new n85.a("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                    int i2 = zcb.a;
                    aw9 aw9Var2 = new aw9(uh1.b);
                    ArrayList arrayList2 = new ArrayList(32);
                    arrayList2.add(new ju7.f(8.59f, 16.59f));
                    arrayList2.add(new ju7.e(13.17f, 12.0f));
                    arrayList2.add(new ju7.e(8.59f, 7.41f));
                    arrayList2.add(new ju7.e(10.0f, 6.0f));
                    arrayList2.add(new ju7.m(6.0f, 6.0f));
                    arrayList2.add(new ju7.m(-6.0f, 6.0f));
                    arrayList2.add(new ju7.m(-1.41f, -1.41f));
                    arrayList2.add(ju7.b.c);
                    n85.a.a(aVar3, arrayList2, aw9Var2);
                    n85VarB2 = aVar3.b();
                    n65.b = n85VarB2;
                }
                lj2.h(this.v, n85VarB2, ws3.b(jt1Var2, R.string.m3c_date_picker_switch_to_next_month), null, this.w, jt1Var2, 0, 8);
                jt1Var2.I();
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ String t;
        public final /* synthetic */ lh2 u;
        public final /* synthetic */ boolean v;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ boolean x;

        public l(String str, lh2 lh2Var, boolean z, boolean z2, boolean z3) {
            this.t = str;
            this.u = lh2Var;
            this.v = z;
            this.w = z2;
            this.x = z3;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            long j;
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                ox6.a aVar = ox6.a.t;
                ox6 ox6VarC = ir9.c(aVar, 1.0f);
                fl6 fl6VarD = dv0.d(di.a.e, false);
                int iD = jt1Var2.D();
                kw7 kw7VarY = jt1Var2.y();
                ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarC);
                bt1.c.getClass();
                qr5.a aVar2 = bt1.a.b;
                if (jt1Var2.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var2.q();
                if (jt1Var2.l()) {
                    jt1Var2.k(aVar2);
                } else {
                    jt1Var2.z();
                }
                rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                bt1.a.b bVar = bt1.a.g;
                if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                    rh.b(iD, jt1Var2, iD, bVar);
                }
                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                Object objF = jt1Var2.f();
                if (objF == jt1.a.a) {
                    objF = new zj2(0);
                    jt1Var2.C(objF);
                }
                ox6 ox6VarA = pb9.a(aVar, (oh4) objF);
                lh2 lh2Var = this.u;
                lh2Var.getClass();
                boolean z = this.w;
                boolean z2 = this.x;
                if (z && z2) {
                    j = lh2Var.j;
                } else if (z && !z2) {
                    j = lh2Var.k;
                } else if (this.v && z2) {
                    j = lh2Var.i;
                } else {
                    j = z2 ? lh2Var.g : lh2Var.h;
                }
                mia.b(this.t, ox6VarA, ((uh1) tq9.a(j, zs4.e(wy6.v, jt1Var2), null, jt1Var2, 0, 12).getValue()).a, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 261112);
                jt1Var2.I();
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ i21 t;
        public final /* synthetic */ long u;
        public final /* synthetic */ fg5 v;
        public final /* synthetic */ ox6 w;
        public final /* synthetic */ lh2 x;
        public final /* synthetic */ oh4<Integer, g2b> y;
        public final /* synthetic */ s99 z;

        /* JADX WARN: Multi-variable type inference failed */
        public m(i21 i21Var, long j, fg5 fg5Var, ox6 ox6Var, lh2 lh2Var, oh4<? super Integer, g2b> oh4Var, s99 s99Var) {
            this.t = i21Var;
            this.u = j;
            this.v = fg5Var;
            this.w = ox6Var;
            this.x = lh2Var;
            this.y = oh4Var;
            this.z = s99Var;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                i21 i21Var = this.t;
                final int i = i21Var.g(i21Var.h()).a;
                final int i2 = i21Var.f(this.u).a;
                fg5 fg5Var = this.v;
                zu5 zu5VarA = cv5.a(Math.max(0, (i2 - fg5Var.t) - 3), jt1Var2, 2);
                wo4.a aVar = new wo4.a();
                lh2 lh2Var = this.x;
                ox6 ox6VarC = gi0.c(this.w, lh2Var.a, al8.a);
                c30.h hVar = new c30.h(lj2.d, true, new a30());
                boolean zJ = jt1Var2.j(i21Var) | jt1Var2.j(fg5Var) | jt1Var2.h(i2) | jt1Var2.h(i) | jt1Var2.J(this.y) | jt1Var2.J(this.z) | jt1Var2.J(lh2Var);
                Object objF = jt1Var2.f();
                if (zJ || objF == jt1.a.a) {
                    final fg5 fg5Var2 = this.v;
                    final i21 i21Var2 = this.t;
                    final oh4<Integer, g2b> oh4Var = this.y;
                    final s99 s99Var = this.z;
                    final lh2 lh2Var2 = this.x;
                    oh4 oh4Var2 = new oh4() { // from class: ak2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            int size;
                            lu5 lu5Var = (lu5) obj;
                            fg5 fg5Var3 = fg5Var2;
                            fg5Var3.getClass();
                            if (fg5Var3 instanceof Collection) {
                                size = ((Collection) fg5Var3).size();
                            } else {
                                Iterator<Integer> it = fg5Var3.iterator();
                                int i3 = 0;
                                while (((eg5) it).v) {
                                    ((tf5) it).next();
                                    i3++;
                                    if (i3 < 0) {
                                        throw new ArithmeticException("Count overflow has happened.");
                                    }
                                }
                                size = i3;
                            }
                            lu5Var.e(size, ku5.t, new fr1(true, 674613074, new ck2(fg5Var3, i21Var2, i2, i, oh4Var, s99Var, lh2Var2)));
                            return g2b.a;
                        }
                    };
                    jt1Var2.C(oh4Var2);
                    objF = oh4Var2;
                }
                gt5.a(aVar, ox6VarC, zu5VarA, null, hVar, c30.e, null, false, null, (oh4) objF, jt1Var2, 1769472);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    public static final void a(final ox6 ox6Var, final ci4 ci4Var, final ci4 ci4Var2, final ci4 ci4Var3, final lh2 lh2Var, final wja wjaVar, final float f2, final fr1 fr1Var, jt1 jt1Var, final int i2) {
        int i3;
        ci4 ci4Var4;
        ci4 ci4Var5;
        wja wjaVar2;
        float f3;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(1539132883);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.j(ci4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            ci4Var4 = ci4Var2;
            i3 |= bj4VarO.j(ci4Var4) ? 256 : 128;
        } else {
            ci4Var4 = ci4Var2;
        }
        if ((i2 & 3072) == 0) {
            ci4Var5 = ci4Var3;
            i3 |= bj4VarO.j(ci4Var5) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        } else {
            ci4Var5 = ci4Var3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bj4VarO.J(lh2Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            wjaVar2 = wjaVar;
            i3 |= bj4VarO.J(wjaVar2) ? 131072 : 65536;
        } else {
            wjaVar2 = wjaVar;
        }
        if ((1572864 & i2) == 0) {
            f3 = f2;
            i3 |= bj4VarO.g(f3) ? 1048576 : 524288;
        } else {
            f3 = f2;
        }
        if ((12582912 & i2) == 0) {
            i3 |= bj4VarO.j(fr1Var) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (bj4VarO.A(i4 & 1, (i4 & 4793491) != 4793490)) {
            ox6 ox6VarM = ir9.m(ox6Var, fk2.d, 0.0f, 0.0f, 0.0f, 14);
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new ti2(0);
                bj4VarO.C(objF);
            }
            ox6 ox6VarC = gi0.c(pb9.b(ox6VarM, false, (oh4) objF), lh2Var.a, al8.a);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            d(ci4Var, lh2Var.b, lh2Var.c, f3, gr1.b(-1658370654, new ej2(ci4Var4, ci4Var5, ci4Var, lh2Var, wjaVar2), bj4VarO), bj4VarO, (i4 & 112) | 196614 | (57344 & (i4 >> 6)));
            bj4Var = bj4VarO;
            fr1Var.invoke(bj4Var, Integer.valueOf((i4 >> 21) & 14));
            bj4Var.U(true);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: wi2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lj2.a(ox6Var, ci4Var, ci4Var2, ci4Var3, lh2Var, wjaVar, f2, fr1Var, (jt1) obj, gz3.s(i2 | 1));
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final qk2 qk2Var, final ox6 ox6Var, yh2 yh2Var, lh2 lh2Var, ci4 ci4Var, ci4 ci4Var2, boolean z, p94 p94Var, jt1 jt1Var, final int i2) {
        final yh2 yh2Var2;
        final lh2 lh2Var2;
        final ci4 ci4Var3;
        final ci4 ci4Var4;
        final boolean z2;
        final p94 p94Var2;
        yh2 yh2Var3;
        ci4 ci4VarB;
        p94 p94Var3;
        boolean z3;
        lh2 lh2Var3;
        ci4 ci4Var5;
        fr1 fr1VarB;
        bj4 bj4VarO = jt1Var.o(1105472031);
        int i3 = i2 | (bj4VarO.J(qk2Var) ? 4 : 2) | 14378112;
        if (bj4VarO.A(i3 & 1, (4793491 & i3) != 4793490)) {
            bj4VarO.v0();
            int i4 = i2 & 1;
            jt1.a.C0187a c0187a = jt1.a.a;
            if (i4 == 0 || bj4VarO.c0()) {
                Object objF = bj4VarO.f();
                if (objF == c0187a) {
                    ph2 ph2Var = ph2.a;
                    objF = new zh2();
                    bj4VarO.C(objF);
                }
                yh2Var3 = (yh2) objF;
                ph2 ph2Var2 = ph2.a;
                lh2 lh2VarC = ph2.c(bj4VarO);
                ci4VarB = gr1.b(1655706771, new fj2(qk2Var, lh2VarC), bj4VarO);
                fr1 fr1VarB2 = gr1.b(1439279037, new gj2(qk2Var, yh2Var3, lh2VarC), bj4VarO);
                Object objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new p94();
                    bj4VarO.C(objF2);
                }
                p94Var3 = (p94) objF2;
                z3 = true;
                lh2Var3 = lh2VarC;
                ci4Var5 = fr1VarB2;
            } else {
                bj4VarO.u();
                yh2Var3 = yh2Var;
                lh2Var3 = lh2Var;
                ci4VarB = ci4Var;
                ci4Var5 = ci4Var2;
                z3 = z;
                p94Var3 = p94Var;
            }
            bj4VarO.V();
            boolean zJ = bj4VarO.J(qk2Var.getLocale());
            Object objF3 = bj4VarO.f();
            if (zJ || objF3 == c0187a) {
                if (qk2Var instanceof dk0) {
                    objF3 = ((dk0) qk2Var).c;
                } else {
                    Locale locale = qk2Var.getLocale();
                    objF3 = Build.VERSION.SDK_INT >= 26 ? new j21(locale) : new j56(locale);
                }
                bj4VarO.C(objF3);
            }
            i21 i21Var = (i21) objF3;
            if (z3) {
                bj4VarO.K(-690551113);
                fr1VarB = gr1.b(-1483431603, new ij2(qk2Var, lh2Var3), bj4VarO);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-690163489);
                bj4VarO.U(false);
                fr1VarB = null;
            }
            p94 p94Var4 = p94Var3;
            ci4 ci4Var6 = ci4VarB;
            a(ox6Var, ci4Var6, ci4Var5, fr1VarB, lh2Var3, j0b.a(fk2.q, bj4VarO), fk2.o, gr1.b(-1346903698, new kj2(qk2Var, i21Var, yh2Var3, lh2Var3, p94Var4), bj4VarO), bj4VarO, 14156214);
            ci4Var4 = ci4Var5;
            lh2Var2 = lh2Var3;
            z2 = z3;
            p94Var2 = p94Var4;
            yh2Var2 = yh2Var3;
            ci4Var3 = ci4Var6;
        } else {
            bj4VarO.u();
            yh2Var2 = yh2Var;
            lh2Var2 = lh2Var;
            ci4Var3 = ci4Var;
            ci4Var4 = ci4Var2;
            z2 = z;
            p94Var2 = p94Var;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(ox6Var, yh2Var2, lh2Var2, ci4Var3, ci4Var4, z2, p94Var2, i2) { // from class: ji2
                public final /* synthetic */ p94 A;
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ yh2 v;
                public final /* synthetic */ lh2 w;
                public final /* synthetic */ ci4 x;
                public final /* synthetic */ ci4 y;
                public final /* synthetic */ boolean z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(49);
                    lj2.b(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x027f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0288  */
    /* JADX WARN: Code duplicated, block: B:105:0x028c  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:112:0x0378  */
    /* JADX WARN: Code duplicated, block: B:114:0x037c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0198  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x022c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0233  */
    /* JADX WARN: Code duplicated, block: B:92:0x0237  */
    /* JADX WARN: Code duplicated, block: B:97:0x0254  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final Long l2, final long j2, final oh4<? super Long, g2b> oh4Var, final oh4<? super Long, g2b> oh4Var2, final i21 i21Var, final fg5 fg5Var, final yh2 yh2Var, final s99 s99Var, final lh2 lh2Var, jt1 jt1Var, final int i2) {
        bt1.a.c cVar;
        bt1.a.d dVar;
        String strB;
        boolean zJ;
        Object objF;
        boolean zJ2;
        Object objF2;
        boolean zJ3;
        Object objF3;
        boolean z;
        int i3;
        bt1.a.c cVar2;
        fl6 fl6VarD;
        int iD;
        kw7 kw7VarP;
        ox6 ox6VarC;
        bt1.a.b bVar;
        aj1 aj1VarA;
        int iD2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        bj4 bj4VarO = jt1Var.o(-434467002);
        j1b j1bVar = bj4VarO.a;
        int i4 = i2 | (bj4VarO.J(l2) ? 4 : 2) | (bj4VarO.i(j2) ? 32 : 16) | (bj4VarO.j(oh4Var) ? 256 : 128) | (bj4VarO.j(oh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.j(i21Var) ? 16384 : 8192) | (bj4VarO.j(fg5Var) ? 131072 : 65536) | (bj4VarO.J(yh2Var) ? 1048576 : 524288) | (bj4VarO.J(s99Var) ? 8388608 : 4194304) | (bj4VarO.J(lh2Var) ? 67108864 : 33554432);
        if (bj4VarO.A(i4 & 1, (38347923 & i4) != 38347922)) {
            l21 l21VarF = i21Var.f(j2);
            int i5 = (((l21VarF.a - fg5Var.t) * 12) + l21VarF.b) - 1;
            if (i5 < 0) {
                i5 = 0;
            }
            final nz5 nz5VarA = qz5.a(i5, bj4VarO, 0, 2);
            Integer numValueOf = Integer.valueOf(i5);
            boolean zJ4 = bj4VarO.J(nz5VarA) | bj4VarO.h(i5);
            Object objF4 = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ4 || objF4 == c0187a) {
                objF4 = new a(nz5VarA, i5, null);
                bj4VarO.C(objF4);
            }
            wd3.d(bj4VarO, (ci4) objF4, numValueOf);
            Object objF5 = bj4VarO.f();
            if (objF5 == c0187a) {
                objF5 = m78.a(bj4VarO.x(), bj4VarO);
            }
            final t72 t72Var = (t72) objF5;
            Object[] objArr = new Object[0];
            Object objF6 = bj4VarO.f();
            if (objF6 == c0187a) {
                objF6 = new ci2(0);
                bj4VarO.C(objF6);
            }
            h37 h37Var = (h37) mm8.d(objArr, (mh4) objF6, bj4VarO, 48);
            c30.k kVar = c30.c;
            sp0.a aVar = di.a.m;
            aj1 aj1VarA2 = yi1.a(kVar, aVar, bj4VarO, 0);
            int iD3 = bj4VarO.D();
            kw7 kw7VarP3 = bj4VarO.P();
            ox6.a aVar2 = ox6.a.t;
            ox6 ox6VarC3 = it1.c(bj4VarO, aVar2);
            bt1.c.getClass();
            qr5.a aVar3 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            bt1.a.c cVar3 = bt1.a.f;
            rd7.d(bj4VarO, cVar3, aj1VarA2);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP3);
            bt1.a.b bVar2 = bt1.a.g;
            if (bj4VarO.S) {
                cVar = cVar3;
            } else {
                cVar = cVar3;
                if (!xj5.a(bj4VarO.f(), Integer.valueOf(iD3))) {
                }
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC3);
                ox6 ox6VarK = eo7.k(aVar2, 12.0f, 0.0f, 2);
                boolean zD = nz5VarA.d();
                boolean zB = nz5VarA.b();
                boolean zBooleanValue = ((Boolean) h37Var.getValue()).booleanValue();
                strB = yh2Var.b(Long.valueOf(j2), i21Var.a);
                if (strB == null) {
                    strB = "-";
                }
                zJ = bj4VarO.j(t72Var) | bj4VarO.J(nz5VarA);
                objF = bj4VarO.f();
                if (zJ || objF == c0187a) {
                    objF = new mh4() { // from class: di2
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            oy0.d(t72Var, null, null, new lj2.b(nz5VarA, null), 3);
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF);
                }
                mh4 mh4Var = (mh4) objF;
                zJ2 = bj4VarO.j(t72Var) | bj4VarO.J(nz5VarA);
                objF2 = bj4VarO.f();
                if (zJ2 || objF2 == c0187a) {
                    objF2 = new mh4() { // from class: ei2
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            oy0.d(t72Var, null, null, new lj2.c(nz5VarA, null), 3);
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF2);
                }
                mh4 mh4Var2 = (mh4) objF2;
                zJ3 = bj4VarO.J(h37Var);
                objF3 = bj4VarO.f();
                if (!zJ3 || objF3 == c0187a) {
                    z = false;
                    objF3 = new fi2(0, h37Var);
                    bj4VarO.C(objF3);
                } else {
                    z = false;
                }
                i3 = i4 & 234881024;
                cVar2 = cVar;
                j(ox6VarK, zD, zB, zBooleanValue, strB, mh4Var, mh4Var2, (mh4) objF3, lh2Var, bj4VarO, i3 | 6);
                bj4VarO = bj4VarO;
                fl6VarD = dv0.d(di.a.a, z);
                iD = bj4VarO.D();
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, aVar2);
                if (j1bVar != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar2, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP);
                if (bj4VarO.S && xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                    bVar = bVar2;
                } else {
                    bVar = bVar2;
                    qh.a(iD, bj4VarO, iD, bVar);
                }
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6VarK2 = eo7.k(aVar2, 12.0f, 0.0f, 2);
                aj1VarA = yi1.a(kVar, aVar, bj4VarO, 0);
                iD2 = bj4VarO.D();
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarK2);
                if (j1bVar != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar2, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD2))) {
                    qh.a(iD2, bj4VarO, iD2, bVar);
                }
                rd7.d(bj4VarO, dVar, ox6VarC2);
                l(lh2Var, i21Var, bj4VarO, ((i4 >> 24) & 14) | ((i4 >> 9) & 112));
                g(nz5VarA, l2, oh4Var, oh4Var2, i21Var, fg5Var, yh2Var, s99Var, lh2Var, bj4VarO, ((i4 << 3) & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128) | i3);
                bj4VarO.U(true);
                wy6 wy6Var = wy6.v;
                a04 a04VarE = zs4.e(wy6Var, bj4VarO);
                a04 a04VarE2 = zs4.e(wy6.w, bj4VarO);
                a04 a04VarE3 = zs4.e(wy6Var, bj4VarO);
                dv.d(((Boolean) h37Var.getValue()).booleanValue(), uma.b(aVar2), zg3.b(a04VarE3, 14).b(new uh3(new zva(new et3(0.6f, a04VarE), (sr9) null, (o91) null, (t39) null, (LinkedHashMap) null, 126))), zg3.h(a04VarE3, 14).b(zg3.d(a04VarE2, 2)), null, gr1.b(1193716082, new d(j2, h37Var, t72Var, nz5VarA, fg5Var, l21VarF, s99Var, i21Var, lh2Var), bj4VarO), bj4VarO, 196656, 16);
                bj4VarO.U(true);
                bj4VarO.U(true);
            }
            qh.a(iD3, bj4VarO, iD3, bVar2);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC3);
            ox6 ox6VarK3 = eo7.k(aVar2, 12.0f, 0.0f, 2);
            boolean zD2 = nz5VarA.d();
            boolean zB2 = nz5VarA.b();
            boolean zBooleanValue2 = ((Boolean) h37Var.getValue()).booleanValue();
            strB = yh2Var.b(Long.valueOf(j2), i21Var.a);
            if (strB == null) {
                strB = "-";
            }
            zJ = bj4VarO.j(t72Var) | bj4VarO.J(nz5VarA);
            objF = bj4VarO.f();
            if (zJ) {
                objF = new mh4() { // from class: di2
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        oy0.d(t72Var, null, null, new lj2.b(nz5VarA, null), 3);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: di2
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        oy0.d(t72Var, null, null, new lj2.b(nz5VarA, null), 3);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            }
            mh4 mh4Var3 = (mh4) objF;
            zJ2 = bj4VarO.j(t72Var) | bj4VarO.J(nz5VarA);
            objF2 = bj4VarO.f();
            if (zJ2) {
                objF2 = new mh4() { // from class: ei2
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        oy0.d(t72Var, null, null, new lj2.c(nz5VarA, null), 3);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new mh4() { // from class: ei2
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        oy0.d(t72Var, null, null, new lj2.c(nz5VarA, null), 3);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF2);
            }
            mh4 mh4Var4 = (mh4) objF2;
            zJ3 = bj4VarO.J(h37Var);
            objF3 = bj4VarO.f();
            if (zJ3) {
                z = false;
                objF3 = new fi2(0, h37Var);
                bj4VarO.C(objF3);
            } else {
                z = false;
                objF3 = new fi2(0, h37Var);
                bj4VarO.C(objF3);
            }
            i3 = i4 & 234881024;
            cVar2 = cVar;
            j(ox6VarK3, zD2, zB2, zBooleanValue2, strB, mh4Var3, mh4Var4, (mh4) objF3, lh2Var, bj4VarO, i3 | 6);
            bj4VarO = bj4VarO;
            fl6VarD = dv0.d(di.a.a, z);
            iD = bj4VarO.D();
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, aVar2);
            if (j1bVar != null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar2, fl6VarD);
            rd7.d(bj4VarO, eVar, kw7VarP);
            if (bj4VarO.S) {
                bVar = bVar2;
                qh.a(iD, bj4VarO, iD, bVar);
            } else {
                bVar = bVar2;
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6VarK4 = eo7.k(aVar2, 12.0f, 0.0f, 2);
            aj1VarA = yi1.a(kVar, aVar, bj4VarO, 0);
            iD2 = bj4VarO.D();
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarK4);
            if (j1bVar != null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar2, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            if (bj4VarO.S) {
                qh.a(iD2, bj4VarO, iD2, bVar);
            } else {
                qh.a(iD2, bj4VarO, iD2, bVar);
            }
            rd7.d(bj4VarO, dVar, ox6VarC2);
            l(lh2Var, i21Var, bj4VarO, ((i4 >> 24) & 14) | ((i4 >> 9) & 112));
            g(nz5VarA, l2, oh4Var, oh4Var2, i21Var, fg5Var, yh2Var, s99Var, lh2Var, bj4VarO, ((i4 << 3) & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128) | i3);
            bj4VarO.U(true);
            wy6 wy6Var2 = wy6.v;
            a04 a04VarE4 = zs4.e(wy6Var2, bj4VarO);
            a04 a04VarE5 = zs4.e(wy6.w, bj4VarO);
            a04 a04VarE6 = zs4.e(wy6Var2, bj4VarO);
            dv.d(((Boolean) h37Var.getValue()).booleanValue(), uma.b(aVar2), zg3.b(a04VarE6, 14).b(new uh3(new zva(new et3(0.6f, a04VarE4), (sr9) null, (o91) null, (t39) null, (LinkedHashMap) null, 126))), zg3.h(a04VarE6, 14).b(zg3.d(a04VarE5, 2)), null, gr1.b(1193716082, new d(j2, h37Var, t72Var, nz5VarA, fg5Var, l21VarF, s99Var, i21Var, lh2Var), bj4VarO), bj4VarO, 196656, 16);
            bj4VarO.U(true);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(l2, j2, oh4Var, oh4Var2, i21Var, fg5Var, yh2Var, s99Var, lh2Var, i2) { // from class: gi2
                public final /* synthetic */ s99 A;
                public final /* synthetic */ lh2 B;
                public final /* synthetic */ Long t;
                public final /* synthetic */ long u;
                public final /* synthetic */ oh4 v;
                public final /* synthetic */ oh4 w;
                public final /* synthetic */ i21 x;
                public final /* synthetic */ fg5 y;
                public final /* synthetic */ yh2 z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    lj2.c(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void d(final ci4 ci4Var, final long j2, final long j3, final float f2, final fr1 fr1Var, jt1 jt1Var, final int i2) {
        int i3;
        boolean z;
        bj4 bj4VarO = jt1Var.o(2020490761);
        int i4 = i2 & 6;
        ox6.a aVar = ox6.a.t;
        if (i4 == 0) {
            i3 = (bj4VarO.J(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.j(ci4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.i(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bj4VarO.i(j3) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bj4VarO.g(f2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bj4VarO.j(fr1Var) ? 131072 : 65536;
        }
        if (bj4VarO.A(i3 & 1, (74899 & i3) != 74898)) {
            ox6 ox6VarH = ir9.c(aVar, 1.0f).H(ci4Var != null ? ir9.b(aVar, 0.0f, f2, 1) : aVar);
            aj1 aj1VarA = yi1.a(c30.f, di.a.m, bj4VarO, 6);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarH);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            if (ci4Var != null) {
                bj4VarO.K(396894187);
                z = true;
                bzb.b(j2, j0b.a(fk2.s, bj4VarO), gr1.b(1344395458, new oj2(ci4Var), bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 384);
                bj4VarO.U(false);
            } else {
                z = true;
                bj4VarO.K(397163267);
                bj4VarO.U(false);
            }
            nu1.a(zy1.a.a(new uh1(j3)), fr1Var, bj4VarO, ((i3 >> 12) & 112) | 8);
            bj4VarO.U(z);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: yi2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lj2.d(ci4Var, j2, j3, f2, fr1Var, (jt1) obj, gz3.s(i2 | 1));
                    return g2b.a;
                }
            };
        }
    }

    public static final void e(final String str, final boolean z, final mh4 mh4Var, final boolean z2, final boolean z3, final boolean z4, final String str2, final lh2 lh2Var, jt1 jt1Var, final int i2) {
        int i3;
        long j2;
        yz9 yz9VarJ;
        bj4 bj4VarO = jt1Var.o(-945355136);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.J(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i2 & 48;
        ox6.a aVar = ox6.a.t;
        if (i4 == 0) {
            i3 |= bj4VarO.J(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.c(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bj4VarO.c(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bj4VarO.c(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= bj4VarO.c(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= bj4VarO.c(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= bj4VarO.J(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= bj4VarO.J(lh2Var) ? 536870912 : 268435456;
        }
        if (bj4VarO.A(i3 & 1, (306783379 & i3) != 306783378)) {
            boolean z5 = (234881024 & i3) == 67108864;
            Object objF = bj4VarO.f();
            if (z5 || objF == jt1.a.a) {
                objF = new oh4() { // from class: ri2
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        hc9 hc9Var = (hc9) obj;
                        iw iwVar = new iw(str2);
                        ho5<Object>[] ho5VarArr = ec9.a;
                        hc9Var.d(ac9.C, ws0.h(iwVar));
                        ec9.e(hc9Var, 0);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            }
            ox6 ox6VarB = pb9.b(aVar, true, (oh4) objF);
            jl9 jl9VarB = wl9.b(fk2.f, bj4VarO);
            int i5 = i3 >> 6;
            if (z) {
                j2 = z3 ? lh2Var.r : lh2Var.s;
            } else {
                lh2Var.getClass();
                j2 = uh1.j;
            }
            long j3 = j2;
            if (z2) {
                bj4VarO.K(-1319856736);
                yz9VarJ = tq9.a(j3, zs4.e(wy6.v, bj4VarO), null, bj4VarO, 0, 12);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-1319630064);
                yz9VarJ = bl7.j(new uh1(j3), bj4VarO);
                bj4VarO.U(false);
            }
            v5a.b(z, mh4Var, ox6VarB, z3, jl9VarB, ((uh1) yz9VarJ.getValue()).a, (!z4 || z) ? null : ws0.b(fk2.l, lh2Var.u), gr1.b(1126347158, new pj2(str, lh2Var, z4, z, z3), bj4VarO), bj4VarO, i5 & 7294, 1472);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: si2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lj2.e(str, z, mh4Var, z2, z3, z4, str2, lh2Var, (jt1) obj, gz3.s(i2 | 1));
                    return g2b.a;
                }
            };
        }
    }

    public static final void f(final ox6 ox6Var, final int i2, final oh4<? super n23, g2b> oh4Var, final lh2 lh2Var, jt1 jt1Var, final int i3) {
        bj4 bj4VarO = jt1Var.o(-1461252485);
        int i4 = (bj4VarO.h(i2) ? 32 : 16) | i3 | (bj4VarO.j(oh4Var) ? 256 : 128) | (bj4VarO.J(lh2Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
        if (bj4VarO.A(i4 & 1, (i4 & 1171) != 1170)) {
            nu1.a(zy1.a.a(new uh1(lh2Var.c)), gr1.b(-1734512197, new e(i2, oh4Var, ox6Var), bj4VarO), bj4VarO, 56);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(i2, oh4Var, lh2Var, i3) { // from class: bj2
                public final /* synthetic */ int u;
                public final /* synthetic */ oh4 v;
                public final /* synthetic */ lh2 w;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(7);
                    lj2.f(this.t, this.u, this.v, this.w, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void g(nz5 nz5Var, final Long l2, final oh4<? super Long, g2b> oh4Var, final oh4<? super Long, g2b> oh4Var2, final i21 i21Var, final fg5 fg5Var, final yh2 yh2Var, final s99 s99Var, final lh2 lh2Var, jt1 jt1Var, final int i2) {
        Object gVar;
        final nz5 nz5Var2 = nz5Var;
        bj4 bj4VarO = jt1Var.o(-1994757941);
        int i3 = i2 | (bj4VarO.J(nz5Var2) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.J(l2) ? 32 : 16;
        }
        int i4 = i3 | (bj4VarO.j(oh4Var) ? 256 : 128) | (bj4VarO.j(oh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.j(i21Var) ? 16384 : 8192) | (bj4VarO.j(fg5Var) ? 131072 : 65536) | (bj4VarO.J(yh2Var) ? 1048576 : 524288) | (bj4VarO.J(s99Var) ? 8388608 : 4194304) | (bj4VarO.J(lh2Var) ? 67108864 : 33554432);
        if (bj4VarO.A(i4 & 1, (38347923 & i4) != 38347922)) {
            b21 b21VarH = i21Var.h();
            boolean zJ = bj4VarO.J(fg5Var);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = i21Var.e(fg5Var.t, 1);
                bj4VarO.C(objF);
            }
            mia.a(j0b.a(fk2.h, bj4VarO), gr1.b(1504086906, new f(nz5Var2, fg5Var, i21Var, (l21) objF, oh4Var, b21VarH, l2, yh2Var, s99Var, lh2Var), bj4VarO), bj4VarO, 48);
            boolean zJ2 = ((i4 & 14) == 4) | ((i4 & 7168) == 2048) | bj4VarO.j(i21Var) | bj4VarO.j(fg5Var);
            Object objF2 = bj4VarO.f();
            if (zJ2 || objF2 == c0187a) {
                nz5Var2 = nz5Var;
                gVar = new g(nz5Var2, oh4Var2, i21Var, fg5Var, null);
                bj4VarO.C(gVar);
            } else {
                gVar = objF2;
                nz5Var2 = nz5Var;
            }
            wd3.d(bj4VarO, (ci4) gVar, nz5Var2);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: mi2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lj2.g(nz5Var2, l2, oh4Var, oh4Var2, i21Var, fg5Var, yh2Var, s99Var, lh2Var, (jt1) obj, gz3.s(i2 | 1));
                    return g2b.a;
                }
            };
        }
    }

    public static final void h(mh4<g2b> mh4Var, n85 n85Var, String str, ox6 ox6Var, boolean z, jt1 jt1Var, int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        ox6 ox6Var2;
        boolean z3;
        bj4 bj4VarO = jt1Var.o(-368059805);
        int i6 = i2 | (bj4VarO.j(mh4Var) ? 4 : 2) | (bj4VarO.J(n85Var) ? 32 : 16) | (bj4VarO.J(str) ? 256 : 128);
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
        } else {
            i4 = i6 | (bj4VarO.J(ox6Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i5 = i4 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i5 = i4 | (bj4VarO.c(z2) ? 16384 : 8192);
        }
        if (bj4VarO.A(i5 & 1, (i5 & 9363) != 9362)) {
            ox6 ox6Var3 = i7 != 0 ? ox6.a.t : ox6Var;
            if (i8 != 0) {
                z2 = true;
            }
            boolean z4 = z2;
            yqa.b(sqa.a(bj4VarO), gr1.b(-456272562, new h(str), bj4VarO), yqa.c(bj4VarO), null, false, gr1.b(-1124908186, new i(mh4Var, ox6Var3, z4, n85Var, str), bj4VarO), bj4VarO, 100663344);
            ox6Var2 = ox6Var3;
            z3 = z4;
        } else {
            bj4VarO.u();
            ox6Var2 = ox6Var;
            z3 = z2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new hi2(mh4Var, n85Var, str, ox6Var2, z3, i2, i3);
        }
    }

    public static final void i(final l21 l21Var, final oh4 oh4Var, final long j2, final Long l2, final yh2 yh2Var, final s99 s99Var, final lh2 lh2Var, final Locale locale, jt1 jt1Var, final int i2) {
        bj4 bj4Var;
        bj4 bj4Var2;
        ox6.a aVar;
        boolean z;
        l21 l21Var2 = l21Var;
        bj4 bj4VarO = jt1Var.o(-333300603);
        j1b j1bVar = bj4VarO.a;
        Object obj = s99Var;
        int i3 = i2 | (bj4VarO.J(l21Var2) ? 4 : 2) | (bj4VarO.j(oh4Var) ? 32 : 16) | (bj4VarO.i(j2) ? 256 : 128) | (bj4VarO.J(l2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.J(yh2Var) ? 1048576 : 524288) | (bj4VarO.J(obj) ? 8388608 : 4194304) | (bj4VarO.J(lh2Var) ? 67108864 : 33554432) | (bj4VarO.j(locale) ? 536870912 : 268435456);
        if (bj4VarO.A(i3 & 1, (306783379 & i3) != 306783378)) {
            bj4VarO.K(606771165);
            bj4VarO.U(false);
            ox6.a aVar2 = ox6.a.t;
            ox6 ox6VarH = ir9.f(aVar2, 288.0f).H(aVar2);
            sp0.a aVar3 = di.a.m;
            c30.g gVar = c30.e;
            aj1 aj1VarA = yi1.a(gVar, aVar3, bj4VarO, 6);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarH);
            bt1.c.getClass();
            qr5.a aVar4 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar4);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(-680088486);
            int i4 = 0;
            int i5 = 0;
            while (i5 < 6) {
                ox6 ox6VarC2 = ir9.c(aVar2, 1.0f);
                ny8 ny8VarA = ly8.a(gVar, di.a.k, bj4VarO, 54);
                int iD2 = bj4VarO.D();
                kw7 kw7VarP2 = bj4VarO.P();
                ox6 ox6VarC3 = it1.c(bj4VarO, ox6VarC2);
                bt1.c.getClass();
                int i6 = i4;
                qr5.a aVar5 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                int i7 = i5;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar5);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                bt1.a.b bVar2 = bt1.a.g;
                if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD2))) {
                    qh.a(iD2, bj4VarO, iD2, bVar2);
                }
                rd7.d(bj4VarO, bt1.a.d, ox6VarC3);
                bj4VarO.K(1542622325);
                int i8 = i6;
                int i9 = 0;
                while (i9 < 7) {
                    int i10 = l21Var2.d;
                    if (i8 < i10 || i8 >= i10 + l21Var2.c) {
                        bj4Var2 = bj4VarO;
                        i8 = i8;
                        i9 = i9;
                        ox6.a aVar6 = aVar2;
                        bj4Var2.K(576825328);
                        aVar = aVar6;
                        ox6 ox6VarM = ir9.m(aVar, fk2.g, fk2.e, 0.0f, 0.0f, 12);
                        y0a y0aVar = tg5.c;
                        b47.b(bj4Var2, ir9.k(((y43) bj4Var2.F(y0aVar)).t, ((y43) bj4Var2.F(y0aVar)).t, ox6VarM));
                        bj4Var2.U(false);
                    } else {
                        bj4VarO.K(577914947);
                        int i11 = i8 - l21Var2.d;
                        final long j3 = (((long) i11) * 86400000) + l21Var2.e;
                        boolean z2 = j3 == j2;
                        boolean z3 = l2 != null && j3 == l2.longValue();
                        bj4VarO.K(578890300);
                        bj4VarO.U(false);
                        StringBuilder sb = new StringBuilder();
                        bj4VarO.K(974838827);
                        bj4VarO.U(false);
                        if (z2) {
                            bj4VarO.K(1416920485);
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(ws3.b(bj4VarO, R.string.m3c_date_picker_today_description));
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(975029291);
                            bj4VarO.U(false);
                        }
                        String string = sb.length() == 0 ? null : sb.toString();
                        ox6.a aVar7 = aVar2;
                        String strA = yh2Var.a(Long.valueOf(j3), locale, true);
                        if (strA == null) {
                            strA = BuildConfig.FLAVOR;
                        }
                        String strA2 = h21.a(i11 + 1, locale, 7);
                        boolean zI = ((i3 & 112) == 32) | bj4VarO.i(j3);
                        Object objF = bj4VarO.f();
                        jt1.a.C0187a c0187a = jt1.a.a;
                        if (zI || objF == c0187a) {
                            objF = new mh4() { // from class: pi2
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    oh4Var.invoke(Long.valueOf(j3));
                                    return g2b.a;
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        mh4 mh4Var = (mh4) objF;
                        boolean zI2 = bj4VarO.i(j3) | ((29360128 & i3) == 8388608);
                        Object objF2 = bj4VarO.f();
                        if (zI2 || objF2 == c0187a) {
                            obj.getClass();
                            z = true;
                            objF2 = true;
                            bj4VarO.C(objF2);
                        } else {
                            z = true;
                        }
                        boolean zBooleanValue = ((Boolean) objF2).booleanValue();
                        if (string != null) {
                            strA = cj2.a(string, ", ", strA);
                        }
                        bj4 bj4Var3 = bj4VarO;
                        e(strA2, z3, mh4Var, z3, zBooleanValue, z2, strA, lh2Var, bj4Var3, ((i3 << 3) & 1879048192) | 48);
                        bj4Var2 = bj4Var3;
                        bj4Var2.U(false);
                        aVar = aVar7;
                    }
                    l21Var2 = l21Var;
                    gVar = gVar;
                    i8++;
                    bj4VarO = bj4Var2;
                    i9++;
                    aVar2 = aVar;
                    obj = s99Var;
                }
                bj4 bj4Var4 = bj4VarO;
                bj4Var4.U(false);
                bj4Var4.U(true);
                l21Var2 = l21Var;
                obj = s99Var;
                i5 = i7 + 1;
                bj4VarO = bj4Var4;
                i4 = i8;
            }
            bj4Var = bj4VarO;
            bj4Var.U(false);
            bj4Var.U(true);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(oh4Var, j2, l2, yh2Var, s99Var, lh2Var, locale, i2) { // from class: qi2
                public final /* synthetic */ Locale A;
                public final /* synthetic */ oh4 u;
                public final /* synthetic */ long v;
                public final /* synthetic */ Long w;
                public final /* synthetic */ yh2 x;
                public final /* synthetic */ s99 y;
                public final /* synthetic */ lh2 z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iS = gz3.s(221185);
                    lj2.i(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (jt1) obj2, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void j(ox6 ox6Var, final boolean z, final boolean z2, final boolean z3, final String str, final mh4<g2b> mh4Var, final mh4<g2b> mh4Var2, final mh4<g2b> mh4Var3, final lh2 lh2Var, jt1 jt1Var, final int i2) {
        ox6 ox6Var2;
        bj4 bj4VarO = jt1Var.o(-773929258);
        int i3 = i2 | (bj4VarO.c(z) ? 32 : 16) | (bj4VarO.c(z2) ? 256 : 128) | (bj4VarO.c(z3) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.J(str) ? 16384 : 8192) | (bj4VarO.j(mh4Var) ? 131072 : 65536) | (bj4VarO.j(mh4Var2) ? 1048576 : 524288) | (bj4VarO.j(mh4Var3) ? 8388608 : 4194304) | (bj4VarO.J(lh2Var) ? 67108864 : 33554432);
        if (bj4VarO.A(i3 & 1, (38347923 & i3) != 38347922)) {
            ox6Var2 = ox6Var;
            ox6 ox6VarF = ir9.f(ir9.c(ox6Var2, 1.0f), 56.0f);
            ny8 ny8VarA = ly8.a(z3 ? c30.a : c30.f, di.a.k, bj4VarO, 48);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarF);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            o(mh4Var3, z3, null, gr1.b(619076006, new j(str, lh2Var), bj4VarO), bj4VarO, ((i3 >> 6) & 112) | ((i3 >> 21) & 14) | 3072);
            if (z3) {
                bj4VarO.K(282432080);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(281624840);
                nu1.a(zy1.a.a(new uh1(lh2Var.f)), gr1.b(-128317193, new k(mh4Var2, z2, mh4Var, z), bj4VarO), bj4VarO, 56);
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
        } else {
            ox6Var2 = ox6Var;
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final ox6 ox6Var3 = ox6Var2;
            xj8VarW.d = new ci4(z, z2, z3, str, mh4Var, mh4Var2, mh4Var3, lh2Var, i2) { // from class: li2
                public final /* synthetic */ mh4 A;
                public final /* synthetic */ lh2 B;
                public final /* synthetic */ boolean u;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ String x;
                public final /* synthetic */ mh4 y;
                public final /* synthetic */ mh4 z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(7);
                    lj2.j(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void k(final Long l2, final long j2, final int i2, final oh4 oh4Var, final oh4 oh4Var2, final i21 i21Var, final fg5 fg5Var, final yh2 yh2Var, final s99 s99Var, final lh2 lh2Var, final p94 p94Var, jt1 jt1Var, final int i3) {
        bj4 bj4VarO = jt1Var.o(-2053685029);
        int i4 = i3 | (bj4VarO.J(l2) ? 4 : 2) | (bj4VarO.i(j2) ? 32 : 16) | (bj4VarO.h(i2) ? 256 : 128) | (bj4VarO.j(oh4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.j(oh4Var2) ? 16384 : 8192) | (bj4VarO.j(i21Var) ? 131072 : 65536) | (bj4VarO.j(fg5Var) ? 1048576 : 524288) | (bj4VarO.J(yh2Var) ? 8388608 : 4194304) | (bj4VarO.J(s99Var) ? 67108864 : 33554432) | (bj4VarO.J(lh2Var) ? 536870912 : 268435456);
        if (bj4VarO.A(i4 & 1, ((i4 & 306783379) == 306783378 && ((bj4VarO.J(p94Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            final int i5 = -((tx2) bj4VarO.F(qu1.h)).n1(48.0f);
            final a04 a04VarE = zs4.e(wy6.v, bj4VarO);
            final a04 a04VarE2 = zs4.e(wy6.w, bj4VarO);
            wy6 wy6Var = wy6.t;
            final a04 a04VarE3 = zs4.e(wy6Var, bj4VarO);
            final a04 a04VarE4 = zs4.e(wy6Var, bj4VarO);
            n23 n23Var = new n23(i2);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = new v4(1);
                bj4VarO.C(objF);
            }
            ox6 ox6VarB = pb9.b(ox6.a.t, false, (oh4) objF);
            boolean zJ = bj4VarO.j(a04VarE3) | bj4VarO.j(a04VarE) | bj4VarO.j(a04VarE2) | bj4VarO.h(i5) | bj4VarO.j(a04VarE4);
            Object objF2 = bj4VarO.f();
            if (zJ || objF2 == c0187a) {
                objF2 = new oh4() { // from class: zi2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        ru ruVar = (ru) obj;
                        int i6 = ((n23) ruVar.f()).a;
                        a04 a04Var = a04VarE3;
                        a04 a04Var2 = a04VarE;
                        a04 a04Var3 = a04VarE2;
                        final int i7 = i5;
                        oz1 oz1VarC = i6 == 1 ? lu.c(zg3.i(a04Var, new ms0(1)).b(zg3.c(a04Var2, 2)), zg3.d(a04Var3, 2).b(zg3.k(a04Var, new oh4() { // from class: ai2
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                ((Integer) obj2).intValue();
                                return Integer.valueOf(i7);
                            }
                        }))) : lu.c(zg3.i(a04Var, new oh4() { // from class: ai2
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                ((Integer) obj2).intValue();
                                return Integer.valueOf(i7);
                            }
                        }).b(zg3.c(a04Var2, 2)), zg3.k(a04Var, new ms0(1)).b(zg3.d(a04Var3, 2)));
                        final a04 a04Var4 = a04VarE4;
                        return ruVar.a(oz1VarC, new nr9(new ci4() { // from class: bi2
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj2, Object obj3) {
                                return a04Var4;
                            }
                        }));
                    }
                };
                bj4VarO.C(objF2);
            }
            lu.a(n23Var, ox6VarB, (oh4) objF2, null, "DatePickerDisplayModeAnimation", null, gr1.b(1838500091, new yj2(l2, j2, oh4Var, oh4Var2, i21Var, fg5Var, yh2Var, s99Var, lh2Var, p94Var), bj4VarO), bj4VarO, ((i4 >> 6) & 14) | 1597440);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(l2, j2, i2, oh4Var, oh4Var2, i21Var, fg5Var, yh2Var, s99Var, lh2Var, p94Var, i3) { // from class: aj2
                public final /* synthetic */ yh2 A;
                public final /* synthetic */ s99 B;
                public final /* synthetic */ lh2 C;
                public final /* synthetic */ p94 D;
                public final /* synthetic */ Long t;
                public final /* synthetic */ long u;
                public final /* synthetic */ int v;
                public final /* synthetic */ oh4 w;
                public final /* synthetic */ oh4 x;
                public final /* synthetic */ i21 y;
                public final /* synthetic */ fg5 z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    lj2.k(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(final lh2 lh2Var, final i21 i21Var, jt1 jt1Var, final int i2) {
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-1849465391);
        j1b j1bVar = bj4VarO.a;
        int i3 = (i2 & 6) == 0 ? (bj4VarO.J(lh2Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.j(i21Var) ? 32 : 16;
        }
        boolean z = false;
        boolean z2 = true;
        if (bj4VarO.A(i3 & 1, (i3 & 19) != 18)) {
            int iD = i21Var.d();
            List<js7<String, String>> listI = i21Var.i();
            ArrayList arrayList = new ArrayList();
            int i4 = iD - 1;
            int size = listI.size();
            for (int i5 = i4; i5 < size; i5++) {
                arrayList.add(listI.get(i5));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(listI.get(i6));
            }
            wja wjaVarA = j0b.a(fk2.x, bj4VarO);
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = ir9.c(ir9.b(aVar, 0.0f, 48.0f, 1), 1.0f);
            ny8 ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
            int iD2 = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD2))) {
                qh.a(iD2, bj4VarO, iD2, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            bj4VarO.K(24563235);
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                final js7 js7Var = (js7) arrayList.get(i7);
                boolean zJ = bj4VarO.J(js7Var);
                Object objF = bj4VarO.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new oh4() { // from class: ii2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            ec9.b((String) js7Var.t, (hc9) obj);
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF);
                }
                ox6 ox6VarM = ir9.m(pb9.a(aVar, (oh4) objF), fk2.g, fk2.e, 0.0f, 0.0f, 12);
                y0a y0aVar = tg5.c;
                ox6 ox6VarK = ir9.k(((y43) bj4VarO.F(y0aVar)).t, ((y43) bj4VarO.F(y0aVar)).t, ox6VarM);
                fl6 fl6VarD = dv0.d(di.a.e, z);
                int iD3 = bj4VarO.D();
                kw7 kw7VarP2 = bj4VarO.P();
                ox6 ox6VarC3 = it1.c(bj4VarO, ox6VarK);
                bt1.c.getClass();
                qr5.a aVar3 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP2);
                bt1.a.b bVar2 = bt1.a.g;
                if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD3))) {
                    qh.a(iD3, bj4VarO, iD3, bVar2);
                }
                rd7.d(bj4VarO, bt1.a.d, ox6VarC3);
                bj4 bj4Var2 = bj4VarO;
                mia.b((String) js7Var.u, ir9.q(aVar), lh2Var.d, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wjaVarA, bj4Var2, 48, 0, 130040);
                bj4Var2.U(true);
                i7++;
                size2 = size2;
                z2 = true;
                bj4VarO = bj4Var2;
                arrayList = arrayList;
                aVar = aVar;
                j1bVar = j1bVar;
                z = false;
            }
            bj4Var = bj4VarO;
            bj4Var.U(z);
            bj4Var.U(z2);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ki2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iS = gz3.s(i2 | 1);
                    lj2.l(lh2Var, i21Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void m(final String str, final ox6 ox6Var, final boolean z, final boolean z2, final mh4<g2b> mh4Var, final boolean z3, final String str2, final lh2 lh2Var, jt1 jt1Var, final int i2) {
        Object objB;
        long j2;
        bj4 bj4VarO = jt1Var.o(-1153850597);
        int i3 = i2 | (bj4VarO.J(str) ? 4 : 2) | (bj4VarO.c(z) ? 256 : 128) | (bj4VarO.c(z2) ? 2048 : 1024) | (bj4VarO.j(mh4Var) ? 16384 : 8192) | (bj4VarO.c(z3) ? 131072 : 65536) | (bj4VarO.J(str2) ? 1048576 : 524288) | (bj4VarO.J(lh2Var) ? 8388608 : 4194304);
        if (bj4VarO.A(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z4 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (z4 || objF == c0187a) {
                objB = (!z2 || z) ? null : ws0.b(fk2.l, lh2Var.u);
                bj4VarO.C(objB);
            } else {
                objB = objF;
            }
            vs0 vs0Var = (vs0) objB;
            boolean z5 = (3670016 & i3) == 1048576;
            Object objF2 = bj4VarO.f();
            if (z5 || objF2 == c0187a) {
                objF2 = new oh4() { // from class: ui2
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        hc9 hc9Var = (hc9) obj;
                        iw iwVar = new iw(str2);
                        ho5<Object>[] ho5VarArr = ec9.a;
                        hc9Var.d(ac9.C, ws0.h(iwVar));
                        ec9.e(hc9Var, 0);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF2);
            }
            ox6 ox6VarB = pb9.b(ox6Var, true, (oh4) objF2);
            jl9 jl9VarB = wl9.b(fk2.D, bj4VarO);
            int i4 = i3 >> 6;
            int i5 = i4 & 14;
            if (z) {
                j2 = z3 ? lh2Var.l : lh2Var.m;
            } else {
                lh2Var.getClass();
                j2 = uh1.j;
            }
            v5a.b(z, mh4Var, ox6VarB, z3, jl9VarB, ((uh1) tq9.a(j2, zs4.e(wy6.v, bj4VarO), null, bj4VarO, 0, 12).getValue()).a, vs0Var, gr1.b(-564400443, new l(str, lh2Var, z2, z, z3), bj4VarO), bj4VarO, i5 | ((i3 >> 9) & 112) | (i4 & 7168), 1472);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(str, ox6Var, z, z2, mh4Var, z3, str2, lh2Var, i2) { // from class: vi2
                public final /* synthetic */ lh2 A;
                public final /* synthetic */ String t;
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ mh4 x;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ String z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(49);
                    lj2.m(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void n(final ox6 ox6Var, final long j2, final oh4<? super Integer, g2b> oh4Var, final s99 s99Var, final i21 i21Var, final fg5 fg5Var, final lh2 lh2Var, jt1 jt1Var, final int i2) {
        bj4 bj4VarO = jt1Var.o(-1286899812);
        int i3 = i2 | (bj4VarO.i(j2) ? 32 : 16) | (bj4VarO.j(oh4Var) ? 256 : 128) | (bj4VarO.J(s99Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.j(i21Var) ? 16384 : 8192) | (bj4VarO.j(fg5Var) ? 131072 : 65536) | (bj4VarO.J(lh2Var) ? 1048576 : 524288);
        if (bj4VarO.A(i3 & 1, (599187 & i3) != 599186)) {
            mia.a(j0b.a(fk2.A, bj4VarO), gr1.b(1301915789, new m(i21Var, j2, fg5Var, ox6Var, lh2Var, oh4Var, s99Var), bj4VarO), bj4VarO, 48);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(j2, oh4Var, s99Var, i21Var, fg5Var, lh2Var, i2) { // from class: oi2
                public final /* synthetic */ long u;
                public final /* synthetic */ oh4 v;
                public final /* synthetic */ s99 w;
                public final /* synthetic */ i21 x;
                public final /* synthetic */ fg5 y;
                public final /* synthetic */ lh2 z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(7);
                    lj2.n(this.t, this.u, this.v, this.w, this.x, this.y, this.z, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void o(mh4 mh4Var, boolean z, ox6 ox6Var, fr1 fr1Var, jt1 jt1Var, int i2) {
        int i3;
        ox6 ox6Var2;
        bj4 bj4VarO = jt1Var.o(-709923073);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.j(mh4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.c(z) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= bj4VarO.j(fr1Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if (bj4VarO.A(i4 & 1, (i4 & 1171) != 1170)) {
            zx8 zx8Var = ay8.a;
            ko7 ko7Var = zy0.a;
            ox6.a aVar = ox6.a.t;
            jz0.c(mh4Var, aVar, false, zx8Var, zy0.f(0L, ((uh1) bj4VarO.F(zy1.a)).a, bj4VarO, 13), null, gr1.b(1899489890, new dk2(fr1Var, z), bj4VarO), bj4VarO, (i4 & 14) | 807075840 | ((i4 >> 3) & 112), 388);
            bj4VarO = bj4VarO;
            ox6Var2 = aVar;
        } else {
            bj4VarO.u();
            ox6Var2 = ox6Var;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ni2(mh4Var, z, ox6Var2, fr1Var, i2);
        }
    }
}
