package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zg3 {
    public static final dza a = new dza(a.u, b.u);
    public static final ty9<Float> b = xv.b(0.0f, 400.0f, null, 5);
    public static final ty9<bg5> c;
    public static final ty9<kg5> d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<ava, cw> {
        public static final a u = new a(1);

        @Override // defpackage.oh4
        public final cw invoke(ava avaVar) {
            long j = avaVar.a;
            return new cw(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<cw, ava> {
        public static final b u = new b(1);

        @Override // defpackage.oh4
        public final ava invoke(cw cwVar) {
            cw cwVar2 = cwVar;
            return new ava(sb4.b(cwVar2.a, cwVar2.b));
        }
    }

    static {
        Map<cza<?, ?>, Float> map = njb.a;
        c = xv.b(0.0f, 400.0f, new bg5(4294967297L), 1);
        d = xv.b(0.0f, 400.0f, new kg5(4294967297L), 1);
    }

    public static uh3 a(xya xyaVar, int i) {
        a04 a04VarB = xyaVar;
        if ((i & 1) != 0) {
            Map<cza<?, ?>, Float> map = njb.a;
            a04VarB = xv.b(0.0f, 400.0f, new kg5(4294967297L), 1);
        }
        return new uh3(new zva((et3) null, (sr9) null, new o91((i & 2) != 0 ? di.a.i : di.a.b, jh3.u, a04VarB), (t39) null, (LinkedHashMap) null, 123));
    }

    public static uh3 b(a04 a04Var, int i) {
        sp0 sp0Var;
        if ((i & 1) != 0) {
            Map<cza<?, ?>, Float> map = njb.a;
            a04Var = xv.b(0.0f, 400.0f, new kg5(4294967297L), 1);
        }
        int i2 = i & 2;
        sp0.b bVar = di.a.l;
        sp0.b bVar2 = di.a.j;
        sp0.b bVar3 = i2 != 0 ? bVar : bVar2;
        if (xj5.a(bVar3, bVar2)) {
            sp0Var = di.a.b;
        } else {
            sp0Var = xj5.a(bVar3, bVar) ? di.a.h : di.a.e;
        }
        return new uh3(new zva((et3) null, (sr9) null, new o91(sp0Var, new kh3(1), a04Var), (t39) null, (LinkedHashMap) null, 123));
    }

    public static uh3 c(a04 a04Var, int i) {
        if ((i & 1) != 0) {
            a04Var = xv.b(0.0f, 400.0f, null, 5);
        }
        return new uh3(new zva(new et3((i & 2) == 0 ? 0.3f : 0.0f, a04Var), (sr9) null, (o91) null, (t39) null, (LinkedHashMap) null, 126));
    }

    public static ko3 d(a04 a04Var, int i) {
        if ((i & 1) != 0) {
            a04Var = xv.b(0.0f, 400.0f, null, 5);
        }
        return new ko3(new zva(new et3(0.0f, a04Var), (sr9) null, (o91) null, (t39) null, (LinkedHashMap) null, 126));
    }

    public static uh3 e(xya xyaVar, float f, int i) {
        a04 a04VarB = xyaVar;
        if ((i & 1) != 0) {
            a04VarB = xv.b(0.0f, 400.0f, null, 5);
        }
        return new uh3(new zva((et3) null, (sr9) null, (o91) null, new t39(f, ava.b, a04VarB), (LinkedHashMap) null, 119));
    }

    public static ko3 f(xya xyaVar) {
        return new ko3(new zva((et3) null, (sr9) null, (o91) null, new t39(0.92f, ava.b, xyaVar), (LinkedHashMap) null, 119));
    }

    public static ko3 g(xya xyaVar, int i) {
        a04 a04VarB = xyaVar;
        if ((i & 1) != 0) {
            Map<cza<?, ?>, Float> map = njb.a;
            a04VarB = xv.b(0.0f, 400.0f, new kg5(4294967297L), 1);
        }
        return new ko3(new zva((et3) null, (sr9) null, new o91((i & 2) != 0 ? di.a.i : di.a.b, lh3.u, a04VarB), (t39) null, (LinkedHashMap) null, 123));
    }

    public static ko3 h(a04 a04Var, int i) {
        sp0 sp0Var;
        if ((i & 1) != 0) {
            Map<cza<?, ?>, Float> map = njb.a;
            a04Var = xv.b(0.0f, 400.0f, new kg5(4294967297L), 1);
        }
        sp0.b bVar = di.a.j;
        sp0.b bVar2 = di.a.l;
        if (xj5.a(bVar2, bVar)) {
            sp0Var = di.a.b;
        } else {
            sp0Var = xj5.a(bVar2, bVar2) ? di.a.h : di.a.e;
        }
        return new ko3(new zva((et3) null, (sr9) null, new o91(sp0Var, new mh3(1), a04Var), (t39) null, (LinkedHashMap) null, 123));
    }

    public static final uh3 i(a04 a04Var, oh4 oh4Var) {
        return new uh3(new zva((et3) null, new sr9(a04Var, new oh3(0, oh4Var)), (o91) null, (t39) null, (LinkedHashMap) null, 125));
    }

    public static /* synthetic */ uh3 j(oh4 oh4Var) {
        Map<cza<?, ?>, Float> map = njb.a;
        return i(xv.b(0.0f, 400.0f, new bg5(4294967297L), 1), oh4Var);
    }

    public static final ko3 k(a04 a04Var, oh4 oh4Var) {
        return new ko3(new zva((et3) null, new sr9(a04Var, new rh3(oh4Var)), (o91) null, (t39) null, (LinkedHashMap) null, 125));
    }
}
