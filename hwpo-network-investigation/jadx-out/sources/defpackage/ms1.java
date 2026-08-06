package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {579}, m = "invokeSuspend", v = 1)
public final class ms1 extends zu8 implements ci4<ad9<? super String>, r02<? super g2b>, Object> {
    public int u;
    public int v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ns1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms1(ns1 ns1Var, r02<? super ms1> r02Var) {
        super(2, r02Var);
        this.z = ns1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ms1 ms1Var = new ms1(this.z, r02Var);
        ms1Var.y = obj;
        return ms1Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(ad9<? super String> ad9Var, r02<? super g2b> r02Var) {
        return ((ms1) create(ad9Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ad9 ad9Var;
        int i;
        int i2;
        int i3;
        String strA;
        int i4;
        int i5;
        String str;
        ns1 ns1Var = this.z;
        le7<Object> le7Var = ns1Var.t;
        uf5 uf5Var = ns1Var.v;
        int i6 = this.x;
        if (i6 == 0) {
            dv8.b(obj);
            ad9Var = (ad9) this.y;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.w;
            i2 = this.v;
            i3 = this.u;
            ad9Var = (ad9) this.y;
            dv8.b(obj);
        }
        if (i3 >= Math.min(ns1Var.w + 10, uf5Var.b)) {
            return g2b.a;
        }
        int i7 = i3 + 1;
        int iA = uf5Var.a(i3);
        switch (iA) {
            case 0:
                strA = "up";
                break;
            case 1:
                Object objB = le7Var.b(i2);
                i2++;
                strA = "down " + objB;
                break;
            case 2:
                strA = "remove " + uf5Var.a(i7) + ' ' + uf5Var.a(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                strA = "move " + uf5Var.a(i7) + ' ' + uf5Var.a(i3 + 2) + ' ' + uf5Var.a(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                strA = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iA2 = uf5Var.a(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iA2 + ' ' + le7Var.b(i2);
                int i8 = i4;
                strA = str;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iA3 = uf5Var.a(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iA3 + ' ' + le7Var.b(i2);
                int i9 = i4;
                strA = str;
                i7 = i9;
                i2 = i5;
                break;
            case 7:
                Object objB2 = le7Var.b(i2);
                objB2.getClass();
                fza.b(2, objB2);
                i2 += 2;
                strA = "apply " + ((ci4) objB2);
                break;
            case 8:
                strA = "reuse " + ns1Var.u.b(i);
                i++;
                break;
            case 9:
                strA = "recompose pending";
                break;
            default:
                strA = pp2.a(iA, "unknown op: ");
                break;
        }
        this.y = ad9Var;
        this.u = i7;
        this.v = i2;
        this.w = i;
        this.x = 1;
        ad9Var.a(this, i3 + ": " + strA);
        return v72.t;
    }
}
