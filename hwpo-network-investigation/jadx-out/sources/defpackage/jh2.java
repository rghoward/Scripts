package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.DateInputKt$DateInputTextField$5$1", f = "DateInput.kt", l = {}, m = "invokeSuspend")
public final class jh2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public final /* synthetic */ Long t;
    public final /* synthetic */ i21 u;
    public final /* synthetic */ yg2 v;
    public final /* synthetic */ Locale w;
    public final /* synthetic */ h37<kha> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh2(Long l, i21 i21Var, yg2 yg2Var, Locale locale, h37<kha> h37Var, r02<? super jh2> r02Var) {
        super(2, r02Var);
        this.t = l;
        this.u = i21Var;
        this.v = yg2Var;
        this.w = locale;
        this.x = h37Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new jh2(this.t, this.u, this.v, this.w, this.x, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((jh2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        Long l = this.t;
        if (l != null) {
            String strA = this.u.a(l.longValue(), this.v.c, this.w);
            kha khaVar = new kha(4, strA.length() == 0 ? lja.b : ay.c(strA.length(), strA.length()), strA);
            ko7 ko7Var = fh2.a;
            this.x.setValue(khaVar);
        }
        return g2b.a;
    }
}
