package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hwpo_training_app.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xna {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final d27 h;
    public static final d27 i;
    public static final d27 j;
    public static final float k;
    public static final float l;
    public static final float m;
    public static final float n;
    public static final float o;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ ioa t;
        public final /* synthetic */ xma u;

        public a(ioa ioaVar, xma xmaVar) {
            this.t = ioaVar;
            this.u = xmaVar;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            int iG;
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                ny8 ny8VarA = ly8.a(c30.a, di.a.j, jt1Var2, 0);
                int iD = jt1Var2.D();
                kw7 kw7VarY = jt1Var2.y();
                ox6.a aVar = ox6.a.t;
                ox6 ox6VarC = it1.c(jt1Var2, aVar);
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
                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                bt1.a.b bVar = bt1.a.g;
                if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                    rh.b(iD, jt1Var2, iD, bVar);
                }
                rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                float f = y48.S;
                float f2 = y48.Q;
                ox6 ox6VarK = ir9.k(f, f2, aVar);
                ioa ioaVar = this.t;
                if (ioaVar.f()) {
                    iG = ioaVar.g() % 24;
                } else if (ioaVar.g() % 12 == 0) {
                    iG = 12;
                } else {
                    iG = xna.r(ioaVar) ? ioaVar.g() - 12 : ioaVar.g();
                }
                xma xmaVar = this.u;
                xna.k(ox6VarK, iG, ioaVar, 0, xmaVar, jt1Var2, 3078);
                xna.e(ir9.k(xna.e, y48.O, aVar), jt1Var2, 6);
                xna.k(ir9.k(f, f2, aVar), ioaVar.c(), ioaVar, 1, xmaVar, jt1Var2, 3078);
                jt1Var2.I();
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements ei4<uf5, jt1, Integer, g2b> {
        public final /* synthetic */ xma t;
        public final /* synthetic */ qi u;
        public final /* synthetic */ boolean v;

        public b(xma xmaVar, qi qiVar, boolean z) {
            this.t = xmaVar;
            this.u = qiVar;
            this.v = z;
        }

        @Override // defpackage.ei4
        public final g2b invoke(uf5 uf5Var, jt1 jt1Var, Integer num) {
            uf5 uf5Var2 = uf5Var;
            jt1 jt1Var2 = jt1Var;
            num.intValue();
            ox6 ox6VarJ = ir9.j(ox6.a.t, y48.x);
            Object objF = jt1Var2.f();
            if (objF == jt1.a.a) {
                objF = new xe6(1);
                jt1Var2.C(objF);
            }
            xna.a(pb9.b(ox6VarJ, false, (oh4) objF), xna.a, gr1.b(-99063847, new coa(this.t, uf5Var2, this.u, this.v), jt1Var2), jt1Var2, 432);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", l = {1769}, m = "invokeSuspend")
    public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ qi u;
        public final /* synthetic */ float v;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ h37<vf7> x;
        public final /* synthetic */ h37<bg5> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qi qiVar, float f, boolean z, h37<vf7> h37Var, h37<bg5> h37Var2, r02<? super c> r02Var) {
            super(2, r02Var);
            this.u = qiVar;
            this.v = f;
            this.w = z;
            this.x = h37Var;
            this.y = h37Var2;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new c(this.u, this.v, this.w, this.x, this.y, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                float f = xna.a;
                h37<vf7> h37Var = this.x;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (h37Var.getValue().a >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (h37Var.getValue().a & 4294967295L));
                long j = this.y.getValue().a;
                fu9 fu9Var = new fu9();
                this.t = 1;
                Object objP = xna.p(this.u, fIntBitsToFloat, fIntBitsToFloat2, this.v, this.w, j, fu9Var, this);
                v72 v72Var = v72.t;
                if (objP == v72Var) {
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
    public static final class d implements fl6 {
        public static final d a = new d();

        @Override // defpackage.fl6
        public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cl6 cl6Var = list.get(i);
                if (xj5.a(yq5.c(cl6Var), "Spacer")) {
                    final jz7 jz7VarE = cl6Var.E(xx1.a(0, hl6Var.n1(y48.K), 0, 0, 12, j));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        cl6 cl6Var2 = list.get(i2);
                        if (!xj5.a(yq5.c(cl6Var2), "Spacer")) {
                            arrayList.add(cl6Var2);
                        }
                    }
                    final ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        arrayList2.add(((cl6) arrayList.get(i3)).E(xx1.a(0, xx1.h(j) / 2, 0, 0, 12, j)));
                    }
                    return hl6Var.y0(xx1.h(j), xx1.g(j), if3.t, new oh4() { // from class: doa
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            jz7.a aVar = (jz7.a) obj;
                            ArrayList arrayList3 = arrayList2;
                            aVar.l((jz7) arrayList3.get(0), 0, 0, 0.0f);
                            aVar.l((jz7) arrayList3.get(1), ((jz7) arrayList3.get(0)).t, 0, 0.0f);
                            int i4 = ((jz7) arrayList3.get(0)).t;
                            jz7 jz7Var = jz7VarE;
                            aVar.l(jz7Var, i4 - (jz7Var.t / 2), 0, 0.0f);
                            return g2b.a;
                        }
                    });
                }
            }
            ab6.b("Collection contains no element matching the predicate.");
            fl.a();
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ int t;
        public final /* synthetic */ ioa u;
        public final /* synthetic */ int v;
        public final /* synthetic */ long w;

        public e(int i, ioa ioaVar, int i2, long j) {
            this.t = i;
            this.u = ioaVar;
            this.v = i2;
            this.w = j;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            int i = 2;
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                boolean zF = this.u.f();
                int i2 = this.t;
                int i3 = this.v;
                String strT = xna.t(i2, zF, i3, jt1Var2);
                fl6 fl6VarD = dv0.d(di.a.e, false);
                int iD = jt1Var2.D();
                kw7 kw7VarY = jt1Var2.y();
                ox6.a aVar = ox6.a.t;
                ox6 ox6VarC = it1.c(jt1Var2, aVar);
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
                rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                boolean zJ = jt1Var2.J(strT);
                Object objF = jt1Var2.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new b32(i, strT);
                    jt1Var2.C(objF);
                }
                mia.b(h21.a(i3, null, 14), pb9.b(aVar, false, (oh4) objF), this.w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262136);
                jt1Var2.I();
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements fl6 {
        public static final f a = new f();

        @Override // defpackage.fl6
        public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cl6 cl6Var = list.get(i);
                if (xj5.a(yq5.c(cl6Var), "Spacer")) {
                    final jz7 jz7VarE = cl6Var.E(xx1.a(0, 0, 0, hl6Var.n1(y48.K), 3, j));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        cl6 cl6Var2 = list.get(i2);
                        if (!xj5.a(yq5.c(cl6Var2), "Spacer")) {
                            arrayList.add(cl6Var2);
                        }
                    }
                    final ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        arrayList2.add(((cl6) arrayList.get(i3)).E(xx1.a(0, 0, 0, xx1.g(j) / 2, 3, j)));
                    }
                    return hl6Var.y0(xx1.h(j), xx1.g(j), if3.t, new oh4() { // from class: foa
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            jz7.a aVar = (jz7.a) obj;
                            ArrayList arrayList3 = arrayList2;
                            aVar.l((jz7) arrayList3.get(0), 0, 0, 0.0f);
                            aVar.l((jz7) arrayList3.get(1), 0, ((jz7) arrayList3.get(0)).u, 0.0f);
                            int i4 = ((jz7) arrayList3.get(0)).u;
                            jz7 jz7Var = jz7VarE;
                            aVar.l(jz7Var, 0, i4 - (jz7Var.u / 2), 0.0f);
                            return g2b.a;
                        }
                    });
                }
            }
            ab6.b("Collection contains no element matching the predicate.");
            fl.a();
            return null;
        }
    }

    static {
        float f2 = y48.x;
        a = 101.0f / f2;
        b = 69.0f / f2;
        c = 36.0f;
        d = 24.0f;
        e = 24.0f;
        f = 74.0f;
        g = 48.0f;
        h = vf5.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        d27 d27VarA = vf5.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        i = d27VarA;
        d27 d27Var = new d27(d27VarA.b);
        int[] iArr = d27VarA.a;
        int i2 = d27VarA.b;
        for (int i3 = 0; i3 < i2; i3++) {
            d27Var.c((iArr[i3] % 12) + 12);
        }
        j = d27Var;
        k = 12.0f;
        l = 384.0f;
        m = 330.0f;
        n = 238.0f;
        o = 200.0f;
    }

    public static final void a(final ox6 ox6Var, final float f2, final fr1 fr1Var, jt1 jt1Var, final int i2) {
        bj4 bj4VarO = jt1Var.o(-1041042571);
        int i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i2;
        if (bj4VarO.A(i3 & 1, (i3 & 147) != 146)) {
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new wna(f2);
                bj4VarO.C(objF);
            }
            fl6 fl6Var = (fl6) objF;
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
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
            rd7.d(bj4VarO, bt1.a.f, fl6Var);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            fr1Var.invoke(bj4VarO, 6);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(f2, fr1Var, i2) { // from class: jna
                public final /* synthetic */ float u;
                public final /* synthetic */ fr1 v;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(433);
                    xna.a(this.t, this.u, this.v, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final ioa ioaVar, final xma xmaVar, jt1 jt1Var, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(-934561141);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? bj4VarO.J(ioaVar) : bj4VarO.j(ioaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.J(xmaVar) ? 32 : 16;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 19) != 18)) {
            nu1.b(new kf8[]{mia.a.a(j0b.a(y48.T, bj4VarO)), qu1.n.a(tq5.t)}, gr1.b(-477913269, new a(ioaVar, xmaVar), bj4VarO), bj4VarO, 56);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: una
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iS = gz3.s(i2 | 1);
                    xna.b(ioaVar, xmaVar, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void c(int i2, final qi qiVar, jt1 jt1Var, ox6 ox6Var, final xma xmaVar, boolean z) {
        int i3;
        bj4 bj4VarO = jt1Var.o(-478841003);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.j(qiVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.J(xmaVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bj4VarO.c(z) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 1171) != 1170)) {
            zb2.b(qiVar.a.e() == 1 ? h : i, z63.e(gi0.c(ox6Var, xmaVar.a, ay8.a).H(new wf1(qiVar, z, qiVar.a.e(), zs4.e(wy6.t, bj4VarO))), new oh4() { // from class: ana
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    cz1 cz1Var = (cz1) obj;
                    qi qiVar2 = qiVar;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(cz1Var.U0(b53.a(xna.q(qiVar2))))) << 32) | (((long) Float.floatToRawIntBits(cz1Var.U0(b53.b(xna.q(qiVar2))))) & 4294967295L);
                    float fU0 = ((cz1Var.U0(y48.C) / 2.0f) * cz1Var.n1(qiVar2.i())) / cz1Var.n1(y48.x);
                    xma xmaVar2 = xmaVar;
                    long j2 = xmaVar2.b;
                    d73.N(cz1Var, uh1.b, fU0, jFloatToRawIntBits, 0, 56);
                    cz1Var.K1();
                    d73.N(cz1Var, j2, fU0, jFloatToRawIntBits, 11, 56);
                    float fU1 = cz1Var.U0(y48.D);
                    float fCos = ((float) Math.cos(qiVar2.f.d().floatValue())) * fU0;
                    cz1Var.H1(j2, p50.c(cz1Var.c()), vf7.d(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(((float) Math.sin(qiVar2.f.d().floatValue())) * fU0)) & 4294967295L) | (Float.floatToRawIntBits(fCos) << 32)), fU1, (480 & 16) != 0 ? 0 : 0, 3);
                    d73.N(cz1Var, j2, cz1Var.U0(y48.A) / 2.0f, p50.c(cz1Var.c()), 0, 120);
                    d73.N(cz1Var, xmaVar2.e, fU0, jFloatToRawIntBits, 4, 56);
                    return g2b.a;
                }
            }), zs4.e(wy6.v, bj4VarO), null, gr1.b(747010833, new b(xmaVar, qiVar, z), bj4VarO), bj4VarO, 24576);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ni2(i2, qiVar, ox6Var, xmaVar, z);
        }
    }

    public static final void d(final ox6 ox6Var, final qi qiVar, final int i2, final boolean z, jt1 jt1Var, final int i3) {
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-206784607);
        int i4 = i3 | (bj4VarO.J(ox6Var) ? 4 : 2) | (bj4VarO.j(qiVar) ? 32 : 16) | (bj4VarO.h(i2) ? 256 : 128) | (bj4VarO.c(z) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
        if (bj4VarO.A(i4 & 1, (i4 & 1171) != 1170)) {
            wja wjaVarA = j0b.a(y48.y, bj4VarO);
            final tx2 tx2Var = (tx2) bj4VarO.F(qu1.h);
            final float fU0 = tx2Var.U0(f);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(new vf7(0L));
                bj4VarO.C(objF);
            }
            final h37 h37Var = (h37) objF;
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = bl7.i(new bg5(0L));
                bj4VarO.C(objF2);
            }
            final h37 h37Var2 = (h37) objF2;
            Object objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = bl7.i(sk8.e);
                bj4VarO.C(objF3);
            }
            final h37 h37Var3 = (h37) objF3;
            Object objF4 = bj4VarO.f();
            if (objF4 == c0187a) {
                c33 c33Var = wd3.a;
                objF4 = m78.a(bj4VarO.x(), bj4VarO);
            }
            final t72 t72Var = (t72) objF4;
            final String strT = t(qiVar.a.e(), qiVar.a.f(), i2, bj4VarO);
            String strA = h21.a(i2, null, 15);
            boolean zJ = bj4VarO.J(qiVar);
            Object objF5 = bj4VarO.f();
            if (zJ || objF5 == c0187a) {
                objF5 = bl7.f(new mh4() { // from class: kna
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        long jQ = xna.q(qiVar);
                        float fA = b53.a(jQ);
                        tx2 tx2Var2 = tx2Var;
                        float fU1 = tx2Var2.U0(fA);
                        float fU2 = tx2Var2.U0(b53.b(jQ));
                        return Boolean.valueOf(((sk8) h37Var3.getValue()).a((Float.floatToRawIntBits(fU1) << 32) | (Float.floatToRawIntBits(fU2) & 4294967295L)));
                    }
                });
                bj4VarO.C(objF5);
            }
            final yz9 yz9Var = (yz9) objF5;
            Object objF6 = bj4VarO.f();
            if (objF6 == c0187a) {
                objF6 = new mba(h37Var2, h37Var3, h37Var);
                bj4VarO.C(objF6);
            }
            ox6 ox6VarB = oh7.b(ox6Var, (oh4) objF6);
            e15 e15Var = tg5.a;
            ox6 ox6VarA = ia4.a(ir9.j(ox6VarB.H(iv6.t), g), true, null);
            boolean zJ2 = bj4VarO.j(t72Var) | bj4VarO.j(qiVar) | bj4VarO.g(fU0) | ((i4 & 7168) == 2048) | bj4VarO.J(yz9Var);
            Object objF7 = bj4VarO.f();
            if (zJ2 || objF7 == c0187a) {
                oh4 oh4Var = new oh4() { // from class: lna
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        hc9 hc9Var = (hc9) obj;
                        final t72 t72Var2 = t72Var;
                        final qi qiVar2 = qiVar;
                        final float f2 = fU0;
                        final boolean z2 = z;
                        final h37 h37Var4 = h37Var;
                        final h37 h37Var5 = h37Var2;
                        mh4 mh4Var = new mh4() { // from class: pna
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                oy0.d(t72Var2, null, null, new xna.c(qiVar2, f2, z2, h37Var4, h37Var5, null), 3);
                                return Boolean.TRUE;
                            }
                        };
                        ho5<Object>[] ho5VarArr = ec9.a;
                        hc9Var.d(kb9.b, new k3(null, mh4Var));
                        ec9.f(hc9Var, ((Boolean) yz9Var.getValue()).booleanValue());
                        return g2b.a;
                    }
                };
                bj4VarO.C(oh4Var);
                objF7 = oh4Var;
            }
            ox6 ox6VarB2 = pb9.b(ox6VarA, true, (oh4) objF7);
            fl6 fl6VarD = dv0.d(di.a.e, false);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarB2);
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
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            boolean zJ3 = bj4VarO.J(strT);
            Object objF8 = bj4VarO.f();
            if (zJ3 || objF8 == c0187a) {
                objF8 = new oh4() { // from class: mna
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        ec9.b(strT, (hc9) obj);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF8);
            }
            mia.b(strA, pb9.a(ox6.a.t, (oh4) objF8), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4VarO, 0, 0, 131068);
            bj4Var = bj4VarO;
            bj4Var.U(true);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(qiVar, i2, z, i3) { // from class: nna
                public final /* synthetic */ qi u;
                public final /* synthetic */ int v;
                public final /* synthetic */ boolean w;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    xna.d(this.t, this.u, this.v, this.w, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void e(final ox6 ox6Var, jt1 jt1Var, final int i2) {
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(2100674302);
        if (bj4VarO.A(i2 & 1, (i2 & 3) != 2)) {
            wja wjaVarA = wja.a((wja) bj4VarO.F(mia.a), 0L, 0L, null, null, 0L, 0L, null, new e86(17, e86.a.b, 0), 15695871);
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new b50(3);
                bj4VarO.C(objF);
            }
            ox6 ox6VarA = pb9.a(ox6Var, (oh4) objF);
            fl6 fl6VarD = dv0.d(di.a.e, false);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarA);
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
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            mia.b(":", null, hi1.d(uma.a, bj4VarO), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wjaVarA, bj4VarO, 6, 0, 131066);
            bj4Var = bj4VarO;
            bj4Var.U(true);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(i2) { // from class: ena
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(7);
                    xna.e(this.t, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void f(final ioa ioaVar, final xma xmaVar, jt1 jt1Var, final int i2) {
        int i3;
        boolean z;
        bj4 bj4VarO = jt1Var.o(755539561);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? bj4VarO.J(ioaVar) : bj4VarO.j(ioaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.J(xmaVar) ? 32 : 16;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 19) != 18)) {
            aj1 aj1VarA = yi1.a(c30.d, di.a.m, bj4VarO, 6);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = it1.c(bj4VarO, aVar);
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
            bt1.a.c cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, aj1VarA);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            b(ioaVar, xmaVar, bj4VarO, i3 & 126);
            if (ioaVar.f()) {
                z = true;
                bj4VarO.K(999020143);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(998576161);
                ox6 ox6VarM = eo7.m(aVar, 0.0f, k, 0.0f, 0.0f, 13);
                fl6 fl6VarD = dv0.d(di.a.a, false);
                int iD2 = bj4VarO.D();
                kw7 kw7VarP2 = bj4VarO.P();
                ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarM);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD2))) {
                    qh.a(iD2, bj4VarO, iD2, bVar);
                }
                rd7.d(bj4VarO, dVar, ox6VarC2);
                int i4 = i3 << 3;
                g(ir9.k(y48.I, y48.H, aVar), ioaVar, xmaVar, bj4VarO, (i4 & 896) | (i4 & 112) | 6);
                z = true;
                bj4VarO.U(true);
                bj4VarO.U(false);
            }
            bj4VarO.U(z);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: tna
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iS = gz3.s(i2 | 1);
                    xna.f(ioaVar, xmaVar, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void g(final ox6 ox6Var, final ioa ioaVar, final xma xmaVar, jt1 jt1Var, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(1261215927);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? bj4VarO.J(ioaVar) : bj4VarO.j(ioaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.J(xmaVar) ? 256 : 128;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 147) != 146)) {
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = d.a;
                bj4VarO.C(objF);
            }
            jl9 jl9VarB = wl9.b(y48.G, bj4VarO);
            jl9VarB.getClass();
            b72 b72Var = (b72) jl9VarB;
            z43 z43Var = ol9.i;
            i(ox6Var, ioaVar, xmaVar, (fl6) objF, b72.b(b72Var, null, z43Var, z43Var, null, 9), b72.b(b72Var, z43Var, null, null, z43Var, 6), bj4VarO, (i3 & 896) | (i3 & 14) | 3072 | (i3 & 112));
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: zma
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iS = gz3.s(i2 | 1);
                    xna.g(ox6Var, ioaVar, xmaVar, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void h(final int i2, qi qiVar, jt1 jt1Var, final ox6 ox6Var, final xma xmaVar, final boolean z) {
        int i3;
        final qi qiVar2;
        bj4 bj4VarO = jt1Var.o(1432307537);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.j(qiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.J(xmaVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bj4VarO.c(z) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 1171) != 1170)) {
            bj4VarO.v0();
            if ((i2 & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new xk3(4);
                bj4VarO.C(objF);
            }
            ox6 ox6VarB = pb9.b(ox6Var, false, (oh4) objF);
            ny8 ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarB);
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
            f(qiVar, xmaVar, bj4VarO, (i3 & 14) | ((i3 >> 3) & 112));
            b47.b(bj4VarO, ir9.n(ox6.a.t, c));
            c(((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168), qiVar, bj4VarO, new cg1(), xmaVar, z);
            qiVar2 = qiVar;
            bj4VarO.U(true);
        } else {
            qiVar2 = qiVar;
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: rna
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xna.h(gz3.s(i2 | 1), qiVar2, (jt1) obj, ox6Var, xmaVar, z);
                    return g2b.a;
                }
            };
        }
    }

    public static final void i(final ox6 ox6Var, final ioa ioaVar, final xma xmaVar, final fl6 fl6Var, final jl9 jl9Var, final jl9 jl9Var2, jt1 jt1Var, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(1374241901);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? bj4VarO.J(ioaVar) : bj4VarO.j(ioaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.J(xmaVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bj4VarO.J(fl6Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bj4VarO.J(jl9Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bj4VarO.J(jl9Var2) ? 131072 : 65536;
        }
        int i4 = i3;
        boolean z = false;
        if (bj4VarO.A(i4 & 1, (74899 & i4) != 74898)) {
            vs0 vs0VarB = ws0.b(y48.K, xmaVar.d);
            jl9 jl9VarB = wl9.b(y48.G, bj4VarO);
            jl9VarB.getClass();
            b72 b72Var = (b72) jl9VarB;
            final String strB = ws3.b(bj4VarO, R.string.m3c_time_picker_period_toggle_description);
            boolean zJ = bj4VarO.J(strB);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new oh4() { // from class: fna
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        hc9 hc9Var = (hc9) obj;
                        ec9.h(hc9Var);
                        ec9.b(strB, hc9Var);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            }
            ox6 ox6VarB = ns0.b(pb9.b(pb9.b(ox6Var, false, (oh4) objF), false, new c42(4)), vs0VarB.a, vs0VarB.b, b72Var);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarB);
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
            rd7.d(bj4VarO, bt1.a.f, fl6Var);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            boolean z2 = !r(ioaVar);
            int i5 = i4 & 112;
            boolean z3 = i5 == 32 || ((i4 & 64) != 0 && bj4VarO.j(ioaVar));
            Object objF2 = bj4VarO.f();
            if (z3 || objF2 == c0187a) {
                objF2 = new q59(1, ioaVar);
                bj4VarO.C(objF2);
            }
            int i6 = (i4 << 3) & 7168;
            l(z2, jl9Var, (mh4) objF2, xmaVar, cs1.a, bj4VarO, ((i4 >> 9) & 112) | 24576 | i6);
            b47.b(bj4VarO, gi0.c(yq5.d(ox6.a.t, "Spacer").H(new ftb(2.0f)).H(ir9.c), xmaVar.d, al8.a));
            boolean zR = r(ioaVar);
            if (i5 == 32 || ((i4 & 64) != 0 && bj4VarO.j(ioaVar))) {
                z = true;
            }
            Object objF3 = bj4VarO.f();
            if (z || objF3 == c0187a) {
                objF3 = new mh4() { // from class: hna
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        ioa ioaVar2 = ioaVar;
                        if (!xna.r(ioaVar2)) {
                            ioaVar2.a(ioaVar2.g() + 12);
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF3);
            }
            l(zR, jl9Var2, (mh4) objF3, xmaVar, cs1.b, bj4VarO, ((i4 >> 12) & 112) | 24576 | i6);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ina
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xna.i(ox6Var, ioaVar, xmaVar, fl6Var, jl9Var, jl9Var2, (jt1) obj, gz3.s(i2 | 1));
                    return g2b.a;
                }
            };
        }
    }

    public static final void j(final ioa ioaVar, ox6 ox6Var, xma xmaVar, int i2, jt1 jt1Var, final int i3) {
        final ox6 ox6Var2;
        final xma xmaVar2;
        final int i4;
        int i5;
        int i6;
        xma xmaVar3;
        ox6 ox6Var3;
        xma xmaVar4;
        bj4 bj4VarO = jt1Var.o(-619286452);
        int i7 = i3 | (bj4VarO.J(ioaVar) ? 4 : 2) | 1200;
        if (bj4VarO.A(i7 & 1, (i7 & 1171) != 1170)) {
            bj4VarO.v0();
            if ((i3 & 1) == 0 || bj4VarO.c0()) {
                fi1 fi1Var = (fi1) bj4VarO.F(hi1.a);
                xma xmaVar5 = fi1Var.g0;
                if (xmaVar5 == null) {
                    xma xmaVar6 = new xma(hi1.c(fi1Var, y48.w), hi1.c(fi1Var, y48.B), hi1.c(fi1Var, y48.F), hi1.c(fi1Var, y48.J), hi1.c(fi1Var, y48.z), hi1.c(fi1Var, y48.E), hi1.c(fi1Var, y48.L), uh1.j, hi1.c(fi1Var, y48.M), hi1.c(fi1Var, y48.N), hi1.c(fi1Var, y48.U), hi1.c(fi1Var, y48.W), hi1.c(fi1Var, y48.V), hi1.c(fi1Var, y48.X));
                    fi1Var.g0 = xmaVar6;
                    xmaVar5 = xmaVar6;
                }
                Configuration configuration = (Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a);
                i5 = configuration.screenHeightDp < configuration.screenWidthDp ? 0 : 1;
                i6 = i7 & (-8065);
                xmaVar3 = xmaVar5;
                ox6Var3 = ox6.a.t;
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var;
                i5 = i2;
                i6 = i7 & (-8065);
                xmaVar3 = xmaVar;
            }
            bj4VarO.V();
            cb6 cb6VarB = r4.b(0, bj4VarO, 7);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = new hl8();
                bj4VarO.C(objF);
            }
            hl8 hl8Var = (hl8) objF;
            int i8 = i6 & 14;
            boolean z = i8 == 4;
            Object objF2 = bj4VarO.f();
            if (z || objF2 == c0187a) {
                objF2 = new qi(ioaVar, hl8Var);
                bj4VarO.C(objF2);
            }
            qi qiVar = (qi) objF2;
            Integer numValueOf = Integer.valueOf(ioaVar.g());
            Integer numValueOf2 = Integer.valueOf(ioaVar.c());
            boolean zJ = (i8 == 4) | bj4VarO.j(hl8Var) | bj4VarO.j(qiVar);
            Object objF3 = bj4VarO.f();
            if (zJ || objF3 == c0187a) {
                objF3 = new eoa(hl8Var, qiVar, ioaVar, null);
                bj4VarO.C(objF3);
            }
            wd3.f(numValueOf, numValueOf2, (ci4) objF3, bj4VarO);
            if (i5 == 1) {
                bj4VarO.K(2017551219);
                xmaVar4 = xmaVar3;
                o(48, qiVar, bj4VarO, ox6Var3, xmaVar4, !((Boolean) cb6VarB.getValue()).booleanValue());
                bj4VarO.U(false);
            } else {
                bj4VarO.K(2017750673);
                xmaVar4 = xmaVar3;
                h(48, qiVar, bj4VarO, ox6Var3, xmaVar4, !((Boolean) cb6VarB.getValue()).booleanValue());
                bj4VarO.U(false);
            }
            ox6Var2 = ox6Var3;
            xmaVar2 = xmaVar4;
            i4 = i5;
        } else {
            bj4VarO.u();
            ox6Var2 = ox6Var;
            xmaVar2 = xmaVar;
            i4 = i2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(ox6Var2, xmaVar2, i4, i3) { // from class: yma
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ xma v;
                public final /* synthetic */ int w;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    xna.j(this.t, this.u, this.v, this.w, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void k(final ox6 ox6Var, final int i2, final ioa ioaVar, final int i3, final xma xmaVar, jt1 jt1Var, final int i4) {
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-1148055889);
        int i5 = i4 | (bj4VarO.h(i2) ? 32 : 16) | (bj4VarO.J(ioaVar) ? 256 : 128) | (bj4VarO.J(xmaVar) ? 16384 : 8192);
        if (bj4VarO.A(i5 & 1, (i5 & 9363) != 9362)) {
            boolean z = ioaVar.e() == i3;
            String strB = ws3.b(bj4VarO, i3 == 0 ? R.string.m3c_time_picker_hour_selection : R.string.m3c_time_picker_minute_selection);
            long j2 = z ? xmaVar.k : xmaVar.l;
            long j3 = z ? xmaVar.m : xmaVar.n;
            boolean zJ = bj4VarO.J(strB);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new i2(3, strB);
                bj4VarO.C(objF);
            }
            ox6 ox6VarB = pb9.b(ox6Var, true, (oh4) objF);
            jl9 jl9VarB = wl9.b(y48.R, bj4VarO);
            boolean z2 = (i5 & 896) == 256;
            Object objF2 = bj4VarO.f();
            if (z2 || objF2 == c0187a) {
                objF2 = new mh4() { // from class: cna
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        ioa ioaVar2 = ioaVar;
                        int iE = ioaVar2.e();
                        int i6 = i3;
                        if (i6 != iE) {
                            ioaVar2.d(i6);
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4Var = bj4VarO;
            v5a.b(z, (mh4) objF2, ox6VarB, false, jl9VarB, j2, null, gr1.b(-1477282471, new e(i3, ioaVar, i2, j3), bj4VarO), bj4Var, 0, 1992);
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(i2, ioaVar, i3, xmaVar, i4) { // from class: dna
                public final /* synthetic */ int u;
                public final /* synthetic */ ioa v;
                public final /* synthetic */ int w;
                public final /* synthetic */ xma x;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(3079);
                    xna.k(this.t, this.u, this.v, this.w, this.x, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void l(final boolean z, jl9 jl9Var, mh4 mh4Var, xma xmaVar, fr1 fr1Var, jt1 jt1Var, int i2) {
        int i3;
        jl9 jl9Var2;
        mh4 mh4Var2;
        bj4 bj4VarO = jt1Var.o(1523811083);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.c(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            jl9Var2 = jl9Var;
            i3 |= bj4VarO.J(jl9Var2) ? 32 : 16;
        } else {
            jl9Var2 = jl9Var;
        }
        if ((i2 & 384) == 0) {
            mh4Var2 = mh4Var;
            i3 |= bj4VarO.j(mh4Var2) ? 256 : 128;
        } else {
            mh4Var2 = mh4Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bj4VarO.J(xmaVar) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bj4VarO.j(fr1Var) ? 16384 : 8192;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 9363) != 9362)) {
            long j2 = z ? xmaVar.i : xmaVar.j;
            long j3 = z ? xmaVar.g : xmaVar.h;
            ox6 ox6VarH = new ftb(z ? 0.0f : 1.0f).H(ir9.c);
            boolean z2 = (i3 & 14) == 4;
            Object objF = bj4VarO.f();
            if (z2 || objF == jt1.a.a) {
                objF = new oh4() { // from class: ona
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        ec9.f((hc9) obj, z);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            }
            mh4 mh4Var3 = mh4Var2;
            jz0.c(mh4Var3, pb9.b(ox6VarH, false, (oh4) objF), false, jl9Var2, zy0.f(j3, j2, bj4VarO, 12), new ko7(0.0f, 0.0f, 0.0f, 0.0f), fr1Var, bj4VarO, ((i3 >> 6) & 14) | 12582912 | ((i3 << 6) & 7168) | ((i3 << 15) & 1879048192), 356);
            bj4VarO = bj4VarO;
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new hi2(z, jl9Var, mh4Var, xmaVar, fr1Var, i2);
        }
    }

    public static final void m(final ioa ioaVar, final xma xmaVar, jt1 jt1Var, final int i2) {
        int i3;
        boolean z;
        bj4 bj4VarO = jt1Var.o(2054675515);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? bj4VarO.J(ioaVar) : bj4VarO.j(ioaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.J(xmaVar) ? 32 : 16;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 19) != 18)) {
            ny8 ny8VarA = ly8.a(c30.d, di.a.j, bj4VarO, 6);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = it1.c(bj4VarO, aVar);
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
            bt1.a.c cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, ny8VarA);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            b(ioaVar, xmaVar, bj4VarO, i3 & 126);
            if (ioaVar.f()) {
                z = true;
                bj4VarO.K(1364727499);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(1364287361);
                ox6 ox6VarM = eo7.m(aVar, k, 0.0f, 0.0f, 0.0f, 14);
                fl6 fl6VarD = dv0.d(di.a.a, false);
                int iD2 = bj4VarO.D();
                kw7 kw7VarP2 = bj4VarO.P();
                ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarM);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD2))) {
                    qh.a(iD2, bj4VarO, iD2, bVar);
                }
                rd7.d(bj4VarO, dVar, ox6VarC2);
                int i4 = i3 << 3;
                n(ir9.k(y48.P, y48.O, aVar), ioaVar, xmaVar, bj4VarO, (i4 & 896) | (i4 & 112) | 6);
                z = true;
                bj4VarO.U(true);
                bj4VarO.U(false);
            }
            bj4VarO.U(z);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: sna
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iS = gz3.s(i2 | 1);
                    xna.m(ioaVar, xmaVar, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void n(final ox6 ox6Var, final ioa ioaVar, final xma xmaVar, jt1 jt1Var, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(-1898918107);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? bj4VarO.J(ioaVar) : bj4VarO.j(ioaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.J(xmaVar) ? 256 : 128;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 147) != 146)) {
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = f.a;
                bj4VarO.C(objF);
            }
            fl6 fl6Var = (fl6) objF;
            jl9 jl9VarB = wl9.b(y48.G, bj4VarO);
            jl9VarB.getClass();
            b72 b72Var = (b72) jl9VarB;
            b72 b72VarC = wl9.c(b72Var);
            z43 z43Var = ol9.i;
            i(ox6Var, ioaVar, xmaVar, fl6Var, b72VarC, b72.b(b72Var, z43Var, z43Var, null, null, 12), bj4VarO, (i3 & 896) | (i3 & 14) | 3072 | (i3 & 112));
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: bna
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iS = gz3.s(i2 | 1);
                    xna.n(ox6Var, ioaVar, xmaVar, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void o(final int i2, qi qiVar, jt1 jt1Var, final ox6 ox6Var, final xma xmaVar, final boolean z) {
        int i3;
        final qi qiVar2;
        bj4 bj4VarO = jt1Var.o(1249591487);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.j(qiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.J(xmaVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bj4VarO.c(z) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 1171) != 1170)) {
            bj4VarO.v0();
            if ((i2 & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new b60(3);
                bj4VarO.C(objF);
            }
            ox6 ox6VarB = pb9.b(ox6Var, false, (oh4) objF);
            aj1 aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarB);
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
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            m(qiVar, xmaVar, bj4VarO, (i3 & 14) | ((i3 >> 3) & 112));
            float f2 = c;
            ox6.a aVar2 = ox6.a.t;
            b47.b(bj4VarO, ir9.d(aVar2, f2));
            c(((i3 << 3) & 112) | 6 | (i3 & 896) | (i3 & 7168), qiVar, bj4VarO, ir9.j(aVar2, y48.x), xmaVar, z);
            qiVar2 = qiVar;
            b47.b(bj4VarO, ir9.d(aVar2, d));
            bj4VarO.U(true);
        } else {
            qiVar2 = qiVar;
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: qna
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xna.o(gz3.s(i2 | 1), qiVar2, (jt1) obj, ox6Var, xmaVar, z);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, java.lang.Boolean] */
    public static final Object p(qi qiVar, float f2, float f3, float f4, boolean z, long j2, wv wvVar, u02 u02Var) {
        goa goaVar;
        float f5;
        float fRint;
        boolean z2;
        int i2;
        qi qiVar2;
        boolean z3;
        if (u02Var instanceof goa) {
            goaVar = (goa) u02Var;
            int i3 = goaVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                goaVar.w = i3 - Integer.MIN_VALUE;
            } else {
                goaVar = new goa(u02Var);
            }
        } else {
            goaVar = new goa(u02Var);
        }
        goa goaVar2 = goaVar;
        Object obj = goaVar2.v;
        int i4 = goaVar2.w;
        Object obj2 = v72.t;
        if (i4 != 0) {
            if (i4 == 1) {
                boolean z4 = goaVar2.u;
                qiVar2 = goaVar2.t;
                dv8.b(obj);
                z2 = z4;
                i2 = 1;
            } else {
                if (i4 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z3 = goaVar2.u;
                qiVar2 = goaVar2.t;
                dv8.b(obj);
                i2 = 1;
            }
            z2 = z3;
            if (z2) {
                qiVar2.d(i2);
            }
            return g2b.a;
        }
        dv8.b(obj);
        float fAtan2 = ((float) Math.atan2(f3 - ((int) (j2 & 4294967295L)), f2 - ((int) (j2 >> 32)))) - 1.5707964f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 6.2831855f;
        }
        if (qiVar.a.e() == 1) {
            f5 = 0.10471976f;
            fRint = ((float) Math.rint((fAtan2 / 0.10471976f) / 5.0f)) * 5.0f;
        } else {
            f5 = 0.5235988f;
            fRint = (float) Math.rint(fAtan2 / 0.5235988f);
        }
        float f6 = fRint * f5;
        s(qiVar, f2, f3, f4, j2);
        goaVar2.t = qiVar;
        z2 = z;
        goaVar2.u = z2;
        goaVar2.w = 1;
        qiVar.b.a = Boolean.FALSE;
        w37 w37Var = qiVar.g;
        i2 = 1;
        pi piVar = new pi(qiVar, f6, true, wvVar, null);
        w37Var.getClass();
        Object objD = u72.d(new t37(o37.u, w37Var, piVar, null), goaVar2);
        if (objD != obj2) {
            objD = g2b.a;
        }
        if (objD != obj2) {
            qiVar2 = qiVar;
        }
        return obj2;
        if (qiVar2.a.e() == 0 && z2) {
            goaVar2.t = qiVar2;
            goaVar2.u = z2;
            goaVar2.w = 2;
            if (bw2.b(100L, goaVar2) != obj2) {
                z3 = z2;
                z2 = z3;
            }
            return obj2;
        }
        if (z2) {
            qiVar2.d(i2);
        }
        return g2b.a;
    }

    public static final long q(qi qiVar) {
        float fI;
        float f2;
        float fI2 = (y48.C / 2.0f) * (qiVar.i() / y48.x);
        ioa ioaVar = qiVar.a;
        if (ioaVar.f() && r(qiVar) && ioaVar.e() == 0) {
            fI = qiVar.i();
            f2 = b;
        } else {
            fI = qiVar.i();
            f2 = a;
        }
        y43 y43Var = new y43((fI * f2) - fI2);
        y43 y43Var2 = new y43(0.0f);
        if (y43Var.compareTo(y43Var2) < 0) {
            y43Var = y43Var2;
        }
        float f3 = y43Var.t + fI2;
        return (((long) Float.floatToRawIntBits((qiVar.i() / 2.0f) + (((float) Math.cos(qiVar.f.d().floatValue())) * f3))) << 32) | (((long) Float.floatToRawIntBits((qiVar.i() / 2.0f) + (f3 * ((float) Math.sin(qiVar.f.d().floatValue()))))) & 4294967295L);
    }

    public static final boolean r(ioa ioaVar) {
        return ioaVar.g() >= 12;
    }

    public static final void s(ioa ioaVar, float f2, float f3, float f4, long j2) {
        if (ioaVar.e() == 0 && ioaVar.f()) {
            float fHypot = (float) Math.hypot(((int) (j2 >> 32)) - f2, ((int) (j2 & 4294967295L)) - f3);
            if (r(ioaVar)) {
                ioaVar.a(ioaVar.g() - (fHypot >= f4 ? 12 : 0));
            } else {
                ioaVar.a(ioaVar.g() + (fHypot < f4 ? 12 : 0));
            }
        }
    }

    public static final String t(int i2, boolean z, int i3, jt1 jt1Var) {
        int i4;
        if (i2 == 1) {
            i4 = R.string.m3c_time_picker_minute_suffix;
        } else {
            i4 = z ? R.string.m3c_time_picker_hour_24h_suffix : R.string.m3c_time_picker_hour_suffix;
        }
        Object[] objArr = {Integer.valueOf(i3)};
        String strB = ws3.b(jt1Var, i4);
        Locale locale = ((Configuration) jt1Var.F(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
        return String.format(locale, strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }
}
