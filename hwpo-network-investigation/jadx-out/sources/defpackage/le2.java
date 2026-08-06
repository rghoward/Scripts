package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class le2 {
    public Object a;

    public me2 a() {
        Context context = (Context) this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        me2 me2Var = new me2();
        me2Var.t = k43.a(ln3.a.a);
        we5 we5Var = new we5(context);
        me2Var.u = we5Var;
        me2Var.v = k43.a(new vu6(we5Var, new kb2(we5Var)));
        we5 we5Var2 = me2Var.u;
        me2Var.w = new f59(we5Var2);
        nf8<String> nf8VarA = k43.a(new bn3(we5Var2));
        me2Var.x = nf8VarA;
        nf8<hz8> nf8VarA2 = k43.a(new iz8(me2Var.w, nf8VarA));
        me2Var.y = nf8VarA2;
        t49 t49Var = new t49();
        we5 we5Var3 = me2Var.u;
        u49 u49Var = new u49(we5Var3, nf8VarA2, t49Var);
        nf8<Executor> nf8Var = me2Var.t;
        nf8 nf8Var2 = me2Var.v;
        me2Var.z = k43.a(new qxa(new gt2(nf8Var, nf8Var2, u49Var, nf8VarA2, nf8VarA2), new w4b(we5Var3, nf8Var2, nf8VarA2, u49Var, nf8Var, nf8VarA2, nf8VarA2), new tob(nf8Var, nf8VarA2, u49Var, nf8VarA2)));
        return me2Var;
    }
}
