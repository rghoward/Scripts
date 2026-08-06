package defpackage;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {113}, m = "invokeSuspend", v = 2)
public final class kn5 extends zu8 implements ei4<xn2<g2b, JsonElement>, g2b, r02<? super JsonElement>, Object> {
    public int u;
    public /* synthetic */ xn2 v;
    public final /* synthetic */ mn5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn5(mn5 mn5Var, r02<? super kn5> r02Var) {
        super(3, r02Var);
        this.w = mn5Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(xn2<g2b, JsonElement> xn2Var, g2b g2bVar, r02<? super JsonElement> r02Var) {
        kn5 kn5Var = new kn5(this.w, r02Var);
        kn5Var.v = xn2Var;
        return kn5Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        mn5 mn5Var = this.w;
        h2a h2aVar = mn5Var.a;
        xn2 xn2Var = this.v;
        int i = this.u;
        if (i == 0) {
            dv8.b(obj);
            byte bQ = h2aVar.q();
            if (bQ == 1) {
                return mn5Var.d(true);
            }
            if (bQ == 0) {
                return mn5Var.d(false);
            }
            if (bQ != 6) {
                if (bQ == 8) {
                    return mn5Var.c();
                }
                h2a.m(h2aVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.v = null;
            this.u = 1;
            obj = mn5.a(mn5Var, xn2Var, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return (JsonElement) obj;
    }
}
