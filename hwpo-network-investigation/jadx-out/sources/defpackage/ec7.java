package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ec7 {
    public final z79 a;
    public final ci4<rdb, r02<? super g2b>, Object> b;
    public tx2 c;
    public boolean d;
    public final r03 e = new r03();

    /* JADX WARN: Multi-variable type inference failed */
    public ec7(z79 z79Var, ci4<? super rdb, ? super r02<? super g2b>, ? extends Object> ci4Var, tx2 tx2Var) {
        this.a = z79Var;
        this.b = ci4Var;
        this.c = tx2Var;
    }

    public static void a(r48 r48Var) {
        List<a58> list = r48Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ci4 ci4Var, u02 u02Var) throws Throwable {
        cc7 cc7Var;
        if (u02Var instanceof cc7) {
            cc7Var = (cc7) u02Var;
            int i = cc7Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                cc7Var.v = i - Integer.MIN_VALUE;
            } else {
                cc7Var = new cc7(this, u02Var);
            }
        } else {
            cc7Var = new cc7(this, u02Var);
        }
        Object obj = cc7Var.t;
        int i2 = cc7Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            this.d = true;
            dc7 dc7Var = new dc7(this, ci4Var, null);
            cc7Var.v = 1;
            j5a j5aVar = new j5a(cc7Var, cc7Var.getContext());
            Object objD = wx7.d(j5aVar, true, j5aVar, dc7Var);
            v72 v72Var = v72.t;
            if (objD == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        this.d = false;
        return g2b.a;
    }
}
