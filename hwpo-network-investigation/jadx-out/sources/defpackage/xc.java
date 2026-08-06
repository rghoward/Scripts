package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xc extends g5b<a4b, g2b> {
    public final sta a;

    public xc(sta staVar) {
        staVar.getClass();
        this.a = staVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(a4b a4bVar, u02 u02Var) throws Throwable {
        wc wcVar;
        if (u02Var instanceof wc) {
            wcVar = (wc) u02Var;
            int i = wcVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                wcVar.v = i - Integer.MIN_VALUE;
            } else {
                wcVar = new wc(this, u02Var);
            }
        } else {
            wcVar = new wc(this, u02Var);
        }
        wc wcVar2 = wcVar;
        Object obj = wcVar2.t;
        int i2 = wcVar2.v;
        if (i2 == 0) {
            dv8.b(obj);
            ebb ebbVar = a4bVar.a;
            int i3 = a4bVar.b;
            String str = a4bVar.c;
            String lowerCase = a4bVar.d.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Number number = a4bVar.e;
            Number number2 = a4bVar.f;
            String str2 = a4bVar.g;
            Long[] lArr = (Long[]) a4bVar.h.toArray(new Long[0]);
            wcVar2.v = 1;
            Object objB = this.a.b(ebbVar, i3, str, lowerCase, number, number2, str2, lArr, wcVar2);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
