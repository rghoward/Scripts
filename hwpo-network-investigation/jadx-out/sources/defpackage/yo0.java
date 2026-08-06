package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yo0 implements vo0 {
    public final s49 a;

    public yo0(s49 s49Var) {
        s49Var.getClass();
        this.a = s49Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.vo0
    public final Serializable a(int i, ArrayList arrayList, u02 u02Var) throws Throwable {
        xo0 xo0Var;
        if (u02Var instanceof xo0) {
            xo0Var = (xo0) u02Var;
            int i2 = xo0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xo0Var.v = i2 - Integer.MIN_VALUE;
            } else {
                xo0Var = new xo0(this, u02Var);
            }
        } else {
            xo0Var = new xo0(this, u02Var);
        }
        Object objD = xo0Var.t;
        int i3 = xo0Var.v;
        if (i3 == 0) {
            dv8.b(objD);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            wo0 wo0Var = new wo0(0, arrayList);
            tl5 tl5Var = new tl5();
            wo0Var.invoke(tl5Var);
            JsonObject jsonObject = new JsonObject(linkedHashMap);
            xo0Var.v = 1;
            objD = this.a.d(i, jsonObject, xo0Var);
            v72 v72Var = v72.t;
            if (objD == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objD);
        }
        return (Serializable) g93.a((List) objD);
    }
}
