package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qt<T, V extends fw> {
    public final cza<T, V> a;
    public final T b;
    public final yv<T, V> c;
    public final dt7 d;
    public final dt7 e;
    public final s37 f;
    public final ty9<T> g;
    public final V h;
    public final V i;
    public final V j;
    public final V k;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements oh4<r02<? super g2b>, Object> {
        public final /* synthetic */ qt<Object, fw> t;
        public final /* synthetic */ Object u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qt<Object, fw> qtVar, Object obj, r02<? super a> r02Var) {
            super(1, r02Var);
            this.t = qtVar;
            this.u = obj;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(r02<?> r02Var) {
            return new a(this.t, this.u, r02Var);
        }

        @Override // defpackage.oh4
        public final Object invoke(r02<? super g2b> r02Var) {
            return ((a) create(r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            qt<Object, fw> qtVar = this.t;
            qt.b(qtVar);
            Object objA = qt.a(qtVar, this.u);
            qtVar.c.u.setValue(objA);
            qtVar.e.setValue(objA);
            return g2b.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qt(Object obj, cza czaVar, Object obj2) {
        this.a = czaVar;
        this.b = obj2;
        yv<T, V> yvVar = new yv<>(czaVar, obj, null, 60);
        this.c = yvVar;
        this.d = bl7.i(Boolean.FALSE);
        this.e = bl7.i(obj);
        this.f = new s37();
        this.g = new ty9<>(3, obj2);
        V v = yvVar.v;
        V v2 = v instanceof bw ? ut.e : v instanceof cw ? ut.f : v instanceof dw ? ut.g : ut.h;
        v2.getClass();
        this.h = v2;
        V v3 = yvVar.v;
        V v4 = v3 instanceof bw ? ut.a : v3 instanceof cw ? ut.b : v3 instanceof dw ? ut.c : ut.d;
        v4.getClass();
        this.i = v4;
        this.j = v2;
        this.k = v4;
    }

    public static final Object a(qt qtVar, Object obj) {
        cza<T, V> czaVar = qtVar.a;
        V v = qtVar.k;
        V v2 = qtVar.j;
        if (!xj5.a(v2, qtVar.h) || !xj5.a(v, qtVar.i)) {
            V vInvoke = czaVar.a().invoke(obj);
            int iB = vInvoke.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (vInvoke.a(i) < v2.a(i) || vInvoke.a(i) > v.a(i)) {
                    vInvoke.e(uh8.f(vInvoke.a(i), v2.a(i), v.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return czaVar.b().invoke(vInvoke);
            }
        }
        return obj;
    }

    public static final void b(qt qtVar) {
        yv<T, V> yvVar = qtVar.c;
        yvVar.v.d();
        yvVar.w = Long.MIN_VALUE;
        qtVar.d.setValue(Boolean.FALSE);
    }

    public static Object c(qt qtVar, Object obj, wv wvVar, oh4 oh4Var, r02 r02Var, int i) {
        if ((i & 2) != 0) {
            wvVar = qtVar.g;
        }
        wv wvVar2 = wvVar;
        T tInvoke = qtVar.a.b().invoke(qtVar.c.v);
        if ((i & 8) != 0) {
            oh4Var = null;
        }
        oh4 oh4Var2 = oh4Var;
        Object objD = qtVar.d();
        cza<T, V> czaVar = qtVar.a;
        return s37.a(qtVar.f, new pt(qtVar, tInvoke, new l9a(wvVar2, czaVar, objD, obj, czaVar.a().invoke(tInvoke)), qtVar.c.w, oh4Var2, null), r02Var);
    }

    public final T d() {
        return this.c.u.getValue();
    }

    public final Object e(r02 r02Var, Object obj) {
        Object objA = s37.a(this.f, new a(this, obj, null), r02Var);
        return objA == v72.t ? objA : g2b.a;
    }

    public final Object f(p6a p6aVar) {
        Object objA = s37.a(this.f, new rt(this, null), p6aVar);
        return objA == v72.t ? objA : g2b.a;
    }

    public /* synthetic */ qt(Object obj, cza czaVar, Object obj2, int i) {
        this(obj, czaVar, (i & 4) != 0 ? null : obj2);
    }
}
