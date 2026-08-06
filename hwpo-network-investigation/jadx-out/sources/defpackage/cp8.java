package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cp8 implements zo8 {
    public final bu8 a;
    public final ip8 b;

    public cp8(bu8 bu8Var, ip8 ip8Var) {
        bu8Var.getClass();
        ip8Var.getClass();
        this.a = bu8Var;
        this.b = ip8Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.zo8
    public final Object a(long j, int i, Integer num, String str, u02 u02Var) throws Throwable {
        bp8 bp8Var;
        if (u02Var instanceof bp8) {
            bp8Var = (bp8) u02Var;
            int i2 = bp8Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bp8Var.v = i2 - Integer.MIN_VALUE;
            } else {
                bp8Var = new bp8(this, u02Var);
            }
        } else {
            bp8Var = new bp8(this, u02Var);
        }
        bp8 bp8Var2 = bp8Var;
        Object objB = bp8Var2.t;
        int i3 = bp8Var2.v;
        if (i3 == 0) {
            dv8.b(objB);
            bp8Var2.v = 1;
            objB = this.b.b(j, i, num, str, bp8Var2);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objB);
        }
        ru8 ru8Var = (ru8) objB;
        if (ru8Var.a.J) {
            return g2b.a;
        }
        throw new q45(ru8Var);
    }

    @Override // defpackage.zo8
    public final ArrayList b() {
        oo8[] oo8VarArrValues = oo8.values();
        ArrayList arrayList = new ArrayList(oo8VarArrValues.length);
        for (oo8 oo8Var : oo8VarArrValues) {
            arrayList.add(new jo8(oo8Var.t, this.a.b(oo8Var.u, new Object[0])));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.zo8
    public final Object c(long j, int i, Integer num, String str, u02 u02Var) throws Throwable {
        ap8 ap8Var;
        if (u02Var instanceof ap8) {
            ap8Var = (ap8) u02Var;
            int i2 = ap8Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ap8Var.v = i2 - Integer.MIN_VALUE;
            } else {
                ap8Var = new ap8(this, u02Var);
            }
        } else {
            ap8Var = new ap8(this, u02Var);
        }
        ap8 ap8Var2 = ap8Var;
        Object objA = ap8Var2.t;
        int i3 = ap8Var2.v;
        if (i3 == 0) {
            dv8.b(objA);
            ap8Var2.v = 1;
            objA = this.b.a(j, i, num, str, ap8Var2);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objA);
        }
        ru8 ru8Var = (ru8) objA;
        if (ru8Var.a.J) {
            return g2b.a;
        }
        throw new q45(ru8Var);
    }
}
