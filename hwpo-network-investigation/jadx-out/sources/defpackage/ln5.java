package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {22}, m = "readObject", v = 2)
public final class ln5 extends u02 {
    public int A;
    public xn2 t;
    public mn5 u;
    public LinkedHashMap v;
    public String w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ mn5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln5(mn5 mn5Var, ak0 ak0Var) {
        super(ak0Var);
        this.z = mn5Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return mn5.a(this.z, null, this);
    }
}
